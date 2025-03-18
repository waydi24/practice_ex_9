public class Main{
    public static void main(String[] args) throws Exception {
        HandleOrders handleOrders = new HandleOrders();
        OrderLogs order = new OrderLogs();
        Process process = new Process();
        handleOrders.takeOrder();
        handleOrders.createOrderSummary();
        handleOrders.displayCustomPizzas();
        System.out.println(handleOrders);
        order.addOrderLog("pizza1");
        order.addOrderLog("pizza2");
        order.addOrderLog("pizza3");
        order.handleLogs();
        process.addOrderLog("pizza1");
        process.addOrderLog("pizza2");
        process.addOrderLog("pizza3");
        process.handleLogs();
        System.out.println(handleOrders);
    }
}
