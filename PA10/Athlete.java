import java.util.ArrayList;

public class Athlete extends Person {
    public static ArrayList<Athlete> athletes=new  ArrayList<Athlete>();
    String favoriteEvent;
    float pbRun,pbSwim,pbBike;
    int exRun,exSwim,exBike;
    int number;
    public Athlete(String fn,String ln,String fe,float r,float s, float b,int 
                    er,int es,int eb){
        super(fn,ln);
        favoriteEvent=fe;
        pbRun=r;pbSwim =s;pbBike =b;
        exRun=er;exSwim=es;exBike=eb;
        number=athletes.size();
        athletes.add(this);
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
