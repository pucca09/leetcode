package erfen;

/**
 * Created by chenqingqing on 2017/4/15.
 */
public class searchMatrix_74 {
    //二分的解法
    public boolean searchMatrix(int[][] matrix, int target) {

        int row_num = matrix.length;
        int col_num = matrix[0].length;

        int begin = 0, end = row_num * col_num - 1;

        while(begin <= end){
            int mid = (begin + end) / 2;
            int mid_value = matrix[mid/col_num][mid%col_num];

            if( mid_value == target){
                return true;

            }else if(mid_value < target){
                //Should move a bit further, otherwise dead loop.
                begin = mid+1;
            }else{
                end = mid-1;
            }
        }

        return false;
    }
    //非二分的解法
    public boolean searchMatrix02(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int hang = 0;
        int lie = col-1;
        while(hang < row && lie >=0){
            if(matrix[hang][lie] == target){
                return true;
            }else if(matrix[hang][lie] > target){
                lie --;

            }else{
                hang++;
            }
        }
        return false;


    }
}
