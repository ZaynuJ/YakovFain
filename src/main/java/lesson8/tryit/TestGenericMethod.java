package lesson8.tryit;

import Lesson6.Payable;
import lesson7.com.practicaljava.Contractor;

import java.util.ArrayList;
import java.util.List;

public class TestGenericMethod {

    public static void main(String[] args) {

        test();
    }

    public static void test()
    {

        List<RetiredEmployee> lReEm = new ArrayList<>();

        lReEm.add(new RetiredEmployee("Mike"));
        lReEm.add(new RetiredEmployee("Nike"));
        lReEm.add(new RetiredEmployee("Selesta"));


        List<Employee> lEm = new ArrayList<>();
        lEm.add((new Employee("Tam")));
        lEm.add((new Employee("Sam")));
        lEm.add((new Employee("Pam")));

        for (RetiredEmployee lr:lReEm)
        {
            lEm.add(lr);
        }
        for (Employee emp: lEm)
        {
            System.out.println(emp.getName());
        }

    }

}
