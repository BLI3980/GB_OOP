package Solid5Lsp2.src.solid.lsp;

public class OrderRegular extends Orderable{
    public OrderRegular(int qnt, int price) {
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
