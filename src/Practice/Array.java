package Practice;
public class Array {

	public static int sumOfArray(int a[]) {
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	public static int indexOfArrayValue(int a[], int val) {
		for (int i=0; i<a.length; i++) {
			if (a[i] ==val) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,12,33,84,75};
		System.out.println("Sum = "+sumOfArray(a));
		
		System.out.println("Index of value 3 is : "+ indexOfArrayValue(a, 44));
	}

}
