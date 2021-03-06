
public class PigLatin {

	public static void main(String[] args) {
		System.out.println(translate("ZicK"));
		System.out.println(findVowel("mmma"));
		System.out.println(translate(PigLatinPrompt.piggyPrompt()));

	}

	public static String translate(String a) {
		a = a.toLowerCase();

		if (a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o'
				|| a.charAt(0) == 'u') {
			a = a + "way";
			return a;
		} else {
			return findVowel(a);
		}
		
	}

	public static String findVowel(String a) {
		char[] array = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			array[i] = a.charAt(i);
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u') {
				a = a.substring(i) + a.substring(0, i) + "ay";
				break;
			} else {
				a = a;
			}
		}
		return a;
	}

}
