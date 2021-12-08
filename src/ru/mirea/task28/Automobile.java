package ru.mirea.task28;

public class Automobile {
    private String manufacturer;
    private int startYear;
    private Engine autoEngine = new Engine(250, 2.5);


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getStartYear() {
        return startYear;
    }

    public Engine getAutoEngine() {
        return autoEngine;
    }

    //Нестатический вложенный класс
    private class Engine {
        private int power;       //л.с.
        private double volume;         //литры

        private Engine(int power, double volume) {
            this.power = power;
            this.volume = volume;
        }

        private void setPower(int power)
        {
            this.power = power;
        }

        private void setVolume(double volume)
        {
            this.volume = volume;
        }
        private double getPower()
        {
            return power;
        }

        private double getVolume() {
            return volume;
        }
    }

    //Статический класс внутри внешнего класса
    public static class Coupe extends Automobile
    {
        private String color;
        public Coupe(String manufacturer, int startYear, String color)
        {
            Automobile.Coupe.this.setManufacturer(manufacturer);
            Automobile.Coupe.this.setStartYear(startYear);
            this.color = color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void coupeGetInfo()
        {
            System.out.println("Производитель: " + Automobile.Coupe.this.getManufacturer() + ", Год запуска: " + Automobile.Coupe.this.getStartYear() + ", Цвет автомобиля: " + Coupe.this.color + ", Мощность двигателя: " + Automobile.Coupe.this.getAutoEngine().getPower() + ", Объём двигателя: " + Automobile.Coupe.this.getAutoEngine().getVolume());
        }
    }

    //Анонимный класс
    private class Sedan extends Automobile {
        private int price;
        public Sedan(String manufacturer, int startYear, int price)
        {
            Automobile.Sedan.this.setManufacturer(manufacturer);
            Automobile.Sedan.this.setStartYear(startYear);
            this.price = price;

        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void sedGetInfo()
        {
            System.out.println("Производитель: " + this.getManufacturer() + ", Год выпуска: " + this.getStartYear() + ", Цена: " + this.price + ", Мощность двигателя: " + Automobile.Sedan.this.getAutoEngine().getPower() + ", Объём двигателя: " + Automobile.Sedan.this.getAutoEngine().getVolume());
        }
    }

    public static void main(String[] args)
    {
        Automobile.Coupe auto = new Coupe("Audi", 2012, "Blue");
        Automobile.Sedan auto2 = new Automobile().new Sedan("Volvo", 2010, 1300000);

        auto.coupeGetInfo();
        auto2.sedGetInfo();
    }
}
