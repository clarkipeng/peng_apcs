import java.util.*;
public class Person implements Comparable<Person> {
    String Lname,Fname,age;
    public Person(){

    }
    public void setFirstName(String s){
        Fname=s;
    }
    public void setLastName(String s){
        Lname=s;
    }
    public void setAge(String a){
        age = a;
    }
    @Override
    public int compareTo(Person comparestu) {
        // int compareage=(int)((Person)comparestu).Lname.charAt(0);
        return (int)(((Person)this).Lname).compareTo(((Person)comparestu).Lname);
    }
}
