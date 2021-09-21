package ru.mirea.task7;
import java.lang.*;
public interface  Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp()
    {
        this.y += 1 * this.ySpeed;
    }

    public void moveDown()
    {
        this.y -= 1 * this.ySpeed;
    }

    public void moveLeft()
    {
        this.x -= 1 * this.xSpeed;
    }

    public void moveRight()
    {
        this.x += 1 * this.xSpeed;
    }

    public String toString()
    {
        return "Точка:: координата x: " + x + ", координата y: " + y + ", скорость по оси X: " + xSpeed + ", скорость по оси Y: " + ySpeed;
    }
}

class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
       center = new MovablePoint(x,y,xSpeed,ySpeed);
       this.radius = radius;
    }

    public void moveUp()
    {
        this.center.y += 1 * this.center.ySpeed;
    }

    public void moveDown()
    {
        this.center.y -= 1 * this.center.ySpeed;
    }

    public void moveLeft()
    {
        this.center.x -= 1 * this.center.xSpeed;
    }

    public void moveRight()
    {
        this.center.x += 1 * this.center.xSpeed;
    }

    public String toString()
    {
        return "Окружность:: радиус: " + radius + ", координата x центра: " + center.x + ", координата y центра: " + center.y;
    }
}