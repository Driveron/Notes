
public class Internet{
    boolean status;

    public Internet() {
        status = false;
    }

    public void check(Sender src, Receiver des){
        if(src.length != 0) {
            status = true;
            src.send(des, src.packets);
        }
        else 
            status = false;
    }
}