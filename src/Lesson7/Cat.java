package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "Кот: " + name + " | Аппетит: " + appetite + "| Накормленный: " + isFull;
    }

    void eat(Plate plate) {
        if (plate.getAmountOfFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
}