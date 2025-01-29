package ex_07;

public enum Animal {
    DOG("DOGG") {
        @Override
        public void makeSound() {
            System.out.println("woof");
        }
    },
    CAT("TOM") {
        @Override
        public void makeSound() {
            System.out.println("meow");
        }
    },
    COW("RED BULL") {
        @Override
        public void makeSound() {
            System.out.println("moo");
        }
    };

    private final String name;

    Animal(final String text) {
        this.name = text;
    }

    public abstract void makeSound();
}
