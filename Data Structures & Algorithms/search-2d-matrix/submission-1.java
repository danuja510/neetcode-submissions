class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length * matrix[0].length - 1;
        int selection = 0;
        while (i >= 0 && j < matrix.length * matrix[0].length && i <= j) {
            selection = (i + j) / 2;
            int k = selection / matrix[0].length;
            int l = selection % matrix[0].length;
            if (matrix[k][l] == target)
                return true;
            if (i == j) {
                return false;
            }
            if (matrix[k][l] < target)
                i = selection + 1;
            else
                j = selection - 1;
        }
        return false;
    }
}
