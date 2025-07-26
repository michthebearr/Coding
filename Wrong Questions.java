414. Remove Linked List Elements

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */

public class Solution {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return head;
    }

    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode prev = dummyHead;
    ListNode cur = head;

    while (cur != null) {
      if (cur.value == val) {
        prev.next = cur.next;
      } else {
        prev = cur;
      }
      cur = cur.next;
    }
    return head; // MUST return dummyHead.next cause head could have been the target value, could have been deleted
  }
}

#############################################################

40. Merge Two Sorted Linked Lists

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode merge(ListNode oneHead, ListNode twoHead) {

    // Corner Case:
    if (oneHead == null) {
      return twoHead;
    }
    if (twoHead == null) {
      return oneHead;
    }

    // Set up variables:
    ListNode cur1 = oneHead;
    ListNode cur2= twoHead;
    ListNode dummyHead = new ListNode(0);
    ListNode cur = dummyHead;

    while (cur1 != null || cur2 != null) { // &&
      if (cur1.value < cur2.value) {
        cur.next = cur1;
        cur1 = cur1.next;
      } else {
        cur.next = cur2;
        cur2 = cur2.next;
      }
      cur = cur.next;
    }

    // Post Processing:
    if (cur1 != null) {
      cur.next = cur1;
    }
    if (cur2 != null) {
      cur.next = cur2;
    }
    return dummyHead; // return dummyHead.next
  }
}

#############################################################

546. Find Index of Minimum Value

public class Solution {
  public int minIndex(int[] array, int i) {
    int min = i;

    for (int j = i + 1; j < array.length; j++) {
      if(array[j] < array[i]) { // if(array[j] < array[min])
        min = j;
      }
    }
    return min;
  }
}


#############################################################

4. Selection Sort

public class Solution {
  public int[] solve(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }

    for (int i = 0, i < array.length - 1, i++) { // for (int i = 0; i < array.length - 1; i++) 
      int minIndex = i;
      for (int j = i + 1, j < array.length, j++) { // for (int j = i + 1; j < array.length; j++)
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      swap(array, i, minIndex);
    }

    return array; 
  }

  public void swap(int[] array, int x, int y){
      int temp = array[x];
      array[x] = array[y];
      array[y] = temp;

  }
}


// Second Time:
public class Solution {
  public int[] solve(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }

    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = 1; j < array.length; j++) { // for (int j = i + 1; j < array.length; j++)
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      swap(array, i, minIndex);
    }
    return array;
  }

  private void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}

#############################################################

267. Search In Sorted Matrix I

public class Solution {
  public int[] search(int[][] matrix, int target) {
    int row = matrix.length;
    int col = matrix[0].length;

    int left = 0;
    int right = row * col - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      int midRow = mid / col;
      int midCol = mid % col;
      int value = matrix[midRow][midCol];
      if (value == target) {
        return new int[midRow][midCol]; // return new int[] {midRow, midCol};
      } else if (value > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return int[] {-1, -1}; // return new int[] {-1, -1};
  }
}

#############################################################

34. Reverse Linked List (iterative)

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode prev = null;
    ListNode cur = head;
    ListNode next = cur.next; // next NEVER gets updated

    while (cur != null) {
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
}

// Correct: 

public class Solution {
  public ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode prev = null;
    ListNode cur = head;
    
    while (cur != null) {
      ListNode next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
}

#############################################################

39. Insert In Sorted Linked List

public class Solution {
  public ListNode insert(ListNode head, int target) {
    ListNode newNode = new ListNode(target);
    ListNode cur = head;

    if (head == null || head.value >= target) {
      newNode.next = head;
      return newNode;
    }

    while (cur.next != null && cur.next.value < target){
      cur = cur.next;
    }
    newNode.next = cur.next;
    cur.next = newNode;
    return head;
  }
}
#############################################################

40. Merge Two Sorted Linked Lists

/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */

public class Solution {
  public ListNode merge(ListNode oneHead, ListNode twoHead) {
    if (oneHead == null) {
      return twoHead;
    }

    if (twoHead == null) {
      return oneHead;
    }

    ListNode cur1= oneHead;
    ListNode cur2= twoHead;
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;

    while (cur1 != null && cur2 != null) {
      if (cur1.value <= cur2.value) {
        cur.next = cur1;
        cur1 = cur1.next;
      } else {
        cur.next = cur2;
        cur2 = cur2.next;
      }
      cur = cur.next;
    }

    while (cur1 != null) { // IF
      cur.next = cur1;
      cur = cur.next;
    }

    while (cur2 != null) { // IF
      cur.next = cur2;
      cur = cur.next;
    }

    return dummy; // return dummy.next;
  }
}

// Correct: 
public class Solution {
  public ListNode merge(ListNode oneHead, ListNode twoHead) {

    // Corner Case:
    if (oneHead == null) {
      return twoHead;
    }
    if (twoHead == null) {
      return oneHead;
    }

    // Set up variables:
    ListNode cur1 = oneHead;
    ListNode cur2= twoHead;
    ListNode dummyHead = new ListNode(0);
    ListNode cur = dummyHead;

    while (cur1 != null && cur2 != null) { 
      if (cur1.value < cur2.value) {
        cur.next = cur1;
        cur1 = cur1.next;
      } else {
        cur.next = cur2;
        cur2 = cur2.next;
      }
      cur = cur.next;
    }

    // Post Processing:
    if (cur1 != null) {
      cur.next = cur1;
    }
    if (cur2 != null) {
      cur.next = cur2;
    }
    return dummyHead.next;
  }
}

#############################################################

19. K Closest In Sorted Array

public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    int left = findClosest(array, target);
    int right = left + 1;

    int[] result = new int[k];

    for (int i = 0; i < k; i++) {
      if (right >= array.length){
        result[i] = array[left];
        left--;
      } else if (left < 0) {
        result[i] = array[right];
        right++;
      } else if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)){
        result[i] = array[left];
        left--;
      } else {
        result[i] = array[right];
        right++;
      }
    }
    return result;
  }

  private int[] findClosest(int[] array, int target) { // private int findClosest(int[] array, int target)
    int left = 0;
    int right = array.length - 1;

    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] > target) {
        right = mid;
      } else {
        left = mid;
      } 
    }

    if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
      return left;
    } else {
      return right;
    }
  }
}



// Second Time Wrong

public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    int left = findCloset(array, target);
    int right = left + 1;

    int[] result = new int[k];
    
    for (int i = 0; i < k; i++) {
      if (array[left] == null) { // ❌ This will not compile. Primitive types like int cannot be null: if (left < 0) 
        result[i] = array[right];
        right++;
      } else if (array[right] == null) { // ❌ This will not compile. Primitive types like int cannot be null: else if (right > array.length - 1)
        result[i] = array[left];
        left--;
      } else if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
        result[i] = array[left];
        left--;
      } else {
        result[i] = array[right];
        right++;
      }
    }
    return result;
    
  }

  private int findCloset(int[]array, int target) {
    int left = 0;
    int right = array.length - 1;
    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] > target) {
        right = mid;
      } else {
        left = mid;
      }
    }

    if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
      return left;
    } else {
      return right;
    }
  }
}


#############################################################

4. Selection Sort

public class Solution {
  public int[] solve(int[] array) {
    if (array == null || array.length == 0){
      return array;
    }

    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = 1; j < array.length; j++) { // int j = i + 1
        if (array[j] < array[i]) { // if (array[j] < array[minIndex])
          minIndex = j;
        }
      }
      swap(array, i, minIndex);
    }
    return array;
    
  }

  private void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}


#############################################################

9. Merge Sort

public class Solution {
  public int[] mergeSort(int[] array) {
    // Start
    if (array == null || array.length <= 1) {
      return array;
    }

    mergeSort(array, 0, array.length - 1); // return mergeSort(array, 0, array.length - 1)
  }

  // Split with recursion
  private int[] mergeSort(int[] array, int left, int right) {
    // Base Case:
    if (left == right) {
      return new int[] (array[left]); //  return new int[] {array[left]};
    }

    int mid = left + (right - left) / 2;
    int[] leftResult = mergeSort(array, left, mid);
    int[] rightResult = mergeSort(array, mid + 1, right);

    return merge(leftResult, rightResult);
  }

  // Merge
  private int[] merge(int[] leftResult, int[] rightResult) {
    int[] result = new int[leftResult.length + rightResult.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < leftResult.length && j < rightResult.length) {
      if (leftResult[i] <= rightResult[j]) {
        result[k] = leftResult[i];
        i++;
      } else {
        result[k] = rightResult[j]
        j++;
      }
      k++;
    }

    while (i < leftResult.length){
      result[k] = leftResult[i];
        i++;
        k++;
    }

    while (j < rightResult.length){
      result[k] = rightResult[j];
        j++;
        k++;
    }

    return result;
  }
}


#############################################################

280. Sort With 2 Stacks

public class Solution {
  public void sort(LinkedList<Integer> s1) {
    LinkedList<Integer> s2 = new LinkedList<Integer>();
    if (s1 == null || s1.size <= 1) { // if (s1 == null || s1.size() <= 1)
      return;
    }

    int n = s1.size();

    for (int i = 0; i < n; i++) {
      int currentMin = Integer.MAX_VALUE;

      while (!s1.isEmpty()) {
        int current = s1.pollFirst();
        currentMin = Math.min(current, currentMin);
        s2.offerFirst(current);
      }
    

      int minCount = 0;

      while (!s2.isEmpty()) {
        int current = s2.peekFirst();

        if (current < currentMin) {
          break;
        } else if (current > currentMin) {
          s1.offerFirst(s2.pollFirst());
        } else {
          s2.pollFirst();
          minCount++;
        }
      }

      for (int j = 0; j < minCount; j++) {
        s2.offerFirst(currentMin);
      }
    }

    while (!s2.isEmpty()) {
      s1.offerFirst(s2.pollFirst());
    }
  }
}

#############################################################

13. a to the power of b

public class Solution {
  public long power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    if (b == 1) {
      return a;
    }

    long subProblem = power(a, b/2);

    if (b % 2 == 0) {
      return subProblem * subProblem;
    } else {
      return subProblem * subProblem * a;
    }
  }
}

#############################################################

31. Queue By Two Stacks

public class Solution {
  Deque<Integer> s1 = new LinkedList<>();
  Deque<Integer> s2 = new LinkedList<>();
  
  // add element to the back of the queue
  public void offer(int element) {
    s1.addFirst(element);
  }

  // remove element at the front of the queue
  public int poll() { // public Integer poll()
    if (s2.isEmpty()) {
      transferStack();
    }
    return s2.pollFirst();
  }

  // peek first element at the front of the queue
  public int peek() {  // public Integer peek()
    if (s2.isEmpty()) {
      transferStack();
    }
    return s2.peekFirst();
  }

  // total number of elements in the queue
  public int size() {
    return s1.size() + s2.size();
  }

  // check empty
  public boolean isEmpty() {
    return s1.isEmpty() && s2.isEmpty();
  }

  // transfer s1 to s2 to reverse order
  private void transferStack() {
    while(!s2.isEmpty()) { // while(!s1.isEmpty())
      s2.addFirst(s1.pollFirst());
    }
  }

}


#############################################################

281. Remove Spaces

public class Solution {
  public String removeSpaces(String input) {
    if (input.isEmpty()) {
      return input;
    }

    char[] array = input.toCharArray();

    int slow = 0;
    for (int fast = 0; fast < array.length; fast++) {
      if (array[fast] == " " && (fast == 0 || array[fast - 1] == " ")) { // ' '
        continue;
      }
      array[slow] = array[fast];
      slow++;
    }

    if (slow > 0 && array[slow - 1] == " ") { // ' '
      slow--;
    }
    return new String(array, 0, slow);
  }
}

#############################################################

// Leetcode: 290. Word Pattern

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // The length must match:
        if (pattern.length() != words.length) return false;
        // char to word map 
        Map<Character, String> charToWord = new HashMap<>();
        // word to char map 
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            // If the character was already mapped, check if it's mapped to the current word
            // If not, then the pattern is violated (e.g., 'a' was mapped to "dog" before, now it's "cat")
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) return false;
            } else {
            // If the character is not yet mapped but the word is already mapped to another character,
            // then it's a conflict — one word cannot map to two characters
                if (wordToChar.containsKey(word)) return false;
                charToWord.put(ch, word); // Map character to word
                wordToChar.put(word, ch); // Map word to character
            }
        }
        return true;
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