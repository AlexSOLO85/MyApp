package ru.safin.homework13;

public class Child {

    public void eat(Meal meal) {
        try {
            if (meal == Meal.CARROT || meal == Meal.PORRIDGE) {
                throw new DontLikeTheFood();
            } else if (meal == Meal.APPLE || meal == Meal.JUICE) {
                System.out.println("Съел ... за обе щеки");
            }
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        finally {
            System.out.println("Спасибо, мама!");
        }
    }
}
