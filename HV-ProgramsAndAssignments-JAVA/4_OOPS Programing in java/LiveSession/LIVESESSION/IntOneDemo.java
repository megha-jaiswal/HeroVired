package LIVESESSION;

public class IntOneDemo {
    public class IntOneDemo implements AbInter1, Abinter2 {
    @Override
    public String getStart() {
        return "starting";
    }

    public int getCount() {
        return 1;
    }

    public static void main(String[] args){

        IntOneDemo intOneDemo = new IntOneDemo();

        System.out.println(intOneDemo.getCount());


    }

    @Override
    public void start() {
        
    }
}
}
