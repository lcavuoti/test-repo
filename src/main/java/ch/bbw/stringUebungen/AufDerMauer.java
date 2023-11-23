package ch.bbw.stringUebungen;

public class AufDerMauer {

	public void uebung() {
		String text = new String("Auf der Mauer auf der Lauer, sitzt 'ne kleine Wanze");

		System.out.println(text);
		System.out.println(text.charAt(8));
		System.out.println(text.length());
		System.out.println(text.substring(4, 15));
		System.out.println(text.substring(0, text.length()-1));
		System.out.println(text.substring(0, text.length()-2));
		System.out.println(text.substring(0, text.length()-3));
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.substring(0, text.length()-i));
		}

	}

	public void uebungFull() {
		String wanze = new String("Wanze");
		String tanzen = new String("tanzen");
		String text = new String("Auf der Mauer auf der Lauer, sitzt 'ne kleine " + wanze);
		String text2 = new String(" Sieh einmal die " + wanze + " an, wie die " + wanze + " " + tanzen + " kann");
		String text3 = new String(" Auf der Mauer, auf der Lauer, sitzt 'ne kleine " + wanze);

		for (int i = 0; i <= wanze.length(); i++) {

			text = new String("Auf der Mauer auf der Lauer, sitzt 'ne kleine " + wanze.substring(0, wanze.length()-i));
			text2 = new String(" Sieh einmal die " + wanze.substring(0, wanze.length()-i) + " an, wie die " + wanze.substring(0, wanze.length()-i) + " " + tanzen.substring(0, tanzen.length()-i) + " kann");
			text3 = new String(" Auf der Mauer, auf der Lauer, sitzt 'ne kleine " + wanze.substring(0, wanze.length()-i));
//			wanze = wanze.substring(0, wanze.length() - 1);
			System.out.println(text + text2 + text3);

		}

//		System.out.println(text);
//		System.out.println(text.charAt(8));
//		System.out.println(text.length());
//		System.out.println(text.substring(4, 15));
//

	}

	public static void main(String[] args) {
		AufDerMauer aufDerMauer = new AufDerMauer();
		aufDerMauer.uebungFull();
	}

}
