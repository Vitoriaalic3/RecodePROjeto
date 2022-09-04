package modelo;

import java.util.Date;

public class DestinosLista {
private Promocoes ID_V2;
    private Date DataIda;
    private Date DataVolta;
    private String Voos;
    public Promocoes getID_V2() {
		return ID_V2;
	}
	public void setID_V2(Promocoes iD_V2) {
		ID_V2 = iD_V2;
	}
	public Date getDataIda() {
		return DataIda;
	}
	public void setDataIda(Date dataIda) {
		DataIda = dataIda;
	}
	public Date getDataVolta() {
		return DataVolta;
	}
	public void setDataVolta(Date dataVolta) {
		DataVolta = dataVolta;
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
