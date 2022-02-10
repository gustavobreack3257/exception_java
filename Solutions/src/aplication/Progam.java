package aplication;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check in date(dd/MM/yyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check out date(dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		Reservation reserva = new Reservation(number, checkIn, checkOut);
		System.out.println("Reservention: " + reserva);
		
		System.out.println();
		System.out.print("Enter date to update th reservation: ");
		System.out.print("Room number: ");
		number = sc.nextInt();
		System.out.print("Check in date(dd/MM/yyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check out date(dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
		
		reserva.updateDates(checkIn, checkOut);
		System.out.println("Reserva" + reserva);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation " + e.getMessage());
		}
		
		sc.close();
	}		
}


		
	
	


