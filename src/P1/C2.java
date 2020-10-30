package P1;

import P2.C7;
import P3.P2.C5;

public class C2 {
    public void callC2() {
        System.out.println("call P1.C2");

        C3 c3 = new C3();
        c3.callC3();

        C5 c5 = new C5();
        c5.callC5();

        C7 c7 = new C7();
        c7.callC7();
    }
}
