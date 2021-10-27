import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]){
        MyArrayList a = new MyArrayList();
        a.push(1);
        System.out.println(a.toString());
        a.push(1);
        System.out.println(a.toString());
        a.push(1);
        System.out.println(a.toString());
        a.push(2);
        System.out.println(a.toString());
        a.insert(1,7);
        System.out.println(a.toString());
        a.remove(1);
        System.out.println(a.toString());
        a.pop();
        System.out.println(a.toString());
    }
}
