package _java.entrega;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ParentesisBalanceados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Deque<Character> stack = new ArrayDeque<>();
            String parenthesis = sc.nextLine();
            boolean balance = true;
            for (int i = 0; i < parenthesis.length(); i++) {
                char uCase = parenthesis.charAt(i);
                switch (uCase) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(uCase);
                        break;
                        
                    case ')':
                        if (!stack.isEmpty()){
                            if (stack.peek() == '(') 
                                stack.pop();
                        } else {
                            balance = false;
                        }
                        break;

                    case ']':
                        if (!stack.isEmpty()){
                            if (stack.peek() == '[') 
                                stack.pop();
                        } else {
                            balance = false;
                        }
                        break;

                    case '}':
                        if (!stack.isEmpty()){
                            if (stack.peek() == '{') 
                                stack.pop();
                        } else {
                            balance = false;
                        }
                    
                }
            }
            System.out.println(balance ? stack.isEmpty() ? "YES" : "NO" : "NO");
        }
        
        sc.close();
    }
}
