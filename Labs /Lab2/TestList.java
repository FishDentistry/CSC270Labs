public class TestList{

public static void main( String args[] ) 
    { 
        IntList myList = new IntList(3);
        assert myList.getMaxSize() == 3: "Max size should be 3 in " + myList;
        assert myList.length() == 0: "Length should be 0 right now";
        
        
        assert myList.getPos(-1) == -1: "Index is out of range, should return -1";
        assert myList.getPos(1) == -1: "No element in list";
        assert myList.insertBefore(2,0) == true: "Element not inserted properly";
        assert myList.getPos(0) == 2: "Element at index 0 is not 2";
        assert myList.length() == 1: "Length is not 1";
        assert myList.insertBefore(3,1) == true: "Element not inserted properly";
        assert myList.insertBefore(4,2) == true: "Element not inserted properly";
        assert myList.getPos(1) == 3: "Element at index 1 is not 3";
        assert myList.getPos(2) == 4: "Element at index 2 is not 4";
        assert myList.length() == 3: "Length is not 3";
        assert myList.getPos(3) == -1: "Index is out of range, should return -1";
        assert myList.remove(-1) == false: "Index is out of range, how did you remove that?";
        assert myList.remove(2) == true: "Failed to remove last element";
        assert myList.remove(1) == true: "Failed to remove second element";
        assert myList.remove(0) == true: "Failed to remove first element";
        assert myList.remove(3) == false: "Index out of range, how did you remove?";
        assert myList.length() == 0: "Length should be zero after the removals";
        assert myList.remove(1) == false: "Length is 0, nothing to remove";
        assert myList.insertBefore(2,0) == true: "Element not inserted properly";
        assert myList.insertBefore(3,1) == true: "Element not inserted properly";
        assert myList.insertBefore(4,2) == true: "Element not inserted properly";
        assert myList.insertBefore(5,1) == false: "Should not have been inserted, array was full";
        assert myList.remove(3) == false: "Index out of range, how did you remove?";
        assert myList.remove(-1) == false: "Index out of range, how did you remove?";
        
        
        IntList myList2 = new IntList(3);
        assert myList2.insertBefore(1,0): "Failed to insert at first slot";
        assert myList2.insertBefore(2,1): "Failed to insert at second slot";
        assert myList2.insertBefore(3,0): "Failed to insert at first slot";
        assert myList2.getPos(1) == 1: "Second slot is not one, didn't get moved over";
        assert myList2.getPos(2) == 2: "Third slot is not two, didn't get moved over";










        



        //assert myList.remove(4) == false: "Index is out of range, should return false";
        //assert myList.remove(-2) == false: "Index is out of range, should return false";
        

        
        
        System.out.println("Passed all tests!");
         
    } 


}