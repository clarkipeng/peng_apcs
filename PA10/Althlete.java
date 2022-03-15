import java.util.ArrayList;

public class Althlete extends Person {
    static ArrayList<Althlete> althletes=new  ArrayList<Althlete>();
    String favoriteEvent;
    float pbRun,pbSwim,pbBike;
    int number;
    public Althlete(String fn,String ln,String fe,float r,float s, float b){
        super(fn,ln);
        favoriteEvent=fe;
        pbRun =r;
        pbSwim =s;
        pbBike =b;
        number=althletes.size();
        althletes.add(this);
        super.people.add(this);
    }
    public float overallTime(){
        return pbRun+pbBike+pbSwim;
    }
    @Override
    public void print(){
        System.out.print("Athlete #"+number+" ");
        super.print();
        System.out.print('\n');
    }
}
