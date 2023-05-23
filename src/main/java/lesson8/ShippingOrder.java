package lesson8;

public class ShippingOrder<K,V> {
    private K key;
    private V value;

    public ShippingOrder(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
}
