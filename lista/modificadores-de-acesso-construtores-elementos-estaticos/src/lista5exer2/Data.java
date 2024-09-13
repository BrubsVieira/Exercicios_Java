package lista5exer2;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto;
	private int segundo;
	
	public final static int FORMATO_12H = 12;
	public final static int FORMATO_24H = 24;

	public Data(int dia,int mes,int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
			
	}
	
	public Data(int dia,int mes,int ano,int hora,int minuto,int segundo) {
		Data d = new Data(dia,mes,ano);
		this.dia = d.dia;
		this.mes = d.mes;
		this.ano = d.ano;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
	}
	public void imprimir (int formato) {
		int horario = hora; // hora fornecida na aplicacao
		
		// se escolher 12 horas
		if(formato == FORMATO_12H) {
			// para chamar a apenas a data
			if(hora ==  -1) {
				System.out.println(dia+"/"+mes+"/"+ano+" ");
			}
			// se for 12h, de meio dia 
			else if(hora < 12 && hora > 0) {
				System.out.println(dia+"/"+mes+"/"+ano+" "+horario+":"+minuto+":"+segundo+" "+"AM");
			// se for 12h, acima de meio dia 
			} else if (hora >= 12) {
				horario = hora - 12;	
				System.out.println(dia+"/"+mes+"/"+ano+" "+horario+":"+minuto+":"+segundo+" "+"PM");
			}else if (hora == 00) {
				System.out.println(dia+"/"+mes+"/"+ano+" 12:"+minuto+":"+segundo+" "+"AM");
			}
			
			//se escolher 24 horas
		} else if (formato == FORMATO_24H) {
			// para chamar apenas a data
			if (hora == -1) {
				System.out.println(dia+"/"+mes+"/"+ano+" ");
			} else if (hora <= 23 && hora > 0) { // chamando o horario e data
				System.out.println(dia+"/"+mes+"/"+ano+" "+horario+":"+minuto+":"+segundo);	
			}else if (hora == 00) {
				System.out.println(dia+"/"+mes+"/"+ano+" 00:"+minuto+":"+segundo);	
			}
			
			
		}
					
	}	
	
	// metodos getters7
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	
	
}
