public class Archer extends Job{
  
  Archer(){}
  
  
  public int getAttack(int dex, int intel, int val, int str){
    double data = dex * 1.5 * val;
    int value = (int) data;
    return value;
  
  }






}