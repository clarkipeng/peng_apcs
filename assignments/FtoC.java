//package cpeng.peng_apcs.assignments;
import java.util.*;
// import java.io.*;


public class FtoC{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int F;
        System.out.println("gimme the degrees in Fahrenheit! (int)");
        F = sc.nextInt();
        System.out.println((5.0/9)*(F-32)+" degrees Celcius");
        sc.close();
    }
}
