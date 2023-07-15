## Cyclic Sort Pattern

The Cyclic Sort pattern is particularly useful when the range of numbers in the input array is limited and known. It is a simple and efficient sorting technique that involves iterating through the array and placing each number in its correct position by swapping elements.

<p align="center">
  <img src="https://camo.githubusercontent.com/8a3d893e278da66e447251945cb3cf60e99ad132f56a6e086267142901b5354a/68747470733a2f2f63646e2d696d616765732d312e6d656469756d2e636f6d2f6d61782f3830302f302a7639763632364632465f74326e377877" alt="Cyclic Sort" width="500" height="600">
</p>

### Algorithm Steps:
1. Start iterating through the array from index 0.
2. For each element, check if it is in the correct position (i.e., element value matches the index).
3. If it is not in the correct position, swap it with the element at its correct position.
4. Repeat steps 2 and 3 until all elements are in their correct positions.

The Cyclic Sort pattern assumes that the input array contains distinct integers ranging from 0 to n-1, where n is the size of the array. It sorts the array in-place and has a time complexity of O(n).

The Cyclic Sort pattern is particularly useful when the range of numbers is small, and you need to sort the array efficiently. It is often used when the input array is partially sorted or contains missing or duplicate elements.

Please note that the Cyclic Sort pattern may not be suitable for sorting arrays with a large range of numbers or non-integer elements.
