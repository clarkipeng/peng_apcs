import java.util.*;
import java.io.*;
public class binarysort {
    public static ArrayList<Integer> arr = new ArrayList<Integer>();


    public static int bsl(int val){
        int l = 0,r = arr.size()-1,m=0;
        while(l<=r){
            m = (l+r)/2;
            if(arr.get(m)<val){
                l = m+1;
            }
            else if(arr.get(m)==val){
                return m;
            }
            else{
                r = m-1;
            }
        }
        return -1;
    }
    public static int recurse(int val,int l, int r){
        if(arr.get(l)==val)return l;
        if(arr.get(r)==val)return r;
        if(l>r)return -1;
        int m = (l+r)/2;
        if(arr.get(m)<=val){
            return recurse(val,m+1,r);
        }
        else{
            return recurse(val,l,m-1);
        }
    }
    public static int bsr(int val){
        return recurse(val,0,arr.size()-1);
    }
    public static void main(String[]args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while((line=br.readLine())!=null){
                arr.add(Integer.parseInt(line));
            }
            Collections.sort(arr);
            System.out.println(bsl(138)+" "+bsr(138));
        }
        catch(IOException e){

        }
    }
}
