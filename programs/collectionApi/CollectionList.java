package programs.collectionApi;

//Hierarchy Iterable --> Collection --> List --> ArrayList

//Below are the list of lists
//1. ArrayList - used for list - mostly used for all purposes
//2. LinkedList - in case of more insertion and deletions
//3. Vector

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        // Array list implementation
        List<String> names = new ArrayList<>();
        Collection<String> names2 = new ArrayList<>(names);
        Iterable<String> names3 = new ArrayList<>();

        names.add("Gokul");
        names.add("Debashis");
        names.set(1,"Jothika");
//        for(String i: names){
//            System.out.println(i);
//        }

        names2.addAll(names);
        for(String i:names2){
            System.out.println(i);
        }
    }
}
