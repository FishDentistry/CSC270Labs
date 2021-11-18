public class Queue<T>
{
    //be sure that your attributes are protected, so subclasses can use them
    protected Node front;
    protected Node rear;
    protected int numElements = 0;

    
    protected class Node{
    protected T value;
    protected Node next;
    Node(T value, Node next){
      this.value = value;
      this.next = next;
     }
   }


   public Queue()
   {
    front = null;
    rear = null;
   }


    /**Adds val to the end of the queue
     */
   public void push(T val)
   {
     Node temp = new Node(val,null);
     if(numElements == 0){
       front = temp;
       rear = temp;
       numElements++;
       }
     else{
      rear.next = temp;
      rear = temp;
      numElements++;
   }
 }


    /**
       removes and returns the oldest value in the queue
       throws QueueUnderFlowException if the queue is empty
     */
   public T pop() throws QueueUnderFlowException
   {
      if(numElements == 0){
      throw new QueueUnderFlowException("Error- Queue is empty!");
      }
     else{
       T hold = front.value;
       front = front.next;
       numElements--;
       if (numElements == 0){
       front = null;
       rear = null;
      }
       return hold;
     
     }
   }    


    /**
      returns true if the queue is empty
     */

   public boolean isEmpty()
   {
       return (this.numElements == 0);
   }




}
