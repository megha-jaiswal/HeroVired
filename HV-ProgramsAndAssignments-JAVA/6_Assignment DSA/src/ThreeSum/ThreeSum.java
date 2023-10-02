package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> sumofthree(int [] arr)
    {
        List<List<Integer>> result= new ArrayList<>();
       Arrays.sort(arr);
       int n=arr.length;
       for (int i=0; i<n-2 ; i++){
           if ((i==0) ||((i>0) && (arr[i] != arr[i-1]))){
               int left;
               int right;
               left= i+1;
               right= n-1;
               while (left<right) {
                   int currentSum = arr[i] + arr[left] + arr[right];
                   if (currentSum == 0) {
                       result.add(Arrays.asList(arr[i], arr[right], arr[left]));
                   // to remove duplicate value
                   while (left < right && (arr[left] == arr[left + 1])) {
                       left++;
                   }
                   while (left < right && (arr[right] == arr[right + 1])) {
                       right--;
                   }
                   left++;
                   right--;
                    }
                   else if (currentSum <0)
                   {
                       left++;
                   }else{
                       right--;
                   }
               }
           }
       }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum abc= new ThreeSum();
        List<List<Integer>> result= new ArrayList<>();
        int [] arr= {-1,0,1,2};
        result= abc.sumofthree(arr);
        for (List<Integer>a: result){
            System.out.println(a);
        }

    }
}
