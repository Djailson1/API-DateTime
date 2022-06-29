package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();/*pega a data atual*/
		
		/*simular que a data vem do banco de dados ou qualquer outro lugar*/
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));
		
		calendar.add(Calendar.DAY_OF_MONTH, -40);/*data de hoje mais 40 dias*/
		
		System.out.println("Somando dia do m�s: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando o m�s: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando o ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}
