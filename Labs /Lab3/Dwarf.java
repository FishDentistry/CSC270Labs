public class Dwarf implements HeroInterface{
  String race;
  String jobstring;
  Job job;
  
  Dwarf(String race, String jobstring, Job job){
    this.race = race;
    this.jobstring = jobstring;
    this.job = job; 
  }
  
  
  public int attack(int val){
    return job.getAttack(20,20,val,25); //Dex, int, val, strength
  
  }
  
  
   public int getSTR(){
     return 25;
   
   }
   public int getDEX(){
     return 20;
   
   }
   public int getINT(){
     return 20;
   
   }
   public String getRaceName(){
     return this.race;
   
   }
   public String getJobName(){
     return this.jobstring;
   }









}