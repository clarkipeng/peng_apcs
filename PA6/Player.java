import java.io.*;
import java.util.*;


public class Player {
     Ship[] Ships = new Ship[5];
    char[][] board =new char[10][10];
    boolean[][] Shipplacements=new boolean[10][10];
    public Player(){
        for(int i = 0; i <10;i++){
            for(int j = 0; j <10;j++){
                board[i][j]=' ';
            }   
        }
        genShip();
    }
    public void queryBoard(){
        Scanner sc = new Scanner(System.in);
        //place Ships;
        int cmd;
        
        System.out.println("Welcome to BattleShip!");
        for(int i = 0; i < 5;i++){
            int x,y;
            Ships[i].printOr();
            System.out.println("Place This Ship On ");
            printShip();
            while(true){
                System.out.println("Current Orientation: ");
                Ships[i].printOr();
                while(true){
                    System.out.println("DO YOU WANT TO ROTATE THIS Ship 90? 1(Yes)/0(NO)");
                    cmd = sc.nextInt();
                    if(cmd==0)break;
                    Ships[i].rotate();
                    System.out.println("Current Orientation: ");
                    Ships[i].printOr();
                }
                System.out.println("give coordinates (x,y) ");
                x= sc.nextInt();y=sc.nextInt();
                if(Ships[i].placeShip(x,y))  {
                    System.out.println("PLACED");
                    break;
                }
                else  System.out.println("FAILED...RETRY");
            }
        }
    }
   public void generateBoard(){
       for(int i =0 ; i < 5;i++){
           int x = (int) (10*Math.random());
           int y = (int) (10*Math.random());
           for(int j = 0; j <Math.random()*4;j++) Ships[i].rotate();
           while(!Ships[i].placeShip(x,y)){
                x = (int) (10*Math.random());
                y = (int) (10*Math.random());
                for(int j = 0; j <Math.random()*4;j++) Ships[i].rotate();
           }
       }
   } 
    public void genShip(){
        int[][] coords={{-2,0},{-1,0},{0,0},{1,0},{2,0}};
        Ships[0] = new Ship(coords);
        int[][] coords1={{-1,0},{0,0},{1,0},{2,0}};
        Ships[1] = new Ship(coords1);
        int[][] coords2={{-1,0},{0,0},{1,0}};
        Ships[2] = new Ship(coords2);
        int[][] coords3={{-1,0},{0,0},{1,0}};
        Ships[3] = new Ship(coords3);
        int[][] coords4={{0,0},{1,0}};
        Ships[4] = new Ship(coords4);
    }
    public void printBoardYourself(){
        System.out.println("0,0---------9,0");
        for(int i = 0; i  <10;i++){
            System.out.print(" |");
            for(int j = 0; j  <10;j++){
                if(board[i][j]!=' ')System.out.print(board[i][j]);
                else if(Shipplacements[i][j])System.out.print('@');
                else System.out.print(' ');
            }
            System.out.print(" |\n");
        }
        System.out.println("0,9---------9,9");
    }
    public void printBoardOpponet(){
        System.out.println("0,0---------9,0");
        for(int i = 0; i  <10;i++){
            System.out.print(" |");
            for(int j = 0; j  <10;j++){
                System.out.print(board[i][j]);
            }
            System.out.print(" |\n");
        }
        System.out.println("0,9---------9,9");
    }
    public  void printShip(){
        System.out.println("0,0---------9,0");
        for(int i = 0; i  <10;i++){
            System.out.print(" |");
            for(int j = 0; j  <10;j++){
                 if(Shipplacements[i][j])System.out.print('@');
                else System.out.print(' ');
            }
            System.out.print(" |\n");
        }
        System.out.println("0,9---------9,9");
    }
    public boolean alive(){
        for(int i = 0; i  <10;i++){
            for(int j = 0; j  <10;j++){
                if(Shipplacements[i][j]&&board[i][j]==' '){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean attacked(int x,int y){
        if(Shipplacements[x][y]){
            board[x][y]='X';
            return true;
        }
        else{
            board[x][y]='.';
            return false;
        }
    }
    public class Ship{
        int[][] coords;
        boolean vert=false;
        public Ship(int[][]coords){
            this.coords = coords;
        }
        public boolean placeShip(int posx,int posy){
            for(int i =0 ; i < coords.length;i++){
                if(coords[i][0]+posx>=10||coords[i][0]+posx<0)return false;
                if(coords[i][1]+posy>=10||coords[i][1]+posy<0)return false;
                if(Shipplacements[coords[i][1]+posy][coords[i][0]+posx]){
                    return false;
                }
            }
            for(int i =0 ; i < coords.length;i++){
                Shipplacements[coords[i][1]+posy][coords[i][0]+posx]=true;
            }
            return true;
        }
        public void rotate(){
            for(int i =0 ; i < coords.length;i++){
                int temp = coords[i][0];
                coords[i][0]=-coords[i][1];
                coords[i][1] = temp;
            }   
            vert = !vert;
        }
        public void printOr(){
            char[][] taken = new char[5][5];
            for(int i = 0; i < coords.length;i++){
                if(coords[i][1]==0&&coords[i][0]==0)taken[2+coords[i][1]][2+coords[i][0]]='O';
                else if(vert)taken[2+coords[i][1]][2+coords[i][0]]='|';
                else taken[2+coords[i][1]][2+coords[i][0]]='-';
            }
            for(int i =0 ; i < 5;i++){
                for(int j =0 ;j< 5;j++){
                    System.out.print(taken[i][j]);
                }
                System.out.println();
            }
        }
    }
    public int[] attack(Player opp){
        int x,y;
        do{
           x = (int)(Math.random()*10);
             y = (int)(Math.random()*10);
         } while(opp.board[x][y]!=' ');
         int[] ans ={x,y};
        return ans;
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