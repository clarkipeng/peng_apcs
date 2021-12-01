import java.util.*;
import java.io.*;
public class Logo {
    int maxx,maxy;
    int index=0;
    char[] col= {'&','%','*','#','@'};
    char[][] design = 
   {{'.','.','&','&','&','&','&','&','&','&','.','.','.','.','.','.','&','&','&','&','&','&','&','&','&','.'},
    {'.','.','&','.','.','.','.','&','.','.','&','.','.','.','.','.','&','.','.','.','&','.','.','.','.','&'},
    {'.','&','.','.','.','.','.','&','.','.','.','&','.','.','.','&','.','.','.','&','.','.','.','.','.','&'},
    {'&','.','.','.','.','&','&','.','.','.','.','&','.','.','&','.','.','.','&','.','.','.','.','&','&','.'},
    {'&','&','&','&','&','.','.','.','.','.','.','.','&','.','.','.','.','.','&','&','&','&','.','.','.','.'},
    {'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
    {'.','.','.','.','.','.','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','.','.','.','.','.'},
    {'.','&','&','&','&','&','&','&','&','.','.','.','.','.','.','&','&','&','&','&','&','&','&','.','.','.'},
    {'.','.','.','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','.','.','.','.','.','.','.','.'},};

    double vx,vy;
    double x,y;
    public Logo(int mx,int my){
        maxx =mx-design[0].length;
        maxy = my-design.length;
        x = Math.random()*maxx;
        y = Math.random()*maxy;
        vy = Math.random()*.5+.25;
        vx = Math.sqrt(1-vy*vy);
    }
    public int step(){
        x+=vx;
        y+=vy;
        int hit = 0;;
        if(y>=maxy){
            y = 2*maxy-y;
            vy = -vy;
            hit++;
        }
        if(y<=0){
            y = -y;
            vy = -vy;
            hit++;
        }
        if(x>=maxx){
            x= 2*maxx-x;
            vx = -vx;
            hit++;
        }
        if(x<=0){
            x = -x;
            vx = -vx;
           hit++;
        }
        if(hit>0){
            for(int i = 0; i< design.length;i++){
                for(int j = 0; j < design[i].length;j++){
                    if(design[i][j]==col[index]){
                        design[i][j] = col[(index+hit)%5];
                    }
                }
            }
            index=(index+hit)%5;
        }
        return hit/2;
    }
    public void write(char[][] board){
        for(int i = 0; i< design.length;i++){
            for(int j = 0; j < design[i].length;j++){
                board[i+(int)Math.round(y)][j+(int)Math.round(x)] = design[i][j];
            }
        }
    }
    public void print(){
        for(int i = 0; i< design.length;i++){
            for(int j = 0; j < design[i].length;j++){
                if(design[i][j]=='.'){
                    System.out.print(" ");
                    continue;
                }

                System.out.print(design[i][j]);
            }
            System.out.println();
        }
    }
}
