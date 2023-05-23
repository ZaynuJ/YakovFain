package lesson8;

public class Box<T> {
    private T t;

    private void add(T t)
    {
        this.t = t;
    }
    private T get()
    {
        return t;
    }
}
