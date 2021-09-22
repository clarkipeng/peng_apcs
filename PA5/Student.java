public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int grade;
    private Schedule schedule;
    public Student(){
        firstName="John";
        lastName = "Doe";
        age = 15;
        grade = 10;
        schedule = new Schedule();
    }
    public Student(Student other){
        firstName=other.firstName;
        lastName=other.lastName;
        age = other.age;
        grade = other.grade;
        schedule = new Schedule(other.schedule);
    }
    public Student(String fname,String lname, int ag,int grad,Schedule schdul){
        firstName=fname;
        lastName=lname;
        age=ag;
        grade=grad;
        schedule=new Schedule(schdul);
    }
    public void setFirst(String s){firstName=s;}
    public void setLast(String s){lastName=s;}
    public void setAge(int i){age = i;}
    public void setGrade(int i){grade = i;}
    public void changeScheduleTime(int index,double newtime){schedule.changeTime(index,newtime);}
    public void changeScheduleClass(int index,String newClass){schedule.changeClass(index,newClass);}
    public void changeScheduleTime(char index,double newtime){schedule.changeTime((int)(index-'A'),newtime);}
    public void changeScheduleClass(char index,String newClass){schedule.changeClass((int)(index-'A'),newClass);}
    public String getFirst(){return firstName;}
    public String getLast(){return firstName;}
    public int getAge(){return age;}
    public int getGrade(){return grade;}
    public double getScheduleTime(int index){return schedule.getTime(index);}
    public String getScheduleClass(int index){return schedule.getClass(index);}
    public double getScheduleTime(char index){return schedule.getTime((int)(index-'A'));}
    public String getScheduleClass(char index){return schedule.getClass((int)(index-'A'));}
    public void print(){
        System.out.printf("%s %s \n",firstName,lastName);
        System.out.printf("Age : %d, Grade : %d \n",age,grade);
        schedule.print();
    }

}
