class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        // get the value of smallest element in row, store its column index
        // now check whether it is the largest element in its column
        // if yes, add the elements to luckyNumbers array
        List<Integer> luckyNumbers = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int min = 150000;
            int colIndex = -1;
            for(int j=0; j<matrix[i].length; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isTrue = true;
            for(int k=0; k<matrix.length; k++){
                if(matrix[i][colIndex] < matrix[k][colIndex]){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue == true){
                luckyNumbers.add(matrix[i][colIndex]);
            }
        }
        return luckyNumbers;
    }
}