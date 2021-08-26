package com.dailycoder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {



    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person = new Person("A",60);
        Person person1 = new Person("A",80);
        Person person2 = new Person("A",81);
        Person person3 = new Person("A",91);

        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);


        List<Person> personListAgeMoreThan80 = people.stream()
                                    .filter(x -> x.age>80)
                                    .collect(Collectors.toList());


        personListAgeMoreThan80.forEach(x->{
            System.out.println(" age " +x.age);
        });

    }
}

