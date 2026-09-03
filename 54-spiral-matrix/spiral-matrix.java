class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while(top <= bottom && left <= right){
            // add hoga element from left to right
            for(int i = left ; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            // add hoga element from top to bottom
            for(int i = top ; i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            //check for rows that r left
            if(top <= bottom){
                //add hoga element from right to left
                for(int i = right; i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // check for the column that r left
            if(left <= right){
                // add hoga element from bottom to top
                for(int i = bottom ; i>= top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;
    }
}