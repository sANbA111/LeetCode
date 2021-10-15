import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sANbA111
 * @datetime 2021/6/24 16:21
 */
public class Num0119getRow {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if(rowIndex==1)
            return list;
        for (int i = 2; i <= rowIndex; i++) {
            list = generateRow(i, list);
        }
        return list;
    }

    private List<Integer> generateRow(int numRows, List<Integer> last) {
        List<Integer> list = new ArrayList();
        list.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            list.add(last.get(i-1)+last.get(i));
        }
        list.add(1);
        return list;
    }

    @Test
    public void test(){
        List list = getRow(3);
        System.out.println("list = " + list);
    }
}
