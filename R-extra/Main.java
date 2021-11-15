import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]){
        try {
            BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
            FileWriter f = new FileWriter("Output.txt");
            String line;
            ArrayList<Person> people = new ArrayList<Person>();
            int k = 0;
            while((line=br.readLine())!=null){
                people.add(new Person());
                int i=0;
                int j=0;
                while(i<line.length()){
                    String in="";
                    while(i<line.length()&&line.charAt(i)!=','){
                        in+=line.charAt(i);
                        i++;
                    }
                    switch(j){
                        case 0:{
                            people.get(k).setFirstName(in);
                            break;
                        }
                        case 1:{
                            people.get(k).setLastName(in);
                            break;
                        }
                        case 2:{
                            people.get(k).setAge(in);
                            break;
                        }
                    }
                    i+=2;
                    j++;
                }
                k++;
            }
            f.write("BEFORE\n");
            for(int i =0 ; i< people.size();i++){
                f.write(people.get(i).Lname+", "+people.get(i).Fname+", "+people.get(i).age+'\n');
            }
            Collections.sort(people);
            f.write("AFTER\n");
            for(int i =0 ; i< people.size();i++){
                f.write(people.get(i).Lname+", "+people.get(i).Fname+", "+people.get(i).age+'\n');
            }
            f.close();
        }

        catch(IOException e){

        }
    }
}
