package Lab06;

enum CarModel { COROLLA, PRIUS, CAMRY, CAMRY_HYBRID }

class MyCar {
    private String name;
    private CarModel model;
    private MyEngine engine;

    public MyCar(String name, CarModel model) {
        this.name = name;
        this.model = model;
        this.engine = new MyEngine();
    }

    public String toString() {
        return String.format("My car is called %s. It is a %s and %s ", name, model, engine);
    }

    class MyEngine {
        private int capacity;

        public MyEngine() {
            if (model == CarModel.COROLLA) {
                capacity = 1794;
            } else if (model == CarModel.PRIUS) {
                capacity = 1798;
            } else {
                capacity = 2362;
            }
        }

        public String toString() {
            return String.format("has an engine capacity of %d.", capacity);
        }
    }
}

public class Q10 {
}
