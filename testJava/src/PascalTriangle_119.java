import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenqingqing on 2017/3/1.
 */
public class PascalTriangle_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();

        pre.add(1);

        for (int i = 1; i < rowIndex+1; i++) {
            List<Integer> cur = new ArrayList<Integer>();

            cur.add(1); //first
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1)); //middle
            }
            cur.add(1);//last

            pre = cur;
        }

        return pre;

    }
}
