import java.io.*;
import java.util.*;

public class Player{
    String name;
    double hp;
    int pd=0,md=0;//hp = health, pd = physical defense, md = magic defense;

    public Player(String name){
        this.name = name;
        hp = 10;
        pd = 0;
        md = 0;
    }
    public void printStats(){
        System.out.println("HP: "+ hp+"| Physical Defense: "+pd+" | Magical Defense: "+md);
    }
    public void promptStats(Scanner Input){
        // Scanner s = new Scanner(System.in);
        int points = 20;
        while(points>0){
            int i = 21;
            while(i >points){
                System.out.println("How many points do you want in physical defense? "
                                    + points+" points left");
                i = Input.nextInt();
                if(i>points)System.out.println("Not enough points");
            }
            pd += i;
            points-=i;
            i=21;
            while(i >points){
                System.out.println("How many points do you want in magic defense? "
                                    + points+" points left");
                i = Input.nextInt();
                if(i>points)System.out.println("Not enough points");
            }
            md += i;
            points-=i;
            if(points>0)System.out.println("You still have points left");
        }
        // s.close();
    }
    public void doAction(int pa, Player p1,int p1a){
        //a =action = 0 = physical, 1 = spell, 2 = defense, 3 = heal.
        switch(pa){
            case 0:{
                switch(p1a){
                    case 0:break;
                    case 1:{
                        getAttacked(p1,this,pa);
                        break;
                    }
                    case 2:{
                        Attackrepelled(p1,this,pa);
                        break;
                    }
                    case 3:{
                        heal(p1);
                        getAttacked(p1,this,pa);
                        break;
                    }
                }
                break;
            }
            case 1:{
                switch(p1a){
                    case 0:{
                        getAttacked(this,p1,p1a);
                        break;
                    }
                    case 1:break;
                    case 2:{
                        getAttacked(p1,this,pa);
                        break;
                    }
                    case 3:{
                        heal(p1);
                        getAttacked(p1,this,pa);
                        break;
                    }
                }
                break;
            }
            case 2:{
                switch(p1a){
                    case 0:{
                        Attackrepelled(this,p1,p1a);
                        break;
                    }
                    case 1:{
                        getAttacked(this,p1,p1a);
                        break;
                    }
                    case 2:break;
                    case 3:{
                        heal(p1);
                        break;
                    }
                }
                break;
            }
            case 3:{
                heal(this);
                switch(p1a){
                    case 0:{
                        getAttacked(this,p1,p1a);
                        break;
                    }
                    case 1:{
                        getAttacked(this,p1,p1a);
                        break;
                    }
                    case 2:{
                        break;
                    }
                    case 3:{
                        heal(p1);
                        break;
                    }
                }
                break;
            }
        }
    }
    public void Attackrepelled(Player defender,Player attacker,int attacktype){
        if(attacktype==0){
            attacker.hp-=.5;
            System.out.println(attacker.name+"'s attack was reflected!");
        }
    }
    public void getAttacked(Player defender,Player attacker,int attacktype){
        if(attacktype==0){
            if(rollattack()>=defender.pd){
                defender.subHealth(1);
                System.out.println(attacker.name+"'s attack worked!");
            }
            else System.out.println(attacker.name+"'s attack failed!");
        }
        else if(attacktype ==1){
            if(rollattack()>=defender.md){
                defender.subHealth(1);
                System.out.println(attacker.name+"'s attack worked!");
            }
            else System.out.println(attacker.name+"'s attack failed!");
        }
    }
    public int rollattack(){
        return (int)(Math.random()*31);
    }
    public void heal(Player a){
        a.addHealth(0.5);
        System.out.println(a.name+" Healed!");
    }
    public void generateStats(int param){//param is max points
        pd = param/2+(int)(Math.random()*param/2);
        md =param-pd;
    }
    public int generateMoveAgainst(Player enemy){
        double move = Math.random();
        double ppa,pma,pd,ph; //probability of physical,magic atacks, defense, healing
        double scale=0;
        ppa = (30-enemy.pd)-0.5*(enemy.pd);
        pma = Math.max(0.0,ppa);
        pma = (30-enemy.md)-1*(30-this.pd);
        pma = Math.max(0.0,pma);
        pd=(0.5*(this.pd)-(30-this.pd))-(30-this.md)+1*(30-enemy.pd);
        pd = Math.max(0.0,pd);
        if(hp==10) ph=0;
        else ph = 30*.5+0.5*(this.pd)-(30-this.pd)-((30-this.md)+1*(30-enemy.pd));
        ph = Math.max(0.0,ph);
        ppa+=5;pma+=5;pd+=5;
        scale =ph+pd+ppa+pma;
        if(move<=ppa/scale)return 0;
        else if (move<=(ppa+pma)/scale)return 1;
        else if (move<=(ppa+pma+pd)/scale)return 2;
        else if (move<=(ppa+pma+pd+ph)/scale)return 3;
        return -1;
    }
    public void addHealth(double delta){
        hp+=delta;
        hp = Math.min(10,hp);
    }
    public void subHealth(double delta){
        hp-=delta;
    }
}