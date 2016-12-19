/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 *
 * �����ַ����е�Ƕ���б�
 * Difficulty:Medium
 */

public class MiniParser_385 {
    /*
    public NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        String tokenNum = ""; //��¼ɨ�赽������
        for (char c : s.toCharArray()) {
            switch (c) {
                case '['://[����һ��list
                    stack.push(new NestedInteger()); //�������б���󣬲�ѹ��ջ��
                    break;
                case ']'://list��β
                    if (!tokenNum.equals(""))//ǰ��tokenΪ����
                        stack.peek().add(new NestedInteger(Integer.parseInt(tokenNum)));//�����ּ��뵽����list��
                    NestedInteger ni = stack.pop();//����list����
                    tokenNum = "";
                    if (!stack.isEmpty()) {//ջ���и��߲�ε�list
                        stack.peek().add(ni);
                    } else {//ջΪ�գ��������ַ�����β
                        return ni;
                    }
                    break;
                case ',':
                    if (!tokenNum.equals("")) //�����ּ��뵽����list��
                        stack.peek().add(new NestedInteger(Integer.parseInt(tokenNum)));
                    tokenNum = "";
                    break;
                default:
                    tokenNum += c;
            }
        }
        if (!tokenNum.equals(""))//����case: ����ַ���ֻ�������ֵ����
            return new NestedInteger(Integer.parseInt(tokenNum));
        return null;
    }
    */
}

