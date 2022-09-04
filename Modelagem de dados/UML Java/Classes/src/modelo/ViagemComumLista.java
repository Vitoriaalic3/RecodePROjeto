package modelo;
import java.util.Date;

public class ViagemComumLista {
	    private ViagensDisponiveis ID_V1;
	    private Date DataIda;
	    private Date Datavolta;
	    private String Voos;
	    public ViagensDisponiveis getID_V1() {
			return ID_V1;
		}
		public void setID_V1(ViagensDisponiveis iD_V1) {
			ID_V1 = iD_V1;
		}
		public Date getDataIda() {
			return DataIda;
		}
		public void setDataIda(Date dataIda) {
			DataIda = dataIda;
		}
		public Date getDatavolta() {
			return Datavolta;
		}
		public void setDatavolta(Date datavolta) {
			Datavolta = datavolta;
		}
		public String getVoos() {
			return Voos;
		}
		public void setVoos(String voos) {
			Voos = voos;
		}
		public String getDestinos() {
			return Destinos;
		}
		public void setDestinos(String destinos) {
			Destinos = destinos;
		}
		private String Destinos;
}
