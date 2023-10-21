
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (int i : ar) {
            sum+=i;
        }
        return sum;
    }

}

class simpleArraySum {
    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>(List.of(1, 2, 3, 4, 10, 11));

        int result = Result.simpleArraySum(ar);

        System.out.println(result);

    }
}


