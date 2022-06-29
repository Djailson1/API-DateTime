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
		
		/*Nova API de data a partir do Java 8*/
		
		
		LocalDate dataAtual = LocalDate.now();/*como se declara o objeto */
		System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		/*como imprime e formata*/
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataAtuaHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atual: " + dataAtuaHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		
		
	}

}
