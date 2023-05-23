package Lesson6;

public class TestPayIncrease {


    public static void main(String[] args){

        Person workers[] = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mark");
        workers[2] = new Employee("Tom");

        Employee currentEmployee;
        Contractor currentContractor;

        for (Person p:workers)
        {
            p.increasePay(20);
//            if (p instanceof Employee)
//            {
//                currentEmployee = (Employee) p;
//                currentEmployee.increasePay(30);
//            } else if (p instanceof Contractor) {
//                currentContractor = (Contractor) p;
//                currentContractor.increasePay(60);
//            }
        }
    }
}
