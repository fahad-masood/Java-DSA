class Solution {
    public int maximumPopulation(int[][] logs) {
        // Optimised solution (Running Sum)
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++; // Increase the value of birth year by 1
            arr[logs[i][1] - 1950]--; // Decrease the value of death year by 1
        }
        int maxValue = 0;
        int maxYear = 1950;

        // Calculating running sum
        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
        }

        for (int i = 0; i < 101; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}