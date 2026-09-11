import java.time.*;
public class Reservation{
	private String nomPassager;
	private Vol vol;
	private ZonedDateTime dateReservation;
	private String statut;
	public Reservation(String nomPassager, Vol vol, ZonedDateTime dateReservation, String statut){
		this.nomPassager = nomPassager;
		this.vol = vol;
		this.dateReservation = dateReservation;
		this.statut = statut;
	}
	public String getNomPassager(){
		return nomPassager;
	}
	public Vol getVol(){
		return vol;
	}
	public ZonedDateTime getDateReservation(){
		return dateReservation;
	}
	public String getStatut(){
		return statut;
	}
	public void setNomPassager(String nomPassager){
		this.nomPassager = nomPassager;
	}
	public void setVol(Vol vol){
		this.vol = vol;
	}
	public void setDateReservation(ZonedDateTime dateReservation){
		this.dateReservation = dateReservation;
	}
	public void setStatut(String statut){
		this.statut = statut;
	}
	@Override
	public String toString(){
		return "nom passager est : ["+nomPassager+"], vol : ["+vol.toString()+"], date reservation : ["+dateReservation+"], statut : ["+statut+"]";
	}
}