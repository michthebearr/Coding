/************************************************************
/  Code snippet
************************************************************/

Map<Integer, Integer> map = new HashMap<>();
map.size
map.equals
int count = dictT.getOrDefault(t.charAt(i), 0); // use it in Sliding windows to dual wiht duplication
int smallestValue = Collection.min(map.values)
return new int[] {a, b};
throw new IllegalArgumentException("Invalid input");
List<Pair<Integer, Character>> filteredS = new ArrayList<Pair<Integer, Character>>();
new Pair<Integer, Character>(i, c)
pair.getKey(), pair.getValue()
for(char c : s.toCharArray())
System.arraycopy(nums1, 0, nums1_copy, 0, m);
Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

Set<String> validExpressions = new HashSet<String>();
return new ArrayList<String>(validExpressions);

int[][] dirs=new int[][]{{0,1},{0,-1},{-1,0},{1,0}};

check (base > INT_MAX/10 || (base == INT_MAX / 10 && str[i] - '0' > 7)) 
before base = 10*base + str[i++] - '0');
wher 7 = INT_MAX%10

private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }

PriorityQueue<Pair> pq = 
new PriorityQueue<>((a, b) -> (a.c == b.c ? a.s.compareTo(b.s) : b.c - a.c));

Comparator, keep the order if negative, swap if positive

Arrays.sort(intervals, new Comparator<Interval>() {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }        
    });


// maxheap with max freq, otherwise get more recent (larger index)
class NodeComparator implements Comparator<Node>{
        public int compare(Node a, Node b){
            if (a.freq != b.freq) return b.freq -a.freq;
                    return b.pushIndex - a.pushIndex;

        }
    }


boolean checkUniqueChar (char c) {
    int mask = 0;
    if (mask & (1 << (c - 'a')) = 0) {
        mask |= (1 << (c - 'a'));
    } else {
        return false;
    }
    return true;
}

boolean checkUniqueChar (String input) {
    for (int i = 0; i < input.length; i++) {
        int a = input.charAt(i);
        int row = a / 32;
        int w = 1 << (a - 'a');
        if (bits[row] & w != 0) {
            return false;
        }
        bits[row] |= w;
    }
    return true;
}
/************************************************************
/  0. ToLearn
************************************************************/
logN Runtime for binary search

collection.java

learn O(n) sort
To have O(N) algorithm performance, one would need a structure, which provides four operations in O(1) time :
- Insert the key
- Get the key / Check if the key exists
- Delete the key
- ***Return the first / or the last added key/value***
The first three operations in O(1) time are provided by the standard hashmap, and the forth one - by linked list.
It is ordered dictionary, it is called LinkedHashMap in java
treemap vs balance binary search tree
Fenwick Tree, Segment Tree, B+ tree, 
Grokking the system design Interview
Reverse linkedList in both recursive and iteration ways
research on '0' in ascii Code
lexicographic permutation
Topological sorting
Threaded binary tree and Explaination of Morris Method
skewed/skew tree, every node have only one child.  It is a line
Union Find (aka Disjoint Set)
Bucket sort, good runtime if all numbers are uniformly distributed
circular buffer
hamilton path, Hamilton cycle VS Euler path, Euler cycle
Treemap vs LinkedHashMap 
`buildHeap`heapify take O(n) but heapSort take O(nlog n)

When answering Time and Space, make sure to point out the difference between balanced and unbalanced tree

global map/set is not thread safe
amortized (average) time complexity

Trie
When data is sparse, memory allocation fragmentation

Tree transval
https://leetcode.com/problems/validate-binary-search-tree/discuss/32112/Learn-one-iterative-inorder-traversal-apply-it-to-multiple-tree-questions-(Java-Solution)


Sliding windows
https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem.

Subsets, Permutations, Combination Sum, Palindrome Partitioning
https://leetcode.com/problems/combination-sum/discuss/16502/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)

Make sure to understand the difference between combination and permutation
For permutation of String, we can use the SWAP method to swap the current and i index

BFS:
Always mark a node as visited before pushing it to the queue
Operation can be done right BEFORE pushing to the queue OR right AFTER poll()

( x & (x-1)) can netural the least signficant 1 in x
/************************************************************
/  1. 2 Sum
************************************************************/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

Time = O(n), Space = O(n)

/************************************************************
/  3. Longest Substring Without Repeating Characters
************************************************************/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                // i is the current left
                // s.charAt(j) could be less than current left and thus we need to use Math.max
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}

Time = O(n), Space = O(n)


/************************************************************
/  4. Media of Two Sorted Arrays
************************************************************/

/************************************************************
/  13. Roman to Integer
************************************************************/
// Approach 1
public int romanToInt(String s) {
     int sum=0;
    if(s.indexOf("IV")!=-1){sum-=2;}
    if(s.indexOf("IX")!=-1){sum-=2;}
    if(s.indexOf("XL")!=-1){sum-=20;}
    if(s.indexOf("XC")!=-1){sum-=20;}
    if(s.indexOf("CD")!=-1){sum-=200;}
    if(s.indexOf("CM")!=-1){sum-=200;}
    
    char c[]=s.toCharArray();
    int count=0;
    
   for(;count<=s.length()-1;count++){
       if(c[count]=='M') sum+=1000;
       if(c[count]=='D') sum+=500;
       if(c[count]=='C') sum+=100;
       if(c[count]=='L') sum+=50;
       if(c[count]=='X') sum+=10;
       if(c[count]=='V') sum+=5;
       if(c[count]=='I') sum+=1;  
   }
   return sum;  
}

// Approach 2
public static int romanToInt(String s) {
    int res = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        char c = s.charAt(i);
        switch (c) {
        case 'I':
            res += (res >= 5 ? -1 : 1);
            break;
        case 'V':
            res += 5;
            break;
        case 'X':
            res += 10 * (res >= 50 ? -1 : 1);
            break;
        case 'L':
            res += 50;
            break;
        case 'C':
            res += 100 * (res >= 500 ? -1 : 1);
            break;
        case 'D':
            res += 500;
            break;
        case 'M':
            res += 1000;
            break;
        }
    }
    return res;
}

/************************************************************
/  14. Longest Common Prefix
************************************************************/
// Approach 1
public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
    }
    return strs[0];
}

// Approach 2
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}


/************************************************************
/  15. 3Sum
************************************************************/
public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int start = i+1, end = num.length-1, sum = 0 - num[i];
            while (start < end) {
                if (num[start] + num[end] == sum) {
                    res.add(Arrays.asList(num[i], num[start], num[end]));
                    while (start < end && num[start] == num[start+1]) start++;
                    while (start < end && num[end] == num[end-1]) end--;
                    start++; end--;
                } else if (num[start] + num[end] < sum) start++;
                else end--;
           }
        }
    }
    return res;
}

/************************************************************
/  16. 3Sum Closet
************************************************************/
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}

/************************************************************
/  17. Letter Combinations of a Phone Number
************************************************************/
class Solution {
  Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
  }};

  List<String> output = new ArrayList<String>();

  public void backtrack(String combination, String next_digits) {
    // if there is no more digits to check
    if (next_digits.length() == 0) {
      // the combination is done
      output.add(combination);
    }
    // if there are still digits to check
    else {
      // iterate over all letters which map 
      // the next available digit
      String digit = next_digits.substring(0, 1);
      String letters = phone.get(digit);
      for (int i = 0; i < letters.length(); i++) {
        String letter = phone.get(digit).substring(i, i + 1);
        // append the current letter to the combination
        // and proceed to the next digits
        backtrack(combination + letter, next_digits.substring(1));
      }
    }
  }

  public List<String> letterCombinations(String digits) {
    if (digits.length() != 0)
      backtrack("", digits);
    return output;
  }
}

Time = O(3^N * 4^M) 
where N is the number of digits in the input that maps 
to 3 letters (e.g. 2, 3, 4, 5, 6, 8) 
and M is the number of digits in the input that maps 
to 4 letters (e.g. 7, 9), and N+M is the total number digits in the input.
Space = O(3^N * 4^M) since one has to keep 3^N \times 3^N * 4^M solutions.

/************************************************************
/  18. 4Sum - K Sum
************************************************************/
List<List<Integer>> kSum_Trim(int[] a, int target, int k) {
    List<List<Integer>> result = new ArrayList<>();
    if (a == null || a.length < k || k < 2) return result;
    Arrays.sort(a);
    kSum_Trim(a, target, k, 0, result, new ArrayList<>());
    return result;
}

void kSum_Trim(int[] a, int target, int k, int start, List<List<Integer>> result, List<Integer> path) {
    int max = a[a.length - 1];
    if (a[start] * k > target || max * k < target) return;
    
    if (k == 2) {                        // 2 Sum
        int left = start;
        int right = a.length - 1;
        while (left < right) {
            if      (a[left] + a[right] < target) left++;
            else if (a[left] + a[right] > target) right--;
            else {
                result.add(new ArrayList<>(path));
                result.get(result.size() - 1).addAll(Arrays.asList(a[left], a[right]));
                left++; right--;
                while (left < right && a[left] == a[left - 1]) left++;
                while (left < right && a[right] == a[right + 1]) right--;
            }
        }
    }
    else {                        // k Sum
        for (int i = start; i < a.length - k + 1; i++) {
            if (i > start && a[i] == a[i - 1]) continue;
            if (a[i] + max * (k - 1) < target) continue;
            if (a[i] * k > target) break;
            if (a[i] * k == target) {
                if (a[i + k - 1] == a[i]) {
                    result.add(new ArrayList<>(path));
                    List<Integer> temp = new ArrayList<>();
                    for (int x = 0; x < k; x++) temp.add(a[i]);
                    result.get(result.size() - 1).addAll(temp);    // Add result immediately.
                }
                break;
            }
            path.add(a[i]);
            kSum_Trim(a, target - a[i], k - 1, i + 1, result, path);
            path.remove(path.size() - 1);        // Backtracking
        }
    }
}

4Sum - Time = O(n^3), Space = O(1)
kSum - Time = O(n^k)

/************************************************************
/  19. Remove Nth Node From End of List
************************************************************/
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
}
/************************************************************
/  24. Swap Nodes in Pairs
************************************************************/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode first = head;
        ListNode second = head.next;
        
        ListNode nextHead = swapPairs(second.next);
        
        second.next = first;
        first.next = nextHead;
        
        return second;
    }
}
/************************************************************
/  25. Reverse Nodes in k-Group
************************************************************/
class ReverseKGroupsLinkedList {
  public ListNode reverseKGroup(ListNode head, int k) {
      if (head == null || k == 1) {
        return head;
      }
      ListNode dummy = new ListNode(0);
      dummy.next = head;
  
      ListNode start = dummy;
      ListNode end = head;
      int count = 0;
      while (end != null) {
        count++;
        // group
        if (count % k == 0) {
          // reverse linked list (start, end]
          start = reverse(start, end.next);
          end = start.next;
        } else {
          end = end.next;
        }
      }
      return dummy.next;
    }
  
    /** 
     * reverse linked list from range (start, end), return last node.
     * for example: 
     * 0->1->2->3->4->5->6->7->8
     * |           |
     * start       end
     * 
     * After call start = reverse(start, end)
     * 
     * 0->3->2->1->4->5->6->7->8
     *          |  |
     *       start end
     *       first
     * 
     */
    private ListNode reverse(ListNode start, ListNode end) {
      ListNode curr = start.next;
      ListNode prev = start;
      ListNode first = curr;
      while (curr != end){
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
      }
      start.next = prev;
      first.next = curr;
      return first;
    }
}

// Same but short
public ListNode reverseKGroup(ListNode head, int k) {
    ListNode curr = head;
    int count = 0;
    while (curr != null && count != k) { // find the k+1 node
        curr = curr.next;
        count++;
    }
    if (count == k) { // if k+1 node is found
        curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
        // head - head-pointer to direct part, 
        // curr - head-pointer to reversed part;
        while (count-- > 0) { // reverse current k-group: 
            ListNode tmp = head.next; // tmp - next head in direct part
            head.next = curr; // preappending "direct" head to the reversed list 
            curr = head; // move head of reversed part to a new node
            head = tmp; // move "direct" head to the next node in direct part
        }
        head = curr;
    }
    return head;
}

// Non-recursive
public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for (ListNode i = head; i != null; n++, i = i.next);
        
        ListNode dmy = new ListNode(0);
        dmy.next = head;
        for(ListNode prev = dmy, tail = head; n >= k; n -= k) {
            for (int i = 1; i < k; i++) {
                ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
            }
            
            prev = tail;
            tail = tail.next;
        }
        return dmy.next;
    }



/************************************************************
/  30. Substring with Concatenation of All Words
************************************************************/
Method 1: iterate all the index i, 
method 2: similar to KMP, 
but need to consider offbit shift, 
thats why we need to have a outer for-loop for diferent start index
----
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null || s.length() == 0 || words.length == 0) {
            return new ArrayList<>();
        }
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        
        List<Integer> r = new ArrayList<>();
        int sLen = s.length();
        int num = words.length;
        int wordLen = words[0].length();

        for (int i = 0; i < sLen - num * wordLen + 1; i++) {
            String sub = s.substring(i, i + num * wordLen);
            if (isConcat(sub, counts, wordLen)) {
                r.add(i);
            }
        }
        return r;
    }
    
    /**
     * */
    private boolean isConcat(String sub, Map<String, Integer> counts, int wordLen) {
        Map<String, Integer> seen = new HashMap<>();
        for (int i = 0; i < sub.length(); i += wordLen) {
            String sWord = sub.substring(i, i + wordLen);
            seen.put(sWord, seen.getOrDefault(sWord, 0) + 1);
        }
        return seen.equals(counts);
    }
}

Time = O(n * sizeOfStringList * lengthOfEachString) ~ O(n * num)
Space = O(sizeOfStringList * lengthOfEachString) ~ O(n * num)



/************************************************************
/  32. Longest Valid Parentheses
************************************************************/
When scanning from left to right, you might end up with a positive value for 'left'.
Say, your left ends up with 4 and right ends up with 3. 
This means there could be 3 valid pairs giving an answer of 6. 
But you never got the chance to calculate that 
because your "left" has always managed to stay more than "right". Example: "(((()))"



/************************************************************
/  34. Find First and Last Position of Element in Sorted Array
************************************************************/
// LaiOffer Approach
class Solution {
    public  int[] searchRange(int[] nums, int target) {
        int hi = nums.length - 1;
        int low = 0;
        int[] rs = new int[2];
        // base case
        if(nums == null || nums.length == 0)
            return new int[]{-1, -1 };

        //left side
        while(low < hi - 1){
            int mid = low + (hi - low) /2;
            if(target > nums[mid]){
                low = mid;
            }   else {
                hi = mid;
            }
        }
        
        if(target == nums[low]){
            rs[0] = low;
        } else if(target == nums[hi]){
            rs[0] = hi;
        } else {
            return new int[]{-1, -1 };
        }

        //right side
        hi = nums.length - 1;
        while(low < hi - 1){
            int mid = low + (hi - low) /2;   
            if(target < nums[mid]){
                hi = mid;
            }   else {
                low = mid;
            }
        }   
        if(target == nums[hi]){
            rs[1] = hi;
        } else if(target == nums[low]){
            rs[1] = low;
        }

        return rs;
    }
}

// Leetcode Approach
class Solution {
    public  int[] searchRange(int[] nums, int target) {
        int hi = nums.length - 1;
        int low = 0;
        int[] rs = new int[2];
               // base case
        if(nums == null || nums.length == 0)
            return new int[]{-1, -1 };

               //left side
        while(low < hi){
            int mid = low + (hi - low) /2;
            if(target > nums[mid]){
                low = mid + 1;
            }else if(target < nums[mid]){       // optional
                hi = mid - 1;                   // optional - 1
            }else {
                hi = mid;
            }
        }
        if(target == nums[low]){
            rs[0] = low;
        }else{
            return new int[]{-1, -1 };
        }

                //right side
        hi = nums.length - 1;
        while(low < hi){
            int mid = (low + (hi - low) /2 ) + 1;   
            // +1 because mid is tend to be left side when floor down

            if(target < nums[mid]){
                hi = mid - 1;
            }else if(target < nums[mid]){       // optional
                low = mid + 1;                  // optional + 1
            }else {
                low = mid;
            }
        }   
        rs[1] = hi;

        return rs;
    }
}



/************************************************************
/  36. Valid Sudoku
************************************************************/
// Smart with one hashset
public boolean isValidSudoku(char[][] board) {
    Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            char number = board[i][j];
            if (number != '.')
                if (!seen.add(number + " in row " + i) ||
                    !seen.add(number + " in column " + j) ||
                    !seen.add(number + " in block " + i/3 + "-" + j/3))
                    return false;
        }
    }
    return true;
}


// One pass with three hashmap
box_index = (row / 3) * 3 + col / 3

class Solution {
  public boolean isValidSudoku(char[][] board) {
    // init data
    HashMap<Integer, Integer> [] rows = new HashMap[9];
    HashMap<Integer, Integer> [] columns = new HashMap[9];
    HashMap<Integer, Integer> [] boxes = new HashMap[9];
    for (int i = 0; i < 9; i++) {
      rows[i] = new HashMap<Integer, Integer>();
      columns[i] = new HashMap<Integer, Integer>();
      boxes[i] = new HashMap<Integer, Integer>();
    }

    // validate a board
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char num = board[i][j];
        if (num != '.') {
          int n = (int)num;
          int box_index = (i / 3 ) * 3 + j / 3;

          // keep the current cell value
          rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
          columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
          boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

          // check if this value has been already seen before
          if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1)
            return false;
        }
      }
    }

    return true;
  }
}



/************************************************************
/  38. Count and Say
************************************************************/
class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return "-1";
        String result = "1";
        
        for(int i = 1; i < n; i ++) {
            result = build(result);
        }
        return result;
    }
    
    private String build(String result) {
        StringBuilder builder = new StringBuilder();
        int p = 0;
        while(p < result.length()) {
            char val = result.charAt(p);
            int count = 0;
            
            while(p < result.length() && 
              result.charAt(p) == val){
                p ++;
                count ++;
            }
            builder.append(String.valueOf(count));
            builder.append(val);
        }
        return builder.toString();
    }
}


/************************************************************
/  39. Combination Sum
************************************************************/
// My solution
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) return null;
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> buffer = new ArrayList<Integer>();
        helper(candidates, 0, target, buffer, result);
        
        return result;
    }
    
    void helper(int[] candidates, int idx, int target, List<Integer> buffer, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(buffer));
            return;
        } else if (target < 0) {
            return;
        }
        
        for (int i = idx; i < candidates.length; i++) {
            int curr = candidates[i];
            if (target >= curr) {
                buffer.add(curr);
                helper(candidates, i, target - curr, buffer, result);
                buffer.remove(buffer.size() - 1);
            }
        }
    }
}


Time = O(2^n) because of brench factor 2, could be O(n * 2^n) because of coping the list
!!!!!WRONG TIME ANALYSIS!!!!! Think of a counter example of ['1'], 1 and ['1'], 10000
The time should be O(N^target), N brench with potentially `target` number of levels

Time Complexity - O(m^d),  Space Complexity - O(m)，   THIS IS CORRECT!!!!!!
m is distinct elements in candidate[] which candidate[i] <=  target，  
d = target / min element in candidate[]
Time = O(#candidates^(target/min of candidates))


Space = O(max depth of the tree + max length of the list) + O(n)


/************************************************************
/  40. Combination Sum II
************************************************************/
// The different between this problem and the one above
// Sorted, and make sure don't process the same items twice on the same level
// For example, [1, 1, 1], we don't process the next same number until i+1
// Important observation: idx = size of the buffer = size of the DFS tree
   
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) return null;
        
        Arrays.sort(candidates);
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> buffer = new ArrayList<Integer>();
        helper(candidates, 0, target, buffer, result);
        
        return result;
    }
    
    void helper(int[] candidates, int idx, int target, List<Integer> buffer, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(buffer));
            return;
        } else if (target < 0) {
            return;
        }
        
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i-1]) continue;
            int curr = candidates[i];
            if (target >= curr) {
                buffer.add(curr);
                helper(candidates, i + 1, target - curr, buffer, result);
                buffer.remove(buffer.size() - 1);
            }
        }
    }
}

Time = O(2^n)

/************************************************************
/  41. First Missing Positive
************************************************************/
// Keep swap to the right position
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
        }
        for(int i = 0; i < n; i++)
            if(nums[i] != i + 1)
                return i + 1;
        return n + 1;
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}

Time = O(n), although there is a for-while loop, but the while-loop can run atmost N time total, 
so the average is O(1)



// LC solution
- Check if 1 is present in the array. If not, you are done and 1 is the answer.
- If nums = [1], the answer is 2.
- Replace negative numbers, zeros, and numbers larger than n by 1s.
- Walk along the array. Change the sign of a-th element if you meet number a. Be careful with duplicates : do sign change only once. Use index 0 to save an information about presence of number n since index n is not available.
- Walk again along the array. Return the index of the first positive element.
- If nums[0] > 0 return n.
- If on the previous step you did not find the positive element in nums, 
that means that the answer is n + 1.

class Solution {
  public int firstMissingPositive(int[] nums) {
    int n = nums.length;

    // Base case.
    int contains = 0;
    for (int i = 0; i < n; i++)
      if (nums[i] == 1) {
        contains++;
        break;
      }

    if (contains == 0)
      return 1;

    // nums = [1]
    if (n == 1)
      return 2;

    // Replace negative numbers, zeros,
    // and numbers larger than n by 1s.
    // After this convertion nums will contain 
    // only positive numbers.
    for (int i = 0; i < n; i++)
      if ((nums[i] <= 0) || (nums[i] > n))
        nums[i] = 1;

    // Use index as a hash key and number sign as a presence detector.
    // For example, if nums[1] is negative that means that number `1`
    // is present in the array. 
    // If nums[2] is positive - number 2 is missing.
    for (int i = 0; i < n; i++) {
      int a = Math.abs(nums[i]);
      // If you meet number a in the array - change the sign of a-th element.
      // Be careful with duplicates : do it only once.
      if (a == n)
        nums[0] = - Math.abs(nums[0]);
      else
        nums[a] = - Math.abs(nums[a]);
    }

    // Now the index of the first positive number 
    // is equal to first missing positive.
    for (int i = 1; i < n; i++) {
      if (nums[i] > 0)
        return i;
    }

    if (nums[0] > 0)
      return n;

    return n + 1;
  }
}

/************************************************************
/  42. Trapping Rain Water
************************************************************/
DP: Two pass from both direction and then do Math.min(leftMax, rightMax) - height[i]
Stack: Keep a decrease stack, pop items when hit height[i] > stack.top
Two pointers, time O(n), space O(1)

public int trap(int[] height) {
    if (height.length <= 1) {
        return 0;
    }
    int res = 0;
    int left = 0;
    int right = height.length - 1;

    int lmax = height[0];
    int rmax = height[height.length - 1];

    while (left <= right) {
        if (height[left] <= height[right]) {
            int curr = height[left];
            if (curr > lmax) {
                lmax = curr;
            } else {
                res = res + lmax - curr;
            }
            left++;
        }  else {
            int curr = height[right];
            if (curr > rmax) {
                rmax = curr;
            } else {
                res = res + rmax - curr;
            }
            right--;
        }
    }
    return res;
}


/************************************************************
/  46. Permutations
************************************************************/
// My dump solution
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, result);
        return result;
    }
    
    public void dfs(int[] nums, int idx, List<List<Integer>> result) {
        if (idx == nums.length) {
            // There is no easy way to convert int[] into a list
            List<Integer> intList = new ArrayList<Integer>();
            for (int i : nums) {
                intList.add(i);
            }
            result.add(intList);
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            dfs(nums, idx + 1, result);
            swap(nums, idx, i);
        }
    }
    
    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}


// LC solution
class Solution {
  public void backtrack(int n,
                        ArrayList<Integer> nums,
                        List<List<Integer>> output,
                        int first) {
    if (first == n)
      output.add(new ArrayList<Integer>(nums));
    for (int i = first; i < n; i++) {
      Collections.swap(nums, first, i);
      backtrack(n, nums, output, first + 1);
      Collections.swap(nums, first, i);
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> output = new LinkedList();

    // convert nums into list since the output is a list of lists
    ArrayList<Integer> nums_lst = new ArrayList<Integer>();
    for (int num : nums) nums_lst.add(num);

    int n = nums.length;
    backtrack(n, nums_lst, output, 0);
    return output;
  }
}

Time = O(n!) because the first item has N choices, the 2nd has N-1, the 3rd has N-2...
Space = O(n) but
It could be O(N!) because you need to store the permutations and 
there are N! permutations for N distinct numbers.


/************************************************************
/  47. Permutations II
************************************************************/
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
    //  int[] temp = nums;      // Should not modify the input
        dfs(nums, 0, result);
        return result;
    }
    
    public void dfs(int[] nums, int idx, List<List<Integer>> result) {
        if (idx == nums.length) {
            List<Integer> intList = new ArrayList<Integer>();
            for (int i : nums) {
                intList.add(i);
            }
            result.add(intList);
        }
        
        Set<Integer> set = new HashSet<>();   // This is the only difference
        
        for (int i = idx; i < nums.length; i++) {
            if (!set.add(nums[i])) continue;  // Check for duplicates
            swap(nums, idx, i);
            dfs(nums, idx + 1, result);
            swap(nums, idx, i);
        }
    }
    
    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}


/************************************************************
/  56. Merge Intervals
************************************************************/
//My solution
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
           public int compare(int[] a, int[] b) {
               return Integer.compare(a[0], b[0]);
           } 
        });
        
        int curr = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[curr][1]) {
                intervals[curr][1] = Math.max(intervals[curr][1], intervals[i][1]);
            } else {
                curr++;
                intervals[curr] = intervals[i];
            }
        }
        
        int[][] result = new int[curr + 1][2];
        
        for (int i = 0; i <= curr; i++) {
            result[i] = intervals[i];
        }
        
        return result;
    }
}

// Best
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort by ascending starting point
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {                             // Disjoint intervals, add the new interval to the list
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}

// List intput
public List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() <= 1)
        return intervals;
    
    // Sort by ascending starting point using an anonymous Comparator
    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
    
    List<Interval> result = new LinkedList<Interval>();
    int start = intervals.get(0).start;
    int end = intervals.get(0).end;
    
    for (Interval interval : intervals) {
        if (interval.start <= end) // Overlapping intervals, move the end if needed
            end = Math.max(end, interval.end);
        else {                     // Disjoint intervals, add the previous one and reset bounds
            result.add(new Interval(start, end));
            start = interval.start;
            end = interval.end;
        }
    }
    
    // Add the last interval
    result.add(new Interval(start, end));
    return result;
}

Time = O(nlogn) for sorting, Space = O(n)



/************************************************************
/  66. Plus One
************************************************************/
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}


/************************************************************
/  67. Add Binary
************************************************************/
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            // sum = carry + left + right
            // digit = sum % 2
            // carry = sum % 2
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}


/************************************************************
/  69. Sqrt(x)
************************************************************/
public int mySqrt(int x) {
    if (x < 2) return x;

    long num;
    int pivot, left = 2, right = x / 2;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      num = (long)pivot * pivot;
      if (num > x) right = pivot - 1;
      else if (num < x) left = pivot + 1;
      else return pivot;
  }
  return right;
}

/************************************************************
/  76. Minimum Window Substring
************************************************************/
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap();
        for(char c : s.toCharArray()) {     /* 1. initialize the hash map here */
            map.put(c,0);
        }

        for(char c : t.toCharArray())       /* 2. initialize the hash map here */
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                return "";
        }

        int start =0, end=0;                // two pointers, one point to tail and one  head
        int minStart=0;                     // minStart
        int minLen = Integer.MAX_VALUE;     //  the length of substring
        int counter = t.length();           // check whether the substring is valid

        while(end < s.length())
        {
            char c1 = s.charAt(end);        /* 3. get the end string */

            if(map.get(c1) > 0)             /* 4. modify counter here */
                counter--;

            map.put(c1,map.get(c1)-1);      /* 5. update map */

            end++;

            while(counter == 0)             /* 6. counter condition */
            {
                if(minLen > end-start)      /* 7. update d here if finding minimum */
                {
                    minLen = end-start;
                    minStart = start;
                }

                char c2 = s.charAt(start);
                map.put(c2, map.get(c2)+1); /* 8. increase begin to make it invalid/valid again */

                if(map.get(c2) > 0)         /* 9. modify counter here */
                    counter++;

                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLen);
    }
}



/************************************************************
/  78. Subsets
************************************************************/
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //Arrays.sort(nums);    // Optional
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}


/************************************************************
/  79. Word Search
************************************************************/

class Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0 || word == null) {
            return false;
        }
        
        int n = board.length;
        int m = board[0].length;
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(found = dfs(i, j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(int i, int j, char[][] board, String word, int idx) {
        if (idx == word.length()) {
            return true;
        }
        
        int n = board.length;
        int m = board[0].length;
        
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        
        char c = board[i][j];
        
        if (c == '*' || c != word.charAt(idx)) {
            return false;
        }
        
        board[i][j] = '*';
        boolean found = dfs(i + 1, j, board, word, idx + 1)
                    || dfs(i - 1, j, board, word, idx + 1)
                    || dfs(i, j + 1, board, word, idx + 1)
                    || dfs(i, j - 1, board, word, idx + 1);
        board[i][j] = c;
        
        return found;
    }
}

Time = O(m*n * 4^L), Space = O(L), where L is the length of the word

4 breched tree, so that it is factor of 4




/************************************************************
/  82. Remove Duplicates from Sorted List II
************************************************************/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }
}




/************************************************************
/  83. Remove Duplicates from Sorted List
************************************************************/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null) {
            if (pre.val != cur.val) {
                pre.next = cur;
                pre = pre.next;
            }
            cur = cur.next;
        }
        pre.next = null;
        return head;
    }
}


public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}



/************************************************************
/  86. Partition List
************************************************************/
// My solution
public ListNode partition(ListNode head, int x) {
    ListNode lessHead = new ListNode(0);
    ListNode lessCur = lessHead;
    ListNode moreHead = new ListNode(0);
    ListNode moreCur = moreHead;
    
    ListNode cur = head;
    
    while (cur != null) {
        ListNode next = cur.next;
        if (cur.val < x) {
            lessCur.next = cur;
            lessCur = lessCur.next;
        } else {
            moreCur.next = cur;
            moreCur = moreCur.next;
        }
        cur = next;
    }
    
    moreCur.next = null;
    lessCur.next = moreHead.next;
    return lessHead.next;
}

/************************************************************
/  90. Subsets II
************************************************************/
// Sorting is NECESSARY!
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);  // It must be sorted.
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        // Set<Integer> set = new HashSet<>();  // Use the if-condition to save a Set
        
        for(int i = start; i < nums.length; i++){
            int curr = nums[i];
            
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            
            // if (!set.contains(curr)) {
            //     set.add(curr);
            // } else continue;
            
            tempList.add(curr);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}



/************************************************************
/  94. Binary Tree Inorder Traversal
************************************************************/
// Recursive
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        helper(root, result);
        return result;
    }
    
    void helper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        dfs(root.left, result);
        result.add(root.val);
        dfs(root.right, result);
    }
}

// Iteratively

//https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
// Algorithm
1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            if (cur != null) {  // can replaced with a while condition and remove CONTINUE
                stack.add(cur);
                cur = cur.left;
                continue;
            }
            TreeNode node = stack.pop();
            result.add(node.val);
            cur = node.right;
        }
        return result;
    }
}

//My solution, should not use an extra hashSet
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        Stack < TreeNode > stack = new Stack < > ();
        Set <TreeNode> set = new HashSet<> ();
        stack.add(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (!set.contains(node)) {
                if (node.right != null) stack.add(node.right);
                stack.add(node);
                if (node.left != null) stack.add(node.left);
                set.add(node);
            } else {
                result.add(node.val);
            }
        }
        return result;
    }
}

/************************************************************
/  98. Validate Binary Search Tree
************************************************************/
// BFS
Three stacks and keep polling and adding // Bad solution

// Smart
public boolean isValidBST(TreeNode root) {
   if (root == null) return true;
   Stack<TreeNode> stack = new Stack<>();
   TreeNode cur = root;
   TreeNode pre = null;
   while (cur != null || !stack.isEmpty()) {
      while (cur != null) {
         stack.push(cur);
         cur = cur.left;
      }
      cur = stack.pop();
      if(pre != null && cur.val <= pre.val) return false;
      pre = cur;
      cur = cur.right;
   }
   return true;
}


// DFS 
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean helper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        
        return helper(root.left, min, root.val) 
            &&  helper(root.right, root.val, max);
    }
}


/************************************************************
/  100. Same Tree
************************************************************/
public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return true;
    } else if (p == null || q == null) {
        return false;
    }
    if (p.val != q.val) {
        return false;
    }   
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}

// Iteration
public boolean isSameTree(TreeNode p, TreeNode q) {
    Queue<TreeNode> queue = new LinkedList<>();
    if (p == null && q == null)
        return true;
    else if (p == null || q == null)
        return false;
    
    if (p != null && q != null) {
        queue.offer(p);
        queue.offer(q);
    }
    
    while (!queue.isEmpty()) {
        TreeNode first = queue.poll();
        TreeNode second = queue.poll();
        
        if (first == null && second == null)
            continue;
        if (first == null || second == null)
            return false;
        if (first.val != second.val)
            return false;
        
        queue.offer(first.left);
        queue.offer(second.left);
        queue.offer(first.right);
        queue.offer(second.right);
    }
    return true;
}

/************************************************************
/  101. Symmetric Tree
************************************************************/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
             return true;
        }
        return helper(root.left, root.right);
    }
    
    boolean helper(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null || n1.val != n2.val) {
            return false;
        }
        
        return helper(n1.left, n2.right) && helper(n1.right, n2.left);
    }
}


/************************************************************
/  124. Binary Tree Maximum Path Sum
************************************************************/
class Solution {
  int max_sum = Integer.MIN_VALUE;

  public int max_gain(TreeNode node) {
    if (node == null) return 0;

    // max sum on the left and right sub-trees of node
    int left_gain = Math.max(max_gain(node.left), 0);
    int right_gain = Math.max(max_gain(node.right), 0);

    // the price to start a new path where `node` is a highest node
    int price_newpath = node.val + left_gain + right_gain;

    // update max_sum if it's better to start a new path
    max_sum = Math.max(max_sum, price_newpath);

    // for recursion :
    // return the max gain if continue the same path
    return node.val + Math.max(left_gain, right_gain);
  }

  public int maxPathSum(TreeNode root) {
    max_gain(root);
    return max_sum;
  }
}

Time = O(n)
Space = O(log(n)) if it is a balanced Binary tree



/************************************************************
/  125. Valid Palindrome
************************************************************/
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        
        return true;
    }
}



/************************************************************
/  127. Word Ladder
************************************************************/
// Clean Breath first search
public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    if(!wordList.contains(endWord)) return 0;

    Set<String> dict = new HashSet<>(wordList), vis = new HashSet<>();
    Queue<String> q = new LinkedList<>();
    q.offer(beginWord);
    int len = 1;
    while (!q.isEmpty()) {
        for (int i = q.size(); i > 0; i--) {
            String w = q.poll();
            if (w.equals(endWord)) return len;

            for (int j = 0; j < w.length(); j++) {
                char[] ch = w.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c == w.charAt(j)) continue;
                    ch[j] = c;
                    String nb = String.valueOf(ch);
                    if (dict.contains(nb) && vis.add(nb)) q.offer(nb);
                }
            }
        }
        len++;
    }
    return 0;
}


// Clean Bidirectional  Breath first search
public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    if(!wordList.contains(endWord)) return 0;
    
    Set<String> beginSet = new HashSet<String>(), endSet = new HashSet<String>();

    int len = 1;
    int strLen = beginWord.length();
    HashSet<String> visited = new HashSet<String>();

    beginSet.add(beginWord);
    endSet.add(endWord);
    while (!beginSet.isEmpty() && !endSet.isEmpty()) {
        if (beginSet.size() > endSet.size()) {
            Set<String> set = beginSet;
            beginSet = endSet;
            endSet = set;
        }

        Set<String> temp = new HashSet<String>();
        for (String word : beginSet) {
            char[] chs = word.toCharArray();

            for (int i = 0; i < chs.length; i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char old = chs[i];
                    chs[i] = c;
                    String target = String.valueOf(chs);

                    if (endSet.contains(target)) {
                        return len + 1;
                    }

                    if (!visited.contains(target) && wordList.contains(target)) {
                        temp.add(target);
                        visited.add(target);
                    }
                    chs[i] = old;
                }
            }
        }

        beginSet = temp;
        len++;
    }

    return 0;
}


// Leetcode answer - BFS
class Solution {
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {

    // Since all words are of same length.
    int L = beginWord.length();

    // Dictionary to hold combination of words that can be formed,
    // from any given word. By changing one letter at a time.
    HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();

    wordList.forEach(
        word -> {
          for (int i = 0; i < L; i++) {
            // Key is the generic word
            // Value is a list of words which have the same intermediate generic word.
            String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
            ArrayList<String> transformations =
                allComboDict.getOrDefault(newWord, new ArrayList<String>());
            transformations.add(word);
            allComboDict.put(newWord, transformations);
          }
        });

    // Queue for BFS
    Queue<Pair<String, Integer>> Q = new LinkedList<Pair<String, Integer>>();
    Q.add(new Pair(beginWord, 1));

    // Visited to make sure we don't repeat processing same word.
    HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
    visited.put(beginWord, true);

    while (!Q.isEmpty()) {
      Pair<String, Integer> node = Q.remove();
      String word = node.getKey();
      int level = node.getValue();
      for (int i = 0; i < L; i++) {

        // Intermediate words for current word
        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

        // Next states are all the words which share the same intermediate state.
        for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
          // If at any point if we find what we are looking for
          // i.e. the end word - we can return with the answer.
          if (adjacentWord.equals(endWord)) {
            return level + 1;
          }
          // Otherwise, add it to the BFS Queue. Also mark it visited
          if (!visited.containsKey(adjacentWord)) {
            visited.put(adjacentWord, true);
            Q.add(new Pair(adjacentWord, level + 1));
          }
        }
      }
    }

    return 0;
  }
}


// Leetcode answer - Bidirectional BFS
class Solution {

  private int L;
  private HashMap<String, ArrayList<String>> allComboDict;

  Solution() {
    this.L = 0;

    // Dictionary to hold combination of words that can be formed,
    // from any given word. By changing one letter at a time.
    this.allComboDict = new HashMap<String, ArrayList<String>>();
  }

  private int visitWordNode(
      Queue<Pair<String, Integer>> Q,
      HashMap<String, Integer> visited,
      HashMap<String, Integer> othersVisited) {
    Pair<String, Integer> node = Q.remove();
    String word = node.getKey();
    int level = node.getValue();

    for (int i = 0; i < this.L; i++) {

      // Intermediate words for current word
      String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

      // Next states are all the words which share the same intermediate state.
      for (String adjacentWord : this.allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
        // If at any point if we find what we are looking for
        // i.e. the end word - we can return with the answer.
        if (othersVisited.containsKey(adjacentWord)) {
          return level + othersVisited.get(adjacentWord);
        }

        if (!visited.containsKey(adjacentWord)) {

          // Save the level as the value of the dictionary, to save number of hops.
          visited.put(adjacentWord, level + 1);
          Q.add(new Pair(adjacentWord, level + 1));
        }
      }
    }
    return -1;
  }

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {

    if (!wordList.contains(endWord)) {
      return 0;
    }

    // Since all words are of same length.
    this.L = beginWord.length();

    wordList.forEach(
        word -> {
          for (int i = 0; i < L; i++) {
            // Key is the generic word
            // Value is a list of words which have the same intermediate generic word.
            String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
            ArrayList<String> transformations =
                this.allComboDict.getOrDefault(newWord, new ArrayList<String>());
            transformations.add(word);
            this.allComboDict.put(newWord, transformations);
          }
        });

    // Queues for birdirectional BFS
    // BFS starting from beginWord
    Queue<Pair<String, Integer>> Q_begin = new LinkedList<Pair<String, Integer>>();
    // BFS starting from endWord
    Queue<Pair<String, Integer>> Q_end = new LinkedList<Pair<String, Integer>>();
    Q_begin.add(new Pair(beginWord, 1));
    Q_end.add(new Pair(endWord, 1));

    // Visited to make sure we don't repeat processing same word.
    HashMap<String, Integer> visitedBegin = new HashMap<String, Integer>();
    HashMap<String, Integer> visitedEnd = new HashMap<String, Integer>();
    visitedBegin.put(beginWord, 1);
    visitedEnd.put(endWord, 1);

    while (!Q_begin.isEmpty() && !Q_end.isEmpty()) {

      // One hop from begin word
      int ans = visitWordNode(Q_begin, visitedBegin, visitedEnd);
      if (ans > -1) {
        return ans;
      }

      // One hop from end word
      ans = visitWordNode(Q_end, visitedEnd, visitedBegin);
      if (ans > -1) {
        return ans;
      }
    }

    return 0;
  }
}


Time = O(length of word * size of dictionary) = O(length of word * # of node in the graph)
Time: O(V * len(word)), space: O(V) where V is the size of the dictionary. 
Because time is O(V+E) and E = V*len(word). 

/************************************************************
/  128. Longest Consecutive Sequence
************************************************************/
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

Time = O(n) because the while-loop can only run N times at most



class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> ranges = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (ranges.containsKey(num)) continue;
            
            // 1.Find left and right num
            int left = ranges.getOrDefault(num - 1, 0);
            int right = ranges.getOrDefault(num + 1, 0);
            int sum = left + right + 1;
            max = Math.max(max, sum);
            
            // 2.Union by only updating boundary
            // Leave middle k-v dirty to avoid cascading update
            if (left > 0) ranges.put(num - left, sum);
            if (right > 0) ranges.put(num + right, sum);
            ranges.put(num, sum); // Keep each number in Map to de-duplicate
        }
        return max;
    }
}

/************************************************************
/  133. Clone Graph
************************************************************/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/

// DFS
class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Integer,Node> map = new HashMap<Integer,Node>();
        return dfs(node,map);
    }
    private Node dfs(Node node, HashMap<Integer,Node> map) {
        if (node == null) return null;
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        } else {
            Node clone = new Node(node.val, new ArrayList<>());
            map.put(node.val, clone);
            for (Node n : node.neighbors) {
                clone.neighbors.add(dfs(n, map));
            }
            return clone;
        }
    }
}


// BFS
Algorithm:
Maintain a hashmap for node and clonedNode, this map serves as a visitedSet as well
Use a queue (LinkedList) for BFS
When expanding a node (queue.pop()), iterating all its neighbors and check if they are visited/in the map
if not, add it to the map and push it to the queue 
Then, always add this neighbor node to the neighborList of the current cloneNode

public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label); //new node for return
        HashMap<Integer, UndirectedGraphNode> map = new HashMap(); //store visited nodes
        
        map.put(newNode.label, newNode); //add first node to HashMap
        
        LinkedList<UndirectedGraphNode> queue = new LinkedList(); //to store **original** nodes need to be visited
        queue.add(node); //add first **original** node to queue
        
        while (!queue.isEmpty()) { //if more nodes need to be visited
            UndirectedGraphNode n = queue.pop(); //search first node in the queue
            for (UndirectedGraphNode neighbor : n.neighbors) {
                if (!map.containsKey(neighbor.label)) { //add to map and queue if this node hasn't been searched before
                    map.put(neighbor.label, new UndirectedGraphNode(neighbor.label));
                    queue.add(neighbor);
                }
                map.get(n.label).neighbors.add(map.get(neighbor.label)); //add neighbor to new created nodes
            }
        }
        
        return newNode;
    }
}


/************************************************************
/  136. Single Number
************************************************************/
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans ^= i;
        }
        return ans;
    }
}


/************************************************************
/  150. Evaluate Reverse Polish Notation
************************************************************/
public int evalRPN(String[] tokens) {
    int a,b;
	Stack<Integer> S = new Stack<Integer>();
	for (String s : tokens) {
		if(s.equals("+")) {
			S.add(S.pop()+S.pop());
		}
		else if(s.equals("/")) {
			b = S.pop();
			a = S.pop();
			S.add(a / b);
		}
		else if(s.equals("*")) {
			S.add(S.pop() * S.pop());
		}
		else if(s.equals("-")) {
			b = S.pop();
			a = S.pop();
			S.add(a - b);
		}
		else {
			S.add(Integer.parseInt(s));
		}
	}	
	return S.pop();
}



/************************************************************
/  155. Min Stack
************************************************************/
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


/************************************************************
/  157. Read N Characters Given Read4
************************************************************/
/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */
public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
      boolean eof = false;      // end of file flag
      int total = 0;            // total bytes have read
      char[] tmp = new char[4]; // temp buffer

      while (!eof && total < n) {
        int count = read4(tmp);

        // check if it's the end of the file
        eof = count < 4;

        // get the actual count
        count = Math.min(count, n - total);

        // copy from temp buffer to buf
        for (int i = 0; i < count; i++) 
          buf[total++] = tmp[i];
      }
      return total;
    }
}




/************************************************************
/  158. Read N Characters Given Read4 II - Call multiple times
************************************************************/
/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf); 
 */
public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    private int buffPtr = 0;        // buffer pointer
    private int buffCnt = 0;        // buffer counter
    private char[] buff = new char[4];
    public int read(char[] buf, int n) {
        int ptr = 0;                // current pointer
        while (ptr < n) {
            //  Call read4 when used up the previous response
            if (buffPtr == 0) {
                buffCnt = read4(buff);
            }
            
            // Check if it is the end
            if (buffCnt == 0) break;
            
            // Copy result
            while (ptr < n && buffPtr < buffCnt) {
                buf[ptr++] = buff[buffPtr++];
            }
            
            // Reset pointer to ZERO when reached to the count
            if (buffPtr == buffCnt) buffPtr = 0;
        }
        return ptr;
    }
}



/************************************************************
/  159. Longest Substring with At Most Two Distinct Characters
************************************************************/
// Sliding Window
class Solution {
  public int lengthOfLongestSubstringTwoDistinct(String s) {
    int n = s.length();
    if (n < 3) return n;

    // sliding window left and right pointers
    int left = 0;
    int right = 0;
    // hashmap character -> its rightmost position 
    // in the sliding window
    HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

    int max_len = 2;

    while (right < n) {
      // slidewindow contains less than 3 characters
      if (hashmap.size() < 3)
        hashmap.put(s.charAt(right), right++);

      // slidewindow contains 3 characters
      if (hashmap.size() == 3) {
        // delete the leftmost character
        int del_idx = Collections.min(hashmap.values());
        hashmap.remove(s.charAt(del_idx));
        // move left pointer of the slidewindow
        left = del_idx + 1;
      }

      max_len = Math.max(max_len, right - left);
    }
    return max_len;
  }
}



/************************************************************
/ 163. Missing Ranges
************************************************************/
// Three steps
0. Create a helper function
1. Fix the begining
2. Check the diff of i + 1 and i.  Make sure to check for duplication
3. Check the last

class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0){
            result.add(formRange(lower,upper));
            return result;
        }

        // 1st step
        if (nums[0] > lower){
            result.add(formRange(lower,nums[0]-1));
        }

        // 2nd step
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i+1] != nums[i] && nums[i+1] > nums[i] + 1) {
                result.add(formRange(nums[i]+1, nums[i+1]-1));
            }
        }

       // 3rd step
        if (nums[nums.length-1] < upper){
            result.add(formRange(nums[nums.length-1]+1, upper));
        }
        return result;
    }
    
    public String formRange(int low, int high){
        return low == high ? String.valueOf(low) : (low + "->" + high);
    }
}


/************************************************************
/ 169. Majority Element
************************************************************/
// Voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int counter = 0;
        for (int i : nums) {
            if (num == i) {
                counter++;
            } else if (counter > 0) {
                counter--;
            } else {
                num = i;
                counter = 1;
            }
        }
        return num;
    }
}

// Divide and Conquer
// Good practice
class Solution {
    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi-lo)/2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length-1);
    }
}

/************************************************************
/ 173. Binary Search Tree Iterator
************************************************************/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        this._leftmostInorder(root);
    }

    private void _leftmostInorder(TreeNode root) {
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }
    
    public int next() {
        // Get the next smallest element
        TreeNode topmostNode = this.stack.pop();

        // If the node has a right child, call the 
        // helper function for the right child
        if (topmostNode.right != null) {        // Redundan check
            this._leftmostInorder(topmostNode.right);
        }

        return topmostNode.val;
    }

    public boolean hasNext() {
        return this.stack.size() > 0;
    }
}


/************************************************************
/  198. House Robber
************************************************************/
// Optimum DP solution
class Solution {
    /* the order is: prev2, prev1, num  */
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}

// Others

// Recursive (top-down)
// rob(i) = Math.max( rob(i - 2) + currentHouseValue, rob(i - 1) )
public int rob(int[] nums) {
    return rob(nums, nums.length - 1);
}
private int rob(int[] nums, int i) {
    if (i < 0) {
        return 0;
    }
    return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
}

// Recursive + memo (top-down).
int[] memo;
public int rob(int[] nums) {
    memo = new int[nums.length + 1];
    Arrays.fill(memo, -1);
    return rob(nums, nums.length - 1);
}

private int rob(int[] nums, int i) {
    if (i < 0) {
        return 0;
    }
    if (memo[i] >= 0) {
        return memo[i];
    }
    int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    memo[i] = result;
    return result;
}


// Iterative + memo (bottom-up)
public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    int[] memo = new int[nums.length + 1];
    memo[0] = 0;
    memo[1] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        int val = nums[i];
        memo[i+1] = Math.max(memo[i], memo[i-1] + val);
    }
    return memo[nums.length];
}

/************************************************************
/  199. Binary Tree Right Side View
************************************************************/
// DFS
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.val);
        }
        
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
        
    }
}

// BFS
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        if (root == null) return r;
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.offer(root);
        TreeNode prev, cur;
        int size = 0;
        
        while (!dq.isEmpty()) {
            size = dq.size();
            prev = null;
            for (int i = 0; i < size; ++i) {
                cur = dq.poll();
                if (cur.left != null) dq.offer(cur.left);
                if (cur.right != null) dq.offer(cur.right);
                prev = cur;
            }
            r.add(prev.val);
        }
        return r;
    }
}

Time = O(n), Space = O(logn) if balanced


/************************************************************
/  200. Number of Islands
************************************************************/
// DFS
public class Solution {

private int n;
private int m;

public int numIslands(char[][] grid) {
    int count = 0;
    n = grid.length;
    if (n == 0) return 0;
    m = grid[0].length;
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++)
            if (grid[i][j] == '1') {
                DFSMarking(grid, i, j);
                ++count;
            }
    }    
    return count;
}

    private void DFSMarking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1);
    }
}


https://leetcode.com/problems/number-of-islands/discuss/56354/1D-Union-Find-Java-solution-easily-generalized-to-other-problems
// Union set (Disjoint-set)
class UnionFind {
        int[] father;  
        int m, n;
        int count = 0;
        UnionFind(char[][] grid) {  
            m = grid.length;  
            n = grid[0].length;  
            father = new int[m*n];  
            for (int i = 0; i < m; i++) {  
                for (int j = 0; j < n; j++) {  
                    if (grid[i][j] == '1') {
                        int id = i * n + j;
                        father[id] = id;
                        count++;
                    }
                }  
            }  
        }
        public void union(int node1, int node2) {  
            int find1 = find(node1);
            int find2 = find(node2);
            if(find1 != find2) {
                father[find1] = find2;
                count--;
            }
        }
        public int find (int node) {  
            if (father[node] == node) {  
                return node;
            }
            father[node] = find(father[node]);  
            return father[node];
        }
    }


 int[][] distance = {{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {  
        if (grid == null || grid.length == 0 || grid[0].length == 0)  {
            return 0;  
        }
        UnionFind uf = new UnionFind(grid);  
        int rows = grid.length;  
        int cols = grid[0].length;  
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                if (grid[i][j] == '1') {  
                    for (int[] d : distance) {
                        int x = i + d[0];
                        int y = j + d[1];
                        if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == '1') {  
                            int id1 = i*cols+j;
                            int id2 = x*cols+y;
                            uf.union(id1, id2);  
                        }  
                    }  
                }  
            }  
        }  
        return uf.count;  
    }



/************************************************************
/  202. Happy Number
************************************************************/
// Two pointers
class Solution {
    int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n > 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if(fast == 1) return true;
        } while(slow != fast);
         return false;
    }
}

Time = should be O(2^n)
// Average solution
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;

        }
        return false;
    }
}



/************************************************************
/  205. Isomorphic Strings
************************************************************/
class Solution {
    public boolean isIsomorphic (String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
};




/************************************************************
/  206. Reverse Linked List
************************************************************/
// Recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head);
    }
    
    public ListNode helper(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode nextNode = head.next;
        ListNode newHead = helper(head.next);
        
        nextNode.next = head;
        head.next = null;
        
        return newHead;
    }
}


// Iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head);
    }
    
    public ListNode helper(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode preNode = null;
        ListNode nextHead = null;
        ListNode curNode = head;
        
        while (curNode != null) {
            nextHead = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextHead;
        }
        
        return preNode;
    }
}



/************************************************************
/  208. Implement Trie (Prefix Tree)
************************************************************/
class TrieNode {
    public boolean isWord; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
}

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode ws = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(ws.children[c - 'a'] == null){
                ws.children[c - 'a'] = new TrieNode();
            }
            ws = ws.children[c - 'a'];
        }
        ws.isWord = true;
    }

    public boolean search(String word) {
        TrieNode ws = root; 
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(ws.children[c - 'a'] == null) return false;
            ws = ws.children[c - 'a'];
        }
        return ws.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode ws = root; 
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            if(ws.children[c - 'a'] == null) return false;
            ws = ws.children[c - 'a'];
        }
        return true;
    }
}


/************************************************************
/  213. House Robber II
************************************************************/
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        return Math.max(helper(nums, 0, n - 2),
                       helper(nums, 1, n - 1));
    }
    
    int helper(int[] nums, int lo, int hi) {
        int prev1 = 0;
        int prev2 = 0;
        for (int i = lo; i <= hi; i++) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = tmp;
        }
        
        return prev1;
    }
}


/************************************************************
/  221. Maximal Square
************************************************************/
// DP with 2d array
public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int rows = matrix.length, cols = matrix[0].length;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxsqlen = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        return maxsqlen * maxsqlen;
    }
}


// Better DP with 1d array
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[] dp = new int[cols + 1];
        int maxsqlen = 0, prev = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int temp = dp[j];
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return maxsqlen * maxsqlen;
    }
}



/************************************************************
/  222. Count Complete Tree Nodes
************************************************************/
// KeyPoint: how to find an item in a BST
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  // Return tree depth in O(d) time.
  public int computeDepth(TreeNode node) {
    int d = 0;
    while (node.left != null) {
      node = node.left;
      ++d;
    }
    return d;
  }

  // Last level nodes are enumerated from 0 to 2**d - 1 (left -> right).
  // Return True if last level node idx exists. 
  // Binary search with O(d) complexity.
  public boolean exists(int idx, int d, TreeNode node) {
    int left = 0, right = (int)Math.pow(2, d) - 1;
    int pivot;
    for(int i = 0; i < d; ++i) {
      pivot = left + (right - left) / 2;
      if (idx <= pivot) {
        node = node.left;
        right = pivot;
      }
      else {
        node = node.right;
        left = pivot + 1;
      }
    }
    return node != null;
  }

  public int countNodes(TreeNode root) {
    // if the tree is empty
    if (root == null) return 0;

    int d = computeDepth(root);
    // if the tree contains 1 node
    if (d == 0) return 1;

    // Last level nodes are enumerated from 0 to 2**d - 1 (left -> right).
    // Perform binary search to check how many nodes exist.
    int left = 1, right = (int)Math.pow(2, d) - 1;
    int pivot;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (exists(pivot, d, root)) left = pivot + 1;
      else right = pivot - 1;
    }

    // The tree contains 2**d - 1 nodes on the first (d - 1) levels
    // and left nodes on the last level.
    return (int)Math.pow(2, d) - 1 + left;
  }
}



/************************************************************
/  230. Kth Smallest Element in a BST
************************************************************/
class Solution {
  public int kthSmallest(TreeNode root, int k) {
    LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

    while (true) {
      while (root != null) {
        stack.add(root);
        root = root.left;
      }
      root = stack.removeLast();
      if (--k == 0) return root.val;
      root = root.right;
    }
  }
}


// Follow up
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? 
How would you optimize the kthSmallest routine?

A index system using LinkedList, update the list when insert/delete item.
Time = O(height) for insert/delete, O(k) for iterating the list and get kth

My other solution: use a max heap of size k, and a min heap



/************************************************************
/  234. Palindrome Linked List
************************************************************/
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}


/************************************************************
/  239. Sliding Window Maximum
************************************************************/
// Two pointer
// Store index to a deque
// 1. Delete the first item if it is out of range
// 2. Remove items from the tail if it is less than the current value
// 3. Add the item from the tail
// 4. Update result
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        int[] result = new int[n - k + 1];
        LinkedList<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i - k + 1 >= 0) {
                result[i - k + 1] = nums[dq.peek()];
            }
        }
        return result;
    }
}

// DP
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;
        
        int[] max_left = new int[n];
        int[] max_right = new int[n];

        max_left[0] = nums[0];
        max_right[nums.length - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            max_left[i] = (i % k == 0) ? nums[i] : Math.max(max_left[i - 1], nums[i]);

            int j = nums.length - i - 1;
            max_right[j] = ((j + 1) % k == 0) ? nums[j] : Math.max(max_right[j + 1], nums[j]);
        }

        int[] sliding_max = new int[n - k + 1];
        for (int i = 0; i + k <= n ; i++) {
            sliding_max[i] = Math.max(max_right[i], max_left[i + k - 1]);
        }

        return sliding_max;
    }
}



/************************************************************
/  246. Strobogrammatic Number
************************************************************/
public boolean isStrobogrammatic(String num) {
    for (int i=0, j=num.length()-1; i <= j; i++, j--)
        if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
            return false;
    return true;
}


// Same
public boolean isStrobogrammatic(String num) {
    int i=0, j=num.length()-1;
    while (i <= j) {
        if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
            return false;
        i++;
        j--;
    }
    return true;
}


/************************************************************
/  247. Strobogrammatic Number II
************************************************************/
// Best DFS but runing time is O(5^n)
class Solution {
    public List<String> findStrobogrammatic(int n) {
        helper(new char[n], 0, n - 1);
        return res;
    }

    List<String> res = new ArrayList<String>();

    public void helper(char[] a, int l, int r) {
        if (l > r) {
            res.add(new String(a));
            return;
        }
        if (l == r) {
            a[l] = '0'; res.add(new String(a));
            a[l] = '1'; res.add(new String(a));
            a[l] = '8'; res.add(new String(a));
            return;
        }

        if (l != 0) {
            a[l] = '0'; a[r] = '0';
            helper(a, l+1, r-1);
        }
        a[l] = '1'; a[r] = '1';
        helper(a, l+1, r-1);
        a[l] = '8'; a[r] = '8';
        helper(a, l+1, r-1);
        a[l] = '6'; a[r] = '9';
        helper(a, l+1, r-1);
        a[l] = '9'; a[r] = '6';
        helper(a, l+1, r-1);
    }
}


// Top vote ans, runing time should be O(5^n), 
// think of the increase of ouput size
public List<String> findStrobogrammatic(int n) {
    return helper(n, n);
}

List<String> helper(int n, int m) {
    if (n == 0) return new ArrayList<String>(Arrays.asList(""));
    if (n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));
    
    List<String> list = helper(n - 2, m);
    
    List<String> res = new ArrayList<String>();
    
    for (int i = 0; i < list.size(); i++) {
        String s = list.get(i);
        
        if (n != m) res.add("0" + s + "0");
        
        res.add("1" + s + "1");
        res.add("6" + s + "9");
        res.add("8" + s + "8");
        res.add("9" + s + "6");
    }
    
    return res;
}


// iterative 
public class Solution {
    public List<String> findStrobogrammatic(int n) {
        List<String> cur, ans;
        ans = new ArrayList<String>(
            (n & 1) == 0 
            ? Arrays.asList("") 
            : Arrays.asList("0", "1", "8"));

        // if ((n & 1) == 1) n--; // Don't need it

        if (n < 2) return ans;
        
        while (n > 1) {
            cur = ans;
            ans = new ArrayList<String>();
            for (String i : cur) {
                if (n > 3) ans.add('0' + i + '0');
                ans.add('1' + i + '1');
                ans.add('8' + i + '8');
                ans.add('6' + i + '9');
                ans.add('9' + i + '6');
            }

            n -= 2;
        }
        
        return ans;
    }
}


/************************************************************
/  248. Strobogrammatic Number III
************************************************************/
// Best
public class Solution {
    private static final char[][] PAIRS = new char[][] {
        {'0', '0'}, {'1', '1'}, {'6', '9'}, {'8', '8'}, {'9', '6'}};

    public int strobogrammaticInRange(String low, String high) {
        if (low == null || high == null || low.length() > high.length()
            || (low.length() == high.length() && low.compareTo(high) > 0)) {
            return 0;
        }
        int count = 0;
        for (int len = low.length(); len <= high.length(); len++) {
            count += dfs(low, high, new char[len], 0, len - 1);
        }
        return count;
    }

    private int dfs(String low, String high, char[] ch, int left, int right) {
        if (left > right) {
            String s = new String(ch);
            if ((ch.length == low.length() && s.compareTo(low) < 0)
                || (ch.length == high.length() && s.compareTo(high) > 0)) {
                return 0;
            } else {
                return 1;
            }
        }
        int count = 0;
        for (char[] p : PAIRS) {
            ch[left] = p[0];
            ch[right] = p[1];
            if (ch.length != 1 && ch[0] == '0') {
                continue; //don't start with 0
            }
            if (left == right && (p[0] == '6' || p[0] == '9')) {
                continue; //don't put 6/9 at the middle of string.
            }
            count += dfs(low, high, ch, left + 1, right - 1);
        }
        return count;
    }
}


// Top Vote
private static final char[][] pairs = {{'0', '0'}, {'1', '1'}, {'6', '9'}, {'8', '8'}, {'9', '6'}};

public int strobogrammaticInRange(String low, String high) {
    int[] count = {0};
    for (int len = low.length(); len <= high.length(); len++) {
        char[] c = new char[len];
        dfs(low, high, c, 0, len - 1, count);
    }
    return count[0];
}

public void dfs(String low, String high , char[] c, int left, int right, int[] count) {
    if (left > right) {
        String s = new String(c);
        if ((s.length() == low.length() && s.compareTo(low) < 0) || (s.length() == high.length() && s.compareTo(high) > 0)) {
             return; 
        }
        count[0]++;
        return;
    }
    for (char[] p : pairs) {
        c[left] = p[0];
        c[right] = p[1];
        if (c.length != 1 && c[0] == '0') { 
            continue;
         }
        if (left == right && p[0] != p[1]) {
            continue; 
        }
        dfs(low, high, c, left + 1, right - 1, count);
    }
}

/************************************************************
/  256. Paint House
************************************************************/
public class Solution {
    public int minCost(int[][] costs) {
        if(costs==null||costs.length==0){
            return 0;
        }
        for(int i=1; i<costs.length; i++){
            costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][1],costs[i-1][0]);
        }
        int n = costs.length-1;
        return Math.min(Math.min(costs[n][0], costs[n][1]), costs[n][2]);
    }
}


/************************************************************
/  265. Paint House II
************************************************************/
// Best with O(nk) time and O(1) space
public class Solution {
    public int minCostII(int[][] costs) {
        if (costs.length == 0) {
            return 0;
        }
        int min1 = 0, min2 = 0, index1 = -1;

        for (int i = 0; i < costs.length; i++) {
            int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE, idx1 = -1;

            for (int j = 0; j < costs[0].length; j++) {
                int cost = costs[i][j] + (j != index1 ? min1 : min2);

                 if (cost < m1) {           // cost < m1 < m2
                    m2 = m1; m1 = cost; idx1 = j; 

                } else if (cost < m2) {    // m1 < cost < m2
                    m2 = cost;
                }
            }

            min1 = m1; 
            min2 = m2;
            index1 = idx1;
        }
        return min1;
    }
}


// Modify input
public class Solution {
    public int minCostII(int[][] costs) {
        if (costs == null || costs.length == 0) return 0;

        int n = costs.length, k = costs[0].length;
        // min1 is the index of the 1st-smallest cost till previous house
        // min2 is the index of the 2nd-smallest cost till previous house
        int min1 = -1, min2 = -1;

        for (int i = 0; i < n; i++) {
            int last1 = min1, last2 = min2;
            min1 = -1; min2 = -1;

            for (int j = 0; j < k; j++) {
                if (j != last1) {
                    // current color j is different to last min1
                    costs[i][j] += last1 < 0 ? 0 : costs[i - 1][last1];
                } else {
                    costs[i][j] += last2 < 0 ? 0 : costs[i - 1][last2];
                }

                // find the indices of 1st and 2nd smallest cost of painting current house i
                if (min1 < 0 || costs[i][j] < costs[i][min1]) {
                    min2 = min1; min1 = j;
                } else if (min2 < 0 || costs[i][j] < costs[i][min2]) {
                    min2 = j;
                }
            }
        }

        return costs[n - 1][min1];
    }
}

/************************************************************
/  269. Alien Dictionary
************************************************************/
public String alienOrder(String[] words) {
    Map<Character, Set<Character>> map=new HashMap<Character, Set<Character>>();
    Map<Character, Integer> degree=new HashMap<Character, Integer>();
    String result="";
    if(words==null || words.length==0) return result;
    for(String s: words){
        for(char c: s.toCharArray()){
            degree.put(c,0);
        }
    }
    for(int i=0; i<words.length-1; i++){
        String cur=words[i];
        String next=words[i+1];
        int length=Math.min(cur.length(), next.length());
        for(int j=0; j<length; j++){
            char c1=cur.charAt(j);
            char c2=next.charAt(j);
            if(c1!=c2){
                Set<Character> set=new HashSet<Character>();
                if(map.containsKey(c1)) set=map.get(c1);
                if(!set.contains(c2)){
                    set.add(c2);
                    map.put(c1, set);
                    degree.put(c2, degree.get(c2)+1);
                }
                break;
            }
        }
    }
    Queue<Character> q=new LinkedList<Character>();
    for(char c: degree.keySet()){
        if(degree.get(c)==0) q.add(c);
    }
    while(!q.isEmpty()){
        char c=q.remove();
        result+=c;
        if(map.containsKey(c)){
            for(char c2: map.get(c)){
                degree.put(c2,degree.get(c2)-1);
                if(degree.get(c2)==0) q.add(c2);
            }
        }
    }
    if(result.length()!=degree.size()) return "";
    return result;
}


/************************************************************
/  276. Paint Fence
************************************************************/
class Solution {
    public int numWays(int n, int k) {
        if(n == 0) return 0;
        else if(n == 1) return k;
        int diffColorCounts = k*(k-1);
        int sameColorCounts = k;
        for(int i=2; i<n; i++) {
            int temp = diffColorCounts;
            diffColorCounts = (diffColorCounts + sameColorCounts) * (k-1);
            sameColorCounts = temp;
        }
        return diffColorCounts + sameColorCounts;
    }
}



/************************************************************
/  278. First Bad Version
************************************************************/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right - 1) {
            int mid = left + (right - left)/2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1; // mid is also OK, +1 is optional
            }
        }
        
        if (isBadVersion(left)) {
            return left;
        } else {
            return right;
        }
    }
}


/************************************************************
/  279. Perfect Squares
************************************************************/
// DP
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            int sqrt = (int)Math.sqrt(i);

            // If the number is already a perfect square,
            // then dp[number] can be 1 directly. This is
            // just a optimization for this DP solution.
            if (sqrt * sqrt == i) {
                dp[i] = 1;
                continue;                
            }

            // To get the value of dp[n], we should choose the min
            // value from:
            //     dp[n - 1] + 1,
            //     dp[n - 4] + 1,
            //     dp[n - 9] + 1,
            //     dp[n - 16] + 1
            //     and so on...
            for (int j = 1; j <= sqrt; j++) { // j <= sqrt is same as j*j <= i
                int dif = i - j * j;
                dp[i] = Math.min(dp[i], (dp[dif] + 1));
            }
        }

        return dp[n];
    }
}

Time should be O(n*logn)

// BFS
class Solution {
    public int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(0);
        visited.add(0);
        int depth = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            depth++;
            while(size-- > 0) {
                int u = q.poll();
                for(int i = 1; i*i <= n; i++) {
                    int v = u+i*i;
                    if(v == n) {
                        return depth;
                    }
                    if(v > n) {
                        break;
                    }
                    if(!visited.contains(v)) {
                        q.offer(v);
                        visited.add(v);
                    }
                }
            }
        }
        return depth;  // don't not matter, never reach to this step.
    }
}

// BFS Debug with println
class Solution {
    public int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(0);
        visited.add(0);
        int depth = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            depth++;
            System.out.println("Level: " + depth);
            while(size-- > 0) {
                int u = q.poll();
                System.out.println("poll: " + u);
                System.out.println("v: ");
                for(int i = 1; i*i <= n; i++) {
                    int v = u+i*i;
                    System.out.print(v + " ,");
                    if(v == n) {
                        return depth;
                    }
                    if(v > n) {
                        break;
                    }
                    if(!visited.contains(v)) {
                        q.offer(v);
                        visited.add(v);
                    }
                }
                System.out.println("");
            }
            System.out.println(" ");
            System.out.println(" ");
        }
        return depth;  // don't not matter, never reach to this step.
    }
}

Time should be O((brenching factor)^ sizeOfInput) = O((log n)^n), 
but according to four-square theorem, there should not more than 4 levels

- The depth of the BFS is at most 4 by the four-square theorem 
(every natural number can be represented as the sum of four integer squares)

- At every dept there will be at most sqrt(n) children, 
because there is at most sqrt(n) perfect squares that are smaller than n

Therefore, (sqrt(n))^4 = n²



// BFS Debug log
// input n = 3

Level: 1
poll: 0
v: 
1 ,4 ,9 ,
 
 
Level: 2
poll: 1
v: 
2 ,5 ,10 ,
poll: 4
v: 
5 ,8 ,13 ,
poll: 9
v: 
10 ,13 ,
 
 
Level: 3
poll: 2
v: 
3 ,6 ,11 ,
poll: 5
v: 
6 ,9 ,14 ,
poll: 10
v: 
11 ,14 ,
poll: 8
v: 
9 ,12 ,3


// input n = 124

Level: 1
poll: 0
v: 
1 ,4 ,9 ,16 ,25 ,36 ,49 ,64 ,81 ,100 ,121 ,
 
 
Level: 2
poll: 1
v: 
2 ,5 ,10 ,17 ,26 ,37 ,50 ,65 ,82 ,101 ,122 ,
poll: 4
v: 
5 ,8 ,13 ,20 ,29 ,40 ,53 ,68 ,85 ,104 ,125 ,
poll: 9
v: 
10 ,13 ,18 ,25 ,34 ,45 ,58 ,73 ,90 ,109 ,130 ,
poll: 16
v: 
17 ,20 ,25 ,32 ,41 ,52 ,65 ,80 ,97 ,116 ,137 ,
poll: 25
v: 
26 ,29 ,34 ,41 ,50 ,61 ,74 ,89 ,106 ,125 ,
poll: 36
v: 
37 ,40 ,45 ,52 ,61 ,72 ,85 ,100 ,117 ,136 ,
poll: 49
v: 
50 ,53 ,58 ,65 ,74 ,85 ,98 ,113 ,130 ,
poll: 64
v: 
65 ,68 ,73 ,80 ,89 ,100 ,113 ,128 ,
poll: 81
v: 
82 ,85 ,90 ,97 ,106 ,117 ,130 ,
poll: 100
v: 
101 ,104 ,109 ,116 ,125 ,
poll: 121
v: 
122 ,125

... more


/************************************************************
/  282. Expression Add Operators
************************************************************/
class Solution {
    /**
 * When we use dfs to do this question, the most tricky part is that how to deal with multiplication. For every 
 * addition and subtraction, we just directly adding or subtracting the new number. However, for multiplication, 
 * we should multiply current number and previous number firstly, and then add previous previous number.
 * So we can use a variable preNum to record every previous number in each recursion step. If current recursive 
 * call is trying multiplication, we should use previous calculation value subtract previous number, and then 
 * adding multiplication result between previous number and current number.
 * */
    public List<String> addOperators(String num, int target) {
        if (num.length() == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        dfs(result, num, target, "", 0, 0, 0);
        return result;
    }

    /**
     * @param result: result list to store valid expressions
     * @param num: input num candidates
     * @param target: input target number
     * @param expr: current expression string
     * @param calcVal: current calculation value
     * @param preNum: previous number, in order to multiply current number if we want to put * between preNum and curNum
     * @param pos: current index in the input num array
     * */
    public void dfs(List<String> result, String num, int target, String expr, long calcVal, long preNum, int pos) {
        if (pos == num.length()) {
            if (calcVal == target) {
                result.add(expr);
            }
            return;
        }

        // start from first index of current position in num string, try all possible length of nums
        for (int i = pos; i < num.length(); i++) {
            // corner case: if current position is 0, we can only use it as a single digit number, should be 0
            // if it is not a single digit number with leading 0, it should be considered as an invalid number 
            if (i != pos && num.charAt(pos) == '0') {
                break;
            }
            long curNum = Long.parseLong(num.substring(pos, i + 1));

            // position 0 should be considered individually, since it does not have any operand character before curNum
            if (pos == 0) {
                dfs(result, num, target, expr + curNum, curNum, curNum, i + 1);
            }
            else {
                dfs(result, num, target, expr + "+" + curNum, calcVal + curNum, curNum, i + 1);
                dfs(result, num, target, expr + "-" + curNum, calcVal - curNum, -curNum, i + 1);
                // trick part: to calculate multiplication, we should subtract previous number, and then add current
                // multiplication result to the subtraction result 
                dfs(result, num, target, expr + "*" + curNum, calcVal - preNum + preNum * curNum, preNum * curNum, i + 1);
            }
        }
    }
}

Time = O(4^n)


/************************************************************
/  286. Walls and Gates
************************************************************/
// Better
public class Solution {
    public void wallsAndGates(int[][] rooms) {
        LinkedList<int[]> list = new LinkedList<int[]>();
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) 
                    list.add(new int[]{i,j});
            }
        }
        int[][] diff = new int[][]{{-1,0,1,0},{0,1,0,-1}};
        while(!list.isEmpty()) {
            int[] pop = list.remove();
            for(int i = 0; i < diff[0].length; i++) {
                int newR = pop[0] + diff[0][i];
                int newC = pop[1] + diff[1][i];
                if(newR < 0 || newR >= rooms.length || newC < 0 || newC >= rooms[0].length || 
                    rooms[newR][newC] != Integer.MAX_VALUE) 
                    continue;
                rooms[newR][newC] = rooms[pop[0]][pop[1]] + 1;
                list.add(new int[]{newR, newC});
            }
        }
    }
}


// No so good
private static final int EMPTY = Integer.MAX_VALUE;
private static final int GATE = 0;
private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] { 1,  0},
        new int[] {-1,  0},
        new int[] { 0,  1},
        new int[] { 0, -1}
);

public void wallsAndGates(int[][] rooms) {
    int m = rooms.length;
    if (m == 0) return;
    int n = rooms[0].length;
    Queue<int[]> q = new LinkedList<>();
    for (int row = 0; row < m; row++) {
        for (int col = 0; col < n; col++) {
            if (rooms[row][col] == GATE) {
                q.add(new int[] { row, col });
            }
        }
    }
    while (!q.isEmpty()) {
        int[] point = q.poll();
        int row = point[0];
        int col = point[1];
        for (int[] direction : DIRECTIONS) {
            int r = row + direction[0];
            int c = col + direction[1];

            // Use rooms[r][c] != EMPTY to check if the room is visited
            // That's why it does not need an extra array
            if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY) {
                continue;
            }

            // Changed the EMPTY value to distance which implied visited
            rooms[r][c] = rooms[row][col] + 1;
            q.add(new int[] { r, c });
        }
    }
}



/************************************************************
/  299. Bulls and Cows
************************************************************/
public String getHint(String secret, String guess) {
    int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i<secret.length(); i++) {
        int s = Character.getNumericValue(secret.charAt(i));
        int g = Character.getNumericValue(guess.charAt(i));
        if (s == g) bulls++;
        else {
            //if prev part of guess has curr digit in secret
            //then we found a pair that has same digit with different position
            if (numbers[s] < 0) cows++;

            //if prev part of secret has curr digit in guess
            //then we found a pair that has same digit with different position      
            if (numbers[g] > 0) cows++;

            numbers[s] ++;
            numbers[g] --;
        }
    }
    return bulls + "A" + cows + "B";
}



/************************************************************
/  300. Longest Increasing Subsequence
************************************************************/
public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    int len = 0;
    for (int num : nums) {
        int i = Arrays.binarySearch(dp, 0, len, num);
        if (i < 0) {
            i = -(i + 1);
        }
        dp[i] = num;
        if (i == len) {
            len++;
        }
    }
    return len;
}

Note: Arrays.binarySearch() method returns index of the search key, 
if it is contained in the array, else it returns (-(insertion point) - 1). 
The insertion point is the point at which the key would be inserted into the array: 
the index of the first element greater than the key, 
or a.length if all elements in the array are less than the specified key.

// Better
public int lengthOfLIS(int[] nums) {
    int[] tails = new int[nums.length];
    int size = 0;
    for (int x : nums) {
        int i = 0, j = size;
        while (i < j) {
            int m = (i + j) / 2;
            if (tails[m] < x)
                i = m + 1;
            else
                j = m;
        }
        tails[i] = x;  // i and j are the same
        if (i == size) ++size;
    }
    return size;
}


/************************************************************
/  315. Count of Smaller Numbers After Self
************************************************************/
// Merge Sort
class Solution {
    class Pair {
        int index;
        int val;
        public Pair(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Pair[] arr = new Pair[nums.length];
        Integer[] smaller = new Integer[nums.length];
        Arrays.fill(smaller, 0);
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new Pair(i, nums[i]);
        }
        mergeSort(arr, smaller);
        res.addAll(Arrays.asList(smaller));
        return res;
    }
    private Pair[] mergeSort(Pair[] arr, Integer[] smaller) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        Pair[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid), smaller);
        Pair[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length), smaller);

        for (int i = 0, j = 0; i < left.length || j < right.length;) {
            if (j == right.length || i < left.length && left[i].val <= right[j].val) {
                arr[i + j] = left[i];
                // j is the number of items which already moved to the arr
                smaller[left[i].index] += j;
                i++;
            } else {
                arr[i + j] = right[j];
                j++;
            }
        }
        return arr;
    }
}


/************************************************************
/  317. Shortest Distance from All Buildings
************************************************************/
class Solution {
    //count sum of distance from 0 to all building
    int[][] distance;
    //count how many building each '0' can be reached
    int[][] reach ;
    int[][] dirs=new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
    public int shortestDistance(int[][] grid) {
        if (grid == null || grid[0].length == 0) return 0;
        int m  = grid.length, n = grid[0].length;
        distance = new int[m][n];
        reach = new int[m][n];
        int buildingNum = 0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(grid[i][j]==1){
                    buildingNum++;
                    bfs(grid,i,j);
                }
            }
        }
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && reach[i][j] == buildingNum) {
                    shortest = Math.min(shortest, distance[i][j]);
                }
            }
        }
        return shortest == Integer.MAX_VALUE ? -1 : shortest;

    }

    private void bfs(int[][] grid,int x, int y){
        int m  = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[]{x,y});
        
        boolean[][] visited = new boolean[m][n];
        int level=0;
        
        while (!q.isEmpty()){
            int size=q.size();
            for (int i=0;i<size;i++){
                int[] curr=q.poll();
                int curX = curr[0];
                int curY = curr[1];
                
                distance[curX][curY] += level;
                reach[curX][curY]++;

                for (int[] dir:dirs){
                    int x1=dir[0]+curr[0];
                    int y1=dir[1]+curr[1];
                    if(x1<0||x1>=m||y1<0||y1>=n) continue;
                    if(grid[x1][y1]!=0 ||visited[x1][y1]) continue;

                    visited[x1][y1]=true;
                    q.offer(new int[]{x1,y1});
                }
            }
            level++;
        }  
    }
}

Time = O(nm), where n is # of row, and m is # of column
If the edge can be different cost, it will be digra BFS algorithm
That will be O(nmlong(nm)) because there is a PriorityQueue minHeap in the BFS

Space = O(nm)



/************************************************************
/  334. Increasing Triplet Subsequence
************************************************************/
public boolean increasingTriplet(int[] nums) {
    // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
    int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
    for (int n : nums) {
        if (n <= small) { small = n; } // update small if n is smaller than both
        else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
        else return true; // return if you find a number bigger than both
    }
    return false;
}


/************************************************************
/  336. Palindrome Pairs
************************************************************/
class Solution {
    private static class TrieNode {
        TrieNode[] next;
        int index;
        List<Integer> list;

        TrieNode() {
            next = new TrieNode[26];
            index = -1;
            list = new ArrayList<>();
        }
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();

        TrieNode root = new TrieNode();

        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            search(words, i, root, res);
        }

        return res;
    }

    private void addWord(TrieNode root, String word, int index) {
        for (int i = word.length() - 1; i >= 0; i--) {
            int j = word.charAt(i) - 'a';

            if (root.next[j] == null) {
                root.next[j] = new TrieNode();
            }

            if (isPalindrome(word, 0, i)) {
                root.list.add(index);
            }

            root = root.next[j];
        }

        root.list.add(index);
        root.index = index;
    }

    private void search(String[] words, int i, TrieNode root, List<List<Integer>> res) {
        for (int j = 0; j < words[i].length(); j++) {   
            if (root.index >= 0 && root.index != i && isPalindrome(words[i], j, words[i].length() - 1)) {
                res.add(Arrays.asList(i, root.index));
            }

            root = root.next[words[i].charAt(j) - 'a'];
            if (root == null) return;
        }

        for (int j : root.list) {
            if (i == j) continue;
            res.add(Arrays.asList(i, j));
        }
    }

    private boolean isPalindrome(String word, int i, int j) {
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--)) return false;
        }

        return true;
    }
}


/************************************************************
/  337. House Robber III
************************************************************/
// Worst solution
public int rob(TreeNode root) {
    if (root == null) return 0;
    
    int val = 0;
    
    if (root.left != null) {
        val += rob(root.left.left) + rob(root.left.right);
    }
    
    if (root.right != null) {
        val += rob(root.right.left) + rob(root.right.right);
    }
    
    return Math.max(val + root.val, rob(root.left) + rob(root.right));
}

// Improved DP solution
public int rob(TreeNode root) {
    return robSub(root, new HashMap<>());
}

private int robSub(TreeNode root, Map<TreeNode, Integer> map) {
    if (root == null) return 0;
    if (map.containsKey(root)) return map.get(root);
    
    int val = 0;
    
    if (root.left != null) {
        val += robSub(root.left.left, map) + robSub(root.left.right, map);
    }
    
    if (root.right != null) {
        val += robSub(root.right.left, map) + robSub(root.right.right, map);
    }
    
    val = Math.max(val + root.val, robSub(root.left, map) + robSub(root.right, map));
    map.put(root, val);
    
    return val;
}

Space = O(n)

// Best
class Solution {
    public int rob(TreeNode root) {
        int[] res = robSub(root);
        return Math.max(res[0], res[1]);
    }

    private int[] robSub(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = robSub(root.left);
        int[] right = robSub(root.right);
        int[] res = new int[2];

        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];

        return res;
    }
}

/************************************************************
/  340. Longest Substring with At Most K Distinct Characters
************************************************************/
// Sliding Window + Hashmap
// 1. Return 0 if the string is empty or k is equal to zero.
// 2. Set both set pointers in the beginning of the string left = 0 and right = 0 and init max substring length max_len = 1.
// 3. While right pointer is less than N:
//      3a. Add the current character s[right] in the hashmap and move right pointer to the right.
//      3b. If hashmap contains k + 1 distinct characters, remove the leftmost character from the hashmap and move the left pointer so that sliding window contains again k distinct characters only.
//      3c. Update max_len.
class Solution {
  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    int n = s.length();
    if (n*k == 0) return 0;

    // sliding window left and right pointers
    int left = 0;
    int right = 0;
    // hashmap character -> its rightmost position 
    // in the sliding window
    HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

    int max_len = 1;

    while (right < n) {
      // add new character and move right pointer
      hashmap.put(s.charAt(right), right++);

      // slidewindow contains 3 characters
      if (hashmap.size() == k + 1) {
        // delete the leftmost character
        int del_idx = Collections.min(hashmap.values()); // O(k)
        hashmap.remove(s.charAt(del_idx));
        // move left pointer of the slidewindow
        left = del_idx + 1;
      }

      max_len = Math.max(max_len, right - left);
    }
    return max_len;
  }
}

Time = O(nk), Space = O(k)


//Sliding Window + Ordered Dictionary
class Solution {
  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    int n = s.length();
    if (n*k == 0) return 0;

    // sliding window left and right pointers
    int left = 0;
    int right = 0;
    // hashmap character -> its rightmost position 
    // in the sliding window
    LinkedHashMap<Character, Integer> hashmap = new LinkedHashMap<Character, Integer>(k + 1);

    int max_len = 1;

    while (right < n) {
      Character character = s.charAt(right);
      // if character is already in the hashmap -
      // delete it, so that after insert it becomes
      // the rightmost element in the hashmap
      if (hashmap.containsKey(character))
        hashmap.remove(character);
      hashmap.put(character, right++);

      // slidewindow contains k + 1 characters
      if (hashmap.size() == k + 1) {
        // delete the leftmost character
        Map.Entry<Character, Integer> leftmost = hashmap.entrySet().iterator().next();
        hashmap.remove(leftmost.getKey());
        // move left pointer of the slidewindow
        left = leftmost.getValue() + 1;
      }

      max_len = Math.max(max_len, right - left);
    }
    return max_len;
  }
}

Time = O(n), Space = O(k)




/************************************************************
/  359. Logger Rate Limiter
************************************************************/
/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
class Logger {

    private Map<String, Integer> ok = new HashMap<>();

    /** Initialize your data structure here. */
    public Logger() {
        
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (timestamp < ok.getOrDefault(message, 0))
            return false;
        ok.put(message, timestamp + 10);
        return true;
    }
    
}

// Priority Queue
class Log {
    int timestamp;
    String message;
    public Log(int aTimestamp, String aMessage) {
        timestamp = aTimestamp;
        message = aMessage;
    }
}

public class Logger {
    PriorityQueue<Log> recentLogs;
    Set<String> recentMessages;   
    
    /** Initialize your data structure here. */
    public Logger() {
        recentLogs = new PriorityQueue<Log>(10, new Comparator<Log>() {
            public int compare(Log l1, Log l2) {
                return l1.timestamp - l2.timestamp;
            }
        });
        
        recentMessages = new HashSet<String>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        while (recentLogs.size() > 0)   {
            Log log = recentLogs.peek();
            // discard the logs older than 10 minutes
            if (timestamp - log.timestamp >= 10) {
                recentLogs.poll();
                recentMessages.remove(log.message);
            } else 
                break;
        }
        boolean res = !recentMessages.contains(message);
        if (res) {
            recentLogs.add(new Log(timestamp, message));
            recentMessages.add(message);
        }
        return res;
    }
}


// Queue
public class Logger {
    Queue<Tuple> q = new ArrayDeque<>();
    Set<String> dict = new HashSet<>();
  
    public Logger() {}
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        while (!q.isEmpty() && q.peek().t <= timestamp - 10) {
            Tuple next = q.poll();
            dict.remove(next.msg);
        }
        if (!dict.contains(message)) {
            q.offer(new Tuple(timestamp, message));
            dict.add(message);
            return true;
        }
        return false;
    }
    private static class Tuple {
        int t; 
        String msg;
        public Tuple(int t, String msg) {
            this.t = t;
            this.msg = msg;
        }
    }
}

/************************************************************
/  394. Decode String
************************************************************/
class Solution {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx++);
            }
        }
        return res;
    }
}


/************************************************************
/  410. Split Array Largest Sum
************************************************************/
// DP
// f[i][j] = the largest sum of [0 to i] in j part
// f[i][j] = min(f[k][j-1], nums[k + 1] + ... + nums[i])

// base class = f[0][0] = 0
// f[k][0] = nums[0] + ... + nums[k]
// f[0][j] = 0

// Answer = f[n][m]

class Solution {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] f = new int[n + 1][m + 1];
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = Integer.MAX_VALUE;
            }
        }
        
        int[] arr = new int[n+1];
        arr[0] = nums[0];
        // arr[i] = nums[0] + ... + nums[i - 1]
        
        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + nums[i];
        }
        
//         for (int i = 0; i < n; i++) {
//             f[i + 1][0] = f[i][0] + arr[i+1];
//         }
        
//         for (int j = 0; j <= m; j++) {
//             f[0][j] = 0;
//         }
        
        f[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 0; k < i; k++) {
                    // Be very carefull here,
                    // we are looking for the largest sum among the two subarrays
                    // not the sum of the two arrays
                    int largestSum = Math.max(f[k][j-1], arr[i] - arr[k]);
                    f[i][j] = Math.min(f[i][j], largestSum);
                }
            }
        }
        
        return f[n][m];
    }
}

Time = O(N^2 * k) where k is the number of cut
Space = O(N*k)


// Binary Search + Greedy 
public class Solution {
    public int splitArray(int[] nums, int m) {
        int max = 0; long sum = 0;
        for (int num : nums) {
            max = Math.max(num, max);
            sum += num;
        }
        if (m == 1) return (int)sum;
        //binary search
        long l = max; long r = sum;
        while (l <= r) {
            long mid = l + (r - l)/ 2;
            if (valid(mid, nums, m)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)l;
    }
    public boolean valid(long target, int[] nums, int m) {
        int count = 1;
        long total = 0;
        for(int num : nums) {
            total += num;
            if (total > target) {
                total = num;
                count++;
                if (count > m) {
                    return false;
                }
            }
        }
        return true;
    }
}

Time = O(n*log(SumOfArray-MaxElementInArray))



/************************************************************
/  426. Convert Binary Search Tree to Sorted Doubly Linked List
************************************************************/
class Solution {
  // the smallest (first) and the largest (last) nodes
  Node first = null;
  Node last = null;

  public void helper(Node node) {
    if (node != null) {
      // left
      helper(node.left);
      // node 
      if (last != null) {
        // link the previous node (last)
        // with the current one (node)
        last.right = node;
        node.left = last;
      }
      else {
        // keep the smallest node
        // to close DLL later on
        first = node;
      }
      last = node;
      // right
      helper(node.right);
    }
  }

  public Node treeToDoublyList(Node root) {
    if (root == null) return null;

    helper(root);
    // close DLL
    last.right = first;
    first.left = last;
    return first;
  }
}

Time = O(n)
Space = O(tree depth)



/************************************************************
/  427. Construct Quad Tree
************************************************************/
/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution {
    public Node construct(int[][] grid) {
        return helper(grid, 0, 0, grid.length);
    }
    private Node helper(int[][] grid, int x, int y, int len) {
        if (len == 1) {
            return new Node(grid[x][y] != 0, true, null, null, null, null);
        }
        Node result = new Node();
        Node topLeft = helper(grid, x, y, len / 2);
        Node topRight = helper(grid, x, y + len / 2, len / 2);
        Node bottomLeft = helper(grid, x + len / 2, y, len / 2);
        Node bottomRight = helper(grid, x + len / 2, y + len / 2, len / 2);
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf
           && topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
            result.isLeaf = true;
            result.val = topLeft.val;
        } else {
            result.topLeft = topLeft;
            result.topRight = topRight;
            result.bottomLeft = bottomLeft;
            result.bottomRight = bottomRight;
        }
        return result;
    }
}



/************************************************************
/  438. Find All Anagrams in a String
************************************************************/
There are two different ways of solving this problems with two pointers
1. Keep moving right pointers, then move left when right - left == p.length()
2. Keep moving right pointers, then move left when count == 0
// Approach 1
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;

        int[] hash = new int[256]; //character hash

        //record each character in p to hash
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        //two points, initialize count to p's length
        int left = 0, right = 0, count = p.length();

        while (right < s.length()) {
            //move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p
            if (hash[s.charAt(right)] >= 1) {
                count--;
            }
            hash[s.charAt(right)]--;
            right++;

            //when the count is down to 0, means we found the right anagram
            //then add window's left to result list
            if (count == 0) {
                list.add(left);
            }
            //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
            if (right - left == p.length() ) {
                if (hash[s.charAt(left)] >= 0) {
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }
        }
        return list;
    }
}


// Approach 2
public class Solution {
    public List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();
        
        int begin = 0, end = 0;
        int head = 0;
        int len = Integer.MAX_VALUE;
        
        
        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;
            
            while(counter == 0){
                // Check length first
                if(end-begin == t.length()){
                    result.add(begin);
                }
                
                // Check it is still valid
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    // map.get(tempc) can be negative, eg. s=aaaab, t=ab
                    map.put(tempc, map.get(tempc) + 1); 
                    if(map.get(tempc) > 0){ // > 0 or = 1 both ok
                        counter++;
                    }
                }
                begin++;
            }
            
        }
        return result;
    }
}


Time = O(n)
Space = O(t)


/************************************************************
/  450. Delete Node in a BST
************************************************************/
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root == null) {
                return null;
            } else if (root.left == null || root.right == null) {
                return root.left == null ? root.right : root.left;
            } else {
                TreeNode small = getSmall(root.right);
                root.val = small.val;
                root.right = deleteNode(root.right, small.val);
            }
        }
        
        return root;
    }
    
    public TreeNode getSmall(TreeNode root) {
        while (small.left != null) {
            small = small.left;
        }
        return small;
    }
}

Space = O(log N) for the recursion stack.




/************************************************************
/  482. License Key Formatting
************************************************************/
// Better and clear
public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int charLen = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) != '-')
            {
                if (charLen > 0 && charLen % k == 0) {
                    sb.append('-');
                }
                sb.append(s.charAt(i));
                charLen++;
            }
        }
        
        return sb.reverse().toString().toUpperCase();
    }


// Accepted
public String licenseKeyFormatting(String s, int k) {
    StringBuilder sb = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; i--)
        if (s.charAt(i) != '-')
            sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
    
    return sb.reverse().toString().toUpperCase();
}




/************************************************************
/  489. Robot Room Cleaner
************************************************************/
/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */

//Best
class Solution {
    public void cleanRoom(Robot robot) {
        Set<String> visited = new HashSet<>();
        backtracking(robot, visited, 0, 0, 0);
    }
    
    public void goBack(Robot robot) {
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
      }
    
    int[][] dir = {{1,0}, {0,1}, {-1,0}, {0, -1}};

    private void backtracking(Robot robot, Set<String> visited, int x, int y, int arrow) {
        String path = x + "-" + y;
        if (visited.contains(path)) return;
        visited.add(path);
        robot.clean();
        
        for (int i = 0; i < 4; i++) {
            int newDir = (arrow + i) % 4;
            if (robot.move()) {
                //go all the way till cannot move, then back one step
                int nx = x + dir[newDir][0];
                int ny = y + dir[newDir][1];
                
                backtracking(robot, visited, nx, ny, newDir);
                goBack(robot);
            }
            robot.turnRight();
        }
    }
}



// Not good
public class Pair<F, S> {
  public F first;
  public S second;

  public Pair(F first, S second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public boolean equals(Object o) {
    Pair<F, S> p = (Pair<F, S>) o;
    return Objects.equals(p.first, first) && Objects.equals(p.second, second);
  }

  @Override
  public int hashCode() {
    return first.hashCode() ^ second.hashCode();
  }
}

class Solution {
  // going clockwise : 0: 'up', 1: 'right', 2: 'down', 3: 'left'
  int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
  Set<Pair<Integer, Integer>> visited = new HashSet();
  Robot robot;

  public void goBack() {
    robot.turnRight();
    robot.turnRight();
    robot.move();
    robot.turnRight();
    robot.turnRight();
  }

  public void backtrack(int row, int col, int d) {
    visited.add(new Pair(row, col));
    robot.clean();
    // going clockwise : 0: 'up', 1: 'right', 2: 'down', 3: 'left'
    for (int i = 0; i < 4; i++) {
      // IMPORTANT: Because of Right-hand rule, it needs to be clockwise
      int newD = (d + i) % 4;  
      int newRow = row + directions[newD][0];
      int newCol = col + directions[newD][1];

      if (!visited.contains(new Pair(newRow, newCol)) && robot.move()) {
        backtrack(newRow, newCol, newD);
        goBack();
      }
      // turn the robot following chosen direction : clockwise
      robot.turnRight();
    }
  }

  public void cleanRoom(Robot robot) {
    this.robot = robot;
    backtrack(0, 0, 0);
  }
}

Time = O(N - M), where N is # of room, M is # of obstacles
Space = O(N - M)


/************************************************************
/  543. Diameter of Binary Tree
************************************************************/
// longest path between any two nodes
class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L + R);
        return Math.max(L, R) + 1;
    }
}


/************************************************************
/  560. Subarray Sum Equals K
************************************************************/
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}



/************************************************************
/  621. Task Scheduler
************************************************************/
1. Create a map with count
2. Create a PriorityQueue of descending - queue.addAll(map.entrySet());
3. interval = n + 1, keep poll() and offer() to the queue

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0)
            return -1;
        //build map to sum the amount of each task
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        // build queue, sort from descending
        PriorityQueue<Map.Entry<Character,Integer>> queue = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        queue.addAll(map.entrySet());
        

        int cnt = 0;
        // when queue is not empty, there are remaining tasks
        while (!queue.isEmpty()){
            // for each interval
            int interval = n+1;
            // list used to update queue
            List<Map.Entry<Character, Integer>> list = new ArrayList<>();
    
            // fill the intervals with the next high freq task
            while (interval > 0 && !queue.isEmpty()){
                Map.Entry<Character,Integer> entry = queue.poll();
                entry.setValue(entry.getValue()-1);
                list.add(entry);
                // interval shrinks
                interval --;
                // one slot is taken
                cnt ++;
            }
            
            // update the value in the map
            for (Map.Entry<Character,Integer> entry:list){
                // when there is left task
                if (entry.getValue() > 0)
                    queue.offer(entry);
            }
            // job done
            if (queue.isEmpty())
                break;
            // if interval is > 0, then the machine can only be idle
            cnt += interval;
        }
        
        return cnt;
    }
}




/************************************************************
/  642. Design Search Autocomplete System
************************************************************/
class AutocompleteSystem {

    class TrieNode {
        Map<Character, TrieNode> children;
        Map<String, Integer> counts;
        boolean isWord;
        public TrieNode() {
            children = new HashMap<Character, TrieNode>();
            counts = new HashMap<String, Integer>();
            isWord = false;
        }
    }
    
    TrieNode root;
    String prefix;

    public AutocompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        prefix = "";

        for (int i = 0; i < sentences.length; i++) {
            add(sentences[i], times[i]);
        }
    }

    private void add(String s, int count) {
        TrieNode curr = root;
        for (char c : s.toCharArray()) {
            TrieNode next = curr.children.get(c);
            if (next == null) {
                next = new TrieNode();
                curr.children.put(c, next);
            }
            curr = next;
            curr.counts.put(s, curr.counts.getOrDefault(s, 0) + count);
        }
        curr.isWord = true;
    }

    public List<String> input(char c) {
        if (c == '#') {
            add(prefix, 1);
            prefix = "";
            return new ArrayList<String>();
        }

        prefix = prefix + c;
        TrieNode curr = root;
        for (char cc : prefix.toCharArray()) {
            TrieNode next = curr.children.get(cc);
            if (next == null) {
                return new ArrayList<String>();
            }
            curr = next;
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> (a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()));
        pq.addAll(curr.counts.entrySet());

        List<String> res = new ArrayList<String>();

        int k = 3;
        while(!pq.isEmpty() && k > 0) {
            res.add((String) pq.poll().getKey());
            k--;
        }
        return res;
    }
}


/**
 * Your AutocompleteSystem object will be instantiated and called as such:
 * AutocompleteSystem obj = new AutocompleteSystem(sentences, times);
 * List<String> param_1 = obj.input(c);
 */


/************************************************************
/  753. Cracking the Safe
************************************************************/
// DFS
// Started from O node (000 node if n = 3)
// In the recursion, get the last n - 1 digits and try to join with all combination

class Solution {
    public String crackSafe(int n, int k) {
        // Initialize pwd to n repeated 0's as the start node of DFS.
        String strPwd = String.join("", Collections.nCopies(n, "0"));
        StringBuilder sbPwd = new StringBuilder(strPwd);
        
        Set<String> visitedComb = new HashSet<>();
        visitedComb.add(strPwd);
    
        int targetNumVisited = (int) Math.pow(k, n);
        
        crackSafeAfter(sbPwd, visitedComb, targetNumVisited, n, k);
        
        return sbPwd.toString();
    }
    
    private boolean crackSafeAfter(StringBuilder pwd, Set<String> visitedComb, int targetNumVisited, int n, int k) {
        // Base case: all n-length combinations among digits 0..k-1 are visited. 
        if (visitedComb.size() == targetNumVisited) {
            return true;
        }
        
        String lastDigits = pwd.substring(pwd.length() - n + 1); // Last n-1 digits of pwd.
        for (char ch = '0'; ch < '0' + k; ch++) {
            String newComb = lastDigits + ch;
            if (!visitedComb.contains(newComb))  {
                visitedComb.add(newComb);
                pwd.append(ch);
                if (crackSafeAfter(pwd, visitedComb, targetNumVisited, n, k)) {
                    return true;
                }
                visitedComb.remove(newComb);
                pwd.deleteCharAt(pwd.length() - 1);
            }
        }
        
        return false;
    }
}


Time = (k^n), where k^n is the # of nodes in the DFS tree
k is branching factor (this possible value in any digits) and n level
If k = 2, it can only be 0 or 1, so it is 2^n
when n = 2, they are 00, 01, 10, 11
2*2*2*2*.....

If k = 9, it can be 0 .... 9, so it is 9^n
9*9*9*9*.....

Another better way to explain this is to draw a permutation tree
If k = 2, the first layer is 2^0, then 2^1, 2^2, .... 2^n, where n is the depth of the tree
So, if k = k, the first layer is k^0, then, k^1, k^2, ..., k^n




/************************************************************
/  818. Race Car
************************************************************/
// BFS + DP
public int racecar(int target) {
    Deque<int[]> queue = new LinkedList<>();
    queue.offerLast(new int[] {0, 1}); // starts from position 0 with speed 1
    
    Set<String> visited = new HashSet<>();
    visited.add(0 + " " + 1);
    int level = 0;
    while (!queue.isEmpty()) {
        int size = queue.size();
        for(int k = 0; k < size; k++) {
            int[] cur = queue.pollFirst();  // cur[0] is position; cur[1] is speed
            
            if (cur[0] == target) {
                return level;
            }
            
            int[] nxt = new int[] {cur[0] + cur[1], cur[1] << 1};  // accelerate instruction
            String key = (nxt[0] + " " + nxt[1]);
            
            if (!visited.contains(key) && 0 < nxt[0] && nxt[0] < (target << 1)) {
                queue.offerLast(nxt);
                visited.add(key);
            }
            
            nxt = new int[] {cur[0], cur[1] > 0 ? -1 : 1};  // reverse instruction
            key = (nxt[0] + " " + nxt[1]);
            
            if (!visited.contains(key) && 0 < nxt[0] && nxt[0] < (target << 1)) {
                queue.offerLast(nxt);
                visited.add(key);
            }
        }
        level++;
    }
    return -1;
}

Time = O(target * log(target))
Space = O(target * log(target))

The BFS is memorizing pairs of speed and positions. 
So the total time complexity will be the number of such pairs formed before we hit the target.
Now, How many different positions are possible to reach to target. 
In worst case we, could have visited every single position in both the directions 
i.e. from -target to +target so the total no of positions possible are O(target).
Now, to check total no of speeds possible we could go either 1, 2, 4, 8.. or -1, -2, -4 , -8 .. .. upto (target). 
because we will always reach the target with speed bounded by target position. So total no of distinct speeds are 2O(log target)
Hence time complexity= Total distinct positions(=target) * total distinct speeds (=log(target)) = O(targetlog(target)).


Naive BFS will run at O(2^n), where n is the number of instructions, n is not always less than target

/************************************************************
/  843. Guess the Word
************************************************************/
/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] wordlist, Master master) {
        for (int i = 0, x = 0; i < 10; ++i) {
            HashMap<String, Integer> count = new HashMap<>();
            for (String w1 : wordlist)
                for (String w2 : wordlist)
                    if (match(w1, w2) == 0)
                        count.put(w1, count.getOrDefault(w1 , 0) + 1);
            Pair<String, Integer> minimax = new Pair<>("", 1000);
            for (String w : wordlist)
                if (count.getOrDefault(w, 0) < minimax.getValue())
                    minimax = new Pair<>(w, count.getOrDefault(w, 0));
            x = master.guess(minimax.getKey());
            List<String> wordlist2 = new ArrayList<String>();
            for (String w : wordlist)
                if (match(minimax.getKey(), w) == x)
                    wordlist2.add(w);
            wordlist = wordlist2.toArray(new String[0]);
        }
    }
    
    public int match(String a, String b) {
        int matches = 0;
        for (int i = 0; i < a.length(); ++i) if (a.charAt(i) == b.charAt(i)) matches ++;
        return matches;
    }
    
    class Pair<FF, AA> {
        FF s;
        AA match;
        public Pair(FF s, AA match) {
            this.s = s;
            this.match = match;
        }
        
        private FF getKey() {
            return this.s;
        }
        
        private AA getValue() {
            return this.match;
        }
    }
}

/************************************************************
/  853. Car Fleet
************************************************************/
// With Array
public int carFleet(int target, int[] pos, int[] speed) {
    int N = pos.length, res = 0;
    double[][] cars = new double[N][2];
    for (int i = 0; i < N; ++i)
        cars[i] = new double[] {pos[i], (double)(target - pos[i]) / speed[i]};
    Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
    double cur = 0;
    for (int i = N - 1; i >= 0 ; --i) {
        if (cars[i][1] > cur) {
            cur = cars[i][1];
            res++;
        }
    }
    return res;
}

// With Treemap
public int carFleet(int target, int[] pos, int[] speed) {
    TreeMap<Integer, Double> m = new TreeMap<>();
    for (int i = 0; i < pos.length; ++i) m.put(-pos[i], (double)(target - pos[i]) / speed[i]);
    int res = 0; double cur = 0;
    for (double time : m.values()) {
        if (time > cur) {
            cur = time;
            res++;
        }
    }
    return res;
}


/************************************************************
/  895. Maximum Frequency Stack
************************************************************/
class FreqStack {
    HashMap<Integer, Integer> freq = new HashMap<>();
    HashMap<Integer, Stack<Integer>> m = new HashMap<>();
    int maxfreq = 0;

    public void push(int x) {
        int f = freq.getOrDefault(x, 0) + 1;
        freq.put(x, f);
        maxfreq = Math.max(maxfreq, f);
        if (!m.containsKey(f)) m.put(f, new Stack<Integer>());
        m.get(f).add(x);
    }

    public int pop() {
        int x = m.get(maxfreq).pop();
        freq.put(x, maxfreq - 1);
        if (m.get(maxfreq).size() == 0) maxfreq--;
        return x;
    }
}

/************************************************************
/  953. Verifying an Alien Dictionary
************************************************************/
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); ++i)
            index[order.charAt(i) - 'a'] = i;

        search: for (int i = 0; i < words.length - 1; ++i) {
            String word1 = words[i];
            String word2 = words[i+1];

            // Find the first difference word1[k] != word2[k].
            for (int k = 0; k < Math.min(word1.length(), word2.length()); ++k) {
                if (word1.charAt(k) != word2.charAt(k)) {
                    // If they compare badly, it's not sorted.
                    if (index[word1.charAt(k) - 'a'] > index[word2.charAt(k) - 'a'])
                        return false;
                    continue search;
                }
            }

            // If we didn't find a first difference, the
            // words are like ("app", "apple").
            if (word1.length() > word2.length())
                return false;
        }

        return true;
    }
}



/************************************************************
/  986. Interval List Intersections
************************************************************/
// TreeMap
public class TimeMap {

    private Map<String,TreeMap<Integer,String>> map;

    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {
            map.put(key,new TreeMap<>());
        }
        map.get(key).put(timestamp,value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer,String> treeMap = map.get(key);
        if(treeMap==null) {
            return "";
        }
        Integer floor = treeMap.floorKey(timestamp);
        if(floor==null) {
            return "";
        }
        return treeMap.get(floor);
    }
}


// HashMap + Binary Search
class Data {
    String val;
    int time;
    Data(String val, int time) {
        this.val = val;
        this.time = time;
    }
}
class TimeMap {

    /** Initialize your data structure here. */
    Map<String, List<Data>> map;
    public TimeMap() {
        map = new HashMap<String, List<Data>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) map.put(key, new ArrayList<Data>());
        map.get(key).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        return binarySearch(map.get(key), timestamp);
    }
    
    protected String binarySearch(List<Data> list, int time) {
        int low = 0, high = list.size() - 1;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (list.get(mid).time == time) return list.get(mid).val;
            if (list.get(mid).time < time) {
                if (list.get(mid+1).time > time) return list.get(mid).val;
                low = mid + 1;
            }
            else high = mid -1;
        }
        return list.get(low).time <= time ? list.get(low).val : "";
    }
}


Time = O(1) for set operations with list
     = O(log N) for set operations with treemap
     = O(log N) for get with binary search on a list OR treemap


/************************************************************
/  986. Interval List Intersections
************************************************************/
// Merge Intervals
class Solution {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        List<Interval> ans = new ArrayList();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            // Let's check if A[i] intersects B[j].
            // lo - the startpoint of the intersection
            // hi - the endpoint of the intersection
            int lo = Math.max(A[i].start, B[j].start);
            int hi = Math.min(A[i].end, B[j].end);
            if (lo <= hi)
                ans.add(new Interval(lo, hi));

            // Remove the interval with the smallest endpoint
            if (A[i].end < B[j].end)
                i++;
            else
                j++;
        }

        return ans.toArray(new Interval[ans.size()]);
    }
}

Time = O(n + m)




/************************************************************
/  987. Vertical Order Traversal of a Binary Tree
************************************************************/
// DFS + Priority Queue
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if (root == null) return res;
        
        PriorityQueue<Point> pq = new PriorityQueue(new Comparator<Point>(){
            public int compare(Point p1, Point p2){
                if (p1.x != p2.x)
                    //return p1.x - p2.x;               // Same
                    return Integer.compare(p1.x, p2.x); // Same
                else if (p1.y != p2.y)
                    return p2.y - p1.y;
                else 
                    return Integer.compare(p1.val, p2.val);
            }
        });
        
        dfs(root, 0, 0, pq);
        int prev_x = Integer.MIN_VALUE;
        while (!pq.isEmpty()){
            Point p = pq.poll();
            if (p.x > prev_x){
                List<Integer> list = new ArrayList();
                list.add(p.val);
                res.add(list);
            }
            else{
                List<Integer> list = res.get(res.size()-1);
                list.add(p.val);
            }
            prev_x = p.x;
        }
        return res;
    }
    
    private void dfs(TreeNode root, int x, int y, PriorityQueue<Point> pq){
        if (root == null) return;
        pq.offer(new Point(x, y, root.val));
        dfs(root.left, x-1, y-1, pq);
        dfs(root.right, x+1, y-1, pq);
    }
    
    class Point{
        int x,y,val;
        Point(int x,int y,int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
}


// BFS + Sorting
class Solution {
    class Pair{
        TreeNode node;
        int x;  //horizontal
        int y;  //depth
        Pair(TreeNode n, int x, int y)
        {
            node = n;
            this.x = x;
            this.y = y;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer, List<Pair>> map = new HashMap<>(); //x -> list (some nodes might have same y in the list)
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));
        int min = 0, max = 0;
        while(!q.isEmpty())
        {
            Pair p = q.remove(); 
            
            min = Math.min(min, p.x);
            max = Math.max(max, p.x);
            
            if(!map.containsKey(p.x)) 
                map.put(p.x, new ArrayList<>());
            map.get(p.x).add(p);
            
            if(p.node.left!=null) q.add(new Pair(p.node.left, p.x-1, p.y+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right, p.x+1, p.y+1));
        }        

        for(int i=min; i<=max; i++)
        {
            Collections.sort(map.get(i), new Comparator<Pair>(){
                public int compare(Pair a, Pair b)
                {
                    if(a.y==b.y) //when y is equal, sort it by value
                        return a.node.val - b.node.val;
                    return 0; //otherwise don't change the order as BFS ganrantees that top nodes are visited first
                }
            });
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<map.get(i).size(); j++)
            {
                list.add(map.get(i).get(j).node.val);
            }
            lists.add(list);
        }
        return lists;   
    }

}


Time = O(nlogn) for sorting

/************************************************************
/  1007. Minimum Domino Rotations For Equal Row
************************************************************/
// Two pass
// Do the count of A & B first
// then countA[i] + countB[i] - same[i] is like 
// finding the union of two set A and set B <=> A + B - (A & B)
class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        if (A.length != B.length) { return -1; }
        int[] countA = new int[7]; // countA[i] records the occurrence of i in A.
        int[] countB = new int[7]; // countB[i] records the occurrence of i in B.
        int[] same = new int[7]; // same[k] records the occurrence of k, where k == A[i] == B[i].
        for (int i = 0; i < A.length; ++i) {
            ++countA[A[i]];
            ++countB[B[i]];
            if (A[i] == B[i]) { ++same[A[i]]; }
        }
        for (int i = 1; i < 7; ++i) {
            if (countA[i] + countB[i] - same[i] >= A.length) {
                return Math.min(countA[i], countB[i]) - same[i];
            }
        }
        return -1;
    }
}


// Standard solution but No so good
class Solution {
  /*
  Return min number of rotations 
  if one could make all elements in A or B equal to x.
  Else return -1.
  */
  public int check(int x, int[] A, int[] B, int n) {
    // how many rotations should be done
    // to have all elements in A equal to x
    // and to have all elements in B equal to x
    int rotations_a = 0, rotations_b = 0;
    for (int i = 0; i < n; i++) {
      // rotations coudn't be done
      if (A[i] != x && B[i] != x) return -1;
      // A[i] != x and B[i] == x
      else if (A[i] != x) rotations_a++;
      // A[i] == x and B[i] != x    
      else if (B[i] != x) rotations_b++;
    }
    // min number of rotations to have all
    // elements equal to x in A or B
    return Math.min(rotations_a, rotations_b);
  }

  public int minDominoRotations(int[] A, int[] B) {
    int n = A.length;
    int rotations = check(A[0], B, A, n);
    // If one could make all elements in A or B equal to A[0]
    if (rotations != -1 || A[0] == B[0]) return rotations;
    // If one could make all elements in A or B equal to B[0]
    else return check(B[0], B, A, n);
  }
}


/************************************************************
/  1057. Campus Bikes
************************************************************/
// Good bucket sort
class Solution {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        List<int[]>[ ] buckets = new ArrayList[2001];
        
        for (int i=0; i<workers.length; i++) {
            for (int j=0; j<bikes.length; j++) {
                int dist = manDist(workers[i], bikes[j]);
                if (buckets[dist] == null) {
                    buckets[dist] = new ArrayList<int[]>();
                }
                buckets[dist].add(new int[] {i, j});               
            }
        }
        
        boolean[] bikeVisited = new boolean[bikes.length];
        int[] result = new int[workers.length];
        Arrays.fill(result, -1);
        // Buckets[dist] is consumed completely first, and then move on
        // to next dist. Check if buckets[dist] is null every time.
        for (int dist=0; dist<buckets.length; dist++) {
            if (buckets[dist] == null)
                continue;
            for (int i=0; i<buckets[dist].size(); i++) {
                int w = buckets[dist].get(i)[0];
                int b = buckets[dist].get(i)[1];
                
                if (bikeVisited[b] == true  || result[w] != -1)
                    continue;
                result[w] = b;
                bikeVisited[b] = true;
            }
        }
        return result;   
    }
    
    public int manDist(int[] pt1, int[] pt2) {
        return Math.abs(pt1[0] - pt2[0]) + Math.abs(pt1[1] - pt2[1]);
    }
}

// Don't do the priority queue solution, it's bad

the first for-for-loop code implicitly sort the i-j pair in the bucket list 
by (1) firstly the work index, (2) the secondly the bike index.

Time = O(N * M), because it is kind of like buckets but 
there is NO sorting within a bucket
Space = O(N * M)

/************************************************************
/  Sliding Window Template
************************************************************/

public class Solution {
    public List<Integer> slidingWindowTemplateByHarryChaoyangHe(String s, String t) {
        //init a collection or int value to save the result according the question.
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        
        //create a hashmap to save the Characters of the target substring.
        //(K, V) = (Character, Frequence of the Characters)
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //maintain a counter to check whether match the target string.
        int counter = map.size();//must be the map size, NOT the string size because the char may be duplicate.
        
        //Two Pointers: begin - left pointer of the window; end - right pointer of the window
        int begin = 0, end = 0;
        
        //the length of the substring which match the target string.
        int len = Integer.MAX_VALUE; 
        
        //loop at the begining of the source string
        while(end < s.length()){
            
            char c = s.charAt(end);//get a character
            
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);// plus or minus one
                if(map.get(c) == 0) counter--;//modify the counter according the requirement(different condition).
            }
            end++;
            
            //increase begin pointer to make it invalid/valid again
            while(counter == 0 /* counter condition. different question may have different condition */){
                
                char tempc = s.charAt(begin);//***be careful here: choose the char at begin pointer, NOT the end pointer
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);//plus or minus one
                    if(map.get(tempc) > 0) counter++;//modify the counter according the requirement(different condition).
                }
                
                /* save / update(min/max) the result if find a target*/
                // result collections or result int value
                
                begin++;
            }
        }
        return result;
    }
}



/************************************************************
/  Merge Sort
************************************************************/

void sort(list stack) {
    if (stack == null || stack.isEmpty()) {
    return;
    }

    List stack2;
    List stack3;

    while(!stack.isEmpty()) {
        int min = stack.top();
        if (stack.top() < min) {
            min = stack.top();
        }
        stack2.add(stack.pop());
        stack3.add(min);

        if (stack.isEmpty()) {
            while(!stack2.isEmpty()) {
                int i = stack2.pop();
                if (i != min) {
                    stack.add(i);
                }
            }
        }
    }

    return stack3;

}

list void mergeSort(list a, int left, int right) {
    list solution;
    if (left == right) {
        solution.add(a[left]);
    }

    int mid = left + (right - left) / 2;
    list left = mergetSort(a, left, mid);
    list right = mergeSort(a, mid + 1, right);
    solution = combine(left, right);
    return solution;
}


