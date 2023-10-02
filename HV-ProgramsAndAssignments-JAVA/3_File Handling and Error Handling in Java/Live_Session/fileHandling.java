package Live_Session;

import java.io.File;

public class fileHandling {
    public static void main(String[] args) {
        try{
        String fn="first.txt";
        File f1=new File(fn);
        f1.createNewFile();
        
        System.out.println("File"+ f1.getName()+"Created");
    } catch(Exception e){
        System.out.println(e);
    }
}
}
