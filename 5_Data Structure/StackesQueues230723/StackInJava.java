package StackesQueues230723;

import java.util.Arrays;

public class StackInJava {
    public Object[] arr;
    public int size;
    public int index;

    public StackInJava(int size) {
        this.size = size;
        arr = new Object[size];
        index = -1;
    }

    public void push(Object element) {
       // arr[size + 1] = element;
        if(index == size-1){
            System.out.println("Array is full, cannot insert");
            return;
        }
        index++;
        arr[index]= element;

    }

//    @Override
//    public String toString() {
//        return "StackInJava: {" + Arrays.toString(arr) + '}';
//    }

    public Object pop(){
        Object oldValue = arr[index];
        arr[index]=null;
        index--;
        return oldValue;

    }

    public static void main(String[] args) {
        StackInJava ob = new StackInJava(5);
        ob.push(1);
        ob.push(2);
        ob.push(4);
        ob.push(6);
        System.out.println(Arrays.toString(ob.arr));
        System.out.println("------------------------");
        System.out.println(ob.pop());
        System.out.println(Arrays.toString(ob.arr));

    }
}
