package programs;
// if we are using abstract method then corresponding class should be abstract.
// class which is extending the abstract class is called concrete class.
public class Abstraction {
    public static void main(String[] args) {
        Car c = new Fortuner();
        c.drive();
        c = new WagonR();
        c.drive();
    }
}

abstract class Car{
    public abstract void drive();
}

class WagonR extends Car{

    @Override
    public void drive() {
        System.out.println("Driving WagonR");
    }
}

class Fortuner extends Car{

    @Override
    public void drive() {
        System.out.println("Driving Fortuner");
    }

    public void credits(){
        System.out.println("By Gokul");
    }
}