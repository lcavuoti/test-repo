package ch.bbw.stringUebungen;

public class Validation {

	public boolean isValidTime(String time) {
		System.out.println(">>> in der Methode: " + time);
		if (time.length() == 5) {
			if (time.charAt(2) == ':') {
				// if(time.charAt(0)== '0' || time.charAt(0)=='1' ||
				// time.charAt(0)=='2')
				int hoursInt = Integer.parseInt(time.substring(0, 2));
				if (hoursInt >= 0 && hoursInt <= 23) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean isValidTime2(String time) {
		System.out.println(">>> in der Methode: " + time);
		if (time.length() == 5 && time.charAt(2) == ':') {
			String hoursStr = time.substring(0, 2);
			int hoursInt = Integer.parseInt(hoursStr);
			String minStr = time.substring(3, 5);
			int minInt = Integer.parseInt(minStr);

			if (hoursInt >= 0 && hoursInt <= 23 && minInt >= 0 && minInt <= 59) {
				return true;
			}
		}
		return false;
	}


	public boolean isValidDate(String date) {
		System.out.println(">>> in der Methode: " + date);
		if (date.length() == 10 && date.charAt(4) == '-' && date.charAt(7) == '-') {
			String yearStr = date.substring(0, 4);
			int yearInt = Integer.parseInt(yearStr);
			String monthStr = date.substring(5, 7);
			int monthInt = Integer.parseInt(monthStr);
			String dayStr = date.substring(9, 10);
			int dayInt = Integer.parseInt(dayStr);

			System.out.println("Jahr: " + yearInt + " Monat: "+ monthInt + " Tag: "+ dayInt);


			if (yearInt >= 0 && yearInt <= 2500) {
				return true;
			}
		}
		return false;
	}





	public static void main(String[] args) {
		Validation validation = new Validation();
		if (validation.isValidTime2("33:15")) {
			System.out.println("Zeit ist gültig");
		}
		else{
			System.out.println("Zeit ist ungültig");
		}
		if (validation.isValidDate("2015-02-16")) {
			System.out.println("Datum ist gültig");
		}
		else{
			System.out.println("Datum ist ungültig");
		}
	}

}
