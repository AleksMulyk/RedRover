package main.hw.hw8;

public class Block {
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surfaceArea;

    public Block(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
        this.volume = this.width * this.length * this.height;
        this.surfaceArea = 2 * ((this.height * this.width) + (this.height * this.length)
                + (this.width * this.length));
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getSurfaceArea() {
        return this.surfaceArea;
    }

    public static void main(String[] args) {
        Block block1 = new Block(new int[] {4, 3, 5});
        System.out.println(block1.getSurfaceArea());
    }
}
