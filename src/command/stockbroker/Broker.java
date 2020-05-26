package command.stockbroker;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the Invoker: it executes the Commands.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void undoOrder(Order order){ orderList.remove(order);}
}
