package quicksort;

public class Quicksort {
public int[] A;
public int n;
Quicksort(int[] A,int n){
	this.A=A;
	this.n=n;
}
public void display(){
	for(int i=0; i<n; i++){
		System.out.print(A[i]+" ");
	}
	System.out.println();
}
public void swap(int i,int j){
	int temp=A[i];
	A[i]=A[j];
	A[j]=temp;
}
public  Range find_partition(int start,int end){
	int j=start+1,k=end;
	int pivot = A[start];
	int eq_count=0;
	int begin=start+1;
	while(j<=k){
		while( j<=k && A[j]<=pivot ){
			if(A[j]==pivot){
				eq_count++;
				swap(j,begin);
				begin++;
			}
			j++;
		}
		while(A[k]>pivot)
			k--;
		if(j<=k)
			{
			swap(j,k);
			j++;
			k--;
			}
	}
	if(k>=start)
	swap(start,k);
	
	int s=k;	
	begin=start+1;
	
	for(s=k;eq_count>0; eq_count--){
		s--;
		swap(begin,s);		
		begin++;
	}
	
	return new Range(s,k);
}
public void Quicksort(int start,int end){
	if(start==end)
		return;
	Range r=find_partition(start, end);
	if(start<(r.q-1))
	Quicksort(start,r.q-1);
	if(end>r.t+1)
	Quicksort(r.t+1,end);
}
}
