package com.interview.test.unify;

public class FindSum {
}
//[1,2,3,4,5,5]
//
//[1,4,5] & [2,3,5]
//package main
//
//import "fmt"
//
//func main() {
//	arr := []int{1, 2, 3, 4, 5, 5}
//	sum := 0
//	for _, v := range arr {
//		sum += v
//	}
//	indexLen := len(arr) / 2
//	target := sum / 2
//	var rslt []int
//	var indexRslt []int
//	temp := make([]int, 0)
//	found := midArray(arr, 0, indexLen, target, &rslt, temp, &indexRslt, temp)
//	if found {
//		fmt.Println("rslt value is", rslt)
//		fmt.Println("indexRslt value is", indexRslt)
//	} else {
//		fmt.Println("No valid subset found")
//	}
//}
//func midArray(arr []int, ind, i, t int, rslt *[]int, temp []int, rsltIndex *[]int, tempIndex []int) bool {
//	if t == 0 && len(temp) == i {
//		*rslt = make([]int, len(temp))
//		copy(*rslt, temp)
//		*rsltIndex = make([]int, len(tempIndex))
//		copy(*rsltIndex, tempIndex)
//		return true
//	}
//	if ind >= len(arr) || len(temp) > i {
//		return false
//	}
//
//	temp = append(temp, arr[ind])
//	tempIndex = append(tempIndex, ind)
//	if midArray(arr, ind+1, i, t-arr[ind], rslt, temp, rsltIndex, tempIndex) {
//		return true
//	}