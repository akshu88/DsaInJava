package DsaInJava;

public class linear {
    public static void main(String[] args) {
        int[] nums ={23, 45, 1, 3, 56, -2, -9, 19, 20, 30};
        int target = 40;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

     //search the target and return true or false  
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        // run a for loop
        for(int element : arr){
            if(element == target){
                return true;
            }
        }

        // this line will execute if non of the return statements above have executed
        // hence the target not found
        return false;
    }

    //search the target and return the element 
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        // this line will execute if nonr of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }


    // search in the array: return the index if item found 
    // otherwise if item not found return -1
    
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = 0; index < arr.length; index++){
            // checks for the element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this line will execute if nonr of the return statements above have executed
        // hence the target not found
        return -1;

    }

   
}
