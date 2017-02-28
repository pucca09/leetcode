import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by chenqingqing on 2017/2/23.
 */
public class stack_queue_07 {
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();
    private Queue<Integer> q1 = new LinkedList<Integer>();
    private Queue<Integer> q2 = new LinkedList<Integer>();
    public void appendTail(int data){
        s1.push(data);

    }
    public int deleteHead(){
        if(s2.empty() == false){
            return s2.pop();
        }else{
            while(s1.empty() == false){
                s2.push(s1.pop());
            }
            return s2.pop();
        }

    }
    public void pushStack(int data){
        if(q1.isEmpty() == false){
            q1.add(data);
        }else{
            q2.add(data);
        }

    }
    public int popStack(){
        if(q1.isEmpty()==false){
            if(q1.size() == 1){
                return q1.remove();
            }else{
                while(q1.size() > 1){
                    q2.add(q1.remove());
                }
                return q1.remove();
            }

        }else{
            if(q2.size() == 1){
                return q2.remove();
            }else{
                while(q2.size() > 1){
                    q1.add(q2.remove());
                }
                return q2.remove();
            }

        }


    }
}
