public class Test4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //基本思路从左下角开始，比他大往右，这一行找不到或比他小，往上面招
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
    //妈的，逆天，暴力解法比上面这个用时短
    public boolean findNumberIn2DArray1(int[][] matrix, int target) {
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int j = 0 ; j < matrix[0].length ; j ++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
