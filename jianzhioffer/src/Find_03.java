/**
 * Created by chenqingqing on 2017/2/23.
 */
public class Find_03 {
    //从右上角开始
    public boolean Find(int [][] array,int target) {
        boolean found = false;
        int column = array[0].length;
        int row = array.length;
        int col = column -1;
        int i =0;
        while(i<row &&col>=0){
            int value = array[i][col];
            if(target>value){
                i ++;
            }else if(value>target){
                col --;
            }else{
                found = true;
                break;
            }

        }
        return found;
    }
    //从左下角开始

    public boolean Find2(int target, int [][] array) {
        int row = array.length;
        int column = array[0].length;
        int col = 0;
        int i = row -1;
        boolean flag = false;
        while(i>=0 && col<column){
            int value = array[i][col];
            if(value < target){
                col ++;
            }else if(value > target){
                i --;
            }else{
                flag = true;
                break;

            }

        }
        return flag;


    }
}
