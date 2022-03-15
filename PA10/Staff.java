import java.util.ArrayList;
public class Staff extends Person {

    static ArrayList<Staff> allStaff= new ArrayList<Staff>();
    String certificationType, issuer, locationOfWork;
    public Staff(String fn,String ln,String ct,String i,String lw){
        super(fn,ln);
        certificationType=ct;
        issuer=i;
        locationOfWork=lw;
        allStaff.add(this);
        super.people.add(this);
    }
    @Override
    public void print(){
        System.out.print("(Staff) ");
        super.print();
        System.out.printf(" certified %s, by %s, works at %s",
                            certificationType,issuer,locationOfWork);
        System.out.print('\n');
    }
}
