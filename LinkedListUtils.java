
public class LinkedListUtils {

	public static void main(String[] args) {
		
		

	}
	
	
	/**
	 * Given:  1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
	 * Return: 1 --> 2 --> 3 --> 4 --> 5
	 * @param head 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6
	 * @param val  6
	 * @return 1 --> 2 --> 3 --> 4 --> 5
	 */
	public static ListNode removeElements(ListNode head, int val) {
		
		
		ListNode dummy = new ListNode(1);
        ListNode i = dummy;
        ListNode j = head;
        dummy.next = head;
    
        while(j != null){
            if(j.val == val){
                i.next = i.next.next;
                j = j.next;
            }else{
                i = i.next;
                j = j.next;
            }
        }
        
        return dummy.next;
	
    }

	
	public static void deleteNode(ListNode node) {
	    node.val = node.next.val;
	    node.next = node.next.next;
	}
	
	
	
	public static class ListNode {
		int val;
		ListNode next;
		public ListNode(int x) { val = x; }
	}

}
