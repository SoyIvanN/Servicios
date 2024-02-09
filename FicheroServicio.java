import java.sql.Time;
import java.io.*;
import java.util.Date;

public class FicheroServicio implements Serializable{
	final static String RUTA= new File ("").getAbsolutePath()+"\\src\\";
	private String desc;
	private Time he;
	private Time hs;
	private Date fecha;

	public FicheroServicio() {
	}
	public FicheroServicio(String desc, Time he, Time hs, Date fecha) {
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
	public void guardarServicio() {
		try { 
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(RUTA+"Servicio.dat"));
			objectOutputStream.writeObject(this);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void cargarServicio() {
		try { 
			ObjectInputStream objectOutputStream = new ObjectInputStream(new FileInputStream(RUTA+"Servicio.dat"));
			objectOutputStream.readObject().toString();
			objectOutputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
