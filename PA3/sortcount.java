//package cpeng.peng_PA2;
import java.util.*;
// import java.io.*;


public class sortcount{
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.println("Give 9 digit number");
        String integer=Input.next();
        int[] vals = new int[10];
        int[] count = new int[10];
        for(int i = 0; i< 10;i++)count[i]=0; //initialize count  to 0
        int size = 9;
        for(int i = 0; i <size;i++){//read in ints,count them
            vals[i]=(integer.charAt(i)-'0');
            count[vals[i]]++;
        }
        int j,temp;
        for(int i = 1; i < size;i++){//insertsort
            j = i;
            temp = vals[i];
            while(true){
                //swap until you get to the end or the nextval is lesser
                vals[j]=vals[j-1];
                if(vals[j-1]<temp){
                    vals[j]=temp;
                    break;
                }
                j--;
                if(j==1){
                    vals[j]=vals[j-1];
                    vals[j-1]=temp;
                    break;
                }
            }
        }
        System.out.println("sorted: ");
        for(int i= 0; i < size;i++){
            System.out.print(vals[i]);
        }
        System.out.println();
        System.out.println("counted: ");
        for(int i= 0; i < 10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 0; i < 10;i++){
            System.out.print(count[i]+" ");
        }
        System.out.println();
        Input.close();
    }
}
