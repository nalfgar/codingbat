package codewars.buildingBlocks;

public class BuildingBlocks {
    private int width;
    private int length;
    private int height;

    public BuildingBlocks(int[] dimensions) {
        width = dimensions[0];
        length = dimensions[1];
        height = dimensions[2];
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

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return ((width * length) + (width * height) + (length * height)) * 2;
    }
}
