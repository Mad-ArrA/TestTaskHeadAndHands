package test.handh;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String alice) {
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 25);

        person1.setName("Alice");
        person1.setAge(35);

        person2.setName("Bob");
        person2.setAge(28);

        System.out.println("Person 1's name is " + person1.getName());
        System.out.println("Person 2's age is " + person2.getAge());
    }
}