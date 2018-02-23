package codeFights.interviewPractice.linkedList;


import lombok.Data;

@Data
public class ListNode<T> {
    T value;
    ListNode<T> next;

    public ListNode(T x) {
        value = x;
    }

}
