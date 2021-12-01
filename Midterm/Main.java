import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]){
        Logo l = new Logo(100,35);
        char[][] board= new char[35][100];
        int points = 0;
        while(true){
            for(int i = 0; i< board.length;i++){
                for(int j = 0; j < board[i].length;j++){
                    board[i][j]='.';
                }
            }
            System.out.println();
            points+=l.step();
            l.write(board);
            for(int j = 0; j < board[0].length+2;j++) {
                System.out.print('_');
            }
            System.out.print('\n');
            for(int i = 0; i< board.length;i++){
                System.out.print('|');
                for(int j = 0; j < board[i].length;j++){
                    if(board[i][j]=='.'){
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print(board[i][j]);
                }
                System.out.print('|');
                System.out.println();
            }
            for(int j = 0; j < board[0].length+2;j++) {
                System.out.print('^');
            }
            System.out.println("points: "+points);
            try{
                
                Thread.sleep(40);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}
