package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));/*adc mais 5 dias a data passada*/
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
		System.out.println("Mais 2 meses: " + (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 ano: " + (dataBase = dataBase.minusYears(1)));
		System.out.println("Menos 1 mês: " + (dataBase = dataBase.minusMonths(1)));
		System.out.println("Menos 20 dias: " + (dataBase = dataBase.minusDays(20)));
		
		
		
		
	}

}
