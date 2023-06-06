package Part4.MonitorAndTriangle.Monitors;

public class Monitor implements Comparable<Monitor> {

    private float diagonal;
    private int pixel;

    private final String name, info;


    Monitor(float diagonal, int pixel, String name, String info) {
        setDiagonal(diagonal);
        setPixel(pixel);
        this.name = name;
        this.info = info;
    }

    public void setDiagonal(float diagonal) {
        if (diagonal > 0 && diagonal < 120) {
            this.diagonal = diagonal;
        } else {
            throw new IllegalArgumentException("No monitor exists at the specified size: set in 0 - 120 range");
        }
    }

    public void setPixel(int pixel) {
        if (pixel > Math.pow(diagonal, 2) && pixel < Math.pow(diagonal, 3)) {
            this.pixel = pixel;
        } else {
            throw new IllegalArgumentException("No monitor exists at the specified pixel");
        }
    }

    public String getInfo() {
        return info;
    }

    @Override
    public int compareTo(Monitor o) {
        return pixel - o.pixel;
    }

    @Override
    public String toString() {
        return name;
    }
}
