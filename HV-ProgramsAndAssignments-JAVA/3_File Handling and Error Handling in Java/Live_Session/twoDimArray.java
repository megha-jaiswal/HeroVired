package LiveSession;

public class twoDimArray {
    public static void main(String[] args) {
//         1.Create a 2D array to store the sales data. The array should have dimensions of 7 rows (representing the days of the week) 
// 2Initialize the array with the sales data for each day and product/category.3.Create an array to store the total sales for each day of the week.
// 4Iterate through each row (day) of the 2D array and calculate the sum of sales for that day.
// 5Store the calculated sum in the corresponding position in the total sales array.
// 6Display the total sales for each day.
int[][] salesData = {
    { 10, 20, 30, 50 },
    { 190, 210, 70, 120 },
    { 400, 130, 175, 140 },
    { 95, 100, 85, 160 },
    { 110, 100, 90, 130 },
    { 120, 140, 75, 110 },
    { 130, 125, 95, 150 }
};
int[] tsales = new int[salesData.length];
for (int day = 0; day < salesData.length; day++) {
int daytotal = 0;
for (int prod = 0; prod < salesData[day].length; prod++) {
    daytotal += salesData[day][prod];

}
tsales[day] = daytotal;
}
for (int i = 0; i < tsales.length; i++) {
System.out.println("day" + (i + 1) + ":" + tsales[i]);
tsales +=; 
}
//System.out.println("total sale of teh week is: "+ wsales);
for (int i = 0; i < week.length; i++) {
    int dayTotal = 0;
    for (int j = 0; j < week[i].length; j++) {
      dayTotal += week[i][j];
      sum += week[i][j];
    }
    System.out.println("Day " + (i + 1) + " : " + dayTotal);
  }
  System.out.println("Total Sales: " + sum);
}
}





}

    }
    
