public class Main {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        arrayUtils.maxItem(arrayUtils.getArrItem());
        arrayUtils.minItem(arrayUtils.getArrItem());
        arrayUtils.reversArr(arrayUtils.getArrItem());
//        arrayUtils.faindEelm(arrayUtils.getArrItem());
        arrayUtils.sortArr(arrayUtils.getArrAll());
        System.out.println(arrayUtils.recursiveSum(arrayUtils.getArrAll(), arrayUtils.getArrAll().length));

    }
}