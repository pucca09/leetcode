import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/28 0028.
 */
public class stack {
    //此处Item的类型为String
    private class Node{
        String item;
        Node next;
    }
    private Node first;
    private int N;
    public String pop(){
        Node tmp = first.next;
        String item = first.item;
        first = tmp;
        N--;
        return item;
    }
    public void push(String item){
        Node tmp = new Node();
        tmp.item = item;
        tmp.next = first;
        first = tmp;
        N++;
    }
    public int size(){
        return N;
    }
    public static void main(String[] args){
        stack s = new stack();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while(input.equals("$") == false){
            s.push(input);
            input = in.nextLine();

        }
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
