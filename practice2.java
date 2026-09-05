public class practice2 {
    public static void main(String[] args) {
        int A[] = {3, 5, 34, 53, 2, 7, 8, 58};

        // Print original array
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 1. Save the last element
        int temp = A[A.length - 1];

        // 2. Shift elements to the right (loop backwards)
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }

        // 3. Move the saved element to the front
        A[0] = temp;

        // Print rotated array
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}