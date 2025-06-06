package Shapes;

import java.awt.*;

public abstract class Shape {
    int x1, y1, x2, y2;
    Color color;

    protected Shape(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public void updateEnd(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public abstract void draw(Graphics g);
}
