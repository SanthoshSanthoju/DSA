public class firstOccurance {
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,10,10,40};
        int target =10;
        int ans = firstOcc(arr,target);
        System.out.println(ans);
    }
    public static int firstOcc(int[]arr,int target){
        int res=-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
               res = mid;
               start = mid+1;
            }
            else if(target<arr[mid]){
               end = mid-1;
            }
            else{
                start = mid+1;
            }
              
        }
        return res;
    }
}
