package userPackage;

import packA.A;
import packB.B;
import packC.C;

public class Test {
    public static void main(String[] args) {
        System.out.println("Aggregator module demo");
        A a = new A();
        a.m1();

        B b = new B();
        b.m1();

        C c = new C();
        c.m1();
    }
}
