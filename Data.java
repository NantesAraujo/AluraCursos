class Data{
	int dia, mes, ano;

	Data(int dia, int mes, int ano){
		if(dia == 31 && mes == 2 && ano == 2012){
			System.out.println("Data não permitida.");
		}else{
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}

	String mostrarData(){
		return dia + "/" + mes + "/" + ano;
	}
}