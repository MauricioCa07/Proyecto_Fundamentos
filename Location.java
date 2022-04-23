import java.util.ArrayList;
public class Location {
  private static ArrayList <Location> locationsArray = new ArrayList <Location>();
  private String name;
  private float distanceToAlexandria;
  private int zombiesQuantity;
  
  public static void setLocationsArrayElement(Location location) {
    Location.locationsArray.add(location);          
  }
  public static ArrayList<Location> getLocationsArray() {
    return Location.locationsArray;
  }

  public void setLocationName(String name) {
    this.name = name;
  }
  public String getLocationName() {
    return this.name;
  }

  public void setDistanceToAlexandria(float distance) {
    this.distanceToAlexandria = distance;
  }
  public float getDistanceToAlexandria() {
    return this.distanceToAlexandria;
  }
  public static void organizeLocationsArrayOnDistance(){
    int listLength = locationsArray.size();
    int minorPosition;
    Location temp;
    for(int i = 0; i < listLength - 1; i++){
      minorPosition = i;
      for(int j = i + 1; j < listLength; j++){
        if(locationsArray.get(j).getDistanceToAlexandria() < locationsArray.get(minorPosition).distanceToAlexandria){
          minorPosition = j;
        }
      }
      temp = locationsArray.get(i);
      locationsArray.set(i, locationsArray.get(minorPosition));
      locationsArray.set(minorPosition, temp);
      }
    }

  public void setZombiesQuantity(int zombiesQuantity) {
    this.zombiesQuantity = zombiesQuantity;
  }
  public int getZombiesQuantity() {
    return this.zombiesQuantity;
  }

  @Override
  public String toString() {
    return "**********************************\n" 
    +"Nombre:" + name +"\n"
    +"distancia a Alejandria:" + distanceToAlexandria +"\n"
    +"Cantidad de zombies en esta locacion: "+ zombiesQuantity+"\n"
    +"**********************************" ;
  }
}
