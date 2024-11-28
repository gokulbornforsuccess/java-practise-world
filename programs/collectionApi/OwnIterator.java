package programs.collectionApi;

import java.util.Iterator;
//Important: 2 factors to note, if we want our own array implementation iterable then we have to use the iterable and iterator interface.
public class OwnIterator {
    public static void main(String[] args) {
        Generics<Integer> arr1 = new Generics<Integer>(10);
        arr1.addData(10);
        arr1.addData(20);
        arr1.addData(30);
        Iterator<Integer> it = arr1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Integer i: arr1){
            System.out.println(i);
        }


    }
}

class Generics<T> implements Iterable<T>{
    private T[] items;
    private int size;
    private int length;

    Generics(int length){
        size = 0;
        this.length=length;
        items = (T[]) new Object[length];
    }

    public void addData(T item){
        size+=1;
        if(this.length>size){
            items[size]=item;
        }
    }

    public T viewData(int index){
        if(index<=size){
            return items[index];
        }
        else return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericsIterator(this);
    }

    class GenericsIterator implements Iterator<T> {

        private Generics<T> list;
        private int index=0;

        GenericsIterator(Generics<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("hasNext");
            return index <= list.size;
        }

        @Override
        public T next() {
            System.out.println("next");
            return list.items[index ++];
        }
    }

}