package dataStructures.stack;
import java.util.*;

public class Stack {
    private ArrayList<Integer> list;

    public void push(int a) {
        list.add(a);
    }

    public int peek() {
        return list.get(list.size()-1);
    }

    public void pop() {
        list.remove(list.size()-1);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
