//package cpeng.peng_PA2;
import java.util.*;
// import java.io.*;


public class Factorial{
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        int Numinput;
        System.out.println("Give me an Integer for me to Factorial");
            long ans=1;
            Numinput = Input.nextInt();
            for(int i = 1;i<=Numinput;i++ ){
                ans*=i;
            }
            if(Numinput<=20)System.out.println("Factorial of "+ Numinput+" is "+ ans);
            //print too big
            else System.out.println("Factorial of "+ Numinput+" is too big");
    }
}
