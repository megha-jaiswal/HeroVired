import java.util.Arrays;

public class StackDS {

    public Object[] arr;
    public int size;
    public int index;

    public StackDS(int size) {
        this.size = size;
        arr = new Object[size];
        index = -1;
    }

    public void push(Object element){
        //arr[size]= element;
        if(index== size-1){
            System.out.println("Array is full !! Cannot insert");
            return;
        }
        index++;
        arr[index] = element;
    }

    public Object pop() {
        Object oldValue = arr[index];
        arr[index] = null;
        index--;
        return oldValue;
    }

    public static void main(String[] args) {

        StackDS ob  = new StackDS(5);
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);

        System.out.println(Arrays.toString(ob.arr));
        System.out.println("--------------------------------");
        System.out.println(ob.pop());
        System.out.println(Arrays.toString(ob.arr));
    }
}