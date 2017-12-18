package codewars.buildingBlocks;

public class BuildingBlocks {
    private int width;
    private int length;
    private int height;

    public BuildingBlocks(int[] dimensions) {
        if (dimensions.length != 3) {
            throw new IllegalArgumentException("The table must have three dimensions");
        } else if (dimensions[0] <= 0 || dimensions[1] <= 0 || dimensions[2] <= 0){
            throw new IllegalArgumentException("Dimensions have to be more than 0");
        }
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