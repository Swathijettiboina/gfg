//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends






/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
         if(head==null || head.next==null){
            return true;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //System.out.print(slow.val);
        if(fast==null){
            //System.out.print(reverse(slow.next).val+" "+reverse(slow.next).next.val);
            return check(head,reverse(slow));
            
        }   
        return check(head,reverse(slow.next));
    }    
     static Node reverse(Node slow){
        Node pre=null;
        Node curr=slow;
        Node aft=null;
        while(curr!=null){
            aft=curr.next;
            curr.next=pre;
            pre=curr;
            curr=aft;
            
        }
        return pre;
    }
    static boolean check(Node head,Node mid){
        Node temp1=head;
        Node temp2=mid;
        while(temp1!=mid && temp2!=null){
            if(temp1.data!=temp2.data){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}

