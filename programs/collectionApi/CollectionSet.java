package programs.collectionApi;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(3);
        st1.add(2);
        Set<Integer> st2 = new HashSet<>();
        st2.add(4);
        st2.add(3);
        st2.add(2);
        System.out.println(st1);
        System.out.println(st2);
        st1.retainAll(st2);
        System.out.println(st1);
        System.out.println(st2);
    }
}
