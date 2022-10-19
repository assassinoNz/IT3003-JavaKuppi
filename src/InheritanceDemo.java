class StandardBike {
    double speed;

    void increaseSpeed() {
        System.out.println("Pedaling faster");
    }
}

class MountainBike extends StandardBike {
    int gear;
}

class MotorBike extends MountainBike {
    double fuel;

    @Override
    void increaseSpeed() {
        System.out.println("Providing more fuel");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        //Subtyping example which occurs due to inheritance
        StandardBike bike1 = new StandardBike();
        StandardBike bike2 = new MountainBike();
        StandardBike bike3 = new MotorBike();

        MountainBike bike4 = new MountainBike();
        MountainBike bike5 = new MotorBike();

        MotorBike bike6 = new MotorBike();
    }
}
