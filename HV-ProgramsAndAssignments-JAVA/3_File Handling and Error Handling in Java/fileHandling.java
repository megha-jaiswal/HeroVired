//date 04.06.2023
// EmpfileHandling 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class fileHandling {
    private static String filename="emp.csv";
    private static void writedatatocsv() {
           try (BufferedWriter wr=new BufferedWriter(new FileWriter(filename))){
            wr.write("name,empid,desgnation,salary");
            wr.newLine();
            wr.write("Shakul,101,developer,25000");
            wr.newLine();
            wr.write("Rahul,102,manager,35000");
            wr.newLine();
            wr.write("Tina,103,GET,15000");
            wr.newLine();
            wr.write("Ashwini,104,Engg,20000");
            wr.newLine();
            wr.write("Shubham,105,Sr.Engg,28000");
            wr.newLine();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void readdatafromcsv(){
       
        try (BufferedReader re = new BufferedReader(new FileReader(filename))) {
            String line;
            line = re.readLine();
            while ((line = re.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();// .trim is used to remove the balnk space 

                //System.out.println("name of the employee: " + name);
                int empid = Integer.parseInt(data[1].trim());
                //System.out.println("name of the employee: " + name + " employeeid is: " + empid);
               
                int salary = Integer.parseInt(data[3].trim());
                if (salary >25000){
                
                //System.out.println("Name of the employee: " + name + " employeeid is: " + empid + " Salary: "+ salary);

            }
            if (empid ==102){
                
                System.out.println("Name of the employee: " + name + " employeeid is: " + empid + " Salary: "+ salary);

            }




        } }
        catch (Exception e) {
            System.err.println();
        }
    
}
    public static void main(String[] args) {
        readdatafromcsv();

    }
    }



    

