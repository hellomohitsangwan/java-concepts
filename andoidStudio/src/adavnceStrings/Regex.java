
package adavnceStrings;

import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
	
		String name = "mohitsangwan  mohitsangwan mohitsangwanmohitsangwan";
		Pattern p  = Pattern.compile("m(.*?)a");
		Matcher m = p.matcher(name);
		while(m.find()) {
			
			System.out.println(m.group(1));
			
		}

	}

}
