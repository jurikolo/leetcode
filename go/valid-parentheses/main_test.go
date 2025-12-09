package main

import "testing"

func TestIsValid1(t *testing.T) {
	s := "()"
	expected := true
	result := isValid(s)
	if result != expected {
		t.Errorf("Expected %t, got %t", expected, result)
	}
}

func TestIsValid2(t *testing.T) {
	s := "()[]{}"
	expected := true
	result := isValid(s)
	if result != expected {
		t.Errorf("Expected %t, got %t", expected, result)
	}
}

func TestIsValid3(t *testing.T) {
	s := "(]"
	expected := false
	result := isValid(s)
	if result != expected {
		t.Errorf("Expected %t, got %t", expected, result)
	}
}

func TestIsValid4(t *testing.T) {
	s := "([])"
	expected := true
	result := isValid(s)
	if result != expected {
		t.Errorf("Expected %t, got %t", expected, result)
	}
}

func TestIsValid5(t *testing.T) {
	s := "([)]"
	expected := false
	result := isValid(s)
	if result != expected {
		t.Errorf("Expected %t, got %t", expected, result)
	}
}

func TestIsValid6(t *testing.T) {
	s := "(("
	expected := false
	result := isValid(s)
	if result != expected {
		t.Errorf("Expected %t, got %t", expected, result)
	}
}

func TestIsValid7(t *testing.T) {
	s := "){"
	expected := false
	result := isValid(s)
	if result != expected {
		t.Errorf("Expected %t, got %t", expected, result)
	}
}
