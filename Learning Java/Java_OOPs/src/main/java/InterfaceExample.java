interface Vehicle{
    void startEngine();
    void stopEngine();
}
class Tesla1 implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("MyCar Has started");
    }

    @Override
    public void stopEngine() {
        System.out.println("My car Stopped");
    }
}
class Bike implements Vehicle{
    @Override
    public  void  startEngine(){
        System.out.println("Mybike has started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike Stopped");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("main method");
        // Correct object instantiation
        Vehicle objcar = new Tesla1();  // Creating an object of Tesla1
        Vehicle objbike = new Bike();   // Creating an object of Bike

        // Calling methods
        objcar.startEngine(); // Output: MyCar Has started
        objcar.stopEngine();  // Output: My car Stopped

        objbike.startEngine(); // Output: Mybike has started
        objbike.stopEngine();  // Output: Bike Stopped


    }


}