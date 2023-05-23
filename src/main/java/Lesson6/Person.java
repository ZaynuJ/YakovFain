package Lesson6;

public abstract class Person implements Payable{
    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person name is " + name;
    }

    @Override
    public boolean increasePay(int percent) {
       this.increasePay(percent);
        return true;
    }
}
