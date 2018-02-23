package codeFights.interviewPractice.linkedList;

public class RemoveKFromList {
    public static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        ListNode list = new ListNode(0);
        ListNode temp = list;

        while (l != null) {
            if (l.value != k) {
                temp.next = l;
                temp = temp.next;
            }
            l = l.next;
        }
        temp.next = null;
        return list.next;
    }
}
