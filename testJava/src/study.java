import java.util.*;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Administrator on 2016/11/28 0028.
 */
public class study {
    public static void queue(){
        Scanner in = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        int input = in.nextInt();
        while(input != -1){
            //add()和offer()都是添加元素，不同的是，add()会抛出错误，而offer会返回false
            q.offer(input);
            input = in.nextInt();


        }
        int size = q.size();
        int[] a = new int[size-1];
        for(int i = 0;i<size-1;i++){
            a[i] = q.poll();//poll()是返回的同时移除头部元素，而peak()仅仅返回,队列为空时均返回null
        }
        System.out.println("a[] is:");
        for(int item: a){
            System.out.println(item);
        }
        System.out.println("queue size is:"+size);//size()方法返回队列的大小
        System.out.println(q.isEmpty());//isEmpty方法测试队列是否为空，为空返回true,否则返回false

    }
    public static void stack(){
        Scanner in = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        int input = in.nextInt();
        while(input != -1){
            s.push(input);
            input = in.nextInt();


        }
        int size = s.size();
        int[] a = new int[size];
        for(int i = 0;i<size;i++){
            a[i] = s.pop();//pop()是返回的同时移除尾部元素，而peak()仅仅返回,栈为空时均返回null
        }
        System.out.println("a[] is:");
        for(int item: a){
            System.out.println(item);
        }
        System.out.println("queue size is:"+size);//size()方法返回队列的大小
        System.out.println(s.empty());//empty()方法测试队列是否为空，为空返回true,否则返回false


    }

    public static void main(String[] args){
        stack();
    }
}
