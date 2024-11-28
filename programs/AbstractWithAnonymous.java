package programs;

public class AbstractWithAnonymous {
    public static void main(String[] args) {
        A5 obj = new A5() {
            public void show() {
                System.out.println("Inside Show");
            }
        };
        obj.show();
    }
}

abstract class A5{
    public abstract void show();
}
