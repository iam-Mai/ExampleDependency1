package P3;

import P2.C7;

public class C6 {
    public void callC6() {
        System.out.println("call P3.C6");

        C7 c7 = new C7();
        c7.callC7();
    }
}
