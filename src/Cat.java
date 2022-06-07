

public class Cat {

    private String name;
    private int foodLimit = 20;
    private int eatenFood = 0;
    private boolean wellfed = false;

    public Cat(String name) {
        this.name = name;
    }

    public boolean isWellfed() {
        return wellfed;
    }

    public void eat(Plate plate) {
        int catEatFoodCount;

        if (foodLimit - eatenFood > 0 && plate.getFoodCount() > foodLimit - eatenFood) {

            if (foodLimit - eatenFood > 3) {
                catEatFoodCount = (int) (Math.random() * (foodLimit - eatenFood - 3) + 3);
            } else {
                catEatFoodCount = foodLimit - eatenFood;
            }

            plate.decreaseFood(catEatFoodCount);
            System.out.println("Котик " + name + " съел " + catEatFoodCount + " корма");
            eatenFood += catEatFoodCount;
        } else if (foodLimit - eatenFood == 0) {
            wellfed = true;
            System.out.println("Котик " + name + " наелся ");

        }
    }
}