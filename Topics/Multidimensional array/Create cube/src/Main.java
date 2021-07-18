import java.util.Arrays;

class ArrayOperations {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createCube()));
    }

    public static int[][][] createCube() {
        // write your code here
        var cubes = new int[3][3][3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count = 0;
            for (int j= 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cubes[i][j][k] = k + count;

                }
                count += 3;
            }
        }
        return cubes;
    }
}