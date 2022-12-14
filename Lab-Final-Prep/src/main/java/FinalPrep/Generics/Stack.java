package FinalPrep.Generics;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
    public List<T> items;

    public Stack(){
        items = new ArrayList<>();
    }

    public void push(T item){
        items.add(item);
    }

    public T pop(){
        if(items.size() == 0){
            throw new IllegalStateException();
        }
        return items.remove(items.size() - 1);
    }

    public T top(){
        if(items.size() == 0){
            throw new IllegalStateException();
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void printStack(){
        for(T item : items){
            System.out.println(item);
        }
    }


    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}


