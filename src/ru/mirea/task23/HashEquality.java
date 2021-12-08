package ru.mirea.task23;

public class HashEquality {
    public static void main(String[] args)
    {
        GPU RTX3070 = new GPU("Asus", 2020, 1725,8192, 256);
        GPU RTX3070TI = new GPU("Gigabyte", 2021, 1880, 8192, 256);
        GPU RTX3090 = new GPU("Giganyte", 2020, 1860, 24000, 384);
        GPU RadeonRX5700XT = new GPU("Asus", 2020, 1725, 8192, 256);
        GPU RadeonRXVega64 = new GPU("MSI", 2018, 1890, 8192, 2048);


        System.out.println("Сравним первый объект с последующими");
        System.out.println("RTX3070 и RTX3070TI равны? " + RTX3070.equals(RTX3070TI));
        System.out.println("RTX3070 и RTX3090 равны? " + RTX3070.equals(RTX3090));
        System.out.println("RTX3070 и RX5700XT равны? " + RTX3070.equals(RadeonRX5700XT));
        System.out.println("RTX3070 и RXVega64 равны? " + RTX3070.equals(RadeonRXVega64));
        System.out.print("\n");

        System.out.println("Хэш-коды объектов");
        System.out.println("RTX 3070: " + RTX3070.hashCode());
        System.out.println("RTX 3070 Ti:" + RTX3070TI.hashCode());
        System.out.println("RTX 3090: " + RTX3090.hashCode());
        System.out.println("RadeonRX5700XT: " + RadeonRX5700XT.hashCode());
        System.out.println("RadeonRXVega64: " + RadeonRXVega64.hashCode());
    }
}
