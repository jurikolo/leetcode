package main

import "fmt"

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Default non-optimized implementation
func twoSum(nums []int, target int) []int {
	for i := 0; i < len(nums)-1; i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i]+nums[j] == target {
				return []int{i, j}
			}
		}
	}
	return []int{0, 1}
}

// Optimized implementation 
func twoSum(nums []int, target int) []int {
	// Create a map to store the value and its index
	numMap := make(map[int]int)
	
	for i, num := range nums {
		complement := target - num
		
		// Check if the complement exists in our map
		if j, ok := numMap[complement]; ok {
			return []int{j, i}
		}
		
		// Store the current number and its index in the map
		numMap[num] = i
	}
	
	// This should never happen according to problem constraints
	return []int{0, 1}
}

func main() {
	test1 := twoSum([]int{2, 7, 11, 15}, 9)
	fmt.Println(test1)
}
