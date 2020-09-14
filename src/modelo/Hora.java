package modelo;

public class Hora {
	private int hora, min, seg;
	public Hora(int h, int m, int s) {
			hora = h;
			min = m;
			seg = s;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	public boolean eIgual(int h, int m, int s) {
		if ((h == hora) && (m == min) && (s == seg))
			return true;
		else 
			return false;
	} 
	public String toString() {
		return (hora+":"+min+":"+seg);
	}
}
