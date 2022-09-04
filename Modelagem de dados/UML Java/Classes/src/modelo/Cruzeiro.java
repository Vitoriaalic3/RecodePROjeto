package modelo;

import java.util.Date;

public class Cruzeiro {
    public int getID_V3() {
		return ID_V3;
	}
	public void setID_V3(int iD_V3) {
		ID_V3 = iD_V3;
	}
	public Date getDatas() {
		return Datas;
	}
	public void setDatas(Date datas) {
		Datas = datas;
	}
	public String getItinerario() {
		return Itinerario;
	}
	public void setItinerario(String itinerario) {
		Itinerario = itinerario;
	}
	public String getNavio() {
		return Navio;
	}
	public void setNavio(String navio) {
		Navio = navio;
	}
	private int ID_V3;
    private Date Datas;
    private String Itinerario;
    private String Navio;
}
