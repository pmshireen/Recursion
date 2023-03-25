package Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int []arr = {2,3,54,8};
        boolean ans = Sorted(arr,0);
        System.out.println(ans);
    }
    static boolean Sorted(int []arr,int index){
        //base condition
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && Sorted(arr,index + 1);

    }
}
