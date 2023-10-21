package LiveSession;


public static void SecondLargestInt() {
    public static void main(String[] args) {
        int[] num={4,10,15,20,25,35,17};

// 1.Initialize two variables, smallest and secondSmallest,
// 2.Iterate through each element in the array.
// 3.Compare the current element with the smallest variable.
// 4.If the current element is smaller than smallest, update both smallest and secondSmallest accordingly.
// 5.If the current element is greater than or equal to smallest but smaller than secondSmallest, update secondSmallest only.
// After iterating through all the elements, secondSmallest will hold the second smallest element in the array.
// 6Return the value of secondSmallest.


int smallest =num[0];
int secondSmallest =num[1];
for (int i:num){
    if (i<smallest){
        secondSmallest=smallest;
        smallest=i;
    } else if(i<secondSmallest && i!=smallest){
        secondSmallest=i;
    }
    }
    System.out.println(secondSmallest);
}

}