

Ques Name - Counting Bits

In this we have a given a number like we have to chekc the how manny 1 contains after binary till the n 

example we have 

5 - 0 1 2 3 4 5 

Number     Binary          count 1  
0            0                0
1            1                1
2            10               1
3            11               2
4            100              1 
5            101              2 


// return arr = {0,1,1,2,1,2}  // 1s frequency counter 




  // Code 


  

 class Solution {

    public int[] countBits(int n) {

        int [] arr= new int[n+1];

        for(int i=0; i<=n; i++){
            arr[i] = intToBinary(i);    // put in array 
        }
       
        return arr;              // return arr

    }
    public int intToBinary(int number){      // convert it every elemnt of n to binary
            int count  =0;

            if(number==0){
                count+=0;
            }
            
            
            while(number>0){
             count+= number%2;        // count remainder 1
                
                number=number/2;
            }
            
            return count;      // return for every number till n
    }
} 



I hope this will help you Please Give Support - 
  
Github Repo link - https://github.com/PranavSharma1008/LeetcodeSerieGithub

Youtbe Channel Link - https://www.youtube.com/@CoderPranav1008

Leetcode Link - https://leetcode.com/u/SharmaPranav1008/

linkedin Link - https://www.linkedin.com/in/pranav-sharma-205a7a396/

  
  
