
public class LCM_HCF {
	
	/**
	 * method for finding HCF
	 * @param x : for first number
	 * @param y : for second number
	 * @return
	 */
	int HCF_method(int x,int y){
		if(x==0)
			return y;
		return HCF_method(y%x,x);
	}
	/**
	 * method for finding LCM
	 * @param n : for number from 1 to lcm
	 * @param x : for first number
	 * @param y : for second number
	 * @return
	 */
	int LCM_method(int n,int x, int y){ 
		if(n%x==0 && n%y==0)
			 return n;
		 return LCM_method(n+1,x,y);
	}
	
}
