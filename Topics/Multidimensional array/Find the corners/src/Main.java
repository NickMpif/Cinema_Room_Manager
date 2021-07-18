class ArrayOperations {

    public static void printCorners(int[][] a) {
        // first row
        int[] row = a[0];
        int j = row.length - 1;
        System.out.println(row[0] + " " + row[j]);
        // last row
        int i = a.length - 1;
        row = a[i];
        j = row.length - 1;
        System.out.println(row[0] + " " + row[j]);
    }
}
