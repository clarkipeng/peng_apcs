public class Dmvqueue {
    public class Node {
        Node next;
        String val;
        public Node(String nam){
            val = nam;
        }
    }
    Node front,back;
    int sz  = 0;
    public Dmvqueue(){
    }
    public void push(String v){
        if(sz==0){
            front =back =  new Node(v);
        }
        else{
            Node p = new Node(v);
            back.next=p;
            back = back.next;
        }
        sz++;
    }
    public String pop(){
        if(sz==0)return "ERROR";
        else{
            String val = front.val;
            front = front.next;
            sz--;
            return val;
        }
    }
    public int size(){
        return sz;
    }
    public void clear(){
        front = back = null;
        sz = 0;
    }
    public void print(){
        int count = 0;
        for(Node cur = front; cur!=null;cur=cur.next){
            System.out.println(cur.val +" : position " + (++count));
        }
    }
    public int find(String nam){
        int count = 0;
        for(Node cur = front; cur!=null;cur=cur.next){
            count++;
            if(cur.val.equals(nam)){
                return count;
            }
        }
        return -1;
    }
}
