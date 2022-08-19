package Bai5;
import Bai4.Stack;
public class bai5 {public static void main(String[] args){
    for(int i=0; i<=100; i++){
        toBin(i);
    }
}
    public static void toBin(int stp){
        Stack<Integer> arrBin = new Stack();
        while(stp != 0){
            arrBin.push(stp%2);
            stp /= 2;
        }
        for(int value : arrBin.getStack()) System.out.print(value);
        System.out.println();
    }
}
