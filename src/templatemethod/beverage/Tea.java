package templatemethod.beverage;

public class Tea extends CaffeinatedBeverage {
//    public void boilWater() {
//        System.out.println("Boiling water");
//    }

    //    public void steepTea() {
//        System.out.println("Steeping tea");
//    }
//    public void pourInCup() {
//        System.out.println("Pouring in cup");
//    }
    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping tea");
    }

//    public void addLemon() {
//        System.out.println("Adding lemon");
//    }
//    public void prepareRecipe() {
//        boilWater();
//        steepTea();
//        pourInCup();
//        addLemon();
//    }
}
