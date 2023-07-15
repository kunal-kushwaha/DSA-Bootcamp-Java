## Modified Binary Search Pattern

Whenever you are given a sorted array or matrix and are asked to find a certain element, the best algorithm to use is Binary Search. This pattern describes an efficient way to handle all problems involving Binary Search.

The pattern for an ascending order set looks as follows:

1. Find the middle index between the start and end. An easy way to find the middle would be using the formula: `middle = (start + end) / 2`. However, this has a chance of producing an integer overflow. It's recommended to represent the middle as: `middle = start + (end - start) / 2`.

2. If the key is equal to the number at index middle, return the middle index.

3. If the key is not equal to the number at index middle:
   - Check if the key is less than `arr[middle]`. If it is, reduce the search space by updating `end = middle - 1`.
   - Check if the key is greater than `arr[middle]`. If it is, reduce the search space by updating `end = middle + 1`.

Here is a visual representation of the Modified Binary Search pattern:

<p align="center">
  <img src="https://camo.githubusercontent.com/49390a98be290614bba16d28ea7bbc029dac92e6dd33366731cbd0bcfbab5b25/68747470733a2f2f63646e2d696d616765732d312e6d656469756d2e636f6d2f6d61782f3830302f302a4f4a424f4262625f4354677366365241" alt="Modified Binary Search" width="500" height="600">
</p>

The Modified Binary Search pattern provides an efficient approach for searching specific elements in sorted arrays or matrices. It optimizes the search process by eliminating half of the search space in each iteration.

Please note that this pattern can be adapted for descending order sets or other variations.
