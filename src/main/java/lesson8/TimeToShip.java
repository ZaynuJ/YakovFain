package lesson8;

public class TimeToShip {
    Box<Nokia> boxOfPhones = new Box<>();

    Box<BlackBerry> boxOfPhones2 = new Box<>();

    ShippingOrder<String, Box<Nokia>> so1 = new ShippingOrder<>("ph1121",boxOfPhones);
    ShippingOrder<String, Box<BlackBerry>> so2 = new ShippingOrder<>("ph1121",boxOfPhones2);
}
