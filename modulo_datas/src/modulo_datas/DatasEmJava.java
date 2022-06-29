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
		
		calendar.add(Calendar.DAY_OF_MONTH, -5);/*adicionei 5*/
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
	}

}
