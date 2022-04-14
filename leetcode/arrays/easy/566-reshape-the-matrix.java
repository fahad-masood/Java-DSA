class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // int[][] matrixReshape = new int[r][c];
        // int rows = mat.length;
        // int cols = mat[0].length;
//         int[] arr = new int[rows*cols];
//         int k = -1;
//         for(int i = 0; i<mat.length; i++){
//             for(int j = 0; j<mat[i].length; j++){
//                 k++;
//                 arr[k] = mat[i][j];
//             }
//         }
        
//         if(r*c == rows*cols){
//             int m = 0;
//             for(int i=0; i<r; i++){
//                 for(int j=0; j<c; j++){
//                     matrixReshape[i][j] = arr[m];
//                     m++;
//                 }
//             }
//             return matrixReshape;
//         }
        
//         return mat;
        
//         Second APPROACH
        
        
        int[][] matrixReshape = new int[r][c];
        int rows = mat.length;
        int cols = mat[0].length;
        int size = rows*cols;
        if(r*c!=size){
            return mat;
        }
        else{
            for(int i=0; i<size; i++){
                matrixReshape[i/c][i%c] = mat[i/cols][i%cols];
            }
        }
        return matrixReshape;
        
        
    }
}