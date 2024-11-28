package programs;
//Core Concept: Static doesn't rely on Object

public class StaticVariableAndMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("A.class");
        System.out.println("className:"+A.className);
        A.className = "10th";
        System.out.println("className:"+A.className);
        A obj = new A();
        obj.name="Gokul";
        obj.roll=10;
        A.show(obj);
    }
    
}

class A{
    int roll;
    String name;
    static String className = "6th";

    // Static Block
    static{
        System.out.println("In Static Block");
        className="12th";
    }

    public static void show(A a){
        System.out.println("roll:"+a.roll+" name:"+a.name+" className:"+className);
    }
}
