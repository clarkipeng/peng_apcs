import java.util.*;
import java.io.*;
public class myStudent{
    String Fname,Lname;
    int grade;
    ArrayList<Integer> 
     hwScores = new ArrayList<Integer>()
    ,readScores= new ArrayList<Integer>()
    ,quizScores= new ArrayList<Integer>()
    ,testScores= new ArrayList<Integer>();
    public myStudent(){
        Fname = "John";
        Lname = "Doe";
        grade = 6;

    }
    public void addData(String datatype,int score){
        if(datatype.equals("HOMEWORK")){
            hwScores.add(score);
        }else if(datatype.equals("READING")){
            readScores.add(score);
        }else if(datatype.equals("QUIZ")){
            quizScores.add(score);
        }else if(datatype.equals("TEST")){
            testScores.add(score);
        }
    }
    public void ToString(){
        int sum=0,total=0;double avg;
        System.out.println(Fname+" "+Lname);
        System.out.println("Grade: "+grade);
        for(int i = 0; i<hwScores.size();i++){
            sum+=hwScores.get(i);
        }
        for(int i = 0; i<readScores.size();i++){
            sum+=readScores.get(i);
        }
        for(int i = 0; i<quizScores.size();i++){
            sum+=quizScores.get(i);
        }
        for(int i = 0; i<testScores.size();i++){
            sum+=testScores.get(i);
        }
        total =  hwScores.size()+readScores.size()+quizScores.size()+testScores.size();
        avg = ((double)sum)/total;
        System.out.println("Overall Grade: " + avg+"% with "+total+" assignments");
        System.out.println("\nGrade Categories");
        
        {
            sum = 0;total = readScores.size();
            int min = 100,max = 0;
            for(int i = 0; i<readScores.size();i++){
                sum+=readScores.get(i);
                min = Math.min(min,readScores.get(i));
                max = Math.max(max,readScores.get(i));
            }
            avg = ((double)sum)/total;
            System.out.println("Reading: " + avg+"% with "+total+" assignments");
            System.out.println("Highest Score: "+max);
            System.out.println("Lowest Score: "+min);
        }
        {
            sum = 0;total = hwScores.size();
            int min = 100,max = 0;
            for(int i = 0; i<hwScores.size();i++){
                sum+=hwScores.get(i);
                min = Math.min(min,hwScores.get(i));
                max = Math.max(max,hwScores.get(i));
            }
            avg = ((double)sum)/total;
            System.out.println("Homework: " + avg+"% with "+total+" assignments");
            System.out.println("Highest Score: "+max);
            System.out.println("Lowest Score: "+min);
        }
        {
            sum = 0;total = quizScores.size();
            int min = 100,max = 0;
            for(int i = 0; i<quizScores.size();i++){
                sum+=quizScores.get(i);
                min = Math.min(min,quizScores.get(i));
                max = Math.max(max,quizScores.get(i));
            }
            avg = ((double)sum)/total;
            System.out.println("Quiz: " + avg+"% with "+total+" assignments");
            System.out.println("Highest Score: "+max);
            System.out.println("Lowest Score: "+min);
        }
        {
            sum = 0;total = testScores.size();
            int min = 100,max = 0;
            for(int i = 0; i<testScores.size();i++){
                sum+=testScores.get(i);
                min = Math.min(min,testScores.get(i));
                max = Math.max(max,testScores.get(i));
            }
            avg = ((double)sum)/total;
            System.out.println("Test: " + avg+"% with "+total+" assignments");
            System.out.println("Highest Score: "+max);
            System.out.println("Lowest Score: "+min);
        }
    }
}