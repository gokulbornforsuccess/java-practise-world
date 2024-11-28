package programs.collectionApi;

import lombok.*;
import java.util.*;

/*

In queue below are the methods available.


2. offer() --> no exception thrown
3. poll() --> take out element without exception
5. peek() --> view element without exception

1. add() --> if queue is full throws exception
4. remove() --> take out with exception

6. element() --> view element with exception

Dequeue - double ended queue, implemented in LinkedList as well as Queue

Classes to use --> Stack: ArrayDequeue Queue: LinkedList

 */
public class CollectionQueue {
    public static void main(String[] args) {
        // Methods: offer, poll, peek
        Queue<Integer> qu = new LinkedList<>();
        System.out.println(qu.add(10)); // adds elements but throws exception
        System.out.println(qu.offer(20)); //adds elements but not throws exception
        System.out.println(qu.peek());
        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu);

        //Methods: push, pop, peek
        Stack<Integer> st = new Stack<>();
        System.out.println(st.add(1));
        System.out.println(st.add(2));
        System.out.println(st.push(3));
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

        //Method: addFirst/Last getFirst/Last removeFirst/Last
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println(dq);
        System.out.println(dq.getLast());
        System.out.println(dq.getFirst());
        dq.removeFirst();
        System.out.println(dq);


    }
}
