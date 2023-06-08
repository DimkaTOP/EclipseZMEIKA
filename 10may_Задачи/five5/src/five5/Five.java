package five5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Five {

	public static void compare2Lists() {
		 ArrayList<Double> arrayList = new ArrayList<>();
	        LinkedList<Double> linkedList = new LinkedList<>();
	        final int N = 1000000;
	        final int M = 1000;
	        for (int i = 0; i < N; i++) {
	            arrayList.add(Math.random());
	            linkedList.add(Math.random());
	        }
	        long startTime = System.currentTimeMillis();
	        for (int i = 0; i < M; i++) {
	            arrayList.get((int) (Math.random() * (N - 1)));
	        }
	        System.out.println(System.currentTimeMillis() - startTime);

	        startTime = System.currentTimeMillis();
	        for (int i = 0; i < M; i++) {
	            linkedList.get((int) (Math.random() * (N - 1)));
	        }
	        System.out.println(System.currentTimeMillis() - startTime);
	    }
	}
class ArrayIterator<T> implements Iterator<T>{

    private T[] array;
    private int index = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return array[index++];
    }
}
class Array2d<T> implements Iterable<T>{
    private T[][] array;

    public Array2d(T[][] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int i, j;

            @Override
            public boolean hasNext() {
                for(int i = this.i; i< array.length; i++){
                    for(int j = this.j; j< array[i].length; j++){
                        return true;
                    }
                }
                return false;
            }

            @Override
            public T next() {
                if(!hasNext())
                    throw new NoSuchElementException();
                T t = array[i][j];
                j++;
                for(int i = this.i; i< array.length; i++){
                    for(int j = (i == this.i ? this.j : 0); j< array[i].length; j++){
                        this.i = i;
                        this.j = j;
                        return t;
                    }
                }

                return t;
            }
        };
    }
}

