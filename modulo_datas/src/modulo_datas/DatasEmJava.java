package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException, InterruptedException {
		/*para sabermos quanto tempo demora um processo a ser executado*/
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);/*pode ser um processo com tempo qualquer que não conhecemos*/
		
		Instant ifinal = Instant.now();
		
		Duration duration = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nanosegundos: " + duration.toNanos());
		
		System.out.println("Duração em minutos: " + duration.toMinutes());
		
		System.out.println("Duração em horas: " + duration.toHours());
		
		System.out.println("Duração em milisegundos: " + duration.toMillis());
		
		
		
		
	}

}
