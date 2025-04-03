class MyLinkedList {
private static class Node {
		int val;
		Node next;
		Node prev;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int current_size;

    public MyLinkedList() {
        this.current_size = 0;
		this.head = head;
		this.tail = tail;
    }
    
    public int get(int index) {
        if (index < 0 || index >= current_size) {
			return -1;
		}

		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
		
		if (current_size == 0) {
			head = tail = newNode;
		} else {
		    newNode.next = head;
			head.prev = newNode;
		    head = newNode;
		}
		current_size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
		if (current_size == 0) {
            head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		current_size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > current_size) {
			return;
		}

		if (index == 0) {
			addAtHead(val);
			return;
		}

		if (index == current_size) {
			addAtTail(val);
			return;
		}

		Node newNode = new Node(val);
		Node current = head;

		for (int i = 0; i < index-1; i++) {
			current = current.next;
		}

		newNode.next = current.next;
        newNode.prev = current;
		current.next.prev = newNode;
        current.next = newNode;
		current_size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= current_size) {
			return;
		}

		if (index == 0) {
			head = head.next;
            if (head!=null){
                head.prev = null;
            }
            else {
                tail = null;
            }
        } else if (index == current_size-1) {
            tail = tail.prev;
            if(tail!=null){
                tail.next = null;
            tail.next = null;
            }
        } else {
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			current.prev.next = current.next;
            current.next.prev = current.prev;
		}
		current_size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */