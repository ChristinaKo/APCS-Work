public class Arrays1{
    //1
    public int[] middleWay(int[] a, int[] b) {
	int [] newArray;
	newArray = new int[2];
	newArray[0]= a[1];
	newArray[1]= b[1];
	return newArray;
    }
    //2
    public int[] makeEnds(int[] nums) {
	int [] newArray;
	newArray = new int[2];
	newArray[0]= nums[0];
	newArray[1]= nums[nums.length -1];
	return newArray;
    }
    //3
    public int[] fizzArray(int n) {
	int [] newArray;
	newArray = new int[n];
	for(int i =0; i<n; i = i+1){
	    newArray[i]=i;
	}
	return newArray;
    }
    //4
    public boolean only14(int[] nums) {
	boolean x = true;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] != 1 && nums[i] != 4){
		x = false;
	    }
	    else{
		if (x== false){
		    x = x;
		}
		else{
		    x = true;
		}
	    }
	}
	return x;
    }
}
