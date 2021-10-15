/*
  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
  有效字符串需满足：
  左括号必须用相同类型的右括号闭合。
  左括号必须以正确的顺序闭合。
  来源：力扣（LeetCode）
  链接：https://leetcode-cn.com/problems/valid-parentheses
  著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

import org.junit.Test;

import java.util.Stack;

public class Num0020isValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(stack.empty()){
                    stack.push(s.charAt(i));
                }else{
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                }
            }
            if(s.charAt(i)==']'){
                if(stack.empty()){
                    stack.push(s.charAt(i));
                }else{
                    if(stack.peek()=='['){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                }
            }
            if(s.charAt(i)=='}'){
                if(stack.empty()){
                    stack.push(s.charAt(i));
                }else{
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                }
            }
        }
        return stack.empty();
    }
    @Test
    public void test1(){
        boolean flag = isValid("]");
        System.out.println(flag);
    }
}
