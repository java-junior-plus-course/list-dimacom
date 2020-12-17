package edu.junior.collection;

import java.util.Arrays;

public class ListP<P> implements PersonList<P> {
    private P[] elementData;

    public ListP() {
    }

    public ListP(P... element) {
        this.elementData = Arrays.copyOf(element, element.length);
    }

    public String toString() {
        return Arrays.toString(elementData);
    }

    @Override
    public boolean isEmpty() {
        if (elementData == null || size() == 0) {
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
    public void add(P person) {
        add(person, elementData.length);
    }

    @Override
    public void add(P person, int index) {
        if (index > elementData.length) {
            throw new IllegalArgumentException("index it greater than the size of the list");
        }
        P[] result = (P[]) new Object[elementData.length + 1];
        result[index] = person;
        int i = 0;
        for (P element : elementData) {
            if (i == index) {
                i++;
            }
            result[i++] = element;
            elementData = result;
        }
    }

    @Override
    public P get(int index) {
        if (index > elementData.length - 1) {
            throw new IllegalArgumentException("index it greater than the size of the list");
        }
        return elementData[index];
    }

    @Override
    public int indexOf(P person) {
        if (person != null) {
            int i = 0;
            for (P element : elementData) {
                if (person.equals(element)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(P person) {
        if (indexOf(person) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public P remove(int index) {
        if (index >= elementData.length || index < 0) {
            throw new IllegalArgumentException("illegal argument");
        }
        P[] result = (P[]) new Object[elementData.length - 1];
        int j = 0;
        for (int i = 0; i < elementData.length - 1; i++) {
            if (j == index) {
                j++;
            }
            result[i] = elementData[j++];
        }
        elementData = result;
        return elementData[index];
    }

    @Override
    public boolean remove(P person) {
        int index = indexOf(person);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {

        elementData = (P[]) new Object[0];
    }

    @Override
    public void sort() {
        Arrays.sort(elementData);
    }

    @Override
    public P[] toArray() {
        P[] result = Arrays.copyOf(elementData, elementData.length);
        return result;
    }
}
