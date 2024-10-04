package weatherforecasting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Weatherforecast {

	private static String weatherCondition;

	public static void main(String[]args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] temperatures = {25,20,15,10,30,22};
			String[] descriptions = {"clear skies","light cloud cover","Heavy rain showers","snow flurries",
					"strong winds","scattered clouds"};
			//Get user input for city and date range
			System.out.print("Enter city");
			String city = scanner.nextLine();
System.out.print("Enter start date(yyyy-MM-dd):");
			LocalDate startDate =
					LocalDate.parse(scanner.nextLine(),
							DateTimeFormatter.ISO_DATE);
			//Create a Random instance to generate random data

			
			//Display weather forecast
			System.out.println("Weather Forecast for" + city +"from" +startDate +"to" + startDate);
			LocalDate date = startDate;
			while(!date.isAfter(startDate)) {
				// Generate random weather conditions and temperatures
				
			
				int  weatherIndex = (int)(Math.random() *weatherCondition.length());

			
				System.out.println(date +":");
				System.out.println("Condition:"+ weatherCondition);//use the singular variable now
				
				System.out.println("Temperature:" + temperatures+ "C");
				System.out.println("Description:" + descriptions[weatherIndex]);
				System.out.println();
				date = date.plusDays(1);
				
			
			}
		}

	}

}
