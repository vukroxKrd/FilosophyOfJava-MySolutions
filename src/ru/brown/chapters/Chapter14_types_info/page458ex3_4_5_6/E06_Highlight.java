package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E06_Highlight {
    public static void main(String[] args) {
        List<HShape> shapes = Arrays.asList(
                new HCircle(), new HSquare(),
                new HTriangle(), new HSquare(),
                new HTriangle(), new HCircle(),
                new HCircle(), new HSquare());

        HShape.highlight1(HCircle.class);
        HShape.highlight2(HCircle.class);
        for (HShape shape : shapes)
            shape.draw();
        System.out.println("*******");

        // Highlight them all:
        HShape.highlight1(HShape.class);
        HShape.highlight2(HShape.class);
        for (HShape shape : shapes)
            shape.draw();

        System.out.println("*******");
        // Not in the hierarchy:
        HShape.clearHighlight1(ArrayList.class);
        HShape.clearHighlight2(ArrayList.class);
        for (HShape shape : shapes)
            shape.draw();
    }
}
