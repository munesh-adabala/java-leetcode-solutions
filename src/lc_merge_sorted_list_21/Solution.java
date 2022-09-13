package lc_merge_sorted_list_21;

public class Solution {

	public static void main(String[] args) {
		ListNode l11 = new ListNode(4, null);
		ListNode l12 = new ListNode(2, l11);
		ListNode l13 = new ListNode(1, l12);

		ListNode l21 = new ListNode(5, null);
		ListNode l22 = new ListNode(3, l21);
		ListNode l23 = new ListNode(1, l22);

		System.out.println("After merging");

		printNodes(merge(l13, l23));
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	private static void printNodes(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	private static ListNode merge(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				tail.next = list1;
				tail = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				tail = list2;
				list2 = list2.next;
			}
		}

		tail.next = list1 == null ? list2 : list1;

		return dummy.next;
	}

}
