class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int i = 0; i < twoDimArray.length; i++) {

            int start = 0;
            int end = twoDimArray[i].length - 1;
            while (start < end) {

                // Swap the element
                int temp = twoDimArray[i][start];
                twoDimArray[i][start] = twoDimArray[i][end];
                twoDimArray[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}