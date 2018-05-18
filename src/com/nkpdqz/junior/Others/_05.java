package com.nkpdqz.junior.Others;

import java.util.Stack;

public class _05 {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
            }else if (aChar == '['){
                stack.push(aChar);
            }else if (aChar == '{'){
                stack.push(aChar);
            }else if (aChar == ')'){
                if (stack.empty()){
                    return false;
                }else {
                    char top = (char) stack.peek();
                    if (top != '('){
                        return false;
                    }
                    stack.pop();
                }
            }else if (aChar == ']'){
                if (stack.empty()){
                    return false;
                }else {
                    char top = (char) stack.peek();
                    if (top != '['){
                        return false;
                    }
                    stack.pop();
                }
            }else if (aChar == '}'){
                if (stack.empty()){
                    return false;
                }else {
                    char top = (char) stack.peek();
                    if (top != '{'){
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        if (!stack.empty())
            return false;
        return true;
    }

}
