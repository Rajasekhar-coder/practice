public class LL {
    private ListNode head;
    
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode  current = head;
        while(current!=null){
              System.out.print(current.data+"-->");
              current= current.next;
        }
        System.out.print("null");
    }

    public boolean containsLOOP(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null&&fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }
    public ListNode StartingNodeInLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null&&fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr==fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
        
    }
    private ListNode getStartingNode(ListNode slowPtr){
           ListNode temp = head;
           while(temp!=slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
           }
           return temp;
    }
    
    public void creatLoopInLL(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    
    
    public static void main(String[] args) {
       LL ll = new LL();
       /*ll.head = new ListNode(1);
       ListNode second = new ListNode(2);
       ListNode third = new ListNode(3);
       ListNode fourth = new ListNode(4);
       ListNode fifth = new ListNode(5);

       ll.head.next = second;
       second.next = third;
       third.next = fourth;
       fourth.next= fifth;*/
       ll.creatLoopInLL();
       boolean result = ll.containsLOOP();
       System.out.println(result);
       System.out.println(ll.StartingNodeInLoop().data);
      
       //ll.display();
    }
}
