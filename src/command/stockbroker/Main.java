package command.stockbroker;

public class Main {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        Order buyStockOrder = new BuyStock(abcStock);
        Order sellStockOrder = new SellStock(abcStock);
        // test of new code below
        sellStockOrder.undo();

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        // new code
        broker.undoOrder(sellStockOrder);

        broker.placeOrders();
    }

}
