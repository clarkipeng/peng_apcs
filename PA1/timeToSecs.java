// package cpeng.peng_apcs.assignments;
import java.util.*;
// import java.io.*;

public class timeToSecs {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int h,m,s;
        System.out.println("gimme the hours (Integer)");
        h = sc.nextInt();
        System.out.println("gimme the minutes (Integer)");
        m = sc.nextInt();
        System.out.println("gimme the seconds (Integer)");
        s = sc.nextInt();
        System.out.println(h*3600+m*60+s+" seconds.");
        sc.close();
    }
}
