package programs.collectionApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Important: uses comparable method while using with own class structure
// same not required for wrapper classes because it by default implements comparable interface
public class CollectionPriorityQueue {
    public static void main(String[] args) {

        List<Student> str = new ArrayList<>();
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(2,"Gokul"));
        pq.add(new Student(3,"Rahul"));
        pq.add(new Student(1,"Amit"));
        pq.add(new Student(6,"Anil"));
        pq.add(new Student(4,"Sunil"));
        System.out.println(pq);
        int cntr=0;
        while(!pq.isEmpty()){
            cntr++;
            if(cntr==3) break;
            str.add(pq.poll());
            System.out.println(pq);
            System.out.println(str);
        }
        System.out.println("After");
        //usage of comparator: In terms of Integer if we want to change existing compare method
//        PriorityQueue<Student2> pqi = new PriorityQueue<>(new Comparator<Student2>() {
//            @Override
//            public int compare(Student2 o1, Student2 o2) {
//                return o1.getRoll() - o2.getRoll();
//            }
//        });
        PriorityQueue<Student2> pqi = new PriorityQueue<>((a,b) -> a.getRoll() - b.getRoll() );
        List<Student2> stri = new ArrayList<>();

        pqi.add(new Student2(2,"Gokul"));
        pqi.add(new Student2(3,"Rahul"));
        pqi.add(new Student2(1,"Amit"));
        pqi.add(new Student2(6,"Anil"));
        pqi.add(new Student2(4,"Sunil"));
        System.out.println(pqi);
        cntr=0;
        while(!pqi.isEmpty()){
            cntr++;
            if(cntr==3) break;
            stri.add(pqi.poll());
            System.out.println(pqi);
            System.out.println(stri);
        }

    }
}

class Student implements Comparable<Student>{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return o.roll - this.roll;
    }
}

class Student2 {
    int roll;
    String name;

    public Student2(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Student2() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
