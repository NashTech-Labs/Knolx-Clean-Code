package classes;

/**
 * It does not follow the Open Close Principle
 * since the GraphicEditor class has to be modified for every new shape class that has to be added
 */

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
    }

    public void drawCircle(Shape r) {
    }

    public void drawRectangle(Shape r) {
    }
}


/**
 * we use abstract draw() method in GraphicEditor for drawing objects,
 * while moving the implementation in the concrete shape objects
 */


abstract class ShapeUpdated {
    abstract void draw();
}


class RectangleUpdated extends ShapeUpdated {
    public void draw() {
        // draw the rectangle
    }
}

class GraphicEditorUpdated {
    public void drawShape(ShapeUpdated s) {
        s.draw();
    }
}
