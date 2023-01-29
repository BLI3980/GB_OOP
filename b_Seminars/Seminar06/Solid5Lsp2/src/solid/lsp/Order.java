package Solid5Lsp2.src.solid.lsp;

public class Order extends Orderable{
    public Order(int qnt, int price) {
        super(price, qnt);
    }

    @Override
    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return "Стандартный заказ: " + super.toString();
    }


}
