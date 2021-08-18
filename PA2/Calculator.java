//package cpeng.peng_PA2;
import java.util.*;
// import java.io.*;


public class Calculator{
    //pow funct
    public static long power(int base,int exponent){
        long ans = base;
        while(exponent>0){
            ans*=exponent;
            exponent--;
        }
        return ans;
    }
    //check if opereator exists
    public static boolean opexist(char op){
        switch(op){
            case '+':return true;
            case '-':return true;
            case '*':return true;
            case 'X':return true;
            case 'x':return true;
            case '/':return true;
            case '%':return true;
            case '^':return true;
            default : return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int Numinput1,Numinput2;
        char operator;
        while(true){
            System.out.println("Give me a math expression with two ints (int__Operator__int");
            Numinput1 = sc.nextInt();operator = sc.next().charAt(0);Numinput2 = sc.nextInt();
            //check if within num constraints
            if(Math.abs(Numinput1)>=1000||Math.abs(Numinput2)>=1000){
                System.out.println("Num out-of-bounds");
                break;
            }
            //check if operator is known
            if(!opexist(operator)){
                System.out.println("Operator unknown");
                break;
            }
            //print ans to operation
            System.out.print(Numinput1+" "+operator+" "+Numinput2+" = ");
            switch(operator){
                case '+':System.out.print(Numinput1+Numinput2);break;
                case '-':System.out.print(Numinput1-Numinput2);break;
                case '*':System.out.print(Numinput1*Numinput2);break;
                case 'x':System.out.print(Numinput1*Numinput2);break;
                case 'X':System.out.print(Numinput1*Numinput2);break;
                case '/':System.out.print(((double)Numinput1)/Numinput2);break;
                case '%':{
                    if(Numinput1%Numinput2==0)System.out.print("divisible");
                    else System.out.print("not divisible");
                }
                case '^':System.out.print(power(Numinput1,Numinput2));break;
            }
            System.out.println();
        }
    }
}
