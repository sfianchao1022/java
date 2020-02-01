package add_two_numbers;

public class Linkedlist {
	
	public Node front;
	public Node rear;
	
	public Linkedlist() {
		//queue in linked list
	}
	
	public void create() {
		front=rear=null;
	}
	
	public void add(Node next) {
		
		System.out.println(next.val);
		
		if(rear==null) {//front==rear==null �|���[�J����node
			front=rear=next;
		}else {
			rear.listNode=next;//rear���V�[�J��node(Node next)
			rear=next;//rear����[�J��node �ܦ��̫�@��node
			System.out.println("rear!=front");
		}
		
		System.out.println(rear.val);

	}
	
	public void printLinkedlist() {
		
		System.out.println("LinkedList: ");
		
		if(rear!=null) {
			//�qfront�}�lscan �̧�print value
			while(front!=null) {
				
				System.out.print(front.val+" ");//System.out.print ��X������
				front=front.listNode;
			}
			
		}else {
			System.out.println("front==rear");
		}
		
	}
	
}
