package Lab08;

import java.util.Random;

public class ElectronicToy {
    private final EmbeddedBattery battery;
    public ElectronicToy(int seed){
        battery = new EmbeddedBattery(seed);
    }
    public class EmbeddedBattery {
        private final int ID;
        public EmbeddedBattery(int seed){
            Random rand = new Random(seed);
            ID = rand.nextInt(100);
        }
        public int getBatteryID() {
            return ID;
        }
    }
    public int getToyID(){
        return battery.getBatteryID();
    }
}


class Q6 {
    public static void main(String[] args) {
        /*Tests that member methods of EmbeddedBattery are accessible through the ElectronicToy class*/
        ElectronicToy c = new ElectronicToy(30);
        System.out.println(c.getToyID()>0);

        ElectronicToy c1 = new ElectronicToy(30);
        System.out.println(c1.getToyID());
        ElectronicToy c2 = new ElectronicToy(40);
        System.out.println(c2.getToyID());
    }
}
