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
        b.setFirst("wassuphomes");
        b.changeScheduleClass('H',"jeepsers");
        b.changeScheduleClass('A',"send help");
        b.changeScheduleTime('B',4.20);//me funny
        b.changeScheduleTime('A',6.90);//me funny
        a.print();
        b.print();
        c.print();
    }
}
