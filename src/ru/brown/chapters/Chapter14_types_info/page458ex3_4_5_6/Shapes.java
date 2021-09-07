package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Don't rotate circles");
        } else {
            shape.rotate();
        }
    }
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        //Заполняем массив фигурами:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        //Полиморфные вызовы методов:
        for (Shape shp : s) {
            shp.draw();
            shp.color();
            rotate(shp);
        }
    }
}

