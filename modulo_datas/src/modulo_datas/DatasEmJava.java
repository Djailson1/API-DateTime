package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia do mês: " + localDate.getDayOfMonth());
		System.out.println("Dia do ano: " + localDate.getDayOfYear());
		System.out.println("Mês: " + localDate.getMonth());
		System.out.println("Ano: " + localDate.getYear());
		
		
		
		
		
	}

}
