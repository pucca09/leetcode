package JZOffer;

import java.util.Stack;

/**
 * Created by chenqingqing on 2017/4/13.
 */
public class twoStackAsQueue_07 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if(stack2.empty() == false){
            return stack2.pop();

        }else{
            while(stack1.empty() == false){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

    }
}
