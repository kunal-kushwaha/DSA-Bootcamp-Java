# [Video Link](https://youtu.be/n60Dn0UsbEk)

## Note:
- Use these Codes for reference purpose only; Always try to write Your own Code.
- There are many ways of solving a question, so if your answer is different from the answer given below that doesn't mean your answer is wrong. 

### Easy
1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/) </br>
Solution: 
```java
class Solution {
public int[] buildArray(int[] nums) {
int size=nums.length;
int[] a=new int[size];

for (int i = 0; i < size; i++) {
int product = (nums[nums[i]] % size) * size + nums[i];
a[i]=product;
}

for (int i = 0; i < size; i++) {
int temp = a[i];
a[i]=temp/size;
}
return a;
}
}
```

2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)</br>
Solution: 
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int  n= nums.length;
        int []ans= new int[nums.length*2];
        
        for(int i= 0; i< nums.length; i++){
            ans[i]= nums[i];
            ans[i+n]= nums[i];
        }
        return ans;
    }
}
```
3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) </br>
Solution: 
```java
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) 
            nums[i] = nums[i] + nums[i-1];
        return nums;
    }
}
```
4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) </br>
Solution: 
```java
class Solution {
     public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] row:accounts){
            int curr = 0;
            for(int num: row){
                curr = curr + num;
            }
            max = Math.max(curr, max);
        }
        return max;
    }
}
```
5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) </br>
Solution: 
```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int k=0; int i=0;
        while(i<nums.length){
            ans[i]=nums[k];
            ans[i+1]=nums[n];
            n++;
            k++;
            i+=2;
        }
        return ans;
        }
    }
  ```
6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) </br>
Solution: 
```java
class Solution {
public List kidsWithCandies(int[] candies, int extraCandies) {
ArrayList array = new ArrayList<>();
int max = Integer.MIN_VALUE;
//find maximum
for(int i=0;i<candies.length;i++){
if(candies[i]>=max){
max = candies[i];
}
}
//add true if after adding extraCandies becomes greater than max.
for(int i=0;i<candies.length;i++){
array.add(candies[i]+extraCandies>=max);
}
return array;
}
}
```
7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/) </br>
Solution:
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
```
8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/) </br>
Solution: 
```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] ans= new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] duplicate =new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            duplicate[i]=nums[i];
        }
        
        int p=0;int index=0;
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        for(int i=0;i<nums.length;i++){
            if(i>0){
                if(nums[i]==nums[i-1]){
                    map.put(nums[i],index);
                    continue;
                }
            }
            index=i;
            map.put(nums[i],index);
        }
         for(int i=0;i<nums.length;i++){
              ans[i]= map.get(duplicate[i]);
         }
        return ans;
    }
}
```
9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/) </br>
Solution:
```java
class Solution {
   public int[] createTargetArray(int[] nums, int[] index) {
		//1. Create an arraylist of type Integer
        List<Integer> list = new ArrayList<>();
		//2. Using ArrayList.add() so that we don't have to manually reorder array elements on each add operation.
        for(int i=0; i<index.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] array = new int[list.size()];
		//3. Fill the array with the elements in our ArrayList
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
    return array;
    }
}
```
10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/) </br>
Solution:
```java
class Solution {
  public boolean checkIfPangram(String sentence) {
    boolean[] Check=new boolean[26];
    int index=0;
    for(int i=0;i<sentence.length();i++){
      if('a'<=sentence.charAt(i)&&sentence.charAt(i)<='z'){
      index=sentence.charAt(i)-'a';
    }
    else{
        continue;
     }
    Check[index]=true;
    }
    for(int i=0;i<26;i++){
      if(Check[i]==false){
      return false;
    }
    }
    return true;
  }
}
```
🚧 **More Solutions will be added soon if pull request is accepted**

11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)
16. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
17. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
19. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
20. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)
21. [Two Sum](https://leetcode.com/problems/two-sum/)
22. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
23. [Saddle Point In Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)

### Medium
1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
2. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
3. [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
4. [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
5. [Jump Game](https://leetcode.com/problems/jump-game/)
6. [Rotate Array](https://leetcode.com/problems/rotate-array/)

### Hard
1. [Max Value of Equation](https://leetcode.com/problems/max-value-of-equation/)
2. [ First Missing Positive](https://leetcode.com/problems/first-missing-positive/)
