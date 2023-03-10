package example;

public class Client {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("原始价格为：" + originalPrice);
        System.out.println("--------------------------");

        Discount discount;
        discount = (Discount) XMLUtil.getBean();
        mt.setDiscount(discount);

        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);
    }
}
