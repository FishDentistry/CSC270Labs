
public class IntStack
{

  protected class Node{
    protected int value;
    protected Node next;
    Node(int value, Node next){
      this.value = value;
      this.next = next;
     }
   }
   
   Node tos = null;
   
   public IntStack(){}



   //pushes val onto the stack
   public void push(int val)
   {
     tos = new Node(val, tos);
     

   }

    //returns the top element from the stack
    //If the stack is empty, it will throw a StackUnderFlowException.
   public int top() throws StackUnderFlowException
   {
     if (tos == null){
       throw new StackUnderFlowException("Error-stack is empty!");
       }
     else{
       return tos.value;
	 
   }
}

    //returns the top element from the stack
    //removes the top element from the stack
    //If the stack is empty, it will throw a StackUnderFlowException.
   public int pop()
   {
     if (tos == null){
       throw new StackUnderFlowException("Error-stack is empty!");
       }
     else{
       int hold = tos.value;
       tos = tos.next;
       return hold;
	 
   }
      
   }
   
    //reports if the stack is empty
   public boolean isEmpty()
   {
      return (tos == null);
   }


}
