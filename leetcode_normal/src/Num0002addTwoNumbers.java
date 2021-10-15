import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.List;

/**
 * @author sANbA111
 * @create 2021/10/14 21:39
 */
public class Num0002addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode point = result;
        int next = 0;
        int sum = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            sum  = v1 + v2 + next;
            next = sum / 10;
            sum %= 10;
            point.next = new ListNode(sum);
            point = point.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (next == 1) {
                point.next = new ListNode(1);
            }
        }
        return result.next;
    }


    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int next = 0;
        int count = 0;
        if (l1.val == 0) {
            return l2;
        }
        if (l2.val == 0) {
            return l1;
        }
        if (l1.val!=0 || l2.val!=0) {
            ListNode nextNode = new ListNode(0);
            ListNode point = nextNode;
            ListNode resultNode = new ListNode();
            ListNode pointL = resultNode;
            while (true) {
                l1.val += l2.val;
                l1.val += next;
                next = l1.val / 10;
                l1.val %= 10;
                pointL.val = l1.val;
                ListNode temp = new ListNode();
                pointL.next = temp;
                pointL = pointL.next;
                ListNode listNode = new ListNode(next);
                point.next = listNode;
                point = point.next;
                count++;
                if (l1.next!=null && l2.next!=null) {
                    l1 = l1.next;
                    l2 = l2.next;
                    continue;
                } else {
                    if (l1.next == null) {
                        l1.next = l2.next;
                    } else {
                        break;
                    }
                    break;
                }
            }
            if (count <3) {
                resultNode = addTwoNumbers(resultNode,nextNode);
            }
            return resultNode;
        }
        return null;
    }*/

    @Test
    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
}
