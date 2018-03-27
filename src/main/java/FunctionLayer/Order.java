
package FunctionLayer;


public class Order {
    private int width;
    private int length;
    private int height;

    public  Order(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Order{" + "2x4=" + width + ", 2x2=" + length + ", 2x1=" + height + '}';
    }

   
    
}
