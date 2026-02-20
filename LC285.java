
// Ques Name - Max Consecutive One 

//  So basically in this question, we have to return the maximum consecutive 1s,
// So in this, we have to return the maximum number of continuous 1s in the array. 

// for example [ 1 , 1 , 0 , 1 , 1 , 1]
// Answer - 3 

// For the starting two indices, we have 1 1. For the last three indices, we have also 1 1 1. So we have to return the last three because  more continuous of the one is in the last. 


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        int maxx= Integer.MIN_VALUE;
        boolean [] arr = new boolean[n];

        for(int i=0; i<n; i++){
                if(nums[i]==0){
                    arr[i] = false;
                }
                else{
                    arr[i] = true;
                }
        }
        
        for(int i=0; i<n; i++){

            if(arr[i]==true){
                count++;
            }
            else{
                maxx = Math.max(count,maxx);
                count=0;
            }
        }

        maxx = Math.max(count,maxx);     // if the last element is 1 so the else condition dont run which is whenever the arr[i] comes false;
        return maxx;
    }
}



 // maxx = Math.max(count,maxx);     

// like [1,1,0,1,1,1] so the last first two index store max == 2 , max work when it false , if the las index 1 so it not run that codt so why we use this .

// i Hope u Like this Please Subsribe the channel -  https://www.youtube.com/@CoderPranav1008
