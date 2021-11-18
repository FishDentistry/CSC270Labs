public class TestHero{

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


assert hero1.attack(2) == 70:"Attack for warrior dwarf should be 70";
assert hero1.getSTR() == 25:"Dwarf strength should be 25";
assert hero1.getDEX() == 20:"Dwarf dexterity should be 20";
assert hero1.getINT() == 20:"Dwarf intelligence should be 20";
assert hero1.getRaceName() == "DWARF":"Dwarf race should be dwarf";
assert hero1.getJobName() == "WARRIOR":"Dwarf warrior job should be warrior";

assert hero2.attack(2) == 60:"Attack for mage dwarf should be 60";
assert hero2.getSTR() == 25:"Dwarf strength should be 25";
assert hero2.getDEX() == 20:"Dwarf dexterity should be 20";
assert hero2.getINT() == 20:"Dwarf intelligence should be 20";
assert hero2.getRaceName() == "DWARF":"Dwarf race should be dwarf";
assert hero2.getJobName() == "MAGE":"Dwarf mage job should be mage";

assert hero3.attack(2) == 60:"Attack for archer dwarf should be 60";
assert hero3.getSTR() == 25:"Dwarf strength should be 25";
assert hero3.getDEX() == 20:"Dwarf dexterity should be 20";
assert hero3.getINT() == 20:"Dwarf intelligence should be 20";
assert hero3.getRaceName() == "DWARF":"Dwarf race should be dwarf";
assert hero3.getJobName() == "ARCHER":"Dwarf archer job should be archer";

assert hero4.attack(2) == 65:"Attack for warrior elf should be 65";
assert hero4.getSTR() == 20:"Elf strength should be 20";
assert hero4.getDEX() == 25:"Elf dexterity should be 25";
assert hero4.getINT() == 20:"Elf intelligence should be 20";
assert hero4.getRaceName() == "ELF":"Elf race should be elf";
assert hero4.getJobName() == "WARRIOR":"Elf warrior job should be warrior";

assert hero5.attack(2) == 65:"Attack for mage elf should be 65";
assert hero5.getSTR() == 20:"Elf strength should be 20";
assert hero5.getDEX() == 25:"Elf dexterity should be 25";
assert hero5.getINT() == 20:"Elf intelligence should be 20";
assert hero5.getRaceName() == "ELF":"Elf race should be elf";
assert hero5.getJobName() == "MAGE":"Elf mage job should be mage";

assert hero6.attack(2) == 75:"Attack for archer elf should be 75";
assert hero6.getSTR() == 20:"Elf strength should be 20";
assert hero6.getDEX() == 25:"Elf dexterity should be 25";
assert hero6.getINT() == 20:"Elf intelligence should be 20";
assert hero6.getRaceName() == "ELF":"Elf race should be elf";
assert hero6.getJobName() == "ARCHER":"Elf archer job should be archer";

assert hero7.attack(2) == 60:"Attack for robot warrior should be 60";
assert hero7.getSTR() == 20:"Robot strength should be 20";
assert hero7.getDEX() == 20:"Robot dexterity should be 20";
assert hero7.getINT() == 25:"Robot intelligence should be 25";
assert hero7.getRaceName() == "ROBOT":"Robot race should be robot";
assert hero7.getJobName() == "WARRIOR":"Robot warrior job should be warrior";

assert hero8.attack(2) == 70:"Attack for robot mage should be 70";
assert hero8.getSTR() == 20:"Robot strength should be 20";
assert hero8.getDEX() == 20:"Robot dexterity should be 20";
assert hero8.getINT() == 25:"Robot intelligence should be 25";
assert hero8.getRaceName() == "ROBOT":"Robot race should be robot";
assert hero8.getJobName() == "MAGE":"Robot mage job should be mage";


assert hero9.attack(2) == 60:"Attack for robot archer should be 60";
assert hero9.getSTR() == 20:"Robot strength should be 20";
assert hero9.getDEX() == 20:"Robot dexterity should be 20";
assert hero9.getINT() == 25:"Robot intelligence should be 25";
assert hero9.getRaceName() == "ROBOT":"Robot race should be robot";
assert hero9.getJobName() == "ARCHER":"Robot archer job should be archer";



HeroInterface hero10 = HeroFactory.createHero("INVALID","WARRIOR");
HeroInterface hero11 = HeroFactory.createHero("DWARF","INVALID");
assert hero10 == null:"Invalid race given";
assert hero11 == null:"Invalid job given";











 }
}