 /**
 * Lesson 6
 * @author Tselovalnikov S
 * @version 03 okt 2021
 */
 
 class DZ6 {

    public static void main(String[] args) {
        Dog dog = new Dog(500,10);
        Cat cat = new Cat(200, -1);

IAnimal[] animals = {cat, dog};
for (IAnimal animal : animals) { 
            System.out.println(animal);
            System.out.println(animal.run(300));
            System.out.println(animal.run(400));
            System.out.println(animal.run(500));
            System.out.println(animal.swim(10));
            System.out.println(animal.swim(15));
        }
        System.out.println("Animals: " + cat.getCountOfAnimals());
    }
}

class Dog extends Animal {

    Dog(int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
    }
}

class Cat extends Animal {

    Cat(int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
    }

    @Override
    public String swim(int distance) {
        return getAnimalName() + "cant swim";
   }
}

abstract class Animal implements IAnimal {
    private int runDistance;
    private int swimDistance;
    private String animalName;
    private static int countOfAnimals;

    Animal(int runDistance, int swimDistance) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        animalName = getClass().getSimpleName();
        countOfAnimals++;
    }

    public int getCountOfAnimals() {
        return countOfAnimals;
    }

    public String getAnimalName() {
        return animalName;
    }

    @Override
    public String run(int distance) {
         if (distance > runDistance) {
            return animalName + "could  run  " + distance;
        } else {
            return animalName + " suc run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimDistance) {
            return animalName + "could swim  " + distance;
        } else {
            return animalName + " suc swim " + distance;
       }
    }

    @Override
    public String toString() {
        return animalName + ". runDistance: " + runDistance + ", swimDistance: " + swimDistance;
        }
    }

interface IAnimal {
    String swim(int distance);
    String run(int distance);
}