package ex1;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        java.util.Map<String, Double> studentAndGrade = new HashMap<>();

        studentAndGrade.put("Vlad", 4.0);
        studentAndGrade.put("Fanu", 10.0);
        studentAndGrade.put("Emi", 8.0);
        studentAndGrade.put("Ruben", 8.6);



        for (String student : studentAndGrade.keySet()) {
            System.out.println(studentAndGrade);
        }

    }
}

