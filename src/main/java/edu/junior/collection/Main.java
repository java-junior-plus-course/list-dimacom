package edu.junior.collection;

import edu.junior.person.Address;
import edu.junior.person.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John","Luis", 43,new Address("USA","NY","Mark's pl","8"));
        Person person2 = new Person("Rob","Brawn",22,new Address("Great Britain","London","Bond","13"));
        Person person3 = new Person("Max","Smirnov",34,new Address("Russia","Moscow","Poveletskaya","12"));
        Person person4 = new Person("Alex","Ivanov",18,new Address("BLR","Minsk","Lenina","12"));
        List list = new List(person1,person2,person3,person4);


    }
    }


