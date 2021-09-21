public class Schedule {
    String[] classes;
    double[] times;
    public Schedule(){
        classes = new String[] {"studyhall","studyhall","studyhall","studyhall",
        "studyhall","studyhall","studyhall","studyhall",};
        times = new double[] {90,90,90,90,
        90,90,90,90,};
    }
    public Schedule(Schedule other){
        classes=other.classes.clone();
        times=other.times.clone();
    }
    public Schedule(String[] clss, double[] tims){
        classes = new String[clss.length];
        times = new double[clss.length];
        for(int i =0; i < clss.length;i++){
            classes[i]=clss[i];
            times[i]=tims[i];
        }
    }
    public void changeClass(int i,String s){classes[i]=s;}
    public String getClass(int i){return classes[i];}
    public void changeTime(int i,double d){times[i]=d;}
    public double getTime(int i){return times[i];}

    public void print(){
        for(int i= 0; i < classes.length;i++){
            String spaces = "";
            for(int j = 0; j < 26-classes[i].length();j++)spaces+=" ";
            System.out.printf("Period %c : %s %s Time: %f \n",(char)('A'+i),classes[i],spaces,times[i]);
        }
        return;
    }
}
