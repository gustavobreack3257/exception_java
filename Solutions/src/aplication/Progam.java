package aplication;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Progam {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check in date(dd/MM/yyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check out date(dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		//Solu��o ruim 1
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-Out date must be after check-in date.");
		}
		else {
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
			
			String error = reserva.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			}
			System.out.println("Reserva" + reserva);
			}
		sc.close();
		}
	
	}


