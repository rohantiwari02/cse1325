public class Pet {
    private String name;
    private int age;
    private Type type;

    public Pet(String name, int age, Type type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " is a " + type + " age " + age;
    }

    public static void main(String[] args) {
        Pet[] pets = {
                new Pet("Celestia", 10, Type.Millipedes),
                new Pet("Max", 5, Type.Tarantulas),
                new Pet("Kiwi", 2, Type.Snake),
                new Pet("Nemo", 1, Type.Degus)
        };

        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

}
