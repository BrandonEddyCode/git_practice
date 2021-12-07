public class Beast {
    String furType;
    boolean containsClaws;
    String name;
    String eyeColour;
    int age;
  
  public Beast(String furLength, boolean hasClaws, String nameOf, String eyeC, int ageOf) {
    furType = furLength;
    containsClaws = hasClaws;
    name = nameOf;
    eyeColour = eyeC;
    age = ageOf;
  }
  
    public String toString(){
      return "The name of the beast is " + name + "\n" +  "The age of the pet is " + this.age;
    }
  
  public static void main (String [] args) {
    Beast manolis = new Beast("Short", true, "Manolis", "Brown", 23);
    System.out.println(manolis.toString());
  }
  
  }