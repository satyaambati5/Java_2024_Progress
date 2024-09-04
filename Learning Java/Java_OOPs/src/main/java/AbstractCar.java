abstract class abstractCar {
    abstract void startEngine(); // Abstract method

    void applyBrakes() { // Concrete method
        System.out.println("Brakes applied");
    }
}

class Tesla extends abstractCar {

    @Override
    void startEngine() {
        System.out.println("Tesla engine started silently.");
    }

}

class Ford extends abstractCar {
    @Override
    void startEngine() {
        System.out.println("Ford engine started with a roar.");
    }
}

//public class AbstractCar {
//    public static void main(String[] args) {
//        abstractCar myTesla = new Tesla();
//        myTesla.startEngine(); // Output: Tesla engine started silently.
//        myTesla.applyBrakes(); // Output: Brakes applied
//
//        abstractCar myFord = new Ford();
//        myFord.startEngine(); // Output: Ford engine started with a roar.
//        myFord.applyBrakes();
//    }
//}

