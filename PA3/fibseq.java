//package cpeng.peng_PA2;
import java.util.*;
// import java.io.*;


public class fibseq{
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.println("Give length of fibonacci sequence");
        int size = Input.nextInt();
        long[] fib = new long[size];
        fib[0]=1;fib[1]=1;//initialize start
        for(int i =2; i < size;i++){//calc fib
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i =0; i < size;i++){//print
            System.out.print(fib[i]+" ");
        }
        System.out.print('\n');
        Input.close();
    }
}
