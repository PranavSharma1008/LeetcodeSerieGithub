

// Ques Name - ReverseString


// given a array of chars we have to reverse it 


// Code


class Solution {
    public void reverseString(char[] s) {
       
       int i = 0;
       int j = s.length-1;

       while(i<j){       
        
        char temp = s[i];
        s[i] = s[j];    // swap
        s[j]= temp;
        i++;
        j--;
       }
    }
}




example 


'h' 'e' 'l' 'l' 'o'  -> 'o' 'l' 'l' 'e' 'h'


lets start

'h' 'e' 'l' 'l' 'o'
  i at = h 
  j at o

  {
  j>i true
  temp = h;    // swap concept 
h=o;
o=h
  }

make temp to store the value of char and then repalce the h to o 
then in the o place put h which is we store in the temp


  // 


  
If this will help you Please give the support 

Github Repo link - https://github.com/PranavSharma1008/LeetcodeSerieGithub

Youtbe Channel Link - https://www.youtube.com/@CoderPranav1008

Leetcode Link - https://leetcode.com/u/SharmaPranav1008/

linkedin Link - https://www.linkedin.com/in/pranav-sharma-205a7a396/

  
  
