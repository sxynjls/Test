
import java.util.Arrays;

/**
 * Created by sunxuyang on 16/10/20.
 */
public class Hello {
    public void quickSort(int left,int right,int[] numbers){
        if(left < right){
            int mid = partition(numbers,left,right);
            quickSort(left,mid-1,numbers);
            quickSort(mid+1,right,numbers);
        }
    }

    public int partition(int[] numbers,int left,int right){
        int key = numbers[left];
        while(left < right){
            while(left < right && numbers[right] >= key){
                right --;
            }
            numbers[left] = numbers[right];
            while(left < right && numbers[left] < key){
                left ++;
            }
            numbers[right] = numbers[left];
        }
        numbers[left] = key;
        return left;
    }

    public int[] mergeSortedArray(int[] A, int[] B) {
        int length1 = A.length;
        int length2 = B.length;
        int length = length1 + length2;
        int[] res = new int[length];
        int index1 = 0;
        int index2 = 0;
        int tag = 0;
        while(index1 < length1 && index2 < length2){
            if(A[index1] < B[index2]){
                res[tag] = A[index1];
                index1 ++;
            }
            else{
                res[tag] = B[index2];
                index2 ++;
            }
            tag ++;
        }
        if(index1 == length1){
            while(index2 < length2){
                res[tag++] = B[index2++];
            }
        }
        else{
            while(index1 < length1){
                res[tag++] = A[index1++];
            }
        }
        return res;

    }

    public static void main(String[] args) {

        Hello hello = new Hello();
        int[] A = {7};
        int[] B = {5,7};
        System.out.println(Arrays.toString(hello.mergeSortedArray(A,B)));
    }
}
