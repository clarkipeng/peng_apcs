import java.util.*;
import java.io.*;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static String read(){
        // return s.nextLine().replaceAll("\\s", "");
        return s.nextLine();
    }
    public static void main(String[] args){
        Dmvqueue q = new Dmvqueue();
        while(true){
            System.out.println("WHAT DO YOU WANT DO? (push,pop,print,search,clear");
            String op = read();
            if(op.equals("push")){
                System.out.println("WHO DO YOU WANT TO ADD?");
                q.push(read());
                System.out.println("ADDED");
            }else if(op.equals("pop")){
                String res = q.pop();
                if(res.equals("ERROR")){
                    System.out.println("FAILED: NO ONE IN QUEUE");
                }
                else{
                    System.out.println(res + " WAS REMOVED");
                }
            }else if(op.equals("print")){
                q.print();
                System.out.println("DONE");
            }else if(op.equals("search")){
                System.out.println("WHO DO YOU WANT TO SEARCH FOR?");
                int res =q.find(read());
                if(res>0){
                    System.out.println("FOUND AT POSITION "+res);
                }
                else{
                    System.out.println("NOT FOUND");
                }
            }else if(op.equals("clear")){
                System.out.println("CLEARED");
                q.clear();
            }
            else{
                System.out.println("OPERATION NOT RECOGNIZED");
            }
            System.out.println();
        }
    }
}
