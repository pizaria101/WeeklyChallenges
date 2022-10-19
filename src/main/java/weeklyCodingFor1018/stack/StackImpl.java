package weeklyCodingFor1018.stack;

import java.util.Stack;

public class StackImpl {

    Stack<Node> s;

    class Node{
        int value;
        int max;

        public Node(int value, int max) {
            this.value = value;
            this.max = max;
        }
    }

    public StackImpl(){
        this.s = new Stack<>();
    }

    public void push(int n){
        if(s.isEmpty()){
            this.s.push(new Node(n, n));
        }else{
            int max = Math.max(this.s.peek().max, n);
            this.s.push(new Node(n, max));
        }
    }

    public int pop(){
        if(s.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }else {
            return this.s.pop().value;
        }
    }

    public int getMax(){
        if(s.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }else {
            return this.s.peek().max;
        }
    }
}
