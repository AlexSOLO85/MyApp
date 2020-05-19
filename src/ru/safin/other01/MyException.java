package ru.safin.other01;

public class MyException {

    public static void hello(String[] name) {
        try {
            name[0] = "Hello, World!";
            System.out.println(name[0]);
            if (name[0].equals("")) throw new Exception("Строка не может быть пустая");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс находится за пределами массива!");
        }
        catch (NullPointerException e) {
            System.out.println("Нулевое значение!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] argsStrings) {
        String[] nameOne = new String[0];
        hello(nameOne);
        String[] nameTwo = null;
        hello(nameTwo);
    }
}
