import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAWEESOFT on 4/9/16 AD.
 */
public class Main {

    public static void main(String[] ar){
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Henry"));
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Harry"));
        printName(dogs);
        printNameWildcard(dogs);
        printName(cats);
        printNameWildcard(cats);
    }

    /**
     * Without using Wildcard
     * @param animals
     */
    public static void printName(List<Animal> animals){
        for(Animal animal : animals)
            System.out.println(animal.getName());
    }

    /**
     * Using Wildcard
     */
    public static void printNameWildcard(List<? extends Animal> animals){
        for (Animal animal : animals)
            System.out.println(animal.getName());
    }
}
