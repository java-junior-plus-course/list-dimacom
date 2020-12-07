package edu.junior.collection;

import edu.junior.person.Person;

public interface PersonList {

    /**
     * Checks if the list is empty
     *
     * @return true if the list is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of elements are currently in the list
     *
     * @return the length of the list
     */
    int size();

    /**
     * Adds a person to the end of the list
     *
     * @param person person to be inserted
     */
    void add(Person person);

    /**
     * Adds a person to a certain position in the list
     * The positions of all consequent elements are increased by one
     *
     * @param person person to be inserted
     * @param index  the position to insert
     * @throws IllegalArgumentException if the index it greater than the size of the list
     */
    void add(Person person, int index);

    /**
     * Gets the person by its index
     *
     * @param index the position of required person
     * @return the person from certain position
     * @throws IllegalArgumentException if the index it greater than the size of the list
     */
    Person get(int index);

    /**
     * Returns the index of the person
     *
     * @param person searched person
     * @return the index of a person, or -1 if the list doesn't contain it
     */
    int indexOf(Person person);

    /**
     * Checks if the list contains a certain person
     *
     * @param person person to be matched
     * @return true if the list contains the person, false otherwise
     */
    boolean contains(Person person);

    /**
     * Removes a person from a certain index
     * After remove the size of the list decreases by one
     * The positions of all consequent elements are reduced by one
     *
     * @param index the position of a person to be removed
     * @return removed person
     * @throws IllegalArgumentException if the index it greater than the size of the list
     */
    Person remove(int index);

    /**
     * Removes a certain person
     * After remove the size of the list decreases by one
     * The positions of all consequent elements are reduced by one
     *
     * @param person person to be removed
     * @return true if the person is removed, false otherwise
     */
    boolean remove(Person person);

    /**
     * Removes all the elements from the list
     * Sets the size of the list to zero
     */
    void clear();

    /**
     * Sorts the list in increasing order
     */
    void sort();


    /**
     * Returns the array which is independent for this object
     *
     * @return the array representation of the list
     */
    Person[] toArray();
}
