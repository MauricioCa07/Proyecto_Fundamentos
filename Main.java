import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    System.out.println(Main.showMenu());
  }
  
  public static String showMenu(){
    Scanner user = new Scanner (System.in);
    Zombie newZombie = new Zombie();
    Location newLocation;
    int userNumber, birthYear, acumulator, arrayZombiesLength = Zombie.getZombieArray().size();
    
    System.out.println(Complementary.menu());
    menu:
    while(true){
      userNumber = user.nextInt();
      
      switch(userNumber){
      case 0:
        break menu;
      case 1:  
        System.out.println("Information of the new zombie: ");
        System.out.println("Name: ");
        String name = user.next();
        newZombie.setZombieName(name);
        
        System.out.println("Current health: ");
        int health = user.nextInt();
        newZombie.setZombieHealth(health);
        
        System.out.println("Birthdate: \n"
          + "The format of the date is dd/mm/yyyy");
        String born = user.next();
        newZombie.setZombieBirthDate(born);
        
        System.out.println("Bloodtype:");    
        String bloodTypeSet = user.next();
        newZombie.setZombieBlood(bloodTypeSet);
        
        Zombie.setZombieArrayElement(newZombie);                                   
        break ;  
        
      case 2:
        for(int i = 0; i < Zombie.getZombieArray().size(); i++){
          System.out.println(Zombie.getZombieArray().get(i));
        }  
        break;
        
      case 3:
        System.out.println("Zombies created currently: " + Zombie.getZombiesCounter()); 
        break;
        
      case 4:
        for(int i = 0; i <Zombie.getZombieArray().size(); i++){
          
          if(Zombie.getZombieArray().get(i).getZombieBlood().equals("O+") || Zombie.getZombieArray().get(i).getZombieBlood().equals("AB+")){
            System.out.println(Zombie.getZombieArray().get(i)); 
           }
        }                                                                           
        break ; 
        
      case 5:
        for(int i = 0; i <Zombie.getZombieArray().size(); i++){
          birthYear = Integer.valueOf(Zombie.getZombieArray().get(i).getZombieBirthYear());
          if(birthYear > 2000 ){
            System.out.println(Zombie.getZombieArray().get(i).toString()); 
          }
        }                                                                            
        break; 
                  
      case 6:
        for(int i = 0; i < Zombie.getZombieArray().size(); i++){
          Zombie.getZombieArray().get(i).setZombieHealth(Zombie.getZombieArray().get(i).getZombieHealth() / 2);      }                                         
        break ;
        
      case 7:
        newLocation = new Location();
        System.out.println("Information of the new location: ");
        System.out.println("Name:");
        String zoneName = user.next();
        newLocation.setLocationName(zoneName);
      
        System.out.println("Distance to Alexandria:");
        float distance = user.nextFloat();
        newLocation.setDistanceToAlexandria(distance);
        
        System.out.println("number of zombies:");
        int quantity = user.nextInt();
        newLocation.setZombiesQuantity(quantity);
        Location.setLocationsArrayElement(newLocation);                             
        break ;
        
      case 8:
          for(int i = 0; i <Location.getLocationsArray().size() ; i++){
            System.out.println(Location.getLocationsArray().get(i));
          }                                                                   
        break ;
        
      case 9:
          acumulator = Location.getLocationsArray().get(0).getZombiesQuantity();
        
          for(int i = 0; i < Location.getLocationsArray().size();i++){
            if(acumulator > Location.getLocationsArray().get(i).getZombiesQuantity()){
              acumulator = Location.getLocationsArray().get(i).getZombiesQuantity();
            }
          }
          for(int j = 0; j < Location.getLocationsArray().size(); j++){
              if(acumulator == Location.getLocationsArray().get(j).getZombiesQuantity()){
                System.out.println(Location.getLocationsArray().get(j));
              }
          }                                                                    
        break ;
      case 10:
          Location.organizeLocationsArrayOnDistance();
          for(int i = 0; i < Location.getLocationsArray().size(); i++){
            System.out.println(Location.getLocationsArray().get(i).toString());
          }
        break ;
      case 11:
          System.out.println(Complementary.phrases());                          
        break ;
      case 12:    
            System.out.println("All zombies created are: ");
            for(int i = 0; i < Zombie.getZombieArray().size(); i++){
                System.out.println("**********************************\n" + "this zombie is in the position "+(i));
                System.out.println(Zombie.getZombieArray().get(i));
              }
            System.out.println("based on the position starting at 0, which zombie do you want to eliminate?");
            int position = user.nextInt();
            Zombie.getZombieArray().remove(position);
          break ;
      }
    }
    return " ";
  }
}
