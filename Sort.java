package quicksort;

import java.util.Scanner;

public class Sort {
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();	//number of elements
	int[] a = new int[n];
	for(int i=0; i<n; i++){
		a[i]=in.nextInt();
	}
	Quicksort q = new Quicksort(a, n);
	q.Quicksort(0, n-1);
	q.display();
}
}
