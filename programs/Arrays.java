package programs;

import java.io.DataInputStream;
import java.io.IOException;

public class Arrays {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws NumberFormatException, IOException {
        //1d array
        Student[] s =  new Student[2];
        s[0] = new Student(1,"Gokul");
        s[1] = new Student();
        for(Student s1:s){
            System.out.println(s1);
        }

        //Multi Dimensional Array
        int x=5;
        int [][] i = new int[x][x];
        for (int j=0;j<x;j++){
            for (int k=0;k<x;k++){
                i[j][k]= j;
                System.out.print(i[j][k]+" ");
            }
            System.out.println("");
        }
    }
}
class Student{
    Student(int x,String n){
        this.roll = x;
        this.name = n;
    }
    Student(){
        this.roll = 99;
        this.name = "Dummy";
    }
    

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }


    int roll;
    String name;
}