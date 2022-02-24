import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]){
        BadStack s = new BadStack();
        s.push(1);
        System.out.println(s.pop());
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(9);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
