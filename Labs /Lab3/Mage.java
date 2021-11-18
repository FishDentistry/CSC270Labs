public class Mage extends Job{
  
  Mage(){}
  
  
  public int getAttack(int dex, int intel, int val, int str){
    return dex + (intel * val);
  
  }






}