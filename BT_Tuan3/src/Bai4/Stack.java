package Bai4;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack;
    public Stack() {
        stack = new LinkedList<T>();
    }
    public void push(T value){
        stack.push(value);
    }
    public T poll(){
        return stack.poll();
    }
    public T peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }
    public LinkedList<T> getStack(){
        return stack;
    }
    public T pop() {
        T a = stack.get(0);
        stack.remove(0);
        return a;
    }
}
