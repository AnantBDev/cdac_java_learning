package Git_Java.cdac_java_learning.Java_OOPS.Logical;

public class linear_search {
    private int arr;
    private int num;
    private int len;
    public static int Linear(int[] arr, int num){
        int len = arr.length;
        if (len<1){
            return -1;
        }
        if (len>1){
            for (int i=1; i<=len; i++){
                if(num == arr[i]){
                    return i;
                }
            }
        }
        else{
            return -1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(Linear(nums, 9));
    }
}
