public class Complementary {
    
  public static String menu(){
    return ("*****************\n"
      +"Enter a number from 0 to 12\n"
      + "*****************\n"
      + "Consider what will happen depending on the number:\n"
      + " 0 to stop the running of the program \n "
      + " 1 to add a new zombie\n"
      + " 2 to show the information of all the stocked zombies\n"
      + " 3 to show the amount of stocked zombies\n"
      + " 4 to show the information of the zombies with blood type O+ or AB+\n"
      + " 5 to show the information of the zombies born after the year 2000\n"
      + " 6 to decrease in half the health of all zombies\n"
      + " 7 to add a new location\n"
      + " 8 to show all the stocked locations\n"
      + " 9 to show the safest location in the city\n"
      + " 10 to show the nearest locations to Alexandria\n"
      + " 11 to get a surprise message\n"
      + " 12 to delete a zombie or location\n"
      +"*****************"); 
  }
  
  public static String phrases(){
    String[] phrases = {"Every human we save is one less zombie to fight",
                        "Zombies invade us and we lock ourselves in a library",
                        "That was our first encounter with disco mutants. I knew it wouldn't be the last",
                        "They live for the night, they live to kill, and... they live forever",
                        "I'm not going to continue talking until you put your head on!"};
    int aleatoryPhrase = (int)(Math.random()*(4-0));
    return phrases[aleatoryPhrase];
  }

}
