//package cpeng.peng_PA2;
import java.util.*;
// import java.io.*;
class Student{
    private String firstName;
    private String lastName;
    private int[] Scores;
    public Student(){
        firstName = "John";
        lastName = "Doe";
        Scores = new int[5];
        for(int i = 0; i< 5;i++)Scores[i]=100-i;
    }
    public Student(Student other){
        firstName = other.firstName;
        lastName = other.lastName;
        Scores = new int[other.Scores.length];
        for(int i = 0; i < other.Scores.length;i++)Scores[i]=other.Scores[i];
    }
    public void printthings(){
        double avg=0;
        int size = Scores.length;
        sort(Scores);//least to greatest
        int maxScore=Scores[size-1];
        System.out.println(maxScore);
        for(int i = size-1; i >=0;i--){
            System.out.print(Scores[i]+" ");
            avg+=Scores[i];
        }
        System.out.println();
        avg/=size;
        System.out.println(avg);
    }
    public void sort(int[] ary){
        int j,temp,size = ary.length;
        for(int i = 1; i < size;i++){//insertsort
            j = i;
            temp = ary[i];
            while(true){
                //swap until you get to the end or the nextval is lesser
                ary[j]=ary[j-1];
                if(ary[j-1]<=temp){
                    ary[j]=temp;
                    break;
                }
                j--;
                if(j==0){
                    ary[0]=temp;
                    break;
                }
            }
        }
    }
}
public class studnet{
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        Student test = new Student();
        test.printthings();
    }
}
