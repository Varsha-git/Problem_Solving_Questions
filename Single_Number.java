
public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= {1,2,2,3,3,4,4};
		int unique =  singleNumber(A);
		System.out.println(unique);
	}
	
	
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int singleNumber(final int[] A) {
         // Do XOR of all elements and return
        int res = A[0];
        int n = A.length;
        for (int i = 1; i < n; i++)
            res = res^A[i];
      
        return res;
    }

}
