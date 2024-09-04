
public class EncapsulationExample {
    public static void main(String[] args) {
     MyCar obj2= new MyCar();
        System.out.println("Color: "+ obj2.getColor());
        System.out.println("After Set color Blue to Red: ");
        obj2.setColor("Red");
        System.out.println("Color: "+ obj2.getColor());
        System.out.println("model year is: " + obj2.getModel());
        Testing mytest =new Testing();
        System.out.println("getting collor from the child class testing: "+mytest.getColor());
    }
}
class MyCar {
    // Private fields
    private String color = "Blue";
    private int model = 2024;

    // Public methods to access and modify private fields
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}


class Testing extends  MyCar{
    private Boolean test =true;
    public Boolean getTest(){
        return test;
    }
    public void setTest(Boolean test){
        this.test=test;
    }


//get model here and print it
}