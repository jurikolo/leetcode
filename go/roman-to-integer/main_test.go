package main

import "testing"

func TestRomanToInt1(t *testing.T) {
	input := "III"
	expected := 3
	result := romanToInt(input)
	if result != expected {
		t.Errorf("Expected %d, got %d", expected, result)
	}
}

func TestRomanToInt2(t *testing.T) {
	input := "LVIII"
	expected := 58
	result := romanToInt(input)
	if result != expected {
		t.Errorf("Expected %d, got %d", expected, result)
	}
}

func TestRomanToInt3(t *testing.T) {
	input := "MCMXCIV"
	expected := 1994
	result := romanToInt(input)
	if result != expected {
		t.Errorf("Expected %d, got %d", expected, result)
	}
}
