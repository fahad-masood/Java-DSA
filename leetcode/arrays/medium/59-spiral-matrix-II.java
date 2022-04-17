class Solution {
    public int[][] generateMatrix(int n) {
        
        // Same concept as spiral matrix I
        
        int[][] mat = new int[n][n];
        
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        
        int count = 1;
        
        while(rowStart <= rowEnd && colStart <= colEnd){
            
            for(int i=colStart; i<=colEnd; i++){
                mat[rowStart][i] = count++;
            }
            rowStart++;
                
            for(int i=rowStart; i<=rowEnd; i++){
                mat[i][colEnd] = count++;
            }
            colEnd--;
            
            if(rowStart <= rowEnd){
                for(int i=colEnd; i>=colStart; i--){
                    mat[rowEnd][i] = count++;
                }
                rowEnd--;
            }
            
            if(colStart <= colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    mat[i][colStart] = count++;
                }
                colStart++;
            }
            
        }
        
        return mat;
        
    }
}