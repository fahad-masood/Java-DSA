class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix=new int[rows*cols][2];
        int i=0;
        matrix[i++]=new int[]{rStart,cStart};  //adding the initial position
        int d=0;          // this will be used for direction there can be 4 direction only 0 1 2 3 
		int len=0;          //this is to take the number of steps;
        int[] directions=new int[]{0,1,0,-1,0};   //
        while(i<rows*cols){
            if(d==0||d==2){   // 0 for east 1 for south 2 for west and 3 for south 
                len++;              //because only when we are facing east  or facing west then we are moving 1 step more
            }
            for(int k=0;k<len;k++){    //this for loop is to give the position after each step
                rStart+=directions[d];     //when facing east the x coordinate will not be changing only y coordinate will be changing that's why cStart is incremented
                cStart+=directions[d+1];
                if(rStart<rows&&rStart>=0&&cStart<cols&&cStart>=0){
                    matrix[i++]=new int[]{rStart,cStart};         //this condition is to ensure we are only adding the coordinates of position which are in the matrix 
                }
            }
            d=++d%4;       //this is to ensure d values never exceed 3 because we only want 4 direction and d value will be changing many times 
            
        }
        return matrix;
    }
}