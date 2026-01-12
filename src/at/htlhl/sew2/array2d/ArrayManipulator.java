package at.htlhl.sew2.array2d;

public class ArrayManipulator {
    /*
    TODO 1: Return a new 2D array with first and last elements swapped in each row.
     The given array must not be modified.

    Example input:  [[4, 2, 3, 1], [3, 2, 1], [5, 2, 3, 4, 1]]
    Example output: [[1, 2, 3, 4], [1, 2, 3], [1, 2, 3, 4, 5]]

    Preconditions:
    numbers != null
    numbers.length > 0
    for each valid i:
      numbers[i] != null
      numbers[i].length > 0
     */
    public static int[][] swapFirstAndLastElementOfEachRowNonMutating(int[][] numbers) {
        int[][] mutated = new int[numbers.length][];
        for (int i = 0; i < numbers.length; i++) {
            mutated[i] = numbers[i].clone();
        }
        swapFirstAndLastElementOfEachRowInPlace(mutated);
        return mutated;
    }

    /*
    TODO 2: Swap the first and last element of each row directly in the given 2D array.

    Example input:  [[4, 2, 3, 1], [3, 2, 1], [5, 2, 3, 4, 1]]
    Example output: [[1, 2, 3, 4], [1, 2, 3], [1, 2, 3, 4, 5]]

    Preconditions:
    numbers != null
    numbers.length > 0
    for each valid i:
      numbers[i] != null
      numbers[i].length > 0
     */
    public static void swapFirstAndLastElementOfEachRowInPlace(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            int firstNumber = numbers[row][0];
            numbers[row][0] = numbers[row][numbers[row].length -1];
            numbers[row][numbers[row].length -1] = firstNumber;
        }
    }

    /*
    TODO 3: Return a new 2D array which is mirrored along the vertical axis.
       The given array must not be modified.

    Example input:  [[3, 2, 1], [6, 5, 4], [9, 8, 7]]
    Example output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    Preconditions:
    imageArray is symmetrical
    imageArray != null
    imageArray.length > 0
    for each valid i:
      imageArray[i] != null
      imageArray[i].length > 0
     */
    public static int[][] mirrorNonMutating(int[][] imageArray) {
        int[][] image = new int[imageArray.length][];
        for (int i = 0; i < imageArray.length; i++) {
            image[i] = imageArray[i].clone();
        }
        mirrorInPlace(image);
        return image;
    }

    /*
    TODO 4: Mirror the given 2D array directly along the vertical axis.

    Example input:  [[3, 2, 1], [6, 5, 4], [9, 8, 7]]
    Example output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    Preconditions:
    imageArray is symmetrical
    imageArray != null
    imageArray.length > 0
    for each valid i:
      imageArray[i] != null
      imageArray[i].length > 0
     */
    public static void mirrorInPlace(int[][] imageArray) {
        int[][] copy = new int[imageArray.length][];
        for (int i = 0; i < imageArray.length; i++) {
            copy[i] = imageArray[i].clone();
        }

        for(int row = 0; row < imageArray.length; row++) {
            for(int col = 0; col < imageArray[row].length; col++) {
                imageArray[row][col] = copy[row][imageArray[row].length - 1 - col];
            }
        }

    }
}
