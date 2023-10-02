public class multiD {
    public static void main(String[] args) {
        int[][] numArray = { {0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}, {4,4,4}, {5,5,5} };

        // 0 0 0- numArray[0][0] and numArray[0][1] numArray[0][2]
        // 1 1 1-  numArray[1][0] and numArray[1][1] numArray[1][2]
        // 2 2 2 -  numArray[2][0] and numArray[2][1] numArray[2][2]
        // ..

        // numArray[5][3] = ij
        // int[][] numArray = { {0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}, {4,4,4}, {5,5,5} };


        // numArray[3][4]
        //int[][] numArray = { {0,0,0,0}, {1,1,1,1}, {2,2,2,2},  };

        // numArray[3][4][2] = i j k 
        //int[][] numArray = { {{0,0},{0,0},{0,0},{0,0}}, {{1,1},{1,1},{1,1},{1,1}}, {{2,2},{2,2},{2,2},{2,2}}};

        // 0,0
        // 1,1
        // 2, 2

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numArray[i][j] + " ");    
            }
            System.out.println();   
        }
    }
}

        int[][] numArray = { {0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}, {4,4,4}, {5,5,5} };

        // 0 0 0- numArray[0][0] and numArray[0][1] numArray[0][2]
        // 1 1 1-  numArray[1][0] and numArray[1][1] numArray[1][2]
        // 2 2 2 -  numArray[2][0] and numArray[2][1] numArray[2][2]
        // ..

        // numArray[5][3] = ij
        // int[][] numArray = { {0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}, {4,4,4}, {5,5,5} };


        // numArray[3][4]
        //int[][] numArray = { {0,0,0,0}, {1,1,1,1}, {2,2,2,2},  };

        // numArray[3][4][2] = i j k 
        //int[][] numArray = { {{0,0},{0,0},{0,0},{0,0}}, {{1,1},{1,1},{1,1},{1,1}}, {{2,2},{2,2},{2,2},{2,2}}};

        // 0,0
        // 1,1
        // 2, 2

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numArray[i][j] + " ");    
            }
            System.out.println();   
        }

        int[][] numArray = { { 0, 0, 0 }, { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 }, { 5, 5, 5 } };

        // 0 0 0- numArray[0][0] and numArray[0][1] numArray[0][2]
        // 1 1 1- numArray[1][0] and numArray[1][1] numArray[1][2]
        // 2 2 2 - numArray[2][0] and numArray[2][1] numArray[2][2]
        // ..

        // numArray[5][3] = ij
        // int[][] numArray = { {0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}, {4,4,4}, {5,5,5} };

        // numArray[3][4]
        // int[][] numArray = { {0,0,0,0}, {1,1,1,1}, {2,2,2,2}, };

        // numArray[3][4][2] = i j k
        // int[][] numArray = { {{0,0},{0,0},{0,0},{0,0}}, {{1,1},{1,1},{1,1},{1,1}},
        // {{2,2},{2,2},{2,2},{2,2}}};


        // newNumArray[3][3][3] = i j k
        // int[][] numArray = { {{0,0},{0,0}}, {{1,1},{1,1}},

        // 0,0
        // 1,1
        // 2,2

        // 0,1
        // 0,1
        // 0,1

        int[][][] newNumArray = new int[3][3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k <3; k++) {
                    newNumArray[i][j][k] = i;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(newNumArray[i][j][k]);
                }
                System.out.println();
            }
            System.out.println("\nnew d");
        }
    }}