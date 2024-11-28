package programs;

public class ThisAndSuper {
    public static void main(String[] args) {
        new B2();
    }
}
class A2{
    int a;
    A2(int a){
        System.out.println("Inside Constructor A:"+a);
    }
}
class B2 extends A2{
    int a;
    B2(){
        super(1);
        System.out.println("Inside Constructor B");

    }
}