package com.jsp.wo;

public class CompareToExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 30);

        int comparison1 = person1.compareTo(person2);
        System.out.println("Comparison of Alice and Bob: " + comparison1);

        int comparison2 = person1.compareTo(person3);
        System.out.println("Comparison of Alice and Charlie: " + comparison2);

        int comparison3 = person2.compareTo(person3);
        System.out.println("Comparison of Bob and Charlie: " + comparison3);
    }
}
class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Comparing based on age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


