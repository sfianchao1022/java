package add_two_numbers;

public class Linkedlist {
	
	public Node front;
	public Node rear;
	
	public Node count;
	
	public int nodeNum;
	
	public Linkedlist() {
		
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
		
		System.out.println("node number : "+ ++nodeNum);
		
	}
	
	public void printLinkedlist() {
		
		System.out.println("LinkedList: ");
		
		if(rear!=null) {
			//�qfront�}�lscan �̧�print value
			count=front;
			while(count!=null) {
				System.out.print(count.val+" ");//System.out.print ��X������
				count=count.listNode;
			}
			
		}else {
			System.out.println("front==rear");
		}
		
		System.out.println(" ");
		
	}
	
	public Linkedlist reverse(Linkedlist l) {
		Linkedlist rlist=new Linkedlist();
		
		return rlist;
	}
	
	public void getFrontValue() {
		
		System.out.println("front value : "+front.val+" ");
		
	}
	
	public void getRearValue() {
		
		System.out.println("rear value : "+rear.val+" ");
		
	}
	
}
