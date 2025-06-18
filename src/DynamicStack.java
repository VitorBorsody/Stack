public class DynamicStack {
 private Node top;

 public void push(int value){
     Node newNode = new Node(value);
     newNode.next=top;
     top=newNode;
 }
 public void pop() {
     if (top == null) {
         System.out.println("Unfortunately, the stack is empty!");
     } else {
         System.out.println("The removed element has been: " + top.value);
         top = top.next;
     }
 }
     public void displayStack(){
         if(top==null){
             System.out.println("The stack is empty!");

         }
         else {
             Node temp = top;
             while(temp!=null){
                 System.out.println(temp.value);
                 temp = temp.next;

             }
             System.out.println("null");
         }

     }
     public void displayTop(){
     if(top!=null){
         System.out.println("O topo será: " + top.value);
     }

     }
     public int getTop(){
      return top.value;
     }
    public int getSize(){
     int i = 0;
     Node temp = top;
     while(temp!=null){
         temp=temp.next;
         i++;
     }
     return i;
    }
 }

