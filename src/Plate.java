public class Plate {

    private int foodCount;

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" + "foodCount=" + foodCount + '}';
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        if (foodCount >= catEatFoodCount) foodCount -= catEatFoodCount;
    }
    public void increase (int catEatFoodCount) {
         foodCount += catEatFoodCount;
        System.out.println("Добавлено " + catEatFoodCount + " еды, теперь в тарелке " + foodCount + " корма");
    }
}
