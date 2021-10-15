import util.ListNode;

import java.util.List;


/**
 * @author sANbA111
 * @datetime 2021/7/5 21:12
 */
public class Num0141hasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fa = null;
        ListNode listNode = new ListNode();
        while (head.next!=null){
            fa = head;
            head = head.next;
            fa.next = listNode;
            if(head == listNode){
                return true;
            }
        }
        return false;
    }


}
