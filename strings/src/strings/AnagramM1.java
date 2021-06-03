package strings;

public class AnagramM1 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "hka";
		boolean isanagram = false;
       boolean [] visited = new boolean [b.length()];   
//       now agar a = abc, b = abbc, to bhi ye anagam aayega ab si situation se bachane k liye hamme ek arrya banayi visited naam k
//   jisme ham condition dlege k agar us sgring ka i th ya j th element not visited he to he go anagram aye.ab kese dalege vo 
//   code me dekh le
		if(a.length() == b.length())
	{
			
			
		for(int i = 0; i<a.length(); i++) {
			char c = a.charAt(i);
			
			for(int j=0; j<b.length();j++) {
				if(b.charAt(j) == c && !visited[j] ) 
				{
					visited[j] = true;
					isanagram = true;
					break;
				}
			} 
			if(!isanagram) {
				break;
			}
			
		}
		}
		if(isanagram) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}

	}

}
