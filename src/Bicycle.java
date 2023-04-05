public class Bicycle extends Vehicle {
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеду");
    }
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}
