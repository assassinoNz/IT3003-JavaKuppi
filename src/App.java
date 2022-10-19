//We are using interfaces to model Movability in Human and StandardBike because there is no logical connection between 

interface Movable {//Describes methods that needs to be in a Movable object
    public abstract void increaseSpeed();

    public abstract void decreaseSpeed();

    public abstract void stop();
}

interface Ridable {//Describes methods that needs to be in a Ridable object
    public abstract void placeRider(Human human1);

    public abstract void placeRider(Human human1, Human human2);
}

class Human implements Movable {
    //METHODS REQUIRED BECAUSE Human implements Movable
    public void increaseSpeed() {
        System.out.println("Walking faster");
    };

    public void decreaseSpeed() {
        System.out.println("Walking slower");
    };

    public void stop() {
        System.out.println("Not walking");
    };
}

class StandardBike implements Movable, Ridable {
    private double speed; //Encapsulated to prevent unwanted access and mutations

    //METHODS REQUIRED BECAUSE StandardBike implements Movable
    public void increaseSpeed() {
        System.out.println("Pedaling faster");
    }

    public void decreaseSpeed() {
        System.out.println("Pedaling slower");
    };

    public void stop() {
        System.out.println("Brake");
    };

    //METHODS REQUIRED BECAUSE StandardBike implements Ridable
    public void placeRider(Human human1) { //Overloaded by the next method
        System.out.println("Assigned human as main rider");
    }

    public void placeRider(Human human1, Human human2) { //Overloaded by the previous method
        System.out.println("Assigned human1 as main rider. Assigned human2 as pillion rider");
    }

    //OTHER METHODS
    public void setSpeed(double speed) {
        //Error handling example: Using if logic and throw keyword
        if (speed > 150) {
            throw new IllegalArgumentException("Invalid speed");
        } else {
            this.speed = speed;
        }
    }
}

class MountainBike extends StandardBike {
    private int gear; //Encapsulated to prevent unwanted access and mutations

    public void setGear(int gear) { //A secure public method to access modify the gear
        //Error handling example: Using simple if logic
        if (gear > 4) {
            System.out.println("Invalid gear");
        } else {
            this.gear = gear;
        }
    }
}

class MotorBike extends MountainBike {
    private double fuel; //Encapsulated to prevent unwanted access and mutations

    @Override
    public void increaseSpeed() {//Overridden method of StandardBike because MotorBike doesn't use pedaling
        System.out.println("Providing more fuel");
    }

    @Override
    public void decreaseSpeed() {//Overridden method of StandardBike because MotorBike doesn't use pedaling
        System.out.println("Providing less fuel");
    };
}

public class App {
    public static void main(String[] args) {
        MotorBike bike1 = new MotorBike(); //Construct new bike
        MotorBike bike2 = new MotorBike(); //Construct another new bike
        bike1.setGear(500); //Will throw an error
        bike1.setSpeed(500); //Will throw an error

        Human adam = new Human(); //Construct human
        Human eve = new Human(); //Construct another human

        bike1.placeRider(adam); //Using an overload method to set a single rider
        bike2.placeRider(adam, eve); //Using an overload method to set two riders
    }
}
