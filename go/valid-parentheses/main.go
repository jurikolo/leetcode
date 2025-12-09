package main

import (
	"fmt"
)

func isValid(s string) bool {
	if len(s)%2 != 0 {
		return false
	}

	parenthesesSlice := make([]byte, len(s))
	sliceIndex := 0
	for i := 0; i < len(s); i++ {
		switch s[i] {
		// loop over opening parentheses
		case 40:
			parenthesesSlice[sliceIndex] = 41
			sliceIndex++
		case 91:
			parenthesesSlice[sliceIndex] = 93
			sliceIndex++
		case 123:
			parenthesesSlice[sliceIndex] = 125
			sliceIndex++
		// loop over closing parentheses
		case 41:
			if sliceIndex == 0 || parenthesesSlice[sliceIndex-1] != 41 {
				return false
			} else {
				sliceIndex--
			}
		case 93:
			if sliceIndex == 0 || parenthesesSlice[sliceIndex-1] != 93 {
				return false
			} else {
				sliceIndex--
			}
		case 125:
			if sliceIndex == 0 || parenthesesSlice[sliceIndex-1] != 125 {
				return false
			} else {
				sliceIndex--
			}
		}
	}
	if sliceIndex == 0 {
		return true
	} else {
		return false
	}
}

func main() {
	fmt.Println(isValid("){"))
	fmt.Println(isValid("()"))
	fmt.Println(isValid("()[]{}"))
	fmt.Println(isValid("(]"))
	fmt.Println(isValid("([])"))
	fmt.Println(isValid("([)]"))
}
