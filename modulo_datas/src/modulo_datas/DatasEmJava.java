package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("20/06/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("28/06/2022");
		
		//after: se data 1 é maior que a data 2
		//before: se data 1 é menor que a data 2
		
		if(dataVencimentoBoleto.before(dataAtualHoje)) {/*se a data 1 é menor que a data 2*/
			
			System.out.println("Boleto está vencido - URGENTE");
			
		}else {
			System.out.println("Boleto não vencido");
		}
	}

}
