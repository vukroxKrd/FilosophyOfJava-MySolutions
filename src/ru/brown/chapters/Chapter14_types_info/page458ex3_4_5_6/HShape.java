package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/****************** Exercise 6 ******************
 * Modify Shapes.java so that it can "highlight"
 * (set a flag) in all shapes of a particular
 * type. The toString() method for each derived
 * Shape should indicate whether that Shape is
 * "highlighted."
 ***********************************************/

public class HShape {
    boolean highlighted = false;

    public void highlight() {
        highlighted = true;
    }

    public void clearHighlight() {
        highlighted = false;
    }

    void draw() {
        System.out.println(this + " draw()");
    }

    public String toString() {
        return getClass().getName() +
                (highlighted ? " highlighted" : " normal");
    }

    static List<HShape> shapes = new ArrayList<HShape>();

    HShape() {
        shapes.add(this);
    }

    // Basic approach (code duplication)
    static void highlight1(Class<?> type) {
        for (HShape shape : shapes)
            if (type.isInstance(shape))
                shape.highlight();
    }

    static void clearHighlight1(Class<?> type) {
        for (HShape shape : shapes)
            if (type.isInstance(shape))
                shape.clearHighlight();
    }

    // Create an applicator and reuse it. All exceptions
    // indicate programmer error, and are thus
    // RuntimeExceptions:
    static void forEach(Class<?> type, String method) {
        try {
            Method m = HShape.class.getMethod(method, (Class<?>[]) null);

            for (HShape shape : shapes)
                if (type.isInstance(shape))
                    m.invoke(shape, (Object[]) null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void highlight2(Class<?> type) {
        forEach(type, "highlight");
    }

    static void clearHighlight2(Class<?> type) {
        forEach(type, "clearHighlight");
    }
}

class HCircle extends HShape {
}

class HSquare extends HShape {
}

class HTriangle extends HShape {
}

