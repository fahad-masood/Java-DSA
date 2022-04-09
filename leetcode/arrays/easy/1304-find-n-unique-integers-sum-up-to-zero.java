class Solution {
    public int[] sumZero(int n) {
        int[] sumZero = new int[n];
        
        if(n%2 == 0){
            for(int i=0; i<n; i=i+2){
                sumZero[i] = i+1;                    
                sumZero[i+1] = -(i+1);
            } 
        }
        else{
            for(int i=0; i<n-1; i=i+2){
                sumZero[i] = i+1;
                sumZero[i+1] = -(i+1);
            }
            sumZero[n-1] = 0;
        }
        return sumZero;
    }
}