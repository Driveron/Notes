import jdk.internal.dynalink.MonomorphicCallSite;

/**
 * PredatoryCreditCard
 */
public class PredatoryCreditCard extends CreditCard {

    // Additional instance variable
    private double apr;                 // annual percentage rate
    private int calls;                  // counts the calls of the method charge()
    private double monPayment;          // the total payment of the present month
 
    // Constructor for this class
    public PredatoryCreditCard (String cust, String bk, String acnt, int lim, double initialBal, double rate) {
        super(cust, bk, acnt, lim, initialBal);         // initialize superclass attributes
        apr = rate;
        calls = 0;
        monPayment = 0;
    }

    // A new method for assessing monthly interest charges
    public void processMonth () {
        double minPay = balance / 20.0;
        if (monPayment < minPay) {
            balance *= 1.002;           // charge extra fine
        }
        if (balance > 0) {                     //  only charge interests on positive balance
            double monthlyFactor = Math.pow(1 + apr, 1.0 / 12);   // compute monthly rate
            balance *= monthlyFactor;                             // assess interest
        }
        calls = 0;                          // reset the counter of the calls
    }

    // Overriding the charge method defined in the superclass
    public boolean charge (double price) {
        boolean isSuccess = super.charge(price);
        monPayment += price;
        if (isSuccess) {
            balance += 5;
        }
        calls++;         // make an increment of the calls of charge()
        if (calls > 10) {
            balance++;         // make a surcharge
        }
        return isSuccess;
    }
}