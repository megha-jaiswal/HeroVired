package Live_Session;

import java.util.Arrays;

public class filterInJava2 {

    public static void main(String[] args) {

        ///Filter in Arrays
        //int [] num = {1,2,3,4,5,6,7,8,9,10};
        //int[] even= Arrays.stream(num).filter( i->i%2 == 0 ).toArray();
        //Arrays.stream(num).filter( i->i%2 == 0 ).forEach(System.out :: println);// alternate method for toArray
       //System.out.println(Arrays.toString(even));

       // Map in arrays

      // int [] sq = Arrays.stream(num).map(i-> i*i).toArray();
       //System.out.println(Arrays.toString(sq));

       //1st method
    // String [] stringarray={"Hello", "World","Welcome", "to", "Java Class" };

    // Object [] filterarr = Arrays.stream(stringarray).filter(i-> i.length()>6).toArray();// ananomous function written as "->"
    // System.out.println(Arrays.toString(filterarr));

    // String[] names = { "John", "Alice", "Bob", "Sarah", "Mark" };

    // String[] filteredNames = Arrays.stream(names)
    //         .filter(n -> n.length() > 3)
    //         .map(String::toUpperCase)
    //         .toArray(String[]::new);

    // System.out.println(Arrays.toString(filteredNames));

    //2nd method

    String[] stringArray = {"adsf", "fvdf", "fvsd", "sfdvs", "dsf"};
    String[] stringArrayWithStream = (String[]) Arrays.stream(stringArray).filter(i -> i.length() > 3).toArray();
    System.out.println(Arrays.toString(stringArrayWithStream));
    Arrays.stream(stringArray).map(i -> String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1,i.length())).forEach(System.out::println);


     }
}

