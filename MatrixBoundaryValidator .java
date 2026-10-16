 class MatrixBoundaryValidator {
    public static void main(String[] args) {
        int targetRow = 3;
        int targetCol = 4;
        int maxRows = 5;
        int maxCols = 5;
        
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        if (targetRow >= 0 && targetRow < maxRows && targetCol >= 0 && targetCol < maxCols) {
            if (targetRow == 0 || targetRow == maxRows - 1 || targetCol == 0 || targetCol == maxCols - 1) {
                System.out.println("Element " + matrix[targetRow][targetCol] + " is located on the matrix boundary.");
            } else {
                System.out.println("Element " + matrix[targetRow][targetCol] + " is located inside the matrix core.");
            }
        } else {
            System.out.println("Error: Target coordinates are out of bounds.");
        }
    }
}
