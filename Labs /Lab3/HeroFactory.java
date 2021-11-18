public class HeroFactory
{




   public static HeroInterface createHero(String raceName, String jobName)   
   { 
      if (raceName == "DWARF"){
        if(jobName == "WARRIOR"){
         Warrior warrior = new Warrior();
         return new Dwarf("DWARF","WARRIOR",warrior);
        }
        if(jobName == "ARCHER"){
         Archer archer = new Archer();
         return new Dwarf("DWARF","ARCHER",archer);
        }
        if(jobName == "MAGE"){
         Mage mage = new Mage();
         return new Dwarf("DWARF","MAGE",mage);
        }
      
      
      }
       if (raceName == "ELF"){
        if(jobName == "WARRIOR"){
         Warrior warrior = new Warrior();
         return new Elf("ELF","WARRIOR",warrior);
        }
        if(jobName == "ARCHER"){
         Archer archer = new Archer();
         return new Elf("ELF","ARCHER",archer);
        }
        if(jobName == "MAGE"){
         Mage mage = new Mage();
         return new Elf("ELF","MAGE",mage);
        }
      
      
      }
       if (raceName == "ROBOT"){
        if(jobName == "WARRIOR"){
         Warrior warrior = new Warrior();
         return new Robot("ROBOT","WARRIOR",warrior);
        }
        if(jobName == "ARCHER"){
         Archer archer = new Archer();
         return new Robot("ROBOT","ARCHER",archer);
        }
        if(jobName == "MAGE"){
         Mage mage = new Mage();
         return new Robot("ROBOT","MAGE",mage);
        }
      
      
      }return null;
      
   }







}