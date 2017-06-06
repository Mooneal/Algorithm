package algorithm.ch3;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr={5,9,1,9,11,3,7,6,5};
		int[] temp=new int[arr.length];
		mergeSort(arr, 0, arr.length-1, temp);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]+" ");
		}
	}
	public static  void mergeSort(int[] a,int first,int last,int[] temp){
		
		if(first<last){
			int mid=(first+last)/2;
			mergeSort(a, first, mid, temp);
			mergeSort(a,mid+1,last,temp);
			mergeArray(a,first,mid,last,temp);
		}
	}

	private static void mergeArray(int[] a, int first, int mid, int last, int[] temp) {
		// TODO Auto-generated method stub
		int i=first,j=mid+1;
		int m=mid,n=last;
		int k=0;
		while(i<=m && j<=n){
			if(a[i]<=a[j])
				temp[k++]=a[i++];
			else
				temp[k++]=a[j++];
			
		}
		while(i<=m)
			temp[k++]=a[i++];
		while(j<=n)
			temp[k++]=a[j++];
		for(i=0;i<k;i++){
			a[first+i]=temp[i];
		}
		
		 
	}
}
