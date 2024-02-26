package main.hw8;

public class Cube {
    int side = 0;

    public Cube() {
    }

    public void setSide(int side) {
        this.side = side;
    }
    public int getSide() {
        return this.side;
    }

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.setSide(4);
        System.out.println(cube.getSide());
    }
}
