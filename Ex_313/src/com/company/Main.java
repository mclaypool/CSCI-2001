package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee( "Max", "Claypool", 1000 );
        Employee employee2 = new Employee( "Big", "Money", 100000 );

        System.out.printf("%s %s currently makes %s a year\n",
                employee1.getFirstName(),
                employee1.getLastName(),
                employee1.getYearlySalary()
        );

        System.out.printf("%s %s currently makes %s a year\n",
                employee2.getFirstName(),
                employee2.getLastName(),
                employee2.getYearlySalary()
        );

        // give each employee a raise
        System.out.println("\nEvery January, each employee gets a 10% raise\n");

        employee1.giveRaise( 0.1 );
        employee2.giveRaise( 0.1 );

        System.out.printf("%s %s will now make %s a year\n",
                employee1.getFirstName(),
                employee1.getLastName(),
                employee1.getYearlySalary()
        );

        System.out.printf("%s %s will now make %s a year\n",
                employee2.getFirstName(),
                employee2.getLastName(),
                employee2.getYearlySalary()
        );
    }
}
