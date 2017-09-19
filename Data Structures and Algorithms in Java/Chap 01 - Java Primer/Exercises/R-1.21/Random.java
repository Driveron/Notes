public class Random {
    public static void main(String[] args) {
        final int LIST_LEN = 52;            // initialize the length of the array

        boolean[] isUsed = new boolean[LIST_LEN];  // the array judging if the number is used
        int[] naList = new int[LIST_LEN];      // The final list 

        for (int i = 0; i < LIST_LEN; i++) {     // initialize the initial array
            isUsed[i] = false;
        }

        for (int i = 0; i < LIST_LEN; i++) {    // loop to find all the numbers
            int rNum;   // the random testing number
            do {
                rNum = (int)(Math.random() * LIST_LEN);   // get an integer number from 0 to 52-1
            } while (isUsed[rNum]);   // loop until find an distict number
            naList[i] = rNum + 1;   // change range from 0~52-1 to 1~52
            isUsed[rNum] = true;
        }

        for (int i = 0; i < LIST_LEN; i++) {        // print the array info
            System.out.print(naList[i] + "\t");
        }
        System.out.println();
    }
}