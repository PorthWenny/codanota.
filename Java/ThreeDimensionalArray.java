class ThreeDimensionalArray {
    public static void main(String[] args) {

        int[][][] numbers = {{{80, 90, 100, 20}, {25, 26, 23, 100}},{{55, -16, -17, 18},{12, 12, 13, 114}}};

        System.out.println("3-D array values\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + numbers[i][j][k]);
                }        
            }
        }

    }
}