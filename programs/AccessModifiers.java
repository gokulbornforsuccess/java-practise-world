package programs;

import dummy.A3;

// public - everywhere
// private - only in class
// default - same package
// protected - same package + Different package subclass

public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println(new A3().roll);
        System.out.println(new A4().roll);
    }
}

class A4{
    protected int roll;

}
