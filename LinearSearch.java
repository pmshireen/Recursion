package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
       int[] arr = {4,99,1,2,2,55,8};
//        System.out.println(find(arr,0,0));
//        System.out.println(findIndex(arr,55,0));
//        System.out.println(findIndexLast(arr,1,arr.length-1));
//
//        findAllIndex(arr,2,0);
//        System.out.println(list);

        ArrayList<Integer>  ans = findAllIndexArray(arr,2,0,new ArrayList<>());
        System.out.println(ans);

    }

    static boolean find(int []arr,int target,int index){
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int findIndex(int []arr,int target,int index){
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }
    static int findIndexLast(int []arr,int target,int index){
        if(index == -1) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }

   static  ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int []arr,int target,int index){
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target){
           list.add(index);
        }

        findAllIndex(arr, target, index + 1);

    }
 //Returning the Arraylist
 static ArrayList<Integer> findAllIndexArray(int []arr,int target,int index, ArrayList<Integer> list){
     if(index == arr.length) {
         return list;
     }
     if(arr[index] == target){
         list.add(index);
     }

     return findAllIndexArray(arr, target, index + 1,list);

 }



}
