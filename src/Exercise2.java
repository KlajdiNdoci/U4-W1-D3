package src;

import src.entities.Call;
import src.entities.SIM;

public class Exercise2 {
    public static void main(String[] args) {


        SIM mySIM = new SIM("3891237356", 3.20, new Call[2]);

        mySIM.registerCall(2, "3232332322");
        mySIM.registerCall(2, "3232332322");

        System.out.println(mySIM);
    }
}
