public class StringArrayProcessor {
    private String[][] array2D;
    private String[] array1D;
    private int rows, cols;

    // Constructor
    public StringArrayProcessor(String[][] array) {
        this.array2D = array;
        this.rows = array.length;
        this.cols = array[0].length;
    }

    // Print before conversion
    public void print2DBefore() {
        System.out.println("Before (2D Array):");
        for (String[] row : array2D) {
            for (String val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Convert 2D to 1D
    public void convertTo1D() {
        array1D = new String[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1D[k++] = array2D[i][j];
            }
        }
    }

    // Quick Sort
    public void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        String pivot = array1D[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array1D[j].compareTo(pivot) <= 0) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        String temp = array1D[i];
        array1D[i] = array1D[j];
        array1D[j] = temp;
    }

    // Convert back to 2D
    public void convertTo2D() {
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = array1D[k++];
            }
        }
    }

    // Print after sorting
    public void print2DAfter() {
        System.out.println("\nAfter Sorting (2D Array):");
        for (String[] row : array2D) {
            for (String val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
