import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]){
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            // FileWriter f = new FileWriter("Output.txt");
            String line;
            myStudent me = new myStudent();
            while((line=br.readLine())!=null){
                StringTokenizer t = new StringTokenizer(line);
                String type = (t.nextToken()).toUpperCase();
                int val = Integer.parseInt(t.nextToken());
                me.addData(type,val);
            }
            me.ToString();
        }catch(IOException e){

        }

    }
}
