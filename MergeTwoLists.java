public class MergeTwoLists {
   public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
      }
   }
   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode output;
      if (l1 == null && l2 == null) {
         output = null;
      }
      else if (l1 == null) {
         output = l2;
      }
      else if (l2 == null) {
         output = l1;
      }
      else {
         int minimum;
         boolean l1Less = false;
         if (l1.val < l2.val) {
            minimum = l1.val;
            l1Less = true;
         }
         else {
            minimum = l2.val;
         }
         output = new ListNode(minimum);
         if (l1Less) {
            output.next = mergeTwoLists(l1.next, l2);
         }
         else {
            output.next = mergeTwoLists(l1, l2.next);
         }
      }
      return output;
   }
   public static void main(String[] args) {
      ListNode listOne = new ListNode(1);
      listOne.next = new ListNode(2);
      listOne.next.next = new ListNode(4);
      ListNode listTwo = new ListNode(1);
      listTwo.next = new ListNode(3);
      listTwo.next.next = new ListNode(4);
      System.out.println(mergeTwoLists(listOne, listTwo).next.next.next.next.next.val);
   }
}
