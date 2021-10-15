/**
 * @author sANbA111
 * @datetime 2021/6/18 18:59
 */
public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString() {
        return "util.ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
