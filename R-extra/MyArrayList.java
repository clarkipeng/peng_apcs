public class MyArrayList{
    int arr[];
    int size;
    public MyArrayList(){
        size = 0;
    }
    public MyArrayList(int newarr[]){
        arr = newarr.clone();
        size = arr.length;
    }
    public void push(int i){
        int[] newarr = new int[++size];
        for(int j =0 ; j< size-1;j++){
            newarr[j] = arr[j];
        }
        newarr[size-1] = i;
        arr = newarr;
    }
    public void insert(int index,int val){
        if(index<0||index>=size)return;
        int[] newarr = new int[++size];
        int i =0;
        for(int j =0 ; j< size-1;j++){
            if(j==index){
                newarr[i++] = val;
            }
            newarr[i++] = arr[j];
        }
        arr = newarr;
    }
    public void  pop(){
        if(size==0)return;
        int[] newarr = new int[--size];
        for(int j =0 ; j< size;j++){
            newarr[j] = arr[j];
        }
        arr = newarr;
    }
    public void remove(int index){
        if(index<0||index>=size)return;
        int[] newarr = new int[--size];
        int i =0;
        for(int j =0 ; j< size+1;j++){
            if(j==index+1){
                i--;
            }
            newarr[i++] = arr[j];
        }
        arr = newarr;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public String toString(){
        String ret = "";
        for(int i = 0; i < size;i++){
            ret+=(char)(arr[i]+'0')+" ";
        }
        return ret;
    }
}