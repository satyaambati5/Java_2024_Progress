

public class Main {
    public static void main(String[] args) {

//        Class and Object
//        CarClassExample1 car = new CarClassExample1("Kia", "Carens",2021);
//        CarClassExample1 car1 = new CarClassExample1("benz", "GLX Sport",2024);
//        car.startEngine();
//        car.stopEngine();
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println("\n");
//        car1.startEngine();
//        car1.stopEngine();
//        System.out.println(car1.model);
//        System.out.println(car1.year);

        abstractCar myTesla = new Tesla();
        myTesla.startEngine(); // Output: Tesla engine started silently.
        myTesla.applyBrakes(); // Output: Brakes applied

        abstractCar myFord = new Ford();
        myFord.startEngine(); // Output: Ford engine started with a roar.
        myFord.applyBrakes();
    }
}
