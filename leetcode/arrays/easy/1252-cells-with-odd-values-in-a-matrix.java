class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        int oddCells = 0;

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                mat[indices[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                mat[j][indices[i][1]]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0) {
                    oddCells++;
                }
            }
        }
        return oddCells;
    }
}