import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Player you = new Player();
        Player opp = new Player();
        you.queryBoard();
        opp.generateBoard();
        // opp.printBoardYourself();
        int x,y;
        while (you.alive() && opp.alive()) {
            x=10;y=10;
            System.out.println("Oppenent's Board:");
            opp.printBoardOpponet();
            while((x>9||x<0)||(y>9||y<0)){
                System.out.println("Which cell do you want to attack? x y => (x,y)");
                x = sc.nextInt();y = sc.nextInt();
                if((x>9||x<0)||(y>9||y<0)) System.out.print("RETRY. ");
            }
            opp.attacked(x, y);
            int[] move =opp.attack(you);
            x = move[0];
            y = move[1];
            System.out.println("The Oppenent attacks you at " +x + " " + y + " !");
            you.attacked(x, y);
            System.out.println("Your Board: ");
            you.printBoardYourself();
        }
    }
}
/*
0 
4 1
0 
4 2
0 
4 3
0 
4 4
0 
4 5
*/