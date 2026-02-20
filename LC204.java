

Ques Name - Count Primes 


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Helping Guide;

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// 1st approach



// 24 number
// factor of 24 is = 2 3 4 6 8 12 
// so till last from 2 to n-1 bcq 1 and that n is exist so we have to skip it

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// 2nd appraoch


// 24 number
// factor of 24 is = 2 3 4 6 8 12 
// so you see we have to not move through the last we have to check till n/2;

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// 3rd approach


// 24 number
// factor of 24 is = 2 3 4 6 8 12 
// sqrt(n) = i*i<=n


// see in this if we cal sqrtof24 it would beapprxx 4 
// 2*3= 6 which is presnt after 4
// 2*4 = which same

// so the point is we have to move till the sqrt if anyone divisble it not a prime



-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



//                                               MAIN APPROACH 

  


//    4th approach


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  
// in this we mark at 0th and 1th index false and. rather all true
// then iterate over the loop all the number divisiible by the that number make it false;
// count // travesrse loop if this false count ittt



-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  
// CODE 


  
// class Solution {
//     public int countPrimes(int n) {
//         if(n<=1) return 0;

//       boolean [] arr = new boolean[n];
        
        
//         for(int i=2; i<n; i++){
//             arr[i] = true;
//         }

//         for(int i=2; i*i<n; i++){
//             if(arr[i]){
//                 for(int j = i*i; j<n; j+=i){
//                     arr[j] = false;
//                 }
//             }
//         }
//         int count= 0;

//         for(int i=0; i<n; i++){
//             if(arr[i] == true){
//                 count++;
//             }
//         }
//         return count;
//     }
// }


// optimal approach // approach name is Sieve of Eratosthenes.
