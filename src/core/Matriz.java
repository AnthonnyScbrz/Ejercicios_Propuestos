package core;

public class Matriz {
    private final int[][] data;
    private final int rows;
    private final int cols;

    public Matriz(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public int[][] getData() {
        return data;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
    public int getValue(int row, int col){
        return data[rows][cols];
    }
}
