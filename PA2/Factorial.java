//package cpeng.peng_PA2;
import java.util.*;
// import java.io.*;


public class Factorial{
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        int Numinput,currMax=1; 
        //currMax is the Max factorial that the array contains currently
        long[] fact= new long[1000];
        fact[0]=1;//default value of factorial of zero
        while(true){
            System.out.println("Give me an Integer for me to Factorial");
            Numinput = Input.nextInt();
            //we know that factorial of 21 is too big, so we check if the input is <=20
            if(Numinput>currMax&&Numinput<=20){
                for(int i = currMax;i<=Numinput;i++ ){
                    fact[i]=fact[i-1]*i;
                }
                currMax=Numinput;
            }
            //print ans if <=20
            if(Numinput<=20)System.out.println("Factorial of "+ Numinput+" is "+ fact[Numinput]);
            //print too big
            else System.out.println("Factorial of "+ Numinput+" is too big");
        }
    }
}
