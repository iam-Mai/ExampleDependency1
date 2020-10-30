package P3.P2;

import P2.C4;

public class C5 {
    public void callC5() {
        System.out.println("call P3.C5");

        C4 c4 = new C4();
        c4.callC4();

        C6 c6 = new C6();
        c6.callC6();
    }
}
