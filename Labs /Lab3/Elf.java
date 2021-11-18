public class Elf implements HeroInterface{
  String race;
  String jobstring;
  Job job;
  
  Elf(String race, String jobstring, Job job){
    this.race = race;
    this.jobstring = jobstring;
    this.job = job; 
  }
  
  
  public int attack(int val){
    return job.getAttack(25,20,val,20); //Dex, int, val, strength
  
  }
  
  
   public int getSTR(){
     return 20;
   
   }
   public int getDEX(){
     return 25;
   
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