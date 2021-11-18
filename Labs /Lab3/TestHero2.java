public class TestHero2{
public static void main( String args[] ){
  HeroInterface hero1 = HeroFactory.createHero("DWARF","WARRIOR");
 HeroInterface hero2 = HeroFactory.createHero("DWARF","MAGE");
 HeroInterface hero3 = HeroFactory.createHero("DWARF","ARCHER");

 HeroInterface hero4 = HeroFactory.createHero("ELF","WARRIOR");
 HeroInterface hero5 = HeroFactory.createHero("ELF","MAGE");
 HeroInterface hero6 = HeroFactory.createHero("ELF","ARCHER");

 HeroInterface hero7 = HeroFactory.createHero("ROBOT","WARRIOR");
 HeroInterface hero8 = HeroFactory.createHero("ROBOT","MAGE");
 HeroInterface hero9 = HeroFactory.createHero("ROBOT","ARCHER");
 
 System.out.println(hero1.getSTR());





}



}