import javax.crypto.spec.PSource;
import java.util.Scanner;

public class StringAufgaben {


	public static void main(String[] args) {
		// Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie ihren Namen ein:");
		String firstname = scanner.nextLine();
		System.out.println("Geben Sie ihren Nickname");
		String nickname = scanner.nextLine();

		String fullname = firstname.concat(nickname);
		System.out.println(fullname);
		System.out.println(fullname.toUpperCase());
		// länge
		System.out.println(fullname.length());
		System.out.println(fullname.charAt(0));
		System.out.println(fullname.charAt(fullname.length()-1));

		System.out.println(fullname.startsWith("L"));
		System.out.println(fullname.endsWith(".jpg"));

		// Experimente mit substring
		String name = "Robert";

		String kuerzel = name.substring(0,3);

		System.out.println("Name	: "+name);
		System.out.println("Kuerzel	: "+kuerzel);
		System.out.println("Hashtag : "+"#"+name);
		System.out.println("1. Char: "+name.charAt(0));
		System.out.println("n. Char: "+name.charAt(name.length()-1));


		// Experimente mit trim from spaces
		String buffer = "           hello World     ";
		String sauber = buffer.trim();

		System.out.println("buffer: "+buffer);
		System.out.println("sauber: "+sauber);

		// length
		String leer = "";
		System.out.println("länge leer:"+leer.length());
		if (leer.length() % 2 == 0)
			System.out.println("grad");
		System.out.println("länge name:"+name.length());
		// equals
		System.out.println("name und kuerzel sind nicht Gleich: "+name.equals(kuerzel));


		String mail= "hallo@clip.ch";

		if (mail.contains("@")) {
			System.out.println("yes");
		}



		String filename = "hello.png";
		 if (filename.endsWith(".png")) {
			 System.out.println("yes png");
		 }


		String student1 = "Hanshansli"; String student2 = "Paulapaule";
		System.out.println(student1+" "+student2+student1.compareTo(student2));

		String student3 = "Hansi"; String student4 = "Hans";
		System.out.println(student1+" "+student2+student3.compareTo(student4));



		if (student3.length() % 2 == 0) {
			System.out.println("länge gerade");
		} else {
			System.out.println("länge ungerade");
		}

		// conditional operator
		System.out.println(student3.length() % 2 == 0 ? "länge gerade" : "länge ungerade");

	}

}
