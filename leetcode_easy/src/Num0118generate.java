import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sANbA111
 * @datetime 2021/6/24 15:49
 */
public class Num0118generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        if(numRows==1)
            return lists;
        for (int i = 2; i <= numRows; i++) {
            list = generateRow(i, list);
            lists.add(list);
        }
        return lists;
    }
    public List<Integer> generateRow(int numRows,List<Integer> last){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            list.add(last.get(i-1)+last.get(i));
        }
        list.add(1);
        return list;
    }

    @Test
    public void test(){
        List list = generate(5);
        System.out.println("list = " + list);
    }
}
