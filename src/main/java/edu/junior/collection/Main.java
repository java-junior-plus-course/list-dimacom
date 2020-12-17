package edu.junior.collection;

import edu.junior.person.Address;
import edu.junior.person.Person;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John","Luis", 43,new Address("USA","NY","Mark's pl","8"));
        Person person2 = new Person("Rob","Brawn",22,new Address("Great Britain","London","Bond","13"));
        Person person3 = new Person("Max","Smirnov",34,new Address("Russia","Moscow","Poveletskaya","12"));
        Person person4 = new Person("Alex","Ivanov",18,new Address("BLR","Minsk","Lenina","12"));
        ListP<Person> list = new ListP<>(person1,person2,person3);
        list.add(person4);

        String person5 = "Ivan";
        String person6 = "sasha";
        String person7 = "dima";
        ListP<String> listString = new ListP<>(person5,person6,"dasha",person7);

        ListP<Integer> listInteger = new ListP<>(4,6,7,1,3,2);
         }
    }


