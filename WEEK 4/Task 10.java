import java.util.*;

public class Solution {

    static void matrixRotation(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elems = new ArrayList<>();

            int top = layer, left = layer;
            int bottom = m - 1 - layer, right = n - 1 - layer;

            for (int j = left; j <= right; j++) elems.add(matrix[top][j]);
          
            for (int i = top + 1; i < bottom; i++) elems.add(matrix[i][right]);
        
            for (int j = right; j >= left; j--) elems.add(matrix[bottom][j]);
        
            for (int i = bottom - 1; i > top; i--) elems.add(matrix[i][left]);

            int len = elems.size();
            int rot = r % len;

            Collections.rotate(elems, -rot); 

            int idx = 0;

          
            for (int j = left; j <= right; j++) matrix[top][j] = elems.get(idx++);
            for (int i = top + 1; i < bottom; i++) matrix[i][right] = elems.get(idx++);
            for (int j = right; j >= left; j--) matrix[bottom][j] = elems.get(idx++);
            for (int i = bottom - 1; i > top; i--) matrix[i][left] = elems.get(idx++);
        }

  
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(row[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        matrixRotation(matrix, r);
    }
}