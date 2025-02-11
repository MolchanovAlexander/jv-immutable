package core.basesyntax;

import java.util.Objects;

public class Wheel implements Cloneable {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    //implement this class

    @Override
    public String toString() {
        return "Wheel{"
                + "radius=" + radius
                + '}';
    }

    @Override
    public Wheel clone() {
        try {
            Wheel clonedWheel = (Wheel) super.clone();
            return clonedWheel;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone from Engine", e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Wheel wheel = (Wheel) o;
        return Objects.equals(radius, wheel.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
