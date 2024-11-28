package programs;

public class LambdaImplementation1 {
    public static void main(String[] args) {
        FuncInterface fi = (i,j) ->{
            System.out.print("Inside Functional Interface: ");
            return i+j;
        };
        System.out.println(fi.show(10,20));
    }
}
//@FunctionalInterface
interface FuncInterface{
    int show(int i,int j);
}
