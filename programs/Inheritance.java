package programs;

public class Inheritance {
    public static void main(String[] args) {
        new C1().show1();
        new C1().show2();
        new C1().show3();
    }
}

class A1{
    public void show1(){
        System.out.println("Inside class A ");
    }
}

class B1 extends A1{
    public void show2(){
        System.out.println("Inside class B");
    }

}
class C1 extends B1{

    public void show3() {
        System.out.println("Inside class C");
    }
}