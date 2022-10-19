class Butterfly {
    void go() {
        System.out.println("Ok");
    }
}

class AdultButterfly extends Butterfly {
    @Override
    void go() {
        System.out.println("I'm flying");
    }
}

class Caterpillar extends Butterfly {
    @Override
    void go() {
        System.out.println("I'm crawling");
    }
}

class Cocoon extends Butterfly {
    @Override
    void go() {
        System.out.println("Can't move");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Butterfly butterfly1 = new AdultButterfly();
        Butterfly butterfly2 = new Caterpillar();
        Butterfly butterfly3 = new Cocoon();

        Butterfly[] butterflies = new Butterfly[3];
        butterflies[0] = butterfly1;
        butterflies[1] = butterfly2;
        butterflies[2] = butterfly3;
        
        for (int i = 0; i < butterflies.length; i++) {
            butterflies[i].go(); //Example of dynamic binding
        }
    }
}
