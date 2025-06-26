public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid; 
            } else{
                // your are in asc part of array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointin to the largest number because of the 2 checks above
        // start and ens are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one coz that is what the check says
        // more elaboration: at every point of time ofr start and end, they have the best possible ans till that time 
        // and if we are saying that only one item is remaining, hence coz of the above line is the best possible ans
        return start;  // or return end as both are =
    } 
}
