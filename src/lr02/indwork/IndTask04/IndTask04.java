package lr02.indwork.IndTask04;

public class IndTask04 {
    private String name;
    private int age;
    private String gender;

    public IndTask04(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    //Пример использования класса Person:
    public static void main(String[] args) {
        IndTask04 person = new IndTask04("Баходур", 24, "Мужской");
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Пол: " + person.getGender());

        person.setAge(25);
        System.out.println("Новый возраст: " + person.getAge());
    }
}