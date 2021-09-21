//package cpeng.peng_PA2;
import java.util.*;
import java.io.*;


public class test{

    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        Player p = new Player("Player");
        Player ai = new Player("Opponent");
        p.promptStats(Input);
        ai.generateStats((int)(Math.random()*30)+20);
        HashMap<Integer,String> moves = new HashMap<Integer,String>();
        moves.put(0,"attacked");moves.put(1,"used magic");
        moves.put(2,"defended");moves.put(3,"healed");
        while(p.hp>0&&ai.hp>0){
            System.out.println("Your opponent's stats:");
            ai.printStats();
            System.out.println("Your stats:");
            p.printStats();
            int input=-1;
            while(input<0||input>3){
                System.out.println("What action will you take against your opponent?"+ 
                                " {1: attack,2: spell,3: defend,4:heal}");
                input = Input.nextInt();
                input--;
                if(input<4&&input>=0)break;
                else System.out.println("Not a valid move");
            }
            int aimove = ai.generateMoveAgainst(p);
            System.out.println("you "+moves.get(input));
            System.out.println("your opponent "+moves.get(aimove));
            p.doAction(input, ai, aimove);
            
        }
        if(p.hp<=0)System.out.println("YOU LOSE!");
        else System.out.println("YOU WIN!");
        Input.close();
    }
}
