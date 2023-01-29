package braceChecker;

import Stack.Stack;

public class BraceChecker {
    public String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
                stack.push(text.charAt(i));
            }
            char brace = text.charAt(i);
            switch (brace) {
                case ')':
                    char pop1 = stack.pop();
                    if (pop1 != '(') {
                        System.out.println("Error opened " + pop1 + " but closed" + brace + " at index " + i);
                    }
                    break;
                case '}':
                    char pop2 = stack.pop();
                    if (pop2 != '{') {
                        System.out.println("Error opened " + pop2 + " but closed" + brace + " at index " + i);
                    }
                    break;
                case ']':
                    char pop3 = stack.pop();
                    if (pop3 != '[') {
                        System.out.println("Error opened " + pop3 + " but closed" + brace + " at index " + i);
                    }
                    break;

            }
        }


    }
}
