package main

import "testing"

func TestTwoSum1(t *testing.T) {
	nums := []int{2, 7, 11, 15}
	target := 9
	expected := []int{0, 1}

	result := twoSum(nums, target)

	if result[0] != expected[0] || result[1] != expected[1] {
		t.Errorf("twoSum(%v, %d) = %v; want %v", nums, target, result, expected)
	}
}

func TestTwoSum2(t *testing.T) {
	nums := []int{3, 2, 4}
	target := 6
	expected := []int{1, 2}

	result := twoSum(nums, target)

	if result[0] != expected[0] || result[1] != expected[1] {
		t.Errorf("twoSum(%v, %d) = %v; want %v", nums, target, result, expected)
	}
}

func TestTwoSum3(t *testing.T) {
	nums := []int{3, 3}
	target := 6
	expected := []int{0, 1}

	result := twoSum(nums, target)

	if result[0] != expected[0] || result[1] != expected[1] {
		t.Errorf("twoSum(%v, %d) = %v; want %v", nums, target, result, expected)
	}
}
