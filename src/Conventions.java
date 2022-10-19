//CASES
//PascalCase: classes, interfaces
//camelCase: variable, methods
//SCREAMING_SNAKE_CASE: constants

//Class: noun
//Method: verb
//Interface: adjective

class SweetHome {
    //All items in a class are called properties

    //When properties are variables, they are called fields/variables
    //Following are instance fields/variables
    int roomCount;
    int floorCount;
    double width;
    double height;
    //Following are static/class fields/variables
    static String paperType = "A4";

    //When properties are functions, they are called methods/behaviors
    //Following are instance methods/behaviors
    void openDoor() {

    }

    //Following are static/class methods/behaviors
    static void testMethod() {

    }
}

public class Conventions {
    //Java's required main method
    public static void main(String[] args) {
        //Reference type example
        SweetHome whiteHouse; //Variable declaration
        whiteHouse = new SweetHome(); //Variable initialization, instantiation

        SweetHome templeTrees = new SweetHome(); //Variable declaration, initialization, instantiation all at once
        
        //Primitive type example
        int count; //Variable declaration
        count = 12; //Variable initialization, (There is no instantiation)
    
        //There is a static method named "random" in "math" class
        System.out.println(Math.random());

        //There is a static constant named "pi" in "math" class
        System.out.println(Math.PI);
    }

    //Another main method with different signature
    public static void main(int[] args) {

    }

    //Another main method with different signature
    public static void main(String[] args, int count) {

    }
}
