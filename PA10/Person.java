import java.util.ArrayList;
public class Person{
    static ArrayList<Person> people = new ArrayList<Person>();
    String firstName,lastName;
    int age, yearsOfExperience;
    public Person(String f,String l){
        firstName = f;
        lastName = l;
    }
    public Person(){
        firstName = "John";
        lastName = "Doe";
    }
    public void print(){
        System.out.printf("%s %s ",
                        firstName,lastName);
    }
}