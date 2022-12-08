public class Elf {
    private int calories;

    public Elf() {
        calories = 0;
    }

    public void addCalories(int calories) {
        this.calories += calories;
    }

    public int getCalories() {
        return calories;
    }

    public void resetCalories() {
        calories = 0;
    }
}
