package shaoyanfei.cc.dynamicprogramming;

import java.util.Arrays;

/*
 * Given a number N, find the smallest even number E such that E > N and digits in N and E are same. 
 Print NONE otherwise. 
 Sample: 
 Input 
 N = 34722641 
 Output 
 E = 34724126 
 Input 
 N = 8234961 
 Output 
 E = 8236194 (instead of 8236149) 
 Java solution

 We don't need to generate permutations. We can do it in O(nlgn). Observe that if all the digits are in non-decreasing order from right to left then the input itself is the biggest. So, if we can detect the position where the non-decreasing sequence in disrupted then we can simply work on the part of the array. 

 For example: N = 8234961 

 1) Detect the longest increasing (non-decreasing) sequence y from right to left and split the input into N=xy. This is O(n). Let a = the element where the increasing sequence disrupted. Also keep track of minimum even (say m) digit in y. 

 N = 8234 | 961, y=961, x=8234. a=4, m = 6; 

 Here, we might have a special case if y doesn't contain an even digit. In this case extend x to left the point where we have found an even on the left. 

 For example: N = 425731; x=425, y = 731, a=5, m=Integer.MIN. Then we extend y. Now, with extended y: 

 N = 425731; x=42, y = 5731, a=2, m=Integer.MIN. 

 2) Let, b = smallest element in y greater than a. 

 a=4. So, b=6. 

 3) swap (a,b); 

 N = 8236 | 941; x=8236, y=941. This is O(1). 

 4) Find max even in Y. This is O(n). 

 N= 8236 | 941; X=8234, Y=941, Max even = 4. 

 4) swap max even with the right most digit. This is O(1). 

 After swapping: N= 8236 | 914; X=8234, Y=914. 

 Special case: After swapping it may happen that there is no even in y. So, we need to constantly satisfy that y contains an even after swapping X[a] with the Y[b]. So, keeping this constraint true we will extend y to more left until we find an even. Consider this example: 125831 

 5) Now, sort y in decreasing order from right to left leaving rightmost digit unchanged. This is O(nlgn) in worst case. 

 N= 8236 | 91 | 4 --after sort --> 8236 | 19 | 4; 

 That's it, now N=xy is the desired solution. N = 8236194. Total complexity = O(nlgn)
 */
public class FindTheSmallestNumber {

	public static void swap(char a, char b) {
		char tmp = a;
		a = b;
		b = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 8234961;

	}

}
