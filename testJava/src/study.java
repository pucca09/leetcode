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
            //add()��offer()�������Ԫ�أ���ͬ���ǣ�add()���׳����󣬶�offer�᷵��false
            q.offer(input);
            input = in.nextInt();


        }
        int size = q.size();
        int[] a = new int[size-1];
        for(int i = 0;i<size-1;i++){
            a[i] = q.poll();//poll()�Ƿ��ص�ͬʱ�Ƴ�ͷ��Ԫ�أ���peak()��������,����Ϊ��ʱ������null
        }
        System.out.println("a[] is:");
        for(int item: a){
            System.out.println(item);
        }
        System.out.println("queue size is:"+size);//size()�������ض��еĴ�С
        System.out.println(q.isEmpty());//isEmpty�������Զ����Ƿ�Ϊ�գ�Ϊ�շ���true,���򷵻�false

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
            a[i] = s.pop();//pop()�Ƿ��ص�ͬʱ�Ƴ�β��Ԫ�أ���peak()��������,ջΪ��ʱ������null
        }
        System.out.println("a[] is:");
        for(int item: a){
            System.out.println(item);
        }
        System.out.println("queue size is:"+size);//size()�������ض��еĴ�С
        System.out.println(s.empty());//empty()�������Զ����Ƿ�Ϊ�գ�Ϊ�շ���true,���򷵻�false


    }

    public static void main(String[] args){
        stack();
    }
}
