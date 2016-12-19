import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/28 0028.
 */
public class queue {
    private class Node{
        String item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;
    public boolean isEmpty(){return first == null;}
    public void add(String item){
        Node tmp = last;
        last = new Node();
        last.item = item;
        //!important
        if(isEmpty()){
            first = last;
        }else{
            tmp.next = last;
        }
        N++;
    }
    public String remove(){
        Node tmp = first.next;
        String item = first.item;
        //£¡important
        if(isEmpty()){last =null;}
        first = tmp;
        N--;
        return item;

    }
    public int size(){
        return N;
    }
    public static void main(String[] args){
        queue q = new queue();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while(input.equals("$") == false){
            q.add(input);
            input = in.nextLine();

        }
        System.out.println(q.remove());
        System.out.println(q.size());
    }

}
