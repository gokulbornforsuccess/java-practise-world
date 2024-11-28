package programs;

public class ImplementMethodInInterface implements MethImplement{
    public static void main(String[] args) {
        MethImplement.pop(20);
//        System.out.println(MethImplement.x);
    }
}

interface MethImplement{
    int x =10;
    static void pop(int a){
        System.out.println("Inside PoP:"+a);
    }
}
