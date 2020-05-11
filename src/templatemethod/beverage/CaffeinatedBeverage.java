package templatemethod.beverage;

public abstract class CaffeinatedBeverage {

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
