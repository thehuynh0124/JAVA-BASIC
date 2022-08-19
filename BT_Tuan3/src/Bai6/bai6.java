package Bai6;
import java.util.Scanner;
import Bai4.Stack;
public class bai6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dãy: ");
        String a = scanner.nextLine();
        reverse(a);
    }
    public static void reverse(String a){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<a.length(); i++){
            stack.push(a.charAt(i));
        }
        for(char value : stack.getStack())  System.out.print(value);
    }
}
