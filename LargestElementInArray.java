package Recursion;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 6};
        //int ans = MaxElement(arr);
        //System.out.println(ans);

       // int ans1 = secondLargestElement(arr);
        //System.out.println(ans1);


        int ans2 = secondSmallestElement(arr);
        System.out.println(ans2);


    }

    static int MaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondLargestElement(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[size - 2];
    }
    static int secondSmallestElement(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j])     //sort in ascending order
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       // return arr[0];  //1
        return arr[size - 3]; // second smallest
    }
}


