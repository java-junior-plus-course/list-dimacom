package edu.junior.collection;

import edu.junior.person.Person;

import java.util.Arrays;
import java.util.Comparator;


public class List implements PersonList {
    private Person[] elementData;

    public List() {
        this.elementData = new Person[0];
    }

    public List(Person... people) {
        this.elementData = Arrays.copyOf(people, people.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }

    @Override
    public boolean isEmpty() {
        if (elementData == null || elementData.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        if (elementData == null || elementData.length == 0) {
            return 0;
        }
        return elementData.length;
    }

    @Override
    public void add(Person person) {
        add(person, elementData.length);
    }

    @Override
    public void add(Person person, int index) {
        if (index > elementData.length) {
            throw new IllegalArgumentException("index it greater than the size of the list");
        }
        Person[] result = new Person[elementData.length + 1];
        result[index] = new Person(person);
        int i = 0;
        for (Person element : elementData) {
            if (i == index) {
                i++;
            }
            result[i++] = new Person(element);
            elementData = result;
        }
    }

    @Override
    public Person get(int index) {
        if (index > elementData.length - 1) {
            throw new IllegalArgumentException("index it greater than the size of the list");
        }
        return elementData[index];
    }

    @Override
    public int indexOf(Person person) {
        if (person != null) {
            int i = 0;
            for (Person element : elementData) {
                if (person.equals(element)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Person person) {
        if (indexOf(person) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public Person remove(int index) {
        if (index >= elementData.length || index < 0) {
            throw new IllegalArgumentException("illegal argument");
        }
        Person[] result = new Person[elementData.length - 1];
        int j = 0;
        for (int i = 0; i < elementData.length - 1; i++) {
            if (j == index) {
                j++;
            }
            result[i] = new Person(elementData[j++]);
        }
        elementData = result;
        return elementData[index];
    }

    @Override
    public boolean remove(Person person) {
        int index = indexOf(person);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        elementData = new Person[0];
    }

    @Override
    public void sort() {
        Arrays.sort(elementData, Comparator.comparing(Person::getLastName));
    }

    @Override
    public Person[] toArray() {
        return elementData;
    }
}