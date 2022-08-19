package Bai4;
import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue;
    public Queue() {
        queue = new LinkedList<T>();
    }
    public void add(T value){
        queue.add(value);
    }
    public T poll(){
        return queue.poll();
    }
    public T peek(){
        return queue.peek();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }
    public LinkedList<T> getQueue(){
        return queue;
    }
    public void set(int index, T element){
        queue.set(index, element);
    }
}
