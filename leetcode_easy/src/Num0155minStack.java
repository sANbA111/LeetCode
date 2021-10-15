import java.util.ArrayList;
import java.util.List;

/**
 * @author sANbA111
 * @datetime 2021/7/6 18:54
 */
public class Num0155minStack {

    class MinStack {

        List<Integer> val;

        int top;

        int min;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            val = new ArrayList<>();
            top = -1;
            min = Integer.MAX_VALUE;
        }

        public void push(int val) {
            this.val.add(val);
            top++;
            if (min > val) {
                min = val;
            }
        }

        public void pop() {
            if(top>=0){
                Integer pop = this.val.remove(top);
                if (min == pop) {
                    min = Integer.MAX_VALUE;
                    for (Integer integer : val) {
                        min = Math.min(min, integer);
                    }
                }
                top--;
            }
        }

        public int top() {
            return val.get(top);
        }

        public int getMin() {
            return min;
        }
    }
}
