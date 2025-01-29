package ex_07;

public class Ex_07 {
    /**
     * Реализуйте Enum класс Animal. Реализуйте его поля: Dog, Cat, Cow.
     * Каждое из полей должно содержать свое имя животного и свою реализацию метода makeSound().
     * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.
     * Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow" или "moo".
     * В main() создать и наполнить в произвольном порядке объектами разных инстанций массив типа Animal.*
     */


    public static void main(String[] args) {
        new Ex_07().run();
    }

    public void run() {
        Animal[] animals = new Animal[]{Animal.CAT, Animal.DOG, Animal.COW, Animal.DOG, Animal.CAT};

        pokeAnimals(animals);
    }

    private void pokeAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

}

