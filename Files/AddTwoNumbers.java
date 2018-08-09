package Files;
import DataStructs.ListNode;

public class AddTwoNumbers {
   public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode output = new ListNode((l1.val + l2.val)%10);
      int extra = (l1.val + l2.val) / 10;
      ListNode head = output;
      while (l1.next != null && l2.next != null) {
         output.next = new ListNode(((l1.next.val + l2.next.val + extra) % 10));
         extra = (l1.next.val + l2.next.val + extra) / 10;
         l1.next = l1.next.next;
         l2.next = l2.next.next;
         output = output.next;
      }
      while (l1.next != null) {
         output.next = new ListNode((l1.next.val + extra)%10);
         output = output.next;
         output.next = l1.next.next;
         extra = (l1.next.val + extra) / 10;
         l1.next = l1.next.next;
      }
      while (l2.next != null) {
         output.next = new ListNode((l2.next.val + extra)%10);
         output = output.next;
         output.next = l2.next.next;
         extra = (l2.next.val + extra) / 10;
         l2.next = l2.next.next;
      }
      if (extra == 1) {
         output.next = new ListNode(1);
      }
      return head;
   }
}
