public class CarClassExample1 {
    // Fields (attributes)
    String name ;
    String model;
    int year;

    public CarClassExample1 (String name, String model, int year){
        this.name =name;
        this.model = model;
        this.year =year;
  }


//Method mehaviour of car class
    void  startEngine(){
        System.out.println("Car Engine Started");
    }
    void stopEngine(){
        System.out.println("Car Engine Stopped");
    }


}
