import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        arrayUtils.maxItem(arrayUtils.getArrItem());
        arrayUtils.minItem(arrayUtils.getArrItem());
        arrayUtils.reversArr(arrayUtils.getArrItem());

        //      TODO  Метод для проверки, содержит ли массив определённый элемент

        arrayUtils.faindEelm(arrayUtils.getArrItem());

        //      TODO  Метод для сортировки массива по возрастанию

        arrayUtils.sortArr(arrayUtils.getArrAll());

        //      TODO  Мекурсивный метод для вычисления суммы элементов массива

        System.out.println(arrayUtils.recursiveSum(arrayUtils.getArrAll(), arrayUtils.getArrAll().length));

        //      TODO  Метод для слияния двух отсортированных массивов в один отсортированный массив

        arrayUtils.concatArr(arrayUtils.getArrItem(), arrayUtils.getArrAll());

    }
}