import java.io.*;
import java.util.*;
public class Menu{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String line;
        while(true){
            System.out.println("what do you want to do? [Add (a) ,print (p) ,stop (s), find (f) ]");
            line = s.next();
            if(line.equals("a")){
                System.out.println("who are you adding? [athelete (a) ,staff (s)");
                line = s.next();
                if(line.equals("a")){
                    System.out.println("Give me first name, last name, favorite event,best run, best swim, best bike times and expereince in running, swimming, and biking");
                    Athlete ath = new Athlete(s.next(),s.next(),s.next(),Float.parseFloat(s.next()),Float.parseFloat(s.next()),Float.parseFloat(s.next()),Integer.parseInt(s.next()),Integer.parseInt(s.next()),Integer.parseInt(s.next()));
                }
                else if(line.equals("s")){
                    System.out.println("Give me first name, last name, certification, issuer, and location of Work");
                    Staff staf = new Staff(s.next(),s.next(),s.next(),s.next(),s.next());
                }
            }
            else if(line.equals("p")){
                System.out.println("what do you want to print [all athletes (a) ,all staff (s) ,all people (p) ]");
                line = s.next();
                if(line.equals("a")){
                    if(Athlete.athletes.size()==0){
                        System.out.println("no one yet");
                        continue;
                    }
                    for(Athlete a : Athlete.athletes){
                        a.print();
                    }
                }
                if(line.equals("s")){
                    if(Staff.allStaff.size()==0){
                        System.out.println("no one yet");
                        continue;
                    }
                    for(Staff st : Staff.allStaff){
                        st.print();
                    }
                }
                if(line.equals("p")){
                    if(Person.people.size()==0){
                        System.out.println("no one yet");
                        continue;
                    }
                    for(Person p : Person.people){
                        p.print();
                    }
                }
            }
            else if(line.equals("s")){
                break;
            }
            else if (line.equals("f")){
                System.out.println("in what event do you want to find the fastest althete [all events (a) , run (r) , swim (s), bike(b) ]");
                line = s.next();
                Athlete best =  Athlete.athletes.get(0);
                if(line.equals("a")){
                    for(Athlete a: Athlete.athletes){
                        if(a.overallTime()<best.overallTime()){
                            best = a;
                        }
                    }
                }
                else if (line.equals("r")){
                    for(Athlete a: Athlete.athletes){
                        if(a.pbRun<best.pbRun){
                            best = a;
                        }
                    }
                }
                else if (line.equals("s")){
                    for(Athlete a: Athlete.athletes){
                        if(a.pbSwim<best.pbSwim){
                            best = a;
                        }
                    }
                }
                else if (line.equals("b")){
                    for(Athlete a: Athlete.athletes){
                        if(a.pbBike<best.pbBike){
                            best = a;
                        }
                    }
                }
                best.print();
            }
        }
    }
}