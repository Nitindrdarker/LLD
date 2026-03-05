interface FlyingBird {
    public abstract void fly();
}

interface EatingBird {
    public abstract void eat();
}

class Sparrow implements EatingBird, FlyingBird {

    @Override
    public void fly() {
        System.err.println("Flying");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

}

class Penguine implements EatingBird {

    @Override
    public void eat() {
        System.err.println("Flying");
    }

}

class Eagle implements EatingBird, FlyingBird {
    @Override
    public void fly() {
        System.err.println("Flying");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }
}

public class LSP {

}
