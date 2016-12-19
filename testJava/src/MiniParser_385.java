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
 * 解析字符串中的嵌套列表
 * Difficulty:Medium
 */

public class MiniParser_385 {
    /*
    public NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        String tokenNum = ""; //记录扫描到的数字
        for (char c : s.toCharArray()) {
            switch (c) {
                case '['://[代表一个list
                    stack.push(new NestedInteger()); //创建新列表对象，并压入栈中
                    break;
                case ']'://list结尾
                    if (!tokenNum.equals(""))//前面token为数字
                        stack.peek().add(new NestedInteger(Integer.parseInt(tokenNum)));//将数字加入到本层list中
                    NestedInteger ni = stack.pop();//本层list结束
                    tokenNum = "";
                    if (!stack.isEmpty()) {//栈内有更高层次的list
                        stack.peek().add(ni);
                    } else {//栈为空，遍历到字符串结尾
                        return ni;
                    }
                    break;
                case ',':
                    if (!tokenNum.equals("")) //将数字加入到本层list中
                        stack.peek().add(new NestedInteger(Integer.parseInt(tokenNum)));
                    tokenNum = "";
                    break;
                default:
                    tokenNum += c;
            }
        }
        if (!tokenNum.equals(""))//特殊case: 如果字符串只包含数字的情况
            return new NestedInteger(Integer.parseInt(tokenNum));
        return null;
    }
    */
}

