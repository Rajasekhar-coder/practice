// finding an occurence of an integer
import java.util.*;
public class practice{
    public int[] resizearry(int[] arr,int capacity){
        int[] result = new int[capacity];
        for(int i=0;i<arr.length;i++){
            result[i] =arr[i];
        }
        return result;

    }
    public void revesearray(int[] arr){
        int n = arr.length;
        int start =0;
        int end= n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
    public int[] removeele(int[] arr,int val){
        int n = arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=val){
                count++;
            }
        }
        int[] result = new int[count];
        int idx =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                result[idx] =arr[i];
                idx++;
            }
        }
        return result;
    }
    
    
    public static void main(String[] args) {
    practice obj = new practice();

    int[] arr = {4,5,2,4,8,7};
    System.out.println(Arrays.toString(arr));
    //System.out.println("The of the original array:"+arr.length);
    //int[]  result = obj.resizearry(arr, 6);
    //obj.revesearray(arr);
    //cSystem.out.println(Arrays.toString(arr));
    int[] result = obj.removeele(arr, 5);
    System.out.println(Arrays.toString(result));

    
}
}