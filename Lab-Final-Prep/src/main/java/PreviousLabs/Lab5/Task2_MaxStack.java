package PreviousLabs.Lab5;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Task2_MaxStack {
    int max;
    Vector<Integer> vMax = new Vector<>();
    Stack<Integer> stack = new Stack<>();

    public void push(int n){
        if(this.max<n){
            this.max = n;
            vMax.add(n);
            Collections.sort(vMax);
        }
        this.stack.push(n);
    }

    public void pop(){
        if(this.stack.peek() == this.max){
            this.vMax.remove(this.vMax.size()-1);
            this.max = this.vMax.get(this.vMax.size()-1);
        }
        this.stack.pop();
    }

    public int max(){
        return this.max;
    }
}
