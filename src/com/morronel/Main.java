package com.morronel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        String newName;
        String newNumber;
        String searchTerm;
        int i = 0;

        System.out.println("name: ");
        newName = scanner.nextLine();

        while (!newName.equals("")) {
            System.out.println("number: ");
            newNumber = scanner.nextLine();
            list.add(new Student(newName, newNumber));
            i++;
            System.out.println("name: ");
            newName = scanner.nextLine();
        }

        for (Student student : list){
            System.out.println(student);
        }

        System.out.println("Give search termino: ");
        searchTerm = scanner.nextLine();

        for (Student student : list){
            if (student.getName().contains(searchTerm)){
                System.out.println(student);
            }
        }
    }
}
