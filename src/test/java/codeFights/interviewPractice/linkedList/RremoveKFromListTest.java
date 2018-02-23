package codeFights.interviewPractice.linkedList;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RremoveKFromListTest {

    @Test
    public void testOne() {
        ListNode<Integer> givenList  = new ListNode<>(10);
        System.out.println(givenList.hasNext());
        givenList.add(new ListNode<>(20));
        System.out.println(givenList.hasNext());
        givenList.add(new ListNode<>(30));
        System.out.println(givenList);


        assertThat(RemoveKFromList.removeKFromList(new ListNode<Integer>(1), 5 ));
    }
}
