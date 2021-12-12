package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator{
    public Shape shape;
    public RedShapeDecorator(Shape shape){
        super(shape);
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
        setRedBorder();
    }
    private void setRedBorder(){
        System.out.println("Обвели границу красным цветом");
    }
}
