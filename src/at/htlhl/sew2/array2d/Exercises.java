// [ [1, 2, 3], [4, 5, 6], [7, 8, 9] ]
// [ [1, 5, 9], [3, 5, 7] ]

int[][] determineDiagonalNumbers(int[][] numbers) {
    int n = numbers.length;
    int[][] output = new int[2][n];

    for (int i = 0; i < n; i++) {
        output[0][i] = numbers[i][i];
        output[1][i] = numbers[i][n - 1 - i];
    }
    return output;
}

void main() {
    int[][] numbers = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] results = determineDiagonalNumbers(numbers);
    IO.println(Arrays.deepToString(results));
}
