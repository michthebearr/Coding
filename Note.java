
1248. Count Number of Nice Subarrays

vs.

1358. Number of Substrings Containing All Three Characters

🤔 You’re comparing two solutions:
Counting subarrays with at most k odd numbers
→ res += j - i + 1 ✅

Counting substrings with at least one 'a', 'b', and 'c'
→ res += i ✅

At first glance, they seem contradictory — so why is it res += i in one and res += j - i + 1 in the other?

🧠 The Difference Lies in the Problem
🔢 Case 1:
Counting substrings with at least one 'a', 'b', and 'c'

java
Copy
Edit
for (int j = 0; j < s.length(); j++) {
    count[s.charAt(j) - 'a']++;
    while (count[0] > 0 && count[1] > 0 && count[2] > 0)
        count[s.charAt(i++) - 'a']--;
    res += i;
}
What i means here:
At each step:

i is the smallest index such that the window [i, j] no longer contains all three letters.

So all substrings ending at j and starting before i are guaranteed to be valid.

✅ So res += i because:

There are i substrings ending at j that start at index 0, 1, ..., i-1, and all are valid.

🔢 Case 2:
Counting subarrays with at most k odd numbers

java
Copy
Edit
for (int j = 0; j < A.length; j++) {
    k -= A[j] % 2;
    while (k < 0)
        k += A[i++] % 2;
    res += j - i + 1;
}
What j - i + 1 means here:
At each step:

i is the left boundary of a valid window ending at j.

So all subarrays starting from i to j and ending at j are valid.

✅ So res += j - i + 1 because:

You're counting [i..j], [i+1..j], ..., [j..j] → that’s exactly j - i + 1 subarrays.

🔁 So, What’s the Key Difference?
Problem Type	What i represents	Why res += ... works
At least one 'a', 'b', 'c'	First index that breaks validity	i valid prefixes → res += i
At most k odds (sliding window)	First index where window is valid	j - i + 1 valid substrings → res += j - i + 1

📘 Real-Life Analogy:
res += i: "I'm counting how many doors are behind me that I’ve already walked past — all are good."

res += j - i + 1: "I'm standing at door j and looking back to count all good doors from here to i."

