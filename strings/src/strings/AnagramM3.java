package strings;

public class AnagramM3 {

	public static void main(String[] args) {
		
		String a = "abca";
		String b = "bcaa";
		
		int al[] = new int[256];
		
		boolean isAnagram = true;
		
		for(char c : a.toCharArray()) {
			
			int index = (int) c;  //the index do not just give the index of every char of string but it give the index that where the a is given a asky value in the sytem memory,you can also see the value in console as i have sysout it.
			System.out.println(index);
			
			al[index]--;
		}
		for(char d : b.toCharArray()) {
			int index = (int) d;
			al[index]++;
		}
		for(int i = 0 ; i<256; i++) {
			if (al[i] != 0) {
				isAnagram = false;
			}
		}
		
		if(isAnagram) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}

	}

}
