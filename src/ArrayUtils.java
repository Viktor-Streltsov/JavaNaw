import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    private int[] arrItem = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    private int[] arrAll = {3, 8, 12, 15, 1, 19, 6, 14, 10, 17};

    public int[] getArrItem() {
        return arrItem;
    }

    public void setArrItem(int[] arrItem) {
        this.arrItem = arrItem;
    }

    public int[] getArrAll() {
        return arrAll;
    }

    public void setArrAll(int[] arrAll) {
        this.arrAll = arrAll;
    }

    public void maxItem(int[] arr) {
        int maxNum = 0;

        for(int item : arr) {
            if(item > maxNum) {
                maxNum = item;
            }
        }

        System.out.println("Максимальное число: " + maxNum);
    }

    public void minItem(int[] arr) {
        int minNum = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(minNum > arr[i]) {
                minNum = arr[i];
            }
        }

        System.out.println("Минимальное число: " + minNum);
    }

    public void reversArr(int[] arr) {
        int[] reversNewArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reversNewArr[i] = arr[arr.length - 1 - i];
        }

        for(int item : reversNewArr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void faindEelm(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        boolean faindItem = false;

        System.out.print("Введи искомый елемент: ");
        int elem = scanner.nextInt();


        for(int item : arr) {
            if(item == elem) faindItem = true;
        }

        System.out.println(faindItem);
    }

    public void sortArr(int[] arr) {
//        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public int recursiveSum(int[] arr,int length) {

        if(length == 0 ) {
            return 0;
        }

        return arr[length - 1] + recursiveSum(arr,length - 1);
    }

    public int[] concatArr(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result,0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        System.out.println(Arrays.toString(result));

        return result;
    }

}
