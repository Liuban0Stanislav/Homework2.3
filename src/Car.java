public class Car extends Vehicle {
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобилю");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобилю");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
