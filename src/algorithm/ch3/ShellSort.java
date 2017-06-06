package algorithm.ch3;

public class ShellSort {
	private int[] arr;
	public ShellSort(int[] arr){
		this.arr=arr;
	}
	public void sort(){
		int j;
		for(int gap=arr.length/2;gap>0;gap=gap/2)
			for(int i=0;i<gap;i++){
				for(j=i+gap;j<arr.length;j+=gap){
					int temp=arr[j];
					while(j-gap>=0 && temp<arr[j-gap]){
						arr[j]=arr[j-gap];
						j-=gap;
					}
					arr[j]=temp;
				}
			}
			
	}
	public void print(){
		for(int i:arr){
			System.out.print(i+",");
		}
	}
}
