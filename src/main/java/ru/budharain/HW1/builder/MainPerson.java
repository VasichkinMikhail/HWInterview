package ru.budharain.HW1.builder;

public class MainPerson {
    public static void main(String[] args) {
        Person newPerson = new Person.Builder()
                .firstName("Joe")
                .lastName("Smith")
                .middleName("Bob")
                .country("USA")
                .address("Glen str. Denver, Colorado")
                .phone("999999999")
                .age(30)
                .gender("male")
                .build();
        System.out.println(newPerson);
    }
}
