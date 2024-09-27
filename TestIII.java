public class TestIII {

    public static void printTriangle(int count) {
        for (int index = 1; index <= count; index++) {
            for (int i = index; i > 0; i-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void maxNumInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Die maximale Nummer ist: "+max);
    }
}
