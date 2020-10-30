package P1;

public class C1 {
    public void callC1() {
        System.out.println("call P1.C1");
        C2 c2 = new C2();
        c2.callC2();

        C3 c3 = new C3();
        c3.callC3();
    }
}
