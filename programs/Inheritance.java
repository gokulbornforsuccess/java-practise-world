package programs;

public class Inheritance {
    new B1().show();
}

class A1{
    public void show(){
        System.out.println("Inside class A ");
    }
}

class B1 extends A1{
    public void show(){
        System.out.println("Inside class B");
    }

}