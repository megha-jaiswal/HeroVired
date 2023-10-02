import java.util.ArrayList;
import java.util.List;

class Result_compareTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY a
     * 2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(List.of(0,0));
        for (int i =0; i<a.size(); i++){
            if (a.get(i) >b.get(i)){
                result.set(0,(result.get(0)+1));
            }else if(a.get(i) <b.get(i)){
                result.set(1,(result.get(1)+1));
            }

        } 
        return result;
    }

}

public class compareTriplets {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(List.of(17, 28, 30));
        List<Integer> b = new ArrayList<>(List.of(99, 16, 8));
        List<Integer> result = Result_compareTriplets .compareTriplets(a, b);
        System.out.println(result.toString());
    }
}


