package Live_Session;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereadingusingbufferreader {
    public static void main(String[] args) throws  IOException {
        try  (BufferedReader br = new BufferedReader(new FileReader("first.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
             catch(FileNotFoundException e){
                System.out.println("File not found");
            }
    }
}




//         import java.io.FileReader;

// public class filereader {
//     public static void main(String args[]) throws Exception {
//         FileReader fr = new FileReader("first.txt");
//         int i;
//         while ((i = fr.read()) != -1)
//             System.out.print((char) i);
//         fr.close();
//     }

//     public static void close() {
//     }
//}
    