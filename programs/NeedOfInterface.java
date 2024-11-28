package programs;

// Interface acts as a repository to dispatch required class based on object that we pass.

public class NeedOfInterface {
    public static void main(String[] args) {
        new Developer().code(new Desktop());
        new Developer().code(new Laptop());
    }
}

class Developer{
    public void code(Computer computer){
        computer.code();
    }
}

interface Computer{
    public void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding from Desktop");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding from Laptop");
    }
}