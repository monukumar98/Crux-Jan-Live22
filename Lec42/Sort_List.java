package Lec42;

import Lec42.Middle_of_LinkedList.ListNode;

public class Sort_List {

	public class ListNode {
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

	class Solution {
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}

			ListNode mid = middleNode(head);
			ListNode headb = mid.next;
			mid.next = null;

			ListNode A = sortList(head);
			ListNode B = sortList(headb);
			return mergeTwoLists(A, B);

		}

		public ListNode middleNode(ListNode head) {

			ListNode fast = head;
			ListNode slow = head;
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			return slow;

		}

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (list1 != null && list2 != null) {

				if (list1.val < list2.val) {
					temp.next = list1;
					temp = temp.next;
					list1 = list1.next;
				} else {
					temp.next = list2;
					temp = temp.next;
					list2 = list2.next;
				}
			}

			if (list1 == null) {
				temp.next = list2;
			}
			if (list2 == null) {
				temp.next = list1;
			}
			return Dummy.next;

		}

	}

}
