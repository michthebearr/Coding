3110. Score of a String

class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            total += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return total;
    }
}

#############################################################

2942. Find Words Containing Character

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }
}

#############################################################

1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedLetters = new HashSet<>();

        for (char letter : allowed.toCharArray()) {
            allowedLetters.add(letter);
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!allowedLetters.contains(word.charAt(i))) {
                    break;
                } 
                if (i == word.length() - 1) {
                    count++;
                }
            }
        }
        return count;

    }
}

#############################################################

1816. Truncate Sentence

class Solution {
    public String truncateSentence(String s, int k) {
        String[] splitString = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k - 1; i++) {
            sb.append(splitString[i] + " ");
        }
        sb.append(splitString[k-1]);
        return sb.toString();
    }
}

#############################################################

2185. Counting Words With a Given Prefix

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}

#############################################################

709. To Lower Case

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}

#############################################################

2108. Find First Palindromic String in the Array

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word).reverse();
            if (word.equals(sb.toString())){
                return word;
            }
        }
        return "";
    }
}

#############################################################

1832. Check if the Sentence Is Pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] result = new boolean[26];

        for (char letter : sentence.toCharArray()) {
            result[letter - 'a'] = true;
        }

        for (boolean existLetter : result) {
            if (!existLetter)  return false;
        }
        return true;
    }
}

#############################################################

557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        String[] splitWords = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : splitWords) {
            result.append(new StringBuilder(word).reverse() + " ");
        }
        return result.toString().trim();        
    }
}

#############################################################

1768. Merge Strings Alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            result.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            result.append(word2.charAt(j++));
        }
        return result.toString();
    }
}

#############################################################


344. Reverse String

class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

#############################################################

242. Valid Anagram

// Method1: 
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] seen = new int[26];
        for (int i = 0; i < s.length(); i++) {
            seen[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            seen[t.charAt(i) - 'a']--;
        }

        for (int i : seen) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

// Method2:
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // check if any character has non-zero frequency 
        for (int i : count.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

#############################################################

383. Ransom Note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false;
            } else {
                freq[c - 'a']--;
            }
        }
        return true;
    }
}



#############################################################

387. First Unique Character in a String

// Method 2
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (char letter : s.toCharArray()) {
            freq[letter - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

// Method 2
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

#############################################################

389. Find the Difference

// Method 1
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (char cs : s.toCharArray()) result ^= cs;
        for (char ct : t.toCharArray()) result ^= ct;
        return result;
    }
}

// Method 2
class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return c;
        }
        return ' '; // Should never reach here
    }
}
// Time: O(n)
// Space: O(1)

#############################################################


345. Reverse Vowels of a String

class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // move left pointer to a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // move left pointer to a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            //swap
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }
}
#############################################################

58. Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        // skip trailing spaces 
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }

        // count the length of last word
        int count = 0;
        while (right >=0 && s.charAt(right) != ' ') {
            count++;
            right--;
        }
        return count;
    }
}

#############################################################

520. Detect Capital

class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || word.substring(1).equals(word.substring(1).toLowerCase());
    }
}

#############################################################

415. Add Strings

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        // Loop through both strings from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            
            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);  // get the last digit
            carry = sum / 10;         // update the carry
            
            i--;
            j--;
        }
        // Reverse the result since digits were added from least to most significant 
        return result.reverse().toString();
    }
}
#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################



14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Go through each character in the first string and compare with the other strings using first string's index
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Compare this character with other strings using i
            for (int j = 1; j < strs.length; j++) {
                // If we reach the end of one string or the characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i); // Return common prefix found so far
                }
            }
        }
        return strs[0]; // All characters in the first string are matched in all other 
        
    }
}

public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }


#############################################################

20. Valid Parentheses


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false; 
                char top = stack.peek();
                if ((top == '(' && ch == ')') || (top == '[' && ch == ']') || (top == '{' && ch == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false; 
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']') || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


#############################################################

28. Find the Index of the First Occurrence in a String


    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
         // Loop through possible starting indices
        for (int i = 0; i <= m - n; i++) {
            // Check if substring matches needle
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
        
    }

    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
         // Loop through possible starting indices
        for (int i = 0; i <= m - n; i++) {
            // Check if substring matches needle
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
        
    }

Runtime = O(size of needle * size of heakstack)

#############################################################

1470. Shuffle the Array

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) { // careful: it's i < n
            result[index] = nums[i];     // x part
            index++;
            result[index] = nums[i + n]; // y part
            index++;
        }

        return result;
    }
}

#############################################################

1672. Richest Customer Wealth

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int sum = 0;

            // Calculate total wealth for current customer
            for (int money : customer) {
                sum += money;
            }

            // Update max wealth if this customer is richer
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }
}

#############################################################

1528. Shuffle String


❌ Problem:
return result.toString();

This doesn't return the actual string content — it returns something like:
[C@3e25a5

Because toString() on a char[] gives the memory reference, not the actual string.

✅ Fix:
You should convert the char[] to a String using:

return new String(result);


class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);            
        }

        return new String(result);
        
    }
}

#############################################################

1614. Maximum Nesting Depth of the Parentheses

class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (ch == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
}

#############################################################

1732. Find the Highest Altitude

public class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int al : gain) {
            currentAltitude += al;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
}

#############################################################

1748. Sum of Unique Elements

public class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (int num : count.keySet()) {
            if (count.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}

#############################################################

1207. Unique Number of Occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int value : map.values()) {
            if (set.add(value) == false) { // Can't add to set -> duplicate frequency found
                return false;
            }
        }
        return true; 
    }
}

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 1: Count frequency of each number
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check for duplicate frequencies
        Set<Integer> seen = new HashSet<>();
        for (int freq : freqMap.values()) {
            if (!seen.add(freq)) {
                return false; // duplicate frequency found
            }
        }

        return true;
    }
}

#############################################################

217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}

#############################################################

392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            } 
            j++;
        }
        return i == s.length();
        
    }
}


#############################################################

125. Valid Palindrome

// Method #1
// TC: O(n)
// SC: O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char curLeft = s.charAt(left);
            char curRight = s.charAt(right);
            if (!Character.isLetterOrDigit(curLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(curRight)) {
                right--;
            } else {
                if (Character.toLowerCase(curLeft) != Character.toLowerCase(curRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
     }
}

// // Method #2
// // TC: O(n)
// // SC: O(n)
// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb = new StringBuilder();
//         for(char ch : s.toCharArray()){
//             if(Character.isLetterOrDigit(ch)){
//                 sb.append(Character.toLowerCase(ch));
//             }
//         }
    
//         if(sb.toString().equals(sb.reverse().toString())){
//             return true;
//         }
//         return false;
//     }
// }

#############################################################

409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }            
        }

        if (oddCount > 1) {
            return s.length() - oddCount + 1;
        } else {
            return s.length();
        }
        
    }
}

#############################################################

443. String Compression

class Solution {
    public int compress(char[] chars) {
        int slow = 0; // write pointer
        int fast = 0; // read pointer

        while (fast < chars.length) {
            char currentChar = chars[fast];
            int start = fast;

            // move fast to the end of the group of same characters
            while (fast < chars.length && chars[fast] == currentChar) {
                fast++;
            }

            int count = fast - start; // count the same characters

            // write the character
            chars[slow] = currentChar;
            slow++;

            // if count > 1, write each digit of count
            if (count > 1) {
                String countToString = String.valueOf(count);
                for (char c : countToString.toCharArray()) {
                    chars[slow] = c;
                    slow++;
                }
            }
        }
        return slow; // return the length of the new array
    }
}

#############################################################

73. Set Matrix Zeroes

class Solution {
    public void setZeroes(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        // Create flags to track if the first row or first column should be set to zero 
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Step 1: Check if the first row contains any zeros by changing col
        for (int col = 0; col < colCount; col++) {
            if (matrix[0][col] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Step 2: Check if the first column contains any zeros by changing row
        for (int row = 0; row < rowCount; row++) {
            if (matrix[row][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }
        
        // Step 3: Use the first row and column to mark zeroes in the rest of the matrix
        for (int row = 1; row < rowCount; row++) {
            for (int col = 1; col < colCount; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0; // mark that row
                    matrix[0][col] = 0; // mark that column
                }
            }
        }

        // Step 4: Zero out the marked rows - EXCLUDE the first row
        for (int row = 1; row < rowCount; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < colCount; col++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Step 5: Zero out the marked columns - EXCLUDE the first column
        for (int col = 1; col < colCount; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < rowCount; row++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Step 6: Check if the first row had zero before all the markings, zero out the first row if needed
        if (firstRowHasZero) {
            for (int col = 0; col < colCount; col++) {
                matrix[0][col] = 0;
            }
        }

        // Step 7: Check if the first column had zero before all the markings, zero out the first column if needed
        if (firstColHasZero) {
            for (int row = 0; row < rowCount; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}

#############################################################

3174. Clear Digits

public class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            } else if (Character.isDigit(c)) {
                // Remove the closest non-digit character to the left
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                // We don't push the digit
            }
        }

        // Reconstruct the final string as result
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}

#############################################################

346. Moving Average from Data Stream

class MovingAverage {
    private Queue<Integer> window;
    private int maxSize;
    private double sum;

    public MovingAverage(int size) {
        this.window = new LinkedList<>();
        this.maxSize = size;
        this.sum = 0;
        
    }
    
    public double next(int val) {
        window.offer(val);
        sum += val;

        if (window.size() > maxSize) {
            sum -= window.poll();

        }
        return sum / window.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

#############################################################

1047. Remove All Adjacent Duplicates In String

// Method 1
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && c == stack.charAt(len - 1)) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}

// Method 2
class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {
            arr[slow] = arr[fast];
            if (slow > 0 && arr[slow] == arr[slow - 1]) {
                slow -= 2;
            }
            slow++;
        }

        return new String(arr, 0, slow);
    }
}


#############################################################

3174. Clear Digits

// Method 1
class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.append(c);
            } else {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            }
        }
        return stack.toString();        
    }
}


// Method 2
public class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            } else if (Character.isDigit(c)) {
                // Remove the closest non-digit character to the left
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                // We don't push the digit
            }
        }

        // Reconstruct the final string as result
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}

#############################################################

71. Simplify Path

public class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.equals("") && !part.equals(".")) {
                stack.push(part);
            }
        }

        // Use a normal iterator since for-each doesn't work on Iterator
        StringBuilder result = new StringBuilder();
        Iterator<String> it = stack.descendingIterator();
        while (it.hasNext()) {
            result.append("/").append(it.next());
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}

#############################################################

408. Valid Word Abbreviation

public class Solution {
  public boolean validWordAbbreviation(String word, String abbr) {
    int i = 0, j = 0;

    // Loop while there are characters left in both word and abbr
    while (i < word.length() && j < abbr.length()) {
        char c = abbr.charAt(j);
    
      // Case 1: Current abbr character is a letter
      if (Character.isLetter(c)) {
        if (i >= word.length() || word.charAt(i) != c) {
            return false;
        } 
        i++;
        j++;

      // Case 2: Current abbr character is a digit (indicates skip)
      } else if (Character.isDigit(c)) {
        if (c == '0') return false;

        int num = 0;
        while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
            num = num * 10 + (abbr.charAt(j) - '0');
            j++;
        }

        i += num;
      }
    }

    // Check: both pointers must reach the end of their strings
    return (i == word.length() && j == abbr.length());
  }
}


#############################################################

1209. Remove All Adjacent Duplicates in String II

// Method 1:
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == c) {
                int newCount = countStack.peek() + 1;
                countStack.pop();
                countStack.push(newCount);

                if (newCount == k) {
                    charStack.pop();
                    countStack.pop();
                }
            } else {
                // New Character: start from 1
                charStack.push(c);
                countStack.push(1);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            char c = charStack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        return result.reverse().toString();
    }
}


// Method 2:
public class Solution {
    public String removeDuplicates(String s, int k) {
        // Use a stack to store pairs of (character, current count of consecutive appearances)
        Deque<Pair> stack = new ArrayDeque<>();

        // Iterate over each character in the input string
        for (char c : s.toCharArray()) {
            // Case 1: stack is not empty and top character matches current character
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++; // Increment the count

                // If count reaches k, we remove the group from the stack
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } 
            // Case 2: first time we see this character or it's not same as top of stack
            else {
                stack.push(new Pair(c, 1)); // Push a new pair with count = 1
            }
        }

        // Build the final string from the stack (from bottom to top)
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair p = stack.removeLast(); // Reverse the stack to preserve original order

            // Append the character 'count' number of times
            for (int i = 0; i < p.count; i++) {
                result.append(p.ch);
            }
        }

        return result.toString();
    }

    // Helper class to store a character and its current count in sequence
    private static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}

#############################################################

252. Meeting Rooms

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        // Step 1: Sort the intervals by start time (ascending)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Check for any overlapping intervals
        for (int i = 0; i < intervals.length - 1; i++) { // Note: i < intervals.length - 1 because you have to compare with the next one
            // If the end time of the current meeting is after the start of the next → overlap
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false; // Cannot attend both meetings
            }
        }

        // Step 3: If no overlaps found, return true
        return true;
    }
}

#############################################################

1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map stores (value → index)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store this number and its index
            map.put(nums[i], i);
        }

        // Return an empty array
        return new int[] {};
    }
}

/*
We can iterate through the array once, and for each element, check if the target minus the current element exists in the hash table. If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.
Approach using a hash table:

1. Create an empty hash table to store elements and their indices.
2. Iterate through the array from left to right.
3. For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
4. Check if the complement exists in the hash table. If it does, we have found a solution.
5. If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.
6. Repeat steps 3-5 until we find a solution or reach the end of the array.
7. If no solution is found, return an empty array or an appropriate indicator.

time complexity of O(n) since hash table lookups take constant time on average. 
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{}; // no solution found
    }
}

#############################################################

88. Merge Sorted Array

// Method 1
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // pointer for nums1 (valid part)
        int j = n - 1;         // pointer for nums2
        int k = m + n - 1;     // pointer for merged position

        // Merge from back to front
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If any elements left in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}

// Method 2
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;             // last valid element in nums1
        int j = n - 1;             // last element in nums2
        int k = m + n - 1;         // position to fill from the end
        
        while (j >= 0) {           // only need to worry about nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // place larger value at end
            } else {
                nums1[k--] = nums2[j--]; // place nums2 value
            }
        }
    }
}

#############################################################

412. Fizz Buzz

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}

#############################################################

49. Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            // Convert string to char array and sort it to get an anagram key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // sorted string is the key

            // If key not in map, create a new list for it
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }

            // Add original string to its corresponding group
            ans.get(key).add(s);
        }

        // Return all groups of anagrams
        return new ArrayList<>(ans.values());        
    }
}
#############################################################

394. Decode String

class Solution {
    public String decodeString(String s) {
        // Stack to keep track of repeat counts (e.g., the '3' in "3[a]")
        Stack<Integer> countStack = new Stack<>();

        // Stack to keep track of previously built strings before each '['
        Stack<StringBuilder> stringStack = new Stack<>();

        // This is the string we're currently building
        StringBuilder curr = new StringBuilder();

        // Variable to store the current repeat number
        int k = 0;

        // Loop through each character in the input string
        for (char c : s.toCharArray()) {
            
            // If the character is a digit, build the full number (could be multi-digit like "12")
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            }

            // If we see '[', it means we're about to process a new encoded string
            else if (c == '[') {
                // Save the current repeat count
                countStack.push(k);

                // Save the current built string so far
                stringStack.push(curr);

                // Start a new string for the content inside brackets
                curr = new StringBuilder();

                // Reset k to start fresh for the next number
                k = 0;
            }

            // If we see ']', it means the encoded string has ended
            else if (c == ']') {
                // Get the repeat count from the stack
                int repeat = countStack.pop();

                // Get the previous string before this '[' block
                StringBuilder prev = stringStack.pop();

                // Repeat the current string 'repeat' times and append to the previous string
                for (int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }

                // Set curr to the combined result to continue building the final string
                curr = prev;
            }

            // If the character is a regular letter, add it to the current string
            else {
                curr.append(c);
            }
        }

        // After processing all characters, curr contains the fully decoded string
        return curr.toString();
    }
}

#############################################################

3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If char already seen, move left pointer until it's removed
            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }

            // Add current char to set and update maxLength
            seen.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

#############################################################

5. Longest Palindromic Substring

// Method 1: TC: O(N^2), SC: O(N)
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }

        return maxStr;
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

// a b c b e

// i = 0, odd = a, even = ""
// i = 1, odd = b, even = ""
// i = 2, odd = bcb, even = ""
// i = 3, old = b, even = ""
// i = 4, old = e, even = "" 


// Method 2: TC: O(N^2), SC: O(1)
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     // odd length
            int len2 = expandFromCenter(s, i, i + 1); // even length
            int len = Math.max(len1, len2);           // pick the longer one

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // length of the palindrome
    }
}

#############################################################

2956. Find Common Elements Between Two Arrays

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        int count1 = 0, count2 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }
        return new int[] {count1, count2};
    }
}

#############################################################

2965. Find Missing and Repeated Values

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;           // Grid is n x n
        int size = n * n;              // Total expected values from 1 to n^2
        int[] freq = new int[size + 1]; // Frequency array to count occurrences (1-based index)

        // Count how many times each number appears in the grid
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;          // Increment count for each number
            }
        }

        int duplicate = -1, missing = -1;

        // Identify the number that appears twice (duplicate) and the one that is missing
        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2) duplicate = i;
            if (freq[i] == 0) missing = i;
        }

        // Return the results in [duplicate, missing] format
        return new int[]{duplicate, missing};
    }
}


#############################################################

2843. Count Symmetric Integers

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;  // Counter for symmetric integers

        // Iterate through all numbers from low to high
        for (int num = low; num <= high; num++) {
            String s = Integer.toString(num);  // Convert the number to a string to access digits
            int len = s.length();

            // Skip numbers with an odd number of digits (only even-digit numbers can be symmetric)
            if (len % 2 != 0) continue;

            int half = len / 2;      // Half length of the digit string
            int leftSum = 0, rightSum = 0;

            // Sum digits from the left half and right half
            for (int i = 0; i < half; i++) {
                leftSum += s.charAt(i) - '0';            // Convert char to digit and add to leftSum
                rightSum += s.charAt(i + half) - '0';    // Add digit from the second half to rightSum
            }

            // If both halves have equal sums, it's a symmetric integer
            if (leftSum == rightSum) count++;
        }

        return count;  // Return the total count of symmetric integers
    }
}

#############################################################

3105. Longest Strictly Increasing or Strictly Decreasing Subarray

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1;        
        int inc = 1, dec = 1;  // Track lengths of current increasing and decreasing subarrays

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                inc++;         // Extend increasing streak
                dec = 1;       // Reset decreasing streak because trend flipped
            } else if (nums[i] < nums[i - 1]) {
                dec++;         // Extend decreasing streak
                inc = 1;       // Reset increasing streak because trend flipped
            } else {
                // Equal elements break both increasing and decreasing streaks
                inc = 1;
                dec = 1;
            }

            // Update the maximum length seen so far
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }

        return maxLen;
    }
}

#############################################################

9. Palindrome Number



#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################

#############################################################