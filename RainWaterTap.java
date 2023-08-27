
public class RainWaterTap {
	
//	Question Rain Water Trapped

//	Given a vector A of non-negative integers representing an elevation map where 
	//the width of each bar is 1, compute how much water it is able to trap after raining.
	
//	Problem Constraints
//	1 <= |A| <= 100000
//
//	Input Format
//	First and only argument is the vector A
//
//	Output Format
//	Return one integer, the answer to the question
//
//	Example Input
//	Input 1:
//
//	A = [0, 1, 0, 2]
//	Input 2:
//
//	A = [1, 2]
//
//	Example Output
//	Output 1:
//	1
//	Output 2:
//	0
//
//	Example Explanation
//	Explanation 1:
//	1 unit is trapped on top of the 3rd element.
//	Explanation 2:
//
//	No water is trapped.


	public static void main(String[] args) {
		
		int A[] = {2,1,3,2,1,2,4,3,2,1,3,1};		
		int sum = trap(A);
		System.out.println("Final Value :: " + sum );
		
	}
	
// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int trap(final int[] A) {
    	
    	int pf[] = prefixSum(A);
    	int sf[] = suffixSum(A);
    	int n = A.length ;
    	int sum = 0 , min = 0  ;
    	for(int i = 1 ; i < n ; i++) {
    		if(pf[i] < sf[i])
    			min = pf[i];
    		else
    			min = sf[i];
    		int c = min - A[i] ;
    		if(c >= 0 )
    			sum += c ;
    	}
		return sum ;

    }

    public  static int[] prefixSum(int[] A){
        int n = A.length;
        int max = A[0] ;
        int pf[] = new int[n];
        pf[0] = 0 ;
        for(int i = 1 ; i < n ; i++){
            if(A[i-1] > max ){
                max = A[i-1];
            }
            pf[i] = max;
        }
        return pf;
    }
    
    public static int[] suffixSum(int[] A) {
    	int n = A.length;
    	int max = A[n-1];
    	int sf[] = new int[n];
    	sf[n-1] = 0;
    	
    	for(int i = n-2 ; i >= 0 ; i--) {
    		if(A[i+1] > max) {
    			max = A[i+1];
    		}
    		sf[i] = max;
    	}
		return sf;
    }
}
