package main

import "fmt"

const (
	I         int = 73
	V         int = 86
	X         int = 88
	L         int = 76
	C         int = 67
	D         int = 68
	M         int = 77
	IV        int = 159
	IX        int = 161
	XL        int = 164
	XC        int = 155
	CD        int = 135
	CM        int = 144
	ValueOfI  int = 1
	ValueOfV  int = 5
	ValueOfX  int = 10
	ValueOfL  int = 50
	ValueOfC  int = 100
	ValueOfD  int = 500
	ValueOfM  int = 1000
	ValueOfIV int = 4
	ValueOfIX int = 9
	ValueOfXL int = 40
	ValueOfXC int = 90
	ValueOfCD int = 400
	ValueOfCM int = 900
)

func getValue(char int, nextChar int) (int, bool) {
	switch char {
	case I:
		if nextChar == V {
			return ValueOfIV, true
		}
		if nextChar == X {
			return ValueOfIX, true
		}
		return ValueOfI, false
	case V:
		return ValueOfV, false
	case X:
		if nextChar == L {
			return ValueOfXL, true
		}
		if nextChar == C {
			return ValueOfXC, true
		}
		return ValueOfX, false
	case L:
		return ValueOfL, false
	case C:
		if nextChar == D {
			return ValueOfCD, true
		}
		if nextChar == M {
			return ValueOfCM, true
		}
		return ValueOfC, false
	case D:
		return ValueOfD, false
	case M:
		return ValueOfM, false
	}
	return char, false
}

// Given a roman numeral, convert it to an integer.
func romanToInt(s string) int {
	result := 0
	value := 0
	skipNext := false
	runes := make([]rune, len(s))
	for i, r := range s {
		runes[i] = r
		i++
	}
	// loop over all elements except final to avoid index out of range
	for i := 0; i < len(s)-1; i++ {
		if skipNext {
			skipNext = false
		} else {
			value, skipNext = getValue(int(runes[i]), int(runes[i+1]))
			fmt.Println(value)
			result += value
		}
	}
	if skipNext {
		return result
	} else {
		tmp, _ := getValue(int(runes[len(s)-1]), int(runes[len(s)-1]))
		return result + tmp
	}

}

func main() {
	fmt.Println(romanToInt("MCMXCIV"))
}

// Below is optimized solution
func romanToIntOptimized(s string) int {
	// Map for O(1) lookup
	values := map[byte]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}
	
	result := 0
	n := len(s)
	
	for i := 0; i < n; i++ {
		current := values[s[i]]
		
		// If next character exists and has greater value, subtract current
		if i < n-1 && current < values[s[i+1]] {
			result -= current
		} else {
			result += current
		}
	}
	
	return result
}

// Alternative: Array-based lookup for even better performance
func romanToIntArray(s string) int {
	// Pre-allocated array indexed by ASCII value
	// Only positions for Roman numerals will have non-zero values
	values := [256]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}
	
	result := 0
	n := len(s)
	
	for i := 0; i < n; i++ {
		current := values[s[i]]
		
		// If next character exists and has greater value, subtract current
		if i < n-1 && current < values[s[i+1]] {
			result -= current
		} else {
			result += current
		}
	}
	
	return result
}