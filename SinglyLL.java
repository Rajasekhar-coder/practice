public class SinglyLL{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
      }
      //to know the length of the linked list
      public int length(){
        if(head==null){
            return 0;
        }

        ListNode current =head;
        int count =0;
        while(current!=null){
            current=current.next;
            count +=1;
        }
        return count;
      }
      //To print the linked list to the console
      public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
      }
     //Method to insert node at the beginnig of the linked list
     public void insertatbegin(int value){
        ListNode newnode = new ListNode(value);
        newnode.next = head;
        head = newnode;

       
        }
    public void insertatend(int value){
        ListNode newnode = new ListNode(value);
        if(head==null){
            head = newnode;
        }
        ListNode current= head;
        while(current.next!=null){
            current= current.next;
        }
        current.next=newnode;
    }
     
   public void insertat(int val,int position){
           ListNode newnode = new ListNode(val);
           if(head==null){
            head=newnode;
           }
           else{
           if(position==1){
             head = newnode;
             newnode.next = head;
           }
           else{
            ListNode  previous = head;
            int count=1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newnode;
            newnode.next = current;
            

           }
        }

        
   }
   public ListNode removefirst(){
         
        if(head==null){
            return null;
        }
        ListNode current = head;
        head = current.next;
        current.next = null;
        return current;


   }
   public ListNode removelast(){
    if(head==null){
        return null;
    }
    ListNode current=head;
    ListNode previous = null;
    while(current.next!=null){
        
        previous = current;
        current= current.next;
    }
    previous.next=null;
    return current;
   }
   public void removeat(int position){
           if(position==1){
            head = head.next;
            
           }
           
           ListNode previous= head;
           int count =1;
           while(count<position-1){
                previous = previous.next;
                count = count+1;

           }
           ListNode current = previous.next;
           previous.next = current.next;

   }
   public int search(int val){
         ListNode current = head;
         int count=1;
         while(current.next!=null){
              if(current.data==val){
                break;
              }
              
              current =current.next;
              count++;
            }
        return count;
   }
   

    public static void main(String[] args) {
        SinglyLL sll= new SinglyLL();

        sll.head = new ListNode(10);
        sll.insertatbegin(12);
        sll.insertatbegin(45);
        sll.insertatend(58);
        sll.insertatend(12);
        sll.insertatend(56);
        //sll.display();
        sll.insertat(13, 2);
        int len = sll.length();
       
        System.out.println("The length of the linked list is:"+len);
        //sll.removelast();
        
        //sll.removefirst();
        //sll.removefirst();
        //sll.removeat(2);
        sll.display();
        int num =56;
        System.out.println(num+" is at the index of : "+sll.search(num));

    
        
    }
}