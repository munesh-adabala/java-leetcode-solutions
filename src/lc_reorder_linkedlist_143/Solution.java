package lc_reorder_linkedlist_143;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		head.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(4);
		node3.next = node4;
		reorderList(head);
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}

	}

	private static void reorderList(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode prev = null;
		ListNode second = slow.next;
		slow.next = null;
		while (second != null) {
			ListNode temp = second.next;
			second.next = prev;
			prev = second;
			second = temp;
		}
		ListNode list1 = head;
		ListNode list2 = prev;
		ListNode list1Next = list1;
		ListNode list2Next = list2;
		boolean flag = true;
		while (list1 != null && list2 != null) {
			if (flag) {
				list1Next = list1.next;
				list1.next = list2;
				list1 = list1Next;
				flag = false;
			} else {
				list2Next = list2.next;
				list2.next = list1;
				list2 = list2Next;
				flag = true;
			}

		}
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
}