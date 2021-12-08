package ru.mirea.task26;

public class OrderForm {
    PaymentStratege stratege;
    private long orderNum;
    private String fullName;
    private String adress;
    private String paymentMethod;
    private String paymentInformation;
    private int price;

    public OrderForm()
    {
        orderNum = (long) (250000000 + Math.random() * 999999999);
        price = (int) (2500 + Math.random() * 25000);
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void refill(double balance)
    {
        stratege.refill(balance);
    }

    public void pay()
    {
        stratege.pay(this.price);
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentInformation() {
        this.paymentInformation = stratege.collectInformation();
    }

    public double getPrice() {
        return price;
    }

    public long getOrderNum()
    {
        return orderNum;
    }

    public void getOrderInfo()
    {
        System.out.println("Заказ №: " + this.orderNum);
        System.out.println("Фио: " + this.fullName);
        System.out.println("Адрес: " + this.adress);
        System.out.println("Платежный метод: " + this.paymentMethod);
        System.out.println("Платёжная информация: " + this.paymentInformation);
        System.out.println("К оплате: " + this.price + " руб");
    }
}
