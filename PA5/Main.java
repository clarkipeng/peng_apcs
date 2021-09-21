import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]){
        Student a = new Student();
        Student b = new Student(a);
        Schedule t = new Schedule(new String[] {"Math", "Science","Art","English","History","Language","Elective","StudyHall"},
        new double[] {1,2,3,4,5,6,7,8});
        Student c = new Student("Hello","itis",18,12,t);
        b.setAge(9);
        b.setFirst("fartMan");
        b.changeScheduleClass(4,"Farting time");
        b.changeScheduleClass(0,"send help");
        b.changeScheduleTime(4,42069);//me funny
        a.print();
        b.print();
        c.print();
    }
}
