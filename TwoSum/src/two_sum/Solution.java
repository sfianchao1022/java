package two_sum;

class Solution {

	//�S��new��array��reference variable
    public int[] num;
    public int target;
    public int a;
    public int b;
    
    public Solution(){
          
    }
    
    public Solution(int[] num,int target){	
    	this.num=num;
    	this.target=target;
    }
    
    public int[] twoSum() {
    	for(int i=0;i<num.length;i++) {
    		for(int j=i+1;j<num.length;j++) {
    			if(target==num[i]+num[j]) {
    				//System.out.println(num[i]+" "+num[j]);
    				//a=num[i];
    				//b=num[j];
    				
    				return new int[]{num[i],num[j]};
    			}
    		}
    	}
    	//�ҥ~�B�z
    	throw new IllegalArgumentException("No two sum solution");
    	
    	//�Y���ϥΨҥ~�B�z�A��a,b�h���� �]��"return" is for method
    	//Use a finally block(�ҥ~�B�z) or save the return value in a variable that you return at the end of your code
    	//return new int[]{a,b};
    }
   
}