package com.company.builder;

public class BuilderPattern {

    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("Max")
                .setAge(20)
                .setSalary(100.00)
                .build();

        System.out.println(person);
    }
}


