package dir;

public class Car {

    String engine;
    float weight;

    void showWeight(){
        System.out.println(weight);
    }

    public Car(String engine, float weight) {
        this.engine = engine;
        this.weight = weight;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
       // Car car = new Car();
    }
}
