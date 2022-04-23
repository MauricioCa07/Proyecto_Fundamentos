import java.util.ArrayList;
public class Zombie {
  private static int counter = 0;
  private static ArrayList <Zombie> zombieArray = new ArrayList <Zombie>(); 
  private String name;
  private int health;
  private String birthDate;
  private String blood;

  public static int getZombiesCounter(){
    return Zombie.counter;
  }

  public static void setZombieArrayElement(Zombie zombie) {
    Zombie.counter += 1;
    Zombie.zombieArray.add(zombie);
  }
  public static ArrayList <Zombie> getZombieArray() {    
  return zombieArray; 
  }

  public void setZombieName(String name) {
    this.name = name;
  }
  public String getZombieName() {
    return this.name;
  }
  
  public void setZombieHealth(int health) {
    this.health = health;
  }
  public int getZombieHealth() {
    return this.health;
  }
  
  public void setZombieBirthDate(String birth) {
    this.birthDate = birth;
  }
  public String getZombieBirthDate() {
    return this.birthDate;
  }
  public String getZombieBirthYear(){
    return this.birthDate.substring(6);
  }

  public void setZombieBlood(String blood) {
    this.blood = blood.toUpperCase();
  }
  public String getZombieBlood() {
    return this.blood;
  }

  @Override
  public String toString() {
      
    return "**********************************\n"
           +"Name: "+ this.name+ "\n" 
           +"Health: " + this.health + "\n"
           +"Birth date: " + this.birthDate +"\n"
           +"Blood type: " + this.blood + "\n"
           +"**********************************\n";
  }
}
