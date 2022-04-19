class Solution {
    public void setZeroes(int[][] matrix) {
    // Use first row and first column as markers. 
    // if matrix[i][j] = 0, mark respected row and col marker = 0; indicating
    // that later this respective row and col must be marked 0;
    // And because you are altering first row and column, 
    // you need to  have two variables to track their own status. 
    // So, for example, if any one of the first row is 0, firstRow = 0,
    // and at the end set all first row to 0;
        
        boolean firstRow = false, firstColumn = false;
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i==0) firstRow = true;
                    if(j==0) firstColumn = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(firstRow){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        
        if(firstColumn){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}