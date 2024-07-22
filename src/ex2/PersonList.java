package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonList {

    public static void main(String[] args) {
        Person person = new Person("Roberto", 90, "red");
        Person person2 = new Person("Ruben", 10, "blonde");
        Person person3 = new Person("Stefan", 18, "brown");

        //Lists for extraction
        List<Person> personList = new ArrayList<>();
        //name list
        List<String> personNameList = new ArrayList<>();
        //age limit extraxtion list
        List<Person> ageLimitedList = new ArrayList<>();


        // the map personToAge (I tried in a different class but failed :) )
        Map<String, Integer> personToAge = new HashMap<>();

        personList.add(person);
        personList.add(person2);
        personList.add(person3);


        //extract persons name in a separate list
        personList.forEach(people -> personNameList.add(people.getName()));
        System.out.println(personList);
        System.out.println(personNameList);


        //create map and print personToAge
        personList.forEach(people -> personToAge.put(people.getName(), people.getAge()));
        System.out.println(personToAge);

        // people age selector (mai pe romaneste sortarea)
        personList.forEach(people -> {
            if (people.getAge() > 18) { // Filter by age
                ageLimitedList.add(people);
            }});
        System.out.println(ageLimitedList);

//map hair to name
        Map<String, String> hairToName = new HashMap<>();
        personList.forEach(people -> hairToName.put(people.getHairColor(), people.getName()));
        System.out.println(hairToName);


    }
}

record Person(
        String name,
        int age,
        String hairColor
) {

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }
}
