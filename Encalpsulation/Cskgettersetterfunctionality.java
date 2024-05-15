package Encalpsulation;

public class Cskgettersetterfunctionality {
	private String c;
	private String v;
	private String w;
	private int score=220;
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void winner() {
		if(c.equals("Ruturaj") && v.equals("Jadeja") && w.equals("Dhoni") && score>200) {
			System.out.println("CSK wins");
		}
		else {
			System.out.println("CSK looses");
		}
	}
	

}
