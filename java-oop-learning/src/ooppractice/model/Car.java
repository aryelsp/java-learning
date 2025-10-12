package ooppractice.model;

public class Car {
    private String model;
    private double speed;
    public static final int MAX_SPEED = 200;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(double value) {
        if (speed + value > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            speed += value;
        }
    }

    public void showSpeed() {
        System.out.println(model + " speed: " + speed + " km/h");
    }
}
