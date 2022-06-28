package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("30/06/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("28/06/2022");
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) {/*posterior, maior ou depois da data atual*/
			
			System.out.println("Boleto não vencido");
			
		}else {
			System.out.println("Boleto está vencido - URGENTE");
		}
	}

}
