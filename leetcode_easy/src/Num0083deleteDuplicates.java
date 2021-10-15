import org.junit.Test;
import util.ListNode;

/**
 * @author sANbA111
 * @datetime 2021/6/18 18:22
 */
public class Num0083deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode h = head;
        ListNode p = null;
        while (head.next!=null) {
            p = head.next;
            if(p.val==head.val){
                head.next=p.next;
            }else {
                head = head.next;
            }
        }
        return h;
    }

    @Test
    public void test(){

    }
}
