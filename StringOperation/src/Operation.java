
public class Operation {
	/*
	 * Used for String Comparison
	 * @param first : for getting first string
	 * @param second : for getting second string
	 * @return 1/0 : for checking false and true
	 */
	public int StringComparison(String first,String second){
		if( first.length() == second.length() ){
			for(int i=0 ; i<first.length() ; i++){
				if(first.charAt(i)!=second.charAt(i))
					return 0;
			}
		}
		else
			return 0;
		return 1;
	}
	/*
	 * Used for String Reversal
	 * @param first : for getting first string
	 * @param second : for getting second string
	 * @return rev : for returning reversed string
	 */
	String ReverseString(String str){
		char[] tochange=str.toCharArray();
		int len=str.length();
		for(int i=0,j=len-1;i<len/2;i++,j--){
			char temp=tochange[i];
			tochange[i]=tochange[j];
			tochange[j]=temp;
		}
		String rev=String.valueOf(tochange);
		return rev;
	}
	/*
	 * Used for changing case of Letters in a String
	 * @param first : for getting first string
	 * @param second : for getting second string
	 * @return changestr : for returning processed string
	 */
	String toCaseChange(String str){
		char[] tochange=str.toCharArray();
		for(int i=0;i<tochange.length;i++){
			int value=tochange[i];
			if(tochange[i]>='a' && tochange[i]<='z'){
				value-=32;
				tochange[i]=(char)(value);
			}
			else if(tochange[i]>='A' && tochange[i]<='Z'){
				value+=32;
				tochange[i]=(char)(value);
			}
		}
		String changestr=String.valueOf(tochange);
		return changestr;
	}
	/*
	 * Used for Finding Longest word in String
	 * @param first : for getting first string
	 * @param second : for getting second string
	 * @return str2 : for returning Longest word
	 */
	String LongestWord(String str1){
		char[] tochange=str1.toCharArray();
		int mainlen=0,varlen=0,mainindex=0,varindex=0;
		for(int i=0;i<tochange.length;i++){
			if(tochange[i]==' ' || i==tochange.length-1){
				if(i==tochange.length-1)
					varlen += 1;
				if(varlen>=mainlen){
					mainlen=varlen;
					mainindex=varindex;
				}
				varlen=0;
				varindex=i+1;
			}
			else{
				varlen++;
			}
		}
		char[] word=new char[mainlen];
		int j=0;
		for(int i=mainindex;i<(mainlen+mainindex);i++){
			word[j]=tochange[i];
			j++;
		}
		String str2=String.valueOf(word);
		return str2;
	}
}
