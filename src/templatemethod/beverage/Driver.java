package templatemethod.beverage;

public class Driver {

    public static void main(String[] args) {
        CaffeinatedBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("* * * * * * * * * * * * * * *");

        CaffeinatedBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
