529. Division without loss of precision

class Solution {
  public double divide() {
    int a = 3;
    int b = 7;
    
    double c = (double) a / b; //Complete the expression
    
    return c;
  }
}


#############################################################

530. isEven

public class Solution {
  public boolean isEven(int x) {
    boolean b = x % 2 == 0; //complete the expression
    return b;
    // Write your solution here
  }
}

#############################################################

531. areEqual

public class Solution {
  public boolean areEqual(int x, int y) {
    boolean b = x == y; //complete the expression
    return b;
    // Write your solution here
  }

}

#############################################################

532. areRoughlyEqual

public class Solution {
  public boolean areEqual(double x, double y) {
    boolean b = (x-y < 0.0001) && (y-x < 0.0001); //complete the expression
    return b;
    // Write your solution here
  }
}

#############################################################

533. String concatenatio

public class Solution {
  public String concatenate(String x, String y) {
    String z = x + "," + y; //complete the expression
    return z;
    // Write your solution here
  }
}


#############################################################


534. Sign of number

public class Solution {
  public int sign(int x) {
      if (x > 0) {
          return 1;
      } else if (x < 0) {
          return -1;
      } else {
          return 0;
      }
  }
}

#############################################################

535. Is Prime Number

public class Solution {
  public boolean isPrime(int n) {
      for (int i = 2; i < n; i++) {
          if (n % i == 0) {
              return false;
          }
      }
      return true;
  }
}

#############################################################

536. Calculate Sum of Squares

#1
public class Solution {
  public int sumOfSquares(int n) {
      int result = 0;
      for (int i = 1; i * i <= n; i++) {
          result += (i * i) ;
        }
      return result;
  }
}


#2
public class Solution {
  public int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}


#############################################################

537. Calculate factorial of n

public class Solution {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

#############################################################

538. Calculate a to the power of b (naive)

public class Solution {
  public int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
  }
}

#############################################################

730. [Debug] areEqual

public class Solution {
  public boolean areEqual(int x, int y) {
    return x == y;
}

#############################################################

731. [Debug] Is Prime Number

public class Solution {
  public boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      } 
    }
    return true;
  }
}


#############################################################

544. Design an accumulator

class Accumulator {
  int result = 0;
  public void add(int x) {
    result = result + x;
  }
  public int sum() {
    return result;
  }
}


class Test {
  public static void main(String xxxcx) {
    Accumulator a = new Accumulator();
    a.add(5);
    System.out.println(a.sum());

    a.add(100);
    System.out.println(a.sum());
  }
}

#############################################################

733. [Debug] Design an accumulator


class Accumulator {
  int s = 0;
  public void add(int x) {
    s += x;
  }
  public int sum() {
    return s;
  }
}

#############################################################

539. Find Minimum

#Method 1

public class Solution {
  public int min(int[] array) {
    if (array == null || array.length == 0){
      return 0;
    }

    int minValue = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < minValue){
        minValue = array[i];
      }
    }
    return minValue;
  }
}

#Method 2

public class Solution {
  public int min(int[] array) {
    // Write your solution here
    if (array == null || array.length == 0) {
      return 0;
    }

    int min = array[0];
    for (int i : array) {
      min = Math.min(i, min);
    }
    return min;
  }
}

#############################################################

540. Compute Sum

#Method 1

public class Solution {
  public int sum(int[] array) {
    if (array == null || array.length == 0){
      return 0;
    }

    int total = 0;
    for (int i = 0; i < array.length; i++){
      total += array[i];
    }
    return total;
  }
}

#Method 2

public class Solution {
  public int sum(int[] array) {
    if (array == null || array.length == 0){
      return 0;
    }
    
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return sum;
  }
}

#############################################################

541. Swap two elements

public class Solution {
  public void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp; 
  }
}

#############################################################

542. Reverse an array

#1

public class Solution {
  public void reverse(int[] array) {
    int i = 0;
    int j = array.length - 1;
    while (i < j) {
      swap(array, i, j);
      i++;
      j--;
    }
  }
  
  public void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}

#2

public class Solution {
  public void reverse(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }
}

#############################################################

543. Sum of 2D array

#Method 1

public class Solution {
  public int sum(int[][] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        sum += array[i][j];
      }
    }
    return sum;
  }
}

#Method 2

public class Solution {
  public int sum(int[][] array) {
    int sum = 0;
    for (int[] x : array){ // x is an array
      for (int y : x){ // for every y in the array called x
        sum += y;
      }
    }
    return sum;
  }
}


#############################################################

635. Sum of Squares

public class Solution {
  public int sumOfSquare(List<Integer> list) {
    if (list == null || list.size() == 0){
      return 0;
    }
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i) * list.get(i);
    }
    return sum;
  }
}

#############################################################

740. [Debug] Hello world

public class Solution {
  public String helloWorld() {
    return "Hello world!";
  }
}

#############################################################

732. [Debug] Reverse an array

public class Solution {
  public void reverse(int[] array) {
    int start = 0;
    int end = array.length;
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
    }
  }
}

#############################################################

14. Classical Binary Search

// Step 1: 根据Search Range取中点
// Step 2: 对比array[mid] and target
// Step 3: 缩小Search Range

public class Solution {
  public int binarySearch(int[] array, int target) {
    if (array == null || array.length == 0){
      return -1;
    }

    // Step 0: Specify Binary Search's Search Range
    int left = 0;
    int right = array.length - 1;

    // As long as there is still elements left in the search range, repeat Step 1 to 3
    while (left <= right){
      // Step 1: Find mid 
      int mid = left + (right - left)/2;
      // Step 2: Compare array[mid] and target 
      // Step 3: Shorten search range accordingly 
      if(array[mid] == target){
        return mid;
      } else if (array[mid] > target){
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}


#############################################################

15. First Occurrence

// Step 0: Specify Binary Search's Search Range: First/Last Occurrence uses left < right - 1
// Step 1: 根据Search Range取中点
// Step 2: 对比array[mid] and target
// Step 3: 缩小Search Range

public class Solution {
  public int firstOccur(int[] array, int target) {
    if (array ==  null || array.length == 0){
      return -1;
    }

    int left = 0;
    int right = array.length - 1;

    // First/Last Occurrence uses left < right - 1: 三个元素进循环
    while (left < right - 1){
      int mid = left + (right - left)/2;
      if(array[mid] == target){
        right = mid;
      } else if (array[mid] > target){
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    // Post Processing: There are still one/two elements unchecked, first occurence -> check left first then right
    if (array[left] == target){
      return left;
    } 
    if (array[right] == target){
      return right;
    } 
    return -1;
  }
}




public class Solution {
  public int firstOccur(int[] array, int target) {
    if (array == null || array.length == 0){
      return -1;
    }

    int left = 0;
    int right = array.length - 1;

    while (left < right - 1){
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        right = mid;
      } else if (array[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    // Post-Processing:
    if (array[left] == target){
      return left;
    } else if (array[right] == target) {
      return right;
    } else {
      return -1;
    }
  }
}


#############################################################

16. Last Occurrence

public class Solution {
  public int lastOccur(int[] array, int target) {
    if (array == null || array.length == 0){
      return -1;
    }

    int left = 0;
    int right = array.length -1;

    while (left < right - 1) {
      int mid = left + (right - left)/2;
      if (array[mid] == target){
        left = mid;
      } else if (array[mid] > target){
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    // Post Processing: Last Occurence -> Check right first then check left
    if (array[right] == target){
      return right;
    }
    
    if (array[left] == target){
      return left;
    }
    return -1;
  }
}


#############################################################

17. Closest In Sorted Array

// Step 1: 找出离target最近的两个数: First Occurence of element larger than/equal to target & Last Occurence of element smaller than/equal to target 
// Step 2: 算绝对值
public class Solution {
  public int closest(int[] array, int target) {
    if (array == null || array.length == 0){
      return -1;
    }

    // Specify Search Range:
    int left = 0;
    int right = array.length - 1;

    while (left < right - 1){
      int mid = left + (right - left)/2;
      if (array[mid] == target){
        return mid;
      } else if (array[mid] > target){
        right = mid; // Might be First Occurence of element larger than target
      } else {
        left = mid; // Might be Last Occurence of element smaller than target 
      }
    }
    // Post-Processing: 谁近取谁
    if (Math.abs(array[left] - target) < Math.abs(array[right] - target)){
      return left;
    } else {
      return right;
    }
  }
}



#############################################################

267. Search In Sorted Matrix I

#Method 1
public int[] search(int[][] matrix, int target) {
  int rows = matrix.length;
  int cols = matrix[0].length;

  int left = 0;
  int right = rows * cols - 1;

  while (left <= right) {
    int mid = left + (right - left) / 2;
    int row = mid / cols;
    int col = mid % cols;
    int value = matrix[row][col];

    if (value == target) {
      return new int[] {row, col};
    } else if (value < target) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }

  return new int[] {-1, -1};
}




#Method 2
// Classical Binary Search and 2D matrix 
// Search Range: [0, array.length(row*column) - 1]
// Search for What? Classical Binary Search 
// 难点： mid = left + (right - left)/2; how to turn mid from 1D to 2D

public class Solution {
  public int[] search(int[][] matrix, int target) {
    // No Corner Case assuming matrix is not null
    // Specify row and column 
    int row = matrix.length;
    int column = matrix[0].length;

    // Specify search range:  
    int left = 0;
    int right = row * column - 1;

    // Classical Binary Search
    while(left <= right){
      // Turn mid from 1D to 2D
      int mid = left + (right - left)/2;
      int midRow = mid / column;
      int midCol = mid % column;

      if (matrix[midRow][midCol] == target){
        return new int[]{midRow, midCol}; // Note: Create a new array and return 
      } else if (matrix[midRow][midCol] > target){
        right = mid -1;
      } else {
        left = mid + 1;
      }
    }
    return new int[]{-1, -1}; // Note: Create a new array and return 
  }
}


#############################################################

636. Smallest Element Larger than Target

// Search Range: [0, array.length - 1]
// Search for What?: First Occurrence of element such that array[index] > Target
public class Solution {
  public int smallestElementLargerThanTarget(int[] array, int target) {
    // Corner Case:
    if (array == null || array.length == 0){
      return -1;
    }

    // Specify left and right:
    int left = 0;
    int right = array.length -1;

    // Binary Search: Finding First Occurrence of element such that array[index] > Target
    while (left < right - 1){
      int mid = left + (right - left)/2;
      if (array[mid] > target){ // If mid > target, we must keep this mid as right since it could be the First Occurrence > target
        right = mid;
      } else {
        left = mid + 1; // If mid < target
      }
    }

    // Post Processing: Found two elements; Since we want First Occurrence, check left first
    if (array[left] > target){
      return left;
    }
    if (array[right] > target){
      return right;
    }
    return -1; // Return -1 if there is no such index.
  }
}


#############################################################


624. Fibonacci Number Lite

public class Solution {
  // Step 0: Function定义
  public int fibonacci(int K) {
    // Step 1: Base Case
    if (K <= 0){
      return 0;
    }
    if (K == 1){
      return 1;
    }
    // Step 2 & 3: Subproblem & Recursion Rule
    return fibonacci(K-1) + fibonacci(K-2);
  }
}


#############################################################

550. Calculate Factorial of n

public class Solution {
  // Step 0: Function定义是什么？给我一个数n, 我能计算出factorial of n: n*(n-1)*(n-2)...*1
  public long factorial(int n) {
    // Step 1: Base Case: n = 1
    if (n == 1) {
      return 1;
    }
    // Step 2: Subproblem: factorial(n - 1)
    // Step 3: Recursion rule: *n 
    return factorial(n-1)*n;
  }
}


#############################################################

13. a to the power of b


public class Solution {
  // Step 0: give me two integers a and b, I can calculate b times a result of multiple (a to the power of b)
  public long power(int a, int b) {
    // Step 1: Base Case: b == 0 return 1; b == 1 return a; 
    if (b == 0){
      return 1;
    }
    if (b == 1){
      return a;
    }
    // Step 2: Subproblem: power(a, b/2)
    // Step 3: 
    long subproblemResult = power(a, b/2);

    if (b % 2 == 0) {
      return subproblemResult * subproblemResult;
    }else{
      return subproblemResult * subproblemResult * a;
    }
  }
}

#############################################################

554. Generate LinkedList

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
  public ListNode generate(int n) {
    ListNode head = new ListNode(0);
    ListNode cur = head;
    for (int i = 1; i < n; i++){
      cur.next = new ListNode(i);
      cur = cur.next;
    }
    return head;
  }
}

#############################################################


555. Count Nodes in a LinkedList

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
  public int count(ListNode head) {
    if (head == null) {
      return 0;
    }

    int count = 0;
    ListNode cur = head;

    while (cur != null){
      count++;
      cur = cur.next;
    }

    return count;
  }
}

#############################################################

556. Find the Middle Node of a LinkedList (with odd number of nodes)

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
  public ListNode findMiddleNode(ListNode head) {
    if (head == null || head.next == null){
      return head;
    }

    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}

#############################################################

557. Find the Middle Node (first one in the mid two nodes) of a LinkedList (with even number of nodes)


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
  public ListNode findMiddleNode(ListNode head) {
    if (head == null || head.next == null){
      return head;
    }
    
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}

#############################################################


558. Find the Middle Node (second one in the mid two nodes) of a LinkedList (with even number of nodes)

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
  public ListNode findMiddleNode(ListNode head) {
    if (head == null || head.next == null){
      return head;
    }

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}

#############################################################

36. Middle Node Of Linked List

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
  public ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}

#############################################################

559. Insert a Node in a Sorted LinkedList (with length more than 1)

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
  public ListNode insertNode(ListNode head, int target) {
    ListNode newNode = new ListNode(target);
    ListNode cur = head;

    while (cur.next != null){ // VERY IMPORTANT, must make sure there is a cur.next bc you're inserting betw two numbers
      if (target >= cur.value && target <= cur.next.value){ // if cur.next = null, null.value -> NPE
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
      }
      cur = cur.next;
    }
    return head;
  }
}

#############################################################

560. Insert a Node to The Tail of a LinkedList

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
  public ListNode insertNode(ListNode head, int target) {
    ListNode newNode = new ListNode(target);
    ListNode cur = head;

    if (head == null){
      return newNode;
    }

    while (cur.next != null){
      cur = cur.next;
    }
    cur.next = newNode;
    return head;
  }
}

#############################################################

39. Insert In Sorted Linked List

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

// Similar as q559 (Insert to Sorted LinkedList with length > 1) 
// but this question's Sorted LinkedList could be length = 1
public class Solution {
  public ListNode insert(ListNode head, int target) {
    ListNode newNode = new ListNode(target);
    ListNode cur = head;

    // 1. Determine if the newNode is before head:
    if (head == null || head.value >= target){
      newNode.next = head;
      return newNode;
    }
    // 2. Insert the newNode to the right position:
    while (cur.next != null) {
      if (target >= cur.value && target <= cur.next.value){
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
      }
      cur = cur.next;
    }
    // 3. If linkedlist has only one node, must insert newNode behind
    cur.next = newNode;
    return head;
  }
}


// Method 2
public class Solution {
  public ListNode insert(ListNode head, int target) {
    ListNode newNode = new ListNode(target);
    ListNode cur = head;

    // 1. Determine if the newNode is before head:
    if (head == null || head.value >= target){
      newNode.next = head;
      return newNode;
    }
    // 2. Insert the newNode to the right position:
    while (cur.next != null && cur.next.value < target){
      cur = cur.next;
    }
    newNode.next = cur.next;
    cur.next = newNode;
    return head;
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
    if (head == null || head.next == null){
      return head;
    }

    ListNode prev = null;
    ListNode cur = head;

    // High Level: 只要有点没有reverse, reverse每个点
    while (cur != null){
      // 1. 记录next
      ListNode nextNode = cur.next;
      // 2. 反转
      cur.next = prev;
      // 3. 为下次反转做准备，先动prev再动cur
      prev = cur;
      cur = nextNode;
    }
    return prev;
  }
}

#############################################################

653. Reverse Linked List (recursive)
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
  // Step Extra: Give me a LinkedList's head, I can reverse all nodes in the LinkedList and return the new head after the reverse
  public ListNode reverse(ListNode head) { 
    // Step 1: Base Case
    if (head == null || head.next == null) {
      return head;
    }
    // Step 2: Subproblem 
    ListNode subProblemResult = reverse(head.next);

    // Step 3: Recursion Rule 
    head.next.next = head;
    head.next = null;
    return subProblemResult;
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
    if (oneHead == null){
      return twoHead;
    }
    if (twoHead == null){
      return oneHead;
    }

    // Set up variables:
    ListNode cur1 = oneHead;
    ListNode cur2 = twoHead;
    ListNode dummyHead = new ListNode(0);
    ListNode cur = dummyHead;

  while (cur1 != null && cur2 != null){
    if (cur1.value < cur2.value){
      cur.next = cur1;
      cur1 = cur1.next;
    } else {
      cur.next = cur2;
      cur2 = cur2.next;
    }
    cur = cur.next;
  }

  // 如果有一边还有剩余的节点，我们就直接接上就好
  if (cur1 == null){ 
    cur.next = cur2;
  }
  if (cur2 == null){
    cur.next = cur1;
  }
  return dummyHead.next;
  }
}



// Method 2
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
  public ListNode removeElements(ListNode head, int toBeDeletedValue) {
    // Corner Case:
    if (head == null){
      return head;
    }

    // Set up New Variables:
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;

    ListNode prev = dummyHead;
    ListNode cur = head;

    while(cur != null){
      if (cur.value == toBeDeletedValue){
        prev.next = cur.next;
      } else {
        prev = cur;
      }
      cur = cur.next;
    }
    return dummyHead.next;
  }
}

#############################################################

655. Pre-order Traversal Of Binary Tree (recursive)

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  // Give me a root treenode, I can return whole tree in a list of preOrder style
  public List<Integer> preOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    traverse (result, root);
    return result;
  }
  
  private void traverse(List<Integer> result, TreeNode root){
    //  Base Case:
    if (root == null){
      return;
    }

    // Recursion Rule:
    result.add(root.key);

    // Subproblems:
    helperFunction(result, root.left);
    helperFunction(result, root.right);
  }
}

#############################################################

654. In-order Traversal Of Binary Tree (recursive)

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

 // Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  public List<Integer> inOrder(TreeNode root) {
    List<Integer> ans = new ArrayList<>();

    traversal(ans, root);

    return ans;
  }

  private void traversal(List<Integer> ans, TreeNode root) {
    if (root == null) {
      return;
    }

    traversal(ans, root.left);
    ans.add(root.key);   
    traversal(ans, root.right);
  }
}

#############################################################

656. Post-order Traversal Of Binary Tree (recursive)


/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

 // Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  public List<Integer> postOrder(TreeNode root) {
    List<Integer> ans = new ArrayList<>();

    traversal(ans, root);

    return ans;
  }

  private void traversal(List<Integer> ans, TreeNode root) {
    if (root == null) {
      return;
    }

    traversal(ans, root.left);
    traversal(ans, root.right);
    ans.add(root.key);
  }
}


#############################################################

60. Height of Binary Tree

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

 // Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  // Give me a root node, I will return you the height of the binary tree with that root node and return the height in int
  public int findHeight(TreeNode root) {
    // Base Case:
    if (root == null){
      return 0;
    }

    // Subproblem:
    int leftHeight = findHeight(root.left);
    int rightHeight = findHeight(root.right);

    // Recursion Rule:
    int height = Math.max(leftHeight, rightHeight) + 1;

    return height;
  }
}

#############################################################

563. Count Node

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  // Give me a root node, I will return the number of nodes on this tree which is an integer
  public int countNodes(TreeNode root) {
    // Corner Case:
    if (root == null) {
      return 0;
    }

    // Subproblems:
    int countLeft = countNodes(root.left);
    int countRight = countNodes(root.right);

    // Recursion Rule:
    int count = countLeft + countRight + 1;
    return count;
  }
}


#############################################################


46. Check If Binary Tree Is Balanced

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

 // Time Complexity: O(nlogn)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);

    if (isBalanced(root.left) && isBalanced(root.right) && (Math.abs(leftHeight - rightHeight) <= 1)) {
      return true;
    }

    return false;
  }

  private int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    int height = Math.max(leftHeight, rightHeight) + 1;

    return height;
  }
}

// My Version:

public class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);

    return isBalanced(root.left) && isBalanced(root.right) && Math.abs(leftHeight - rightHeight) <= 1;
  }

  private int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    int totalHeight = Math.max(leftHeight, rightHeight) + 1;
    return totalHeight;
  }
}

#############################################################

546. Find Index of Minimum Value

public class Solution {
  public int minIndex(int[] array, int i) {
    int minIndex = i;
    for (int j = i + 1; j < array.length; j++){
      if (array[j] < array[minIndex]){
        minIndex = j;
      }
    }
    return minIndex;
  }
}

#############################################################

4. Selection Sort

// Class 11 Part 1 (00:37:00)

public class Solution {
  public int[] solve(int[] array) {
    // Corner Case:
    if (array == null || array.length <= 1) {
      return array;
    }
    for (int i = 0; i < array.length - 1; i++){
      int minIndex = i;
      // Find the min element in the subarray of (i, array.length - 1)
      for (int j = i + 1; j < array.length; j++){
        if (array[j] < array[minIndex]){
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





public class Solution {
  public int[] solve(int[] array) {
    // 🛑 Edge case: if the array is null or has 0 or 1 elements, it's already sorted
    if (array == null || array.length <= 1) {
      return array;
    }

    // 🔁 Outer loop: iterate through the array till the second to last 
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;

      // 🔍 Find the index of the smallest value in the rest of the array
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j; // Update if a smaller value is found
        }
      }

      // 🔄 Swap the smallest value with the current value at index i
      swap(array, i, minIndex);
    }

    // ✅ Return the sorted array
    return array;
  }

  // 🔁 Helper method to swap two elements in the array
  public void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}

#############################################################

547. Merge Two Sorted Arrays

public class Solution {
  public int[] merge(int[] array1, int[] array2) {
    int[] result = new int[array1.length + array2.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < array1.length && j < array2.length){
      // 谁小取谁，取谁移谁
      if (array1[i] <= array2[j]){
        result[k] = array1[i];
        i++;
      } else {
        result[k] = array2[j];
        j++;
      }
      k++;
    }
    // If we still have elements left in array1, we need to copy all of them:
    while (i < array1.length){
      result[k] = array1[i];
      i++;
      k++;
    }
    // If we still have elements left in array2, we need to copy all of them:
    while (j < array2.length){
      result[k] = array2[j];
      j++;
      k++;
    }
    return result;
  }
}

#############################################################

9. Merge Sort

public class Solution {
  public int[] mergeSort(int[] array) {
    if (array == null || array.length <= 1){
      return array;
    }
    return mergeSort(array, 0, array.length - 1);
  }
  
  // #1.Helper function: mergeSort(function overload?)
  private int[] mergeSort(int[] array, int left, int right){
    // Base Case:
    if (left == right){
      return new int[] {array[left]}; // 返回的是一个array, 里面只有一个元素； 不是一个index, 也不是一个元素本身
    }

    // Subproblem 
    int mid = left + (right - left) / 2;
    int [] leftResult = mergeSort(array, left, mid);
    int [] rightResult = mergeSort(array, mid + 1, right);

    // Recursion Rule 
    return merge(leftResult, rightResult); // helper function #2
  }

  // #2.Helper function: merge
  private int[] merge(int[] leftResult, int[] rightResult){
    int[] result = new int[leftResult.length + rightResult.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < leftResult.length && j < rightResult.length){
      if (leftResult[i] < rightResult[j]){
        result[k] = leftResult[i];
        i++;
      } else {
        result[k] = rightResult[j];
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

547. Merge Two Sorted Arrays

public class Solution {
  public int[] merge(int[] array1, int[] array2) {
    int[] result = new int[array1.length + array2.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < array1.length && j < array2.length){
      // 谁小取谁，取谁移谁
      if (array1[i] <= array2[j]){
        result[k] = array1[i];
        i++;
      } else {
        result[k] = array2[j];
        j++;
      }
      k++;
    }
    // If we still have elements left in array1, we need to copy all of them:
    while (i < array1.length){
      result[k] = array1[i];
      i++;
      k++;
    }
    // If we still have elements left in array2, we need to copy all of them:
    while (j < array2.length){
      result[k] = array2[j];
      j++;
      k++;
    }
    return result;
  }
}

#############################################################

9. Merge Sort

public class Solution {

  // STEP 1: Start Sorting with corner case

  public int[] mergeSort(int[] array) {
    if (array == null || array.length <= 1){
      return array;
    }
    return mergeSort(array, 0, array.length - 1);
  }
  
  // STEP 2: Split with recursion 

  // #1.Helper function: mergeSort(function overload?)
  private int[] mergeSort(int[] array, int left, int right){
    // Base Case:
    if (left == right){
      return new int[] {array[left]}; // 返回的是一个array, 里面只有一个元素； 不是一个index, 也不是一个元素本身
    }

    // Subproblem 
    int mid = left + (right - left) / 2;
    int [] leftResult = mergeSort(array, left, mid);
    int [] rightResult = mergeSort(array, mid + 1, right);

    // Recursion Rule 
    return merge(leftResult, rightResult); // helper function #2
  }
  
  // STEP 3: Merge 

  // #2.Helper function: merge
  private int[] merge(int[] leftResult, int[] rightResult){
    int[] result = new int[leftResult.length + rightResult.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < leftResult.length && j < rightResult.length){
      if (leftResult[i] < rightResult[j]){
        result[k] = leftResult[i];
        i++;
      } else {
        result[k] = rightResult[j];
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

14. Classical Binary Search

// Step 0: Specify Binary Search's Search Range: while (left <= right)
// Step 1: 根据Search Range取中点
// Step 2: 对比array[mid] and target
// Step 3: 缩小Search Range
public class Solution {
  public int binarySearch(int[] array, int target) {
    if (array == null | array.length == 0) {
      return -1;
    }

    int left = 0;
    int right = array.length -1;

    while (left <= right) {
      int mid =  left + (right - left) / 2;
      if (array[mid] == target){
        return mid;
      } else if (array[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
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
        return new int[] {midRow, midCol};
      } else if (value > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return new int[] {-1, -1};
  }
}

#############################################################

17. Closest In Sorted Array

public class Solution {
  public int closest(int[] array, int target) {
    if (array == null || array.length == 0){
      return -1;
    }

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

    //Post Processing:
    if (Math.abs(array[left] - target) > Math.abs(array[right] - target)) {
      return right;
    } else {
      return left;
    }
  }
}

#############################################################

15. First Occurrence

// Step 0: Specify Binary Search's Search Range: First/Last Occurrence uses left < right - 1
// Step 1: 根据Search Range取中点
// Step 2: 对比array[mid] and target
// Step 3: 缩小Search Range

public class Solution {
  public int firstOccur(int[] array, int target) {
    if (array == null || array.length == 0) {
      return -1;
    }

    int left = 0;
    int right = array.length -1;

    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] ==  target){ 
        right = mid;
      } else if (array[mid] > target){
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
     //Post Processing:
     if (array[left] == target){
       return left;
     }
     if (array[right] == target){
       return right;
     }
     return -1;
  }
}

#############################################################

16. Last Occurrence

public class Solution {
  public int lastOccur(int[] array, int target) {
    if (array == null || array.length == 0){
      return -1;
    }

    int left = 0;
    int right = array.length - 1;

    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        left = mid;
      } else if (array[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    // Post Processing:
    if (array[right] == target) {
      return right;
    }
    if (array[left] == target) {
      return left;
    }

    return -1;
  }
}

#############################################################

19. K Closest In Sorted Array

 public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    // Assume array, target, k are all valid
    // Specify left and right for 双指针，左边是"index" closest to target, 右边是left + 1
    int left = findClosestToTarget(array, target); // You run out of elements on the left when left < 0
    int right = left + 1; // You run out of elements on the right when right >= array.length

    // 双指针：做k次谁小取谁，取谁移谁
    int [] result = new int[k];
    for (int i = 0; i < k; i++){
      if (right >= array.length){
          result[i] = array[left]; // When you run out of elements on the right, you take the elements on the left using index
          left--;
      } else if (left < 0){
          result[i] = array[right]; // When you run out of elements on the left, you take the elements on the right using index
      // 开始谁小取谁，取谁移谁 
      } else if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) { // "=" Very important: If there is a tie, the smaller elements are always preferred -> take "left"
          result[i] = array[left];
          left--; // 取谁移谁
      } else {
          result[i] = array[right];
          right++; // 取谁移谁
      }
    }
    return result; // Return an array with all elements that are K closest to Target
  }

  // Here's the findClosestToTarget method called by above - int right
  // Need to find the closest index to the target
  private int findClosestToTarget(int[] array, int target){
    // Corner Case 
    if (array == null || array.length == 0){
      return -1;
    }

    // Specify left and right:
    int left = 0;
    int right = array.length - 1;

    // First/Last Occurrence: Find two elements next to the target -> the largest element <= target & the smallest element >= target
    while (left < right - 1){
      int mid = left + (right - left)/2;
      if (array[mid] == target){
        return mid;
      } else if (array[mid] > target){
        right = mid;
      } else {
        left = mid;
      }
    }

    // Post Processing: You have found the two elements next to the target -> the largest element <= target & the smallest element >= target
    // Now you have to find which one is closest to the target:
    if (Math.abs(array[left] - target) < Math.abs(array[right] - target)){
      return left;
    } else {
      return right;
    }
  }
}


#############################################################

636. Smallest Element Larger than Target

public class Solution {
  public int smallestElementLargerThanTarget(int[] array, int target) {
    if (array == null || array.length == 0) {
      return -1;
    }
    int left = 0;
    int right = array.length - 1;

    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target){
        left = mid + 1;
      } else if (array[mid] > target) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    if (array[left] > target) {
      return left;
    } 

    if (array[right] > target) {
      return right;
    }
    return -1;
  }
}


#############################################################

69. Missing Number II

// https://github.com/MajorGrinch/leetcode-solution/blob/master/laicode-69-Missing-Number-II.md

public class Solution {
  public int missing(int[] array) {
    if (array == null || array.length == 0) {
      return 1;
    }

    int n = array.length;
    if (array[0] != 1) {
      return 1;
    }
    if (array[n - 1] == n) {
      return n + 1;
    }

    int left = 0;
    int right = n - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (array[mid] != mid + 1) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return left + 1;
  }
}

// Time complexity: O(logn)
// Space complexity: O(1)


// Method 2
public class Solution {
  public int findMissing(int[] array) {
    int n = array.length + 1; // Since one number is missing
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;

    for (int num : array) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }
}
// Time: O(N)  
// Space: O(1)

#############################################################

33. Number Of Nodes

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
  public int numberOfNodes(ListNode head) {
    if (head == null) return 0;
    ListNode cur = head;
    int count = 0;
    while (cur != null){
      count++;
      cur = cur.next;
    }
    return count;
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

    ListNode pre = null;
    ListNode cur = head;

    while (cur != null) {
      ListNode next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
    
  }
}


#############################################################

36. Middle Node Of Linked List

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
  public ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}

#############################################################

37. Check If Linked List Has A Cycle

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
  public boolean hasCycle(ListNode head) {
    // Corner Case:
    if (head == null || head.next == null){
      return false;
    }

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast){
        return true;
      }
    }
    return false;
  }
}


#############################################################

39. Insert In Sorted Linked List

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

223. Add Two Numbers

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

// Step 1. Reverse two linked lists so that you first add up the ones digits, then the tens digits, then the hunderds digits
// Step 2. Add up all the digits with a carry  
    // note1. If we run out of digits to add but there is a carry at the end, then this carry will be the new node
    // note2. If list "one" runs out of nodes, we assume list one.value is 0
// Step 3. Reverse the solution

public class Solution {
  public ListNode addTwoNumbers(ListNode one, ListNode two) {
    // Create variables:
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    int carry = 0;

    // Continue if there are still digits left in a OR b
    while (one != null || two != null){
      // if one != null is true, use one.value; if false, use 0;
      int x = (one != null)? one.value : 0;
      int y = (two != null)? two.value : 0;
      int sum = x + y + carry;

      carry = sum / 10;
      ListNode newNode = new ListNode(sum % 10);
      cur.next = newNode;
      cur = cur.next;
      if (one != null) {
        one = one.next;
      }
      if (two != null) {
        two = two.next;
      }

      // If we run out of digits to add but there is a carry at the end, then this carry will be the new node
      if (carry > 0){
        cur.next = new ListNode(carry);
      }
    }
    return dummy.next;
    // We are supposed to reverse the output but in this question, it didn't ask for the reversed output.
  }
}

#############################################################

306. Check If Linked List Is Palindrome

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

 // Step 1: Find mid-point of the linked list
 // Step 2: Split the linked list by mid-point (one & two) and reverse the second half - two
 // Step 3: Check if one and two are the same 

public class Solution {
  public boolean isPalindrome(ListNode head) {
    // Corner Case：
    if (head == null || head.next == null){
      return true;
    }

    // Create variables:
    ListNode one = head;
    ListNode mid = findMid(head);
    ListNode two = mid.next;

    return isPalindrome(one, reverseLinkedList(two));
  }

  // #1.Helper Function: Find Mid Point
  private ListNode findMid(ListNode head){
    if (head == null || head.next == null){ 
      return head;
    }
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  // #2.Helper Function: Reverse the second half
  private ListNode reverseLinkedList(ListNode head){
    if (head == null || head.next == null){ 
      return head;
    }

    ListNode prev = null;
    ListNode next = null;
    ListNode cur = head;

    while (cur != null){
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }

  // #3.Helper Function: isPalindrome(one, reverseLinkedList(two)
  private boolean isPalindrome(ListNode one, ListNode two){
    ListNode cur1 = one;
    ListNode cur2 = two;

    while (cur1 != null && cur2 != null){
      if (cur1.value == cur2.value){
        cur1 = cur1.next;
        cur2 = cur2.next;
      } else {
        return false;
      }
    }
    return true;
  }

}

#############################################################

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
    return dummyHead.next;
  }
}

#############################################################

624. Fibonacci Number Lite

public class Solution {
  public int fibonacci(int K) {
    // Base Case:
    if (K <= 0) {
      return 0;
    }
    if (K == 1) {
      return 1;
    }

    // Subproblems & Recursion Rule
    return fibonacci(K-1) + fibonacci(K-2);
  }
}

#############################################################

13. a to the power of b

public class Solution {
  public long power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    if (b == 1){
      return a;
    }

    // subproblem
    long subproblemResult = power(a, b/2);

    if (b % 2 == 0) {
      return subproblemResult * subproblemResult;
    } else {
      return subproblemResult * subproblemResult * a;
    }
  }
}

#############################################################

4. Selection Sort

/*
Visualization: https://www.google.com/search?q=selection+sort+visualization&sca_esv=12e31e5ec8c98cce&sxsrf=AE3TifNNrKXZ5mXSIjZWu-uWG_Jueyhrlg%3A1750142915593&ei=ww9RaL-AJOKY5OMPyqahyQg&oq=selection+sort+vis&gs_lp=Egxnd3Mtd2l6LXNlcnAiEnNlbGVjdGlvbiBzb3J0IHZpcyoCCAAyBRAAGIAEMgUQABiABDIFEAAYgAQyBhAAGBYYHjIGEAAYFhgeMggQABgWGAoYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjILEAAYgAQYhgMYigVI3RZQ_ARY_g5wAXgBkAEAmAFcoAHPAqoBATS4AQPIAQD4AQGYAgWgAucCwgIKEAAYsAMY1gQYR8ICDRAAGIAEGLADGEMYigXCAgoQABiABBhDGIoFwgINEAAYgAQYsQMYQxiKBcICCBAAGIAEGKIEmAMAiAYBkAYKkgcBNaAH4RiyBwE0uAfiAsIHBTAuMS40yAcT&sclient=gws-wiz-serp#fpstate=ive&vld=cid:6563a947,vid:MxEooU-8ps8,st:0
*/

public class Solution {
  public int[] solve(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }

    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
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

#############################################################

9. Merge Sort

/*
https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/visualize/
*/
/*
https://www.youtube.com/watch?v=3j0SWDX4AtU
*/

public class Solution {
  // Start
  public int[] mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
      return array;
    }

    return mergeSort(array, 0, array.length - 1);
  }

  
  // Split with recursion
  private int[] mergeSort(int[] array, int left, int right) {
    // Base Case:
    if (left == right) {
      return new int[] {array[left]};
    }

    // Subproblem:
    int mid = left + (right - left) / 2;
    int[] leftResult = mergeSort(array, left, mid);
    int[] rightResult = mergeSort(array, mid + 1, right);

    // Recursion Rule:
    return merge(leftResult, rightResult);
  }

  // Merge
  private int[] merge (int[] leftResult, int[] rightResult) {
    int[] result = new int[leftResult.length + rightResult.length]; 
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < leftResult.length && j < rightResult.length) {
      if (leftResult[i] <= rightResult[j]) {
        result[k] = leftResult[i];
        i++;
      } else {
        result[k] = rightResult[j];
        j++;
      }
      k++;
    }

    while (i < leftResult.length) {
      result[k] = leftResult[i];
        i++;
        k++;
    }

    while (j < rightResult.length) {
      result[k] = rightResult[j];
        j++;
        k++;
    }

    return result;
  }


}


#############################################################

10. Quick Sort

/*
https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/visualize/

https://opendsa-server.cs.vt.edu/embed/quicksortAV
*/

public class Solution {
  public int[] quickSort(int[] array) {
    // Start
    if (array == null || array.length <= 1) {
      return array;
    }

    quickSort(array, 0, array.length - 1);
    return array;
  }
  // Random
  private Random random = new Random();

  // Split 
  private void quickSort(int[] array, int left, int right) {
    // base case:
    if (left >= right) {
      return;
    }

    // generate pivot and move to the end
    int pivotIndex = left + random.nextInt (right - left + 1);
    swap(array, pivotIndex, right);

    int i = left;
    int j = right - 1;
    while (i <= j) {
      if (array[i] < array[right]) {
        i++;
      } else {
        swap(array, i, j);
        j--;
      }
    }
    swap(array, i, right);

    quickSort(array, left, i - 1); // left of the pivot
    quickSort(array, i + 1, right); // right of the pivot
  }

  // Swap
  private void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}


#############################################################

258. Move 0s To The End I

/*
public class Solution {
  public int[] moveZero(int[] array) {
    // Corner Case:
    if (array == null || array.length <= 1){
      return array;
    }

    int left = 0;
    int right = array.length - 1;

    while (left <= right){
      if (array[left] != 0){
        left++;
      } else {
        swap(array, left, right);
        right--;
      }
    }
    return array;
  }

  private void swap(int[] array, int x, int y){
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}
*/

/*
题目要求把所有的0都挪到最后，其他元素相对位置不用维护。

利用快排中的循环不变量，这里也是一左一右两个挡板l和r。l左边，即[0, l)都是不等于0的，r右边，即(r, len - 1]都是等于0的。

和快排类似的维护循环不变量的方法，最后循环退出时候循环不变量依然成立，所以我们可以确定答案的正确性。

Time complexity: O(N)

Space complexity: O(1)
*/

public class Solution {
    public int[] moveZero(int[] array) {
        int l = 0, r = array.length - 1;
        while(l <= r){
            if(array[l] != 0){
                l++;
            }else if(array[r] == 0){
                r--;
            }else{
                swap(array, l++, r--);
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



#############################################################

548. Bounded Random Number

class Solution {
  public int random(int a, int b) {
      Random rand = new Random();
      return a + rand.nextInt(b - a + 1);
  }
}

#############################################################

10. Quick Sort

public class Solution {
  public int[] quickSort(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }

    quickSort(array, 0, array.length - 1);

    return array;
  }

  private Random rand = new Random();

  private void quickSort(int[] array, int left, int right) {
    if (left >= right) {
      return;
    }

    int pivot = left + rand.nextInt(right - left + 1);

    swap(array, pivot, right);

    int i = left;
    int j = right - 1;

    while (i <= j) {
      if (array[i] > array[right]) {
        swap(array, i, j);
        --j;
      }
      else {
        ++i;
      }
    }

    swap(array, i, right);

    quickSort(array, left, i - 1);
    quickSort(array, i + 1, right);
  }

  private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}





#############################################################

258. Move 0s To The End I

// Method 1

/*
题目要求把所有的0都挪到最后，其他元素相对位置不用维护。

利用快排中的循环不变量，这里也是一左一右两个挡板l和r。l左边，即[0, l)都是不等于0的，r右边，即(r, len - 1]都是等于0的。

和快排类似的维护循环不变量的方法，最后循环退出时候循环不变量依然成立，所以我们可以确定答案的正确性。

Time complexity: O(N)

Space complexity: O(1)
*/

public class Solution {
    public int[] moveZero(int[] array) {
        int left = 0, right = array.length - 1;
        while(left <= right){
            if(array[left] != 0){
                left++;
            }else if(array[right] == 0){
                right--;
            }else{
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



// Method 2

public class Solution {
  public int[] moveZero(int[] array) {
    // Corner Case:
    if (array == null || array.length <= 1){
      return array;
    }

    int left = 0;
    int right = array.length - 1;

    while (left <= right){
      if (array[left] != 0){
        left++;
      } else {
        swap(array, left, right);
        right--;
      }
    }
    return array;
  }

  private void swap(int[] array, int x, int y){
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}

#############################################################

11. Rainbow Sort

// Method 1

public class Solution {
  public int[] rainbowSort(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }
    int neg = 0;
    int zero = 0;
    int one = array.length - 1;
    
    while (zero <= one) {
      if (array[zero] == -1) {
        swap(array, neg++, zero++);
      } else if (array[zero] == 0) {
        zero++;
      } else {
        swap(array, zero, one--);
      }
    }
    return array;
  }

  private void swap(int[] array, int a, int b) {
    int tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }
}


// Method 2

public class Solution {
  public int[] rainbowSort(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }
    int red = 0;
    int green = 0;
    int blue = array.length - 1;

    while (green <= blue) {
      if (array[green] == -1) {
        swap(array, red++, green++);
      } else if (array[green] == 0) {
        green++;
      } else {
        swap(array, green, blue--);
      }
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

653. Reverse Linked List (recursive)

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
    // Base Case:
    if (head == null || head.next == null) {
      return head;
    }

    // Subproblem:
    ListNode subResult = reverse(head.next);

    // Recursion Rule:
    head.next.next = head;
    head.next = null;
    return subResult;
  }
}

#############################################################

29. Merge Sort Linked List

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
  public ListNode mergeSort(ListNode head) {
    if (head == null || head.next == null){
      return head;
    }

    // Split linkedlist into two halves, then cut the connection 
    ListNode mid = findMid(head);
    ListNode midNext = mid.next;
    mid.next = null;

    // Subproblem: sort each half
    ListNode left = mergeSort(head);
    ListNode right = mergeSort(midNext);

    // Recursion Rule: combine two halves
    return merge(left, right);
  }

  // #1 Helper Function: findMid
  private ListNode findMid(ListNode head){
      if (head == null){
        return head;
      }
      ListNode slow = head;
      ListNode fast = head;

      while (fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
  }
  // #2 Helper Function: merge
  private ListNode merge(ListNode one, ListNode two){
      // Corner Case:
      if (one == null){
        return two;
      }
      if (two == null){
        return one;
      }
      ListNode dummy = new ListNode(0);
      ListNode cur = dummy;
      ListNode cur1 = one;
      ListNode cur2 = two;

      while (cur1 != null && cur2 != null){
        if (cur1.value < cur2.value){
          cur.next = cur1;
          cur1 = cur1.next;
        } else {
          cur.next = cur2;
          cur2 = cur2.next;
        }
        cur = cur.next;
      }

      if (cur1 == null){
        cur.next = cur2;
      }

      if (cur2 == null){
        cur.next = cur1;
      }
      return dummy.next;
  }

}

#############################################################

280. Sort With 2 Stacks

public class Solution {
  public void sort(LinkedList<Integer> s1) {
    LinkedList<Integer> s2 = new LinkedList<Integer>();
    // Write your solution here.
    if (s1 == null || s1.size() <= 1){
      return;
    }

    int n = s1.size(); // There are n elements in total to sort
    for (int i = 0; i < n; i++){
      int currentMin = Integer.MAX_VALUE;
      // Transfer elements from s1 to s2 while looking for the currentMin 
      while (!s1.isEmpty()){
        int current = s1.pollFirst(); // poll each s1 element
        currentMin = Math.min(currentMin, current); // Loop through s1 to find currentMin
        s2.offerFirst(current); // offer each s1 element to s2
      }

      // Transfer elements that are greater than currentMin back to s1
      // offer all elements == currentMin to s2
      int minCount = 0; // Must keep track of number of currentMin since there can be duplicates
      while (!s2.isEmpty()){
        int current = s2.peekFirst();
        if (current < currentMin){
          break; // Case3: entering the already sorted result section; break to keep the element in s2
        } else if (current > currentMin){
          s1.offerFirst(s2.pollFirst()); // Case1: poll from s2 and offer to s1
        } else { // Case2: current == current min: count the number of currentMin so we can offer them all later
          s2.pollFirst();
          minCount++;
        }
      }

      // offer all instances of currentMin to s2 for result and we are done with this level 
      for (int j = 0; j < minCount; j++){
        s2.offerFirst(currentMin);
      }
    }

    // Transfer all elements from s2 back to s1 such that all elemetns in s1 are sorted in ascending order from top to bottom
    while (!s2.isEmpty()){
      s1.offerFirst(s2.pollFirst());
    }
  }
}

// My Version:
public class Solution {
  public void sort(LinkedList<Integer> s1) {
    // create a second stack
    LinkedList<Integer> s2 = new LinkedList<Integer>();

    // corner case
    if (s1 == null || s1.size() <= 1) {
      return;
    }

    // loop through all elements 
    int n = s1.size();
    for (int i = 0; i < n; i++) {
      // poll from s1 & offer to s2 to find currentMin
      int currentMin = Integer.MAX_VALUE;
      while (!s1.isEmpty()) {
        int current = s1.pollFirst();
        currentMin = Math.min(current, currentMin);
        s2.offerFirst(current);
      }

      // poll from s2 & offer to s1 but EXCLUDE all the min 
      // use count to keep track of how many min
      int minCount = 0;
      while(!s2.isEmpty()) {
        int current = s2.peekFirst();
        if (current > currentMin) {
          s1.offerFirst(s2.pollFirst());
        } else if (current == currentMin) {
          s2.pollFirst();
          minCount++;
        } else {
          break; // break & exit the WHILE loop bc you are getting into the sorted section
        }
      }
      // offer currentMin to s2 using minCount
      for (int j = 0; j < minCount; j++) {
        s2.offerFirst(currentMin);
      }
    }

    // Lastly, poll from s2 and offer to s1 to get sorted elements
    while (!s2.isEmpty()) {
      s1.offerFirst(s2.pollFirst());
    }
  }
}

#############################################################

31. Queue By Two Stacks

/*
💡 Real-Life Analogy
Imagine two trays:
You stack plates onto stackOne (adding to the top).
When someone wants the bottom-most plate (the one added first), you flip stackOne onto stackTwo, so now the oldest plate is on top of stackTwo.

stackOne (for adding new items): []
stackTwo (for removing/peeking): []
*/

public class Solution {
  // Set up two stacks
  // The 1st stack is used only when we need to add in new elements
  // The 2nd stack is used only when we need to poll or peek the first element
  Deque<Integer> stackOne = new LinkedList<>();
  Deque<Integer> stackTwo = new LinkedList<>();

  public Integer poll() {
    // When there are elements in the 2nd stack -> poll directly
    // If stackTwo is empty, transfer all elements from stackOne to stackTwo and poll
    if (stackTwo.isEmpty()) {
      transferStack();
    }
    return stackTwo.pollFirst();
  }

  public void offer(int element) {
    stackOne.addFirst(element);
  }

  public Integer peek() {
    if (stackTwo.isEmpty()) {
      transferStack();
    }
    return stackTwo.peekFirst();
  }

  public int size() {
    return stackOne.size() + stackTwo.size();
  }

  public boolean isEmpty() {
    return stackOne.isEmpty() && stackTwo.isEmpty();
  }

  private void transferStack() {
    while (!stackOne.isEmpty()) {
      stackTwo.addFirst(stackOne.pollFirst());
    }
  }
}

// My version
public class Solution {
  Deque<Integer> s1 = new LinkedList<>();
  Deque<Integer> s2 = new LinkedList<>();
  
  // add element to the back of the queue
  public void offer(int element) {
    s1.offerFirst(element);
  }

  // remove element at the front of the queue
  public Integer poll() {
    if (s2.isEmpty()) {
      transferStack();
    }
    return s2.pollFirst();
  }

  // peek first element at the front of the queue
  public Integer peek() {
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
    while(!s1.isEmpty()) {
      s2.offerFirst(s1.pollFirst());
    }
  }

}

#############################################################

32. Stack With min()

public class Solution {
  private Deque<Integer> stack;
  private Deque<Element> minStack;

  /**
   * The helper class to represent the pairs of
   * <element, size of the stack when it gets pushed>
   */
  private class Element {
    int val;
    int size;

    private Element(int val, int size) {
      this.val = val;
      this.size = size;
    }
  }

  public Solution() {
    // write your solution here
    stack = new ArrayDeque<>();
    minStack = new ArrayDeque<>();
  }

  public int pop() {
    if (stack.isEmpty()) {
      return -1;
    }
    // If the size of the stack will become smaller than it used to be when
    // the current min was pushed, also pop the minStack
    if (stack.size() == minStack.peekFirst().size) {
      minStack.pollFirst();
    }
    return stack.pollFirst();
  }

  public void push(int element) {
    stack.offerFirst(element);
    // If the element is smaller than the current min,
    // also push it onto the minStack
    if (minStack.isEmpty() || element < minStack.peekFirst().val) {
      minStack.offerFirst(new Element(element, stack.size()));
    }
  }

  public int top() {
    return stack.isEmpty() ? -1 : stack.peekFirst();
  }

  public int min() {
    return minStack.isEmpty() ? -1 : minStack.peekFirst().val;
  }
}


// My Version:

public class Solution {
  // declare class-level variables
  private Deque<Integer> stack;
  private Deque<Integer> minStack;
  // constructor to initialize both stacks
  public Solution() {
    stack = new ArrayDeque<>();
    minStack = new ArrayDeque<>();
  }
  // push 
  public void push(int element) {
    stack.offerFirst(element); // push to stack
    if (minStack.isEmpty() || element <= minStack.peekFirst()) { // push to minStack with conditions
      minStack.offerFirst(element);
    }
  }
  // remove and return the first element of the stack and minStack
  public int pop() {
    if (stack.isEmpty()){
      return -1;
    }

    int first = stack.pollFirst(); // poll from stack
    if (!minStack.isEmpty() && first == minStack.peekFirst()) { // poll from minStack with conditions
      minStack.pollFirst();
    }
    return first;
  }
  // top = peek
  public int top() {
    return stack.isEmpty() ? -1 : stack.peekFirst();
  }
  // min
  public int min() {
    return minStack.isEmpty() ? -1 : minStack.peekFirst();
  }
}


#############################################################

634. Stack by Queue(s)

class Solution {
    Queue<Integer> q1;
    Queue<Integer> q2;
    /** Initialize your data structure here. */
    public Solution() {
       q1 = new ArrayDeque<>();
       q2 = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public Integer pop() {
        Integer prev = q1.poll();
        Integer curr = q1.poll();

        while (curr != null) {
          q2.offer(prev);
          prev = curr;
          curr = q1.poll();
        }

        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;

        return prev;
    }

    /** Get the top element. */
    public Integer top() {
        Integer ans = pop();

        if (ans != null) {
          q1.offer(ans);
        }

        return ans;
    }

    /** Returns whether the stack is empty. */
    public boolean isEmpty() {
      return top() == null;
    }
}

// My Version:

class Solution {
    // declare two queues
    Queue<Integer> q1;
    Queue<Integer> q2;

    // contructor to initialize
    public Solution() {
      q1 = new ArrayDeque<>();
      q2 = new ArrayDeque<>();      
    }

    // push
    public void push(int x) {
      q1.offer(x); // FIGURE OUT offer vs. offerFirst
        
    }

    // removes the element on top of the stack and returns that element
    public Integer pop() {
      Integer prev = q1.poll(); 
      Integer cur = q1.poll();

      while (cur != null) {
        q2.offer(prev);
        prev = cur;
        cur = q1.poll();
      }

      // At this point, prev holds the last element and cur is null 
      // swap q1 and q2 for future operations
      Queue<Integer> temp = q2;
      q2 = q1;
      q1 = temp;

      return prev;        
    }

    // top / peek using pop()
    public Integer top() {
      Integer topElement = pop();
      if (topElement != null) {
        q1.offer(topElement); // put the topElement back because it shouldn't be removed 
      }
      return topElement;
    }

    /** Returns whether the stack is empty. */
    public boolean isEmpty() {
       return top() == null;
    }
}

#############################################################

68. Missing Number I

// Method I: HashSet
// public class Solution {
//   public int missing(int[] array) {
//     int n = array.length + 1;
//     HashSet<Integer> mySet = new HashSet<Integer>();
//     for (int number : array){ // for each int number in array
//       mySet.add(number);
//     }
//     for (int i = 1; i < n; i++){
//       if (!mySet.contains(i)) {
//         return i;
//       }
//     }
//     return n; // If the array is empty, the missing number is n = 0 + 1 = 1;
//   }
// }

// TC: O(n)
// SC: O(n)

// Method II: xor
public class Solution {
  public int missing(int[] array){
    int n = array.length + 1; // n = 3 + 1
    int xor = 0;

    // xor 1 to n:
    for (int i = 1; i <= n; i++){
      xor = xor ^ i; // xor = 0^1^2^3^4
    }
    for (int num : array){
      xor ^= num; // xor = 0^1^2^3^4^2^1^4 -> 0^1^1^2^2^3^4^4 -> 0^0^0^3^0 -> 0^3 -> 3
    }
    // After this operation, all the numbers from 1 to n are pair xor'ed except for the missing number
    // Since x ^ x = 0, the remaining number is the result:
    return xor; // xor = 0^3 = 3
  }
}
// TC: O(n)
// SC: O(1)

/*
XOR operator rule =>
0 ^ 0 = 0
1 ^ 1 = 0
0 ^ 1 = 1
1 ^ 0 = 1

5 ^ 4 => 1  0  1   (5)
         1  0  0   (4)
        ----------
         0  0  1  => 1

5 ^ 5 => 1   0   1    (5)
         1   0   1    (5)
       ------------
         0   0   0  => (0)

5 ^ 6 => 1   0   1  (5)
         1   1   0  (6)
        -----------
         0   1   1  => 3

*/

#############################################################

652. Common Numbers Of Two Sorted Arrays(Array version)

// Method 1: two pointers
public class Solution {
  public List<Integer> common(int[] a, int[] b) {
    // Assumption: a, b is not null
    List<Integer> common = new ArrayList<Integer>();
    int i = 0;
    int j = 0;
    while (i < a.length && j < b.length){
      if (a[i] == b[j]){
        common.add(a[i]);
        i++;
        j++;
      } else if (a[i] < b[j]){
        i++;
      } else {
        j++;
      }
3    return common;
  }
}
// TC: O(m+n)
// SC: O(1)

#############################################################

// P4 Permutation in String??? Anagram

// freq???

// P5 Anagram

// Bonus


#############################################################

651. Common Numbers Of Two Arrays II(Array version)


public class Solution {
  public List<Integer> common(int[] a, int[] b) {
    List<Integer> common = new ArrayList<>();

    // create a map to count occurrences of each num in a
    Map<Integer, Integer> countA = new HashMap<>();
    for (int num : a) {
      Integer ct = countA.get(num); // use the key "num", to get its value -> ct
      if (ct != null) { // num already existed, increase the count
        countA.put(num, ct + 1);
      } else {
        countA.put(num, 1); // num doesn't exist yet, add to map
      }
    }

    // create a map to count occurrences of each num in b
    Map<Integer, Integer> countB = new HashMap<>();
    for (int num : b) {
      Integer ct = countB.get(num);
      if (ct != null) {
        countB.put(num, ct + 1);
      } else {
        countB.put(num, 1);
      }
    }

    // loop through all entires (num, count) in countA map
    for (Map.Entry<Integer, Integer> entry : countA.entrySet()) {
      Integer ctInB = countB.get(entry.getKey()); // get the count of this num in array "b"
    
      if (ctInB != null) {
        int appear = Math.min(entry.getValue(), ctInB); // find min count in both arrays 
        
        // add the number to result list - the number of times it appeared in both 
        for (int i = 0; i < appear; i++) {
          common.add(entry.getKey());
        }
      }
    }

    // sort the result list in increasing order 
    Collections.sort(common);
    return common;
  } 
}


#############################################################

395. Remove Certain Characters

public class Solution {
  public String remove(String input, String t) {
    // Assumption: input and t are not null
    if (input.isEmpty()){
      return input;
    }
    
    // We need to know how to solve this problem with inplace way
    // Usually we can convert the immutable String to char[]
    char [] array = input.toCharArray();

    // Use helper function: Get set of all distinct characters in t so that lookup operation is efficient
    Set<Character> set = buildSet(t);
    
    // slow: [0, slow) contains the valid result 
    // fast: [fast, array.length) is the explore area
    int slow = 0;
    for (int fast = 0; fast < array.length; fast++) {
      // The exploring character can only be put into "slow" area if it's not in the set
      if (!set.contains(array[fast])){
        array[slow] = array[fast];
        slow++;
      }
    }
    // Convert the char[] subarray back to String Object
    return new String(array, 0, slow);
  }

  private Set<Character> buildSet(String t){
    Set<Character> set = new HashSet<Character>();
    for (int i = 0; i < t.length(); i++){
      set.add(t.charAt(i));
    }
    return set;
  }
}

// TC: O(m+n), m is length of input, n is length of t
// SC: O(m+n), m is length of input, n is length of t

#############################################################

281. Remove Spaces

public class Solution {
  public String removeSpaces(String input) {
    if (input.isEmpty()){
      return input;
    }

    // Turn String to Char[]
    char[] array = input.toCharArray();

    int slow = 0;
    for (int fast = 0; fast < array.length; fast++){
      // Skip the current space character when:
      // 1. we skip all space characters followed by another space character; 
      // if there are several consecutive spaces, only the first one will remain
      // 2. we skip space characters if it's the first character of the input string
      if (array[fast] == ' ' && (fast == 0 || array[fast - 1] == ' ')){ // leading space (if fast == 0) OR extra spaces in a row (if the previous char was also a space) 
        continue;
      }
      array[slow] = array[fast]; // leaving ONLY one space between word
      slow++;
    }

    // Post-processing: it's possible we still have one trailing space at the end: "Hello world "
    if (slow > 0 && array[slow - 1] == ' '){ 
      slow--;
    }
    return new String(array, 0, slow); // new String(char[] value, int offset, int count):  slow is a count, not an index!
  }
}
// O(n)
// O(1)

#############################################################

79. Remove Adjacent Repeated Characters I

public class Solution {
  public String deDup(String input) {
    if (input.isEmpty()){
      return input;
    }
    char[] array = input.toCharArray();
    int slow = 0;
    for (int fast = 0; fast < array.length; fast++){
      if (fast > 0 && array[fast] == array[fast - 1]) {
        continue;
      }
      array[slow] = array[fast];
      slow++;
    }
    return new String(array, 0, slow);
  }
}

// Time Complexity: O(n) where n is the length of input
// Space Complexity: O(n) where n is the length of input

// Method 2:

public class Solution {
  public String deDup(String input) {
    if (input.isEmpty()){
      return input;
    }
    char[] array = input.toCharArray();
    int slow = 0;
    for (int fast = 0; fast < array.length; fast++){
      if (fast == 0 || array[fast] != array[slow - 1]){
        array[slow] = array[fast];
        slow++;
      }
    }
    return new String(array, 0, slow);
  }
}

// Time Complexity: O(n) where n is the length of input
// Space Complexity: O(n) where n is the length of input


#############################################################

396. Reverse String

// Iteration 
public class Solution {
// Assumptions: The given string is not null.  
// Time Complexity: O(n) where n is the length of input string
// Space Complexity: O(n)

  public String reverse(String input) {
    // Corner Case
    if (input == null || input.length() <= 1){
      return input;
    }

    char[] array = input.toCharArray();
    int i = 0, j = array.length - 1;
    while (i < j) { // i == j means there is only one char left, no need to reverse
      char temp = array[i];
      array[i] = array[j];
      array[j] = temp;
      i++;
      j--;
    } 
    return new String(array);
  }
}


#############################################################

84. Reverse Words In A Sentence I

/*
Assumptions:

1. Words are separated by single space
2. There are no leading or tailing spaces
3. Input is not null 

Time Complexity: O(n) where n is the length of input string
Space Complexity: O(n)
*/

public class Solution {
  public String reverseWords(String input) {
    // Convert String to charArray to solve problem in-place
    char[] array = input.toCharArray();
    // Step 1: Reverse the whole charArray
    reverse(array, 0, array.length -1);

    // Step 2: Reverse every single word ?????????????????????
    int start = 0;
    for (int i = 0; i < array.length; i++){
      // Find the start index of a word:
      if ((i == 0 || array[i - 1] == ' ') && array[i] != ' '){
        start = i; 
      }

      // Find the end index of a word:
      if ((i == array.length - 1 || array[i + 1] == ' ') && array[i] != ' '){
        reverse (array, start, i);
      }
    }
    return new String(array);
  }

  private void reverse(char[] array, int left, int right) {
    while (left < right){
      char temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      left++;
      right--;
    }
  }
}


#############################################################

649. String Replace (basic)

// Assumption: input, Source and Target are not null, Source is not empty 
// Time Complexity: O(n*m) where n is the length of the input string and m is the length of the source string.
// Space Complexity: O(n)

public class Solution {
  public String replace(String input, String source, String target) {
    // Two pointers -> same direction
    // [0, i) is the range we want 
    // [j, length) is the range we search
    // If meet the same with start, replace it
    if (input == null || source == null || target == null){
      return null;
    }
    if (source.length() >= target.length()){
      return replaceShorter(input, source, target);
    } else {
      return replaceLonger(input, source, target);
    }
  }

  private String replaceLonger(String input, String source, String target) {
    char[] array = input.toCharArray();
    List<Integer> matchIndex = getAllMatch(array, source);
    char[] newArray = new char[array.length + matchIndex.size() * (target.length() - source.length())];
    int i = newArray.length - 1;
    int j = array.length - 1;
    int lastIdx = matchIndex.size() - 1;
    // j是扫描待处理数组的指针
    while (j >= 0){
      if (lastIdx >= 0 && j == matchIndex.get(lastIdx)) {
        replace(newArray, target, i - target.length() + 1);
        i =  i - target.length();
        j = j - source.length();
        lastIdx--; 
      } else {
        newArray[i--] = array[j--];
      }
    }
    return new String(newArray);
  }

  private List<Integer> getAllMatch(char[] array, String source) {
    List<Integer> result = new ArrayList<>();
    int i = 0;
    while (i <= array.length - source.length()){
      if (equals(array, source, i)) {
        result.add(i + source.length() - 1);
        i += source.length();
      } else {
        i++;
      }
    }
    return result;
  }

  private String replaceShorter(String input, String source, String target) {
    int i = 0;
    int j = 0;
    char[] array = input.toCharArray();
    while (j < array.length){
      if (j <= array.length - source.length() && equals(array, source, j)){
        replace(array, target, i);
        i = i + target.length();
        j = j + source.length();
      } else {
        array[i++] = array[j++];
      }
    }
    return new String(array, 0, i);
  }

  private void replace(char[] array, String target, int start){
    for (int i = 0; i < target.length(); i++){
      array[start + i] = target.charAt(i);
    }
    return;
  }

  private boolean equals(char[] array, String source, int start){
    for (int i = 0; i < source.length(); i++){
      if (array[start + i] != source.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}

#############################################################

292. String Abbreviation Matching

/*
Assumptions:
1. The original string only contains alphabetic characters.
2. Both input and pattern are not null.
3. Pattern would not contain invalid information like "a0a","0".

Time Complexity: O(n)
Space Complexity: O(n)
*/

// Recursive Method:
public class Solution {
  public boolean match(String input, String pattern) {
    return match(input, pattern, 0, 0);
  }

  private boolean match(String s, String t, int si, int ti){
    // only when we run out of s and t at the same time, there is a match
    if (si == s.length() && ti == t.length()){
      return true;
    }
    // if we run out of one of s and t but there is still some characters left for the other one, we can't find the match
    if (si >= s.length() || ti >= t.length()){
      return false;
    }    

    // Case 1. if the current character in t is NOT a digit 
    if (t.charAt(ti) < '0' || t.charAt(ti) > '9'){
      if (s.charAt(si) == t.charAt(ti)){
        return match(s, t, si + 1, ti + 1);
    }
    return false;
    }

    // Case 2. if the current character in t is a digit, we need to find in total what is the number
    // ex. "123" means number 123
    int count = 0;
    while (ti < t.length() && t.charAt(ti) >= '0' && t.charAt(ti) <= '9'){
      count = count * 10 + (t.charAt(ti) - '0');
      ti++;
    }
    return match(s, t, si + count, ti);
  }
}

#############################################################

48. Symmetric Binary Tree

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of tree

/*
For a tree to be symmetric:
The left and right nodes at each level must be mirror images.

That means:
- Left's left should match Right's right
- Left's right should match Right's left


*/

public class Solution {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode left, TreeNode right){
    // Base Case
    if (left == null && right == null){
      return true;
    }
    if (left == null || right == null){
      return false;
    }
    if (left.key != right.key){
      return false;
    }

    // Subproblems & Recursion Rule
    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
  }

}

#############################################################

50. Tweaked Identical Binary Trees

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */


// Time Complexity: O(n^2)
// Space Complexity: O(h) where h is the height of tree


/*

Two trees are tweaked identical if:

- Their root values are the same
- And for each pair of nodes, one of the following is true:
    - Their left subtrees are tweaked identical AND their right subtrees are tweaked identical
    - OR their left subtree is tweaked identical to the other's right, and vice versa

Tree A:

      1
     / \
    2   3
Tree B:

      1
     / \
    2   3
isTweakedIdentical(a.left, b.left)   → isTweakedIdentical(2, 2) → ✅  
isTweakedIdentical(a.right, b.right) → isTweakedIdentical(3, 3) → ✅
Since both subtrees match without any swapping, the trees are tweaked identical, and in fact, they are exactly identical.


Tree A:

     1
    / \
   2   3
Tree B

     1
    / \
   3   2
isTweakedIdentical(a.left, b.right) → isTweakedIdentical(2, 2) → ✅  
isTweakedIdentical(a.right, b.left) → isTweakedIdentical(3, 3) → ✅
The tweak makes them identical.

*/

public class Solution {
  // public boolean isTweakedIdentical(TreeNode root) {
  //   // Corner Case
  //   if (root == null){
  //     return true;
  //   }

  //   return isTweakedIdentical(root.left, root.right);
  // }
  // ??????????????????????????????????????????????????

  public boolean isTweakedIdentical(TreeNode left, TreeNode right) {
    // Base Case:
    if (left == null && right == null){
      return true;
    }
    if (left == null || right == null){
      return false;
    }
    if (left.key != right.key){
      return false;
    }

    return isTweakedIdentical(left.left, right.right) && isTweakedIdentical(left.right, right.left) || isTweakedIdentical(left.left, right.left) && isTweakedIdentical(left.right, right.right);
  }  
}

// My Version:

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public boolean isTweakedIdentical(TreeNode a, TreeNode b) {
    if (a == null && b == null) {
      return true;
    }
    if (a == null || b == null) {
      return false;
    }
    if (a.key != b.key) {
      return false;
    }
    return isTweakedIdentical(a.left, b.left) && isTweakedIdentical(a.right, b.right) || isTweakedIdentical(a.left, b.right) && isTweakedIdentical(a.right, b.left);
  }
}

#############################################################

54. Is Binary Search Tree Or Not

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  public boolean isBST(TreeNode root) {
    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isBST(TreeNode root, int min, int max){
    // Base Case:
    if (root == null) {
      return true;
    }
    if (root.key <= min || root.key >= max){
      return false;
    }

    // Subproblem & Recursion Rule:
    return isBST(root.left, min, root.key) && isBST(root.right, root.key, max);
  }
}

#############################################################

55. Get Keys In Binary Search Tree In Given Range

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  public List<Integer> getRange(TreeNode root, int min, int max) {
    List<Integer> result = new ArrayList<>();
    getRange(root, min, max, result);
    return result;
  }

  private void getRange(TreeNode root, int min, int max, List<Integer> result){
    if(root == null){
      return;
    }

    // 1. Determine if we should traverse the left subtree: go to the left if root.key > min
    // if root.key is already smaller than min, no need to check root.left 
    if (root.key > min){
      getRange(root.left, min, max, result);
    }
    // 2. Determine we should traverse the root and add to result
    if (root.key >= min && root.key <= max){
      result.add(root.key);
    }
    // 3. Determine if we should traverse the right subtree: go to the right if root.key < max
    // if root.key is already larger than max, no need to check root.right
    if (root.key < max){
      getRange(root.right, min, max, result);
    }
  }
}

#############################################################

52. Search In Binary Search Tree

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

//  // Recursion Method 
// Time Complexity: Balanced BST: O(logn); Worst Case: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  public TreeNode search(TreeNode root, int target){
    // Base Case:
    if (root == null || root.key == target){
      return root;
    }
    if (root.key < target){
      return search(root.right, target);
    }
    if (root.key > target){
      return search(root.left, target);
    }
    return null;
  }
}

// My Version - Recursion
public class Solution {
  public TreeNode search(TreeNode root, int target) {
    if(root == null || root.key == target) {
      return root;
    }
    if (root.key > target) {
      return search(root.left, target);
    }
    return search(root.right, target);
  }
}

// Iteration Method 
// Time Complexity: Balanced BST: O(logn); Worst Case: O(n)
// Space Complexity: O(1)

 public class Solution {
  public TreeNode search(TreeNode root, int target){
    //循环终止条件：root == null || root == target
    //取反：root != null && root != target
    while (root != null && root.key != target){
      if (root.key < target){ // Go right
        root = root.right;
      } else {
        root = root.left; // Go left
      }
    }
    return root; // Either null (not found) or the matching node
  } 
 }

#############################################################

51. Insert In Binary Search Tree

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

// Recursion Method
// Time Complexity: Balanced BST: O(logn); Worst Case: O(n)
// Space Complexity: O(h) where h is the height of tree

public class Solution {
  public TreeNode insert(TreeNode root, int target) {
    // Base Case:
    if (root == null){
      return new TreeNode(target);
    }
    // 把node挂上去
    if (root.key < target){
      root.right = insert(root.right, target);
    } else if (root.key > target){
      root.left = insert(root.left, target);
    }
    return root;
  }
}

// Iteration Method (往下瞄一眼)
// Time Complexity: Balanced BST: O(logn); Worst Case: O(n)
// Space Complexity: O(1)

public class Solution {
  public TreeNode insert(TreeNode root, int target){
    // Base Case:
    if (root == null){
      return new TreeNode(target);
    }
    TreeNode cur = root;
    while (cur.key != target){
      if (cur.key > target){
        if(cur.left != null){
          cur = cur.left; // Go to the left if the next node is not null
        } else { // If the next node is null, it means you need to insert the new node next
          cur.left = new TreeNode(target);
          break;  
        }
      } else {
        if (cur.right != null){
          cur = cur.right; // Go to the right if the next node is not null
        } else {
          cur.right = new TreeNode(target);
          break; // If the next node is null, it means you need to insert the new node next
        }
      }
    }
    return root;
  }
}

// Iteration Method II (掉坑回头挂 with Prev Node)

#############################################################

44. Pre-order Traversal Of Binary Tree (iterative)

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

// Time Complexity: O(n)
// Space Complexity: total from stack取决于stack里面放东西最多的时候有多少->我压的都是root.right-> O(height)

public class Solution {
  public List<Integer> preOrder(TreeNode root) {
    // Create an ArrayList
    List<Integer> result = new ArrayList<Integer>();
    if (root == null) {
      return result;
    }

    // Create a stack
    Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
    // offer root to the stack
    stack.offerFirst(root); 
    while (!stack.isEmpty()){
      // poll each element from the stack and label them "cur"
      TreeNode cur = stack.pollFirst();
      if (cur.right != null) {
        stack.offerFirst(cur.right);
      }
      if (cur.left != null){
        stack.offerFirst(cur.left);
      }
      // add each "cur" element to the result ArrayList and at the end, return
      result.add(cur.key);
    }
    return result;
  }
}


#############################################################

43. In-order Traversal Of Binary Tree (iterative)

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

// Time Complexity: O(n)
// Space Complexity: total from stack取决于stack里面放东西最多的时候有多少 -> O(height)

public class Solution {
  public List<Integer> inOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode cur = root;

    while (cur != null || !stack.isEmpty()) {
      // Always try going to the left side to see if there is any node which should be traversed before the cur node
      // cur node is stored on stack since it has not been traversed yet
      if (cur != null) {
        stack.offerFirst(cur);
        cur = cur.left;
      }
      else {
        // If can't go left, meaning all the nodes on the left side of the top node on stack have been traversed
        // The next traversing node should be the top node on stack
        cur = stack.pollFirst();
        result.add(cur.key);
        cur = cur.right; // The next subtree we want to traverse is cur.right
      }
    }
    return result;
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


649. String Replace (basic)

20

class Solution {
    public boolean isValid(String s) {
        // create an empty stack to keep track of opening brackets
        Stack<Character> stack = new Stack<Character>();

        // loop through every character in the string
        for (char c : s.toCharArray()) {
            // if c is an opening bracket, push it onto the stack 
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else { // if c is a closing bracket
                // if the stack is empty, there is no matching opening bracket -> return false
                if (stack.isEmpty()) {
                    return false;
                }
                // otherwise, get the top of the stack and check if it's a matching opening bracket
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    // if it is matching, pop the opening bracket from the stack 
                    stack.pop();
                } else { // otherwise, the brackets don't match, so return false
                    return false;
                }
            }
        }
        // if the stack is empty, all brackets have been matched -> return true
        // otherwise, there are unmatched opening brackets -> return false
        return stack.isEmpty();
    }
}




