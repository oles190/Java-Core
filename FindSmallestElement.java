public class FindSmallestElement {



    public static int findSmallestElement(int[] arr) {


        int minValue = arr[0];

        for (int i = 1; i < arr.length;i++){
            if (arr[i] < minValue){

                minValue =arr[i];
            }
        }
        return minValue;
    }

}
