package ru.mirea.task3;
import java.lang.*;
public class Human {
    private int age;
    private int weight;
    private int height;

    Human(int age, int weight, int height)
    {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setAge(int age) { this.age = age; }
    public void setWeight(int weight) { this.weight = weight; }
    public void setHeight(int height) { this.height = height; }
    public int getAge() { return age; }
    public int getWeight() { return weight; }
    public int getHeight() { return height; }
    public String toString() { return "Human:: Age: " + age + ", weight: " + weight + ", height: " + height; }

}

class Head
{
    private String hairColor;
    private String hairType;

    Head(String hairColor, String hairType)
    {
        this.hairColor = hairColor;
        this.hairType = hairType;
    }

    public void setHairColor(String hairColor) { this.hairColor = hairColor; }
    public void setHairType(String hairType) { this.hairType = hairType; }
    public String getHairColor() { return hairColor; }
    public String getHairType() { return hairType; }
    public String toString() { return "Head:: Hair color: " + hairColor + ", hair type: " + hairType; }
}

class Hand
{
    private String skinColor;
    private int fingersAmount;

    Hand(String skinColor, int fingersAmount)
    {
        this.skinColor = skinColor;
        this.fingersAmount = fingersAmount;
    }

    public void setSkinColor(String skinColor) { this.skinColor = skinColor; }
    public void setFingersAmount(int fingersAmount) { this.fingersAmount = fingersAmount; }
    public String getSkinColor() { return skinColor; }
    public int getFingersAmount() { return fingersAmount; }
    public String toString() { return "Hand:: Skin color: " + skinColor + ", fingers amount: " + fingersAmount; }
}

class Leg
{
    private String footSize;
    private String skinColor;

    Leg(String footSize, String skinColor)
    {
        this.footSize = footSize;
        this.skinColor = skinColor;
    }

    public void setSkinColor(String skinColor) { this.skinColor = skinColor; }
    public void setFootSize(String footSize) { this.footSize = footSize; }
    public String getSkinColor() { return skinColor; }
    public String getFootSize() { return footSize; }
    public String toString() { return "Leg:: Skin color: " + skinColor + ", foot size: " + footSize; }
}