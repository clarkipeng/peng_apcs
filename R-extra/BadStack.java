public class BadStack {
    public class Node{
        int val;
        Node next;
        public Node(int v,Node nex){
            val = v;next = nex;
        }
    }
    Node nodetop;
    public BadStack(){
    }
    public void push(int v){
        if(nodetop==null){
            nodetop =new Node(v,null);
        }
        else{
            nodetop =new Node(v,nodetop);
        }
    }
    public int pop(){
        int ans = nodetop.val;
        Node n = nodetop.next;
        nodetop=null;
        nodetop =n;
        return ans;
    }
    public int top(){
        return nodetop.val;
    }
}
