/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode mergedRoot = null, mergedCurr = null;

        int minIndex;

        while(true) {
            minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && (minIndex < 0 || lists[i].val < lists[minIndex].val)) {
                    minIndex = i;
                }
            }

            if (minIndex > -1) {
                if (mergedRoot == null) {
                    mergedRoot = lists[minIndex];
                    mergedCurr = mergedRoot;
                } else {
                    mergedCurr.next = lists[minIndex];
                    mergedCurr = mergedCurr.next;
                }
                    
                lists[minIndex] = lists[minIndex].next;
            } else {
                break;
            }
        }

        return mergedRoot;
    }
}