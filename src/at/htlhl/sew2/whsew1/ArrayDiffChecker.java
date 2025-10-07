package at.htlhl.sew2.whsew1;

public class ArrayDiffChecker {
    static void main(String[] args) {
        int[] arr1 = {5, -4, 8, -2, 7, 3};
        System.out.println("sameSign()-bothPos: " + sameSign(arr1));
        System.out.println("diffSign()-bothPos: " + diffSign(arr1));

        int[] arr2 = {-5, 4, -8, 2, 7, -3};
        System.out.println("sameSign()-bothNeg: " + sameSign(arr2));
        System.out.println("diffSign()-bothNeg: " + diffSign(arr2));

        int[] arr3 = {-5, 4, -8, 2, -7, 3};
        System.out.println("sameSign()-1stNegLstPos: " + sameSign(arr3));
        System.out.println("diffSign()-1stNegLstPos: " + diffSign(arr3));

        int[] arr4 = {5, -4, -8, -2, 7, -3};
        System.out.println("sameSign-1stPosLstNeg: " + sameSign(arr4));
        System.out.println("diffSign-1stPosLstNeg: " + diffSign(arr4));
    }

    public static boolean sameSign(int[] arr) {
        return (arr[0] <= 0 && arr[arr.length - 1] <= 0) || (arr[0] >= 0 && arr[arr.length - 1] >= 0);
    }

    public static boolean diffSign(int[] arr) {
        return (arr[0] <= 0 && arr[arr.length - 1] >= 0) || (arr[0] >= 0 && arr[arr.length - 1] <= 0);
    }
}
