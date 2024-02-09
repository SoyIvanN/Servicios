import java.sql.Time;
import java.io.*;
import java.util.Date;
public class Servicio implements Serializable {
	private String desc;
	private Time he;
	private Time hs;
	private Date fecha;

	public Servicio() {
	}
	public Servicio(String desc, Time he, Time hs, Date fecha) {
		this.desc = desc;
		this.he = he;
		this.hs = hs;
		this.fecha = fecha;
	}

	public String getdesc() {
		return desc;
	}
	public void setdesc(String desc) {
		this.desc = desc;
	}
	public Time gethe() {
		return he;
	}
	public void sethe(Time he) {
		this.he = he;
	}
	public Time geths() {
		return hs;
	}
	public void seths(Time hs) {
		this.hs = hs;
	}
	public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}