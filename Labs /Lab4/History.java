import java.util.Stack;

public class History
{
   protected class Item{
    protected int position;
    protected int length;
    protected String content;
    protected boolean isDeletion;
    Item(int position, int length, String content, boolean isDeletion){
      this.position = position;
      this.length = length;
      this.content = content;
      this.isDeletion = isDeletion;
     }
   }
   
   Stack<Item> undoStack = new Stack<Item>();
   Stack<Item> redoStack = new Stack<Item>();


    /**
       Notepad will call this function when thier text changes.

       deletion is a boolean that indicates if the action was a deletion of text or the insertion of text.
       position is the postion where the change took place
       Change is the string of characters that is the change.
     */
   public void addEvent(boolean deletion, int position, String Change)
   {
    Item hold = new Item(position,Change.length(),Change,deletion);
    undoStack.push(hold);
    redoStack.clear();
    }
   


    /**
       Notepad will call this function when it wishes to undo the last event.

       note is a variable to the Notepad that called this function
     */
   public void undoEvent(NotePad note)
   {
     if (hasUndoData()){
       Item hold = undoStack.pop();
       redoStack.push(hold);
       if (hold.isDeletion == true){
        note.insert(hold.position, hold.content);
        
       }
      else if (hold.isDeletion == false){
        note.remove(hold.position, hold.length);
        
      }
      //System.out.println(redoStack.size());
       //note.remove(hold.position, hold.length);
       //redoStack.push(hold);
       //System.out.println(redoStack.peek().content);
    }
   }


    /**
       Notepad will call this function when it wishes to redo the last event that was undone.
       Note that new actions should clear out events that can be "redone"
       note is a variable to the Notepad that called this function
     */
   public void redoEvent(NotePad note)
   { 
     System.out.println(redoStack.size());
     if (hasReDoData()){
       Item hold = redoStack.pop();
       undoStack.push(hold);
       if (hold.isDeletion == true){
         note.remove(hold.position, hold.length);
        
       }
      else if (hold.isDeletion == false){
        note.insert(hold.position, hold.content);
        
      }
        //undoStack.push(hold);
        //note.insert(hold.position, hold.content);
       }
       
       
     
    
   }

    /**
       returns true if there is undo data in the History
     */
   public boolean hasUndoData()
   {
       
     return !undoStack.empty();
  }

    /**
       returns true if there is undo data in the History
     */
   public boolean hasReDoData()
   {
       return !redoStack.empty();
   }
	

}
