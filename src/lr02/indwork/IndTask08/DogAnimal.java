package lr02.indwork.IndTask08;

class DogAnimal extends Animal {
    private String breed;
    public DogAnimal(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    // Метод звуков собаки
    public void fetch() {
        System.out.println(getName() + " лает");
    }
    // Метод отображающий породу собаки
    public String getBreed() {
        return breed;
    }
}