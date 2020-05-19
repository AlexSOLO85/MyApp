package ru.safin.homework07;

public class ChangeProduct {

    public static Product getSelected(int item){
        for (Product p : Product.values()) {
            if (p.getNumber() == item) {
                return p;
            }
        }
        return null;
    }
}
