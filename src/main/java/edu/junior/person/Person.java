package edu.junior.person;

import java.util.Objects;

public class Person<P> implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public Person(Person person) {
        this(person.getFirstName(), person.getLastName(), person.getAge(), new Address(person.address));
    }

    @Override
    public String toString() {
        return String.format(" \n %s %s, age %d,%s", firstName, lastName, age, address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, address);
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare( age , o.age);

    }
}
