

Ques name - First Unique Character in a String


Input: s = "leetcode"

Output: 0        // l is unique return index

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"      // start from 0th index l duplicate , o also , v is unique return the index 

Output: 2

Example 3:

Input: s = "aabb"      // no unique return -1

Output: -1





// Code



class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < s.length(); i++){    // new trick learn 
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
    }
}

// so in this code we count the freq which u learn below the vedio link then in second loop we 
// move the pointer through the string and iterates toward end if the char present at the map which freq is one 
// return that particular index



Learn this hashmap freq counter follow the vedio link below

Youtube vedio Link - https://youtu.be/DLtG_MO4Ebs

// this vedio help to learn the concept of hashMap







If this will help you Please give the support 


Github Repo link - https://github.com/PranavSharma1008/LeetcodeSerieGithub

Youtbe Channel Link - https://www.youtube.com/@CoderPranav1008

Leetcode Link - https://leetcode.com/u/SharmaPranav1008/

linkedin Link - https://www.linkedin.com/in/pranav-sharma-205a7a396/
