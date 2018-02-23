package codeFights.interviewPractice.linkedList;


public class ListNode<T> {
    T value;
    ListNode<T> next;

    public ListNode(T x) {
        value = x;
        next = null;
    }

    boolean hasNext() {
        if (next != null) {
            return true;
        }
        return false;
    }

    ListNode<T> getNext() {
        return next.next;
    }

    void add(ListNode<T> node) {
        if (!hasNext()) {
            next = node;
        } else {
            while (next != null)
                next = getNext();
        }
        next = node;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
