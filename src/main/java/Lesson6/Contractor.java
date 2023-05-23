package Lesson6;

public class Contractor extends Person implements Payable {
    public Contractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent>INCREASE_CAP)
        {
            System.out.println("Sorry, it to much pay increase! You are contractor, know your place");
        }
        else
        {
            System.out.println("it's fine");
        }
        return true;
    }
}
