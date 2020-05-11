package templatemethod.beverage;

public class Coffee extends CaffeinatedBeverage {
//    public void boilWater() {
//        System.out.println("Boiling water");
//    }

    //    public void pourInCup() {
//        System.out.println("Pouring in cup");
//    }
    @Override
    public void addCondiments() {
        System.out.println("Adding cream and sugar");
    }

    //    public void brewCoffeeGrounds() {
//        System.out.println("Brewing coffee grounds");
//    }
    @Override
    public void brew() {
        System.out.println("Brewing coffee grounds");
    }

//    public void addCreamAndSugar() {
//        System.out.println("Adding cream and sugar");
//    }
//    public void prepareRecipe() {
//        boilWater();
//        brewCoffeeGrounds();
//        pourInCup();
//        addCreamAndSugar();
//    }
}
