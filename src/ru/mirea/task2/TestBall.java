package ru.mirea.task2;
import java.lang.*;
public class TestBall {
    public static void main(String[] args)
    {
        Ball ball1 = new Ball("red", "paper", 150, 3);
        Ball ball2 = new Ball("red", 150);
        Ball ball3 = new Ball();
        ball1.setRadius(9);
        System.out.println(ball1);
        ball1.getBallVolume();
        ball2.getBallVolume();
        ball3.getBallVolume();
    }
}
