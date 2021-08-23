//package cpeng.peng_PA2;
import java.util.*;
// import java.io.*;


public class SumArray{
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        int[] arr = new int[100];
       
        System.out.println("HOw many numbas");
        int size = Input.nextInt();
        System.out.println("gimme that number of numbas");
        int sum = 0;
        for(int i = 0; i < size;i++){
            arr[i]=Input.nextInt();
            sum+=arr[i];
        }
        System.out.println(((double)sum)/size);
    }
}
