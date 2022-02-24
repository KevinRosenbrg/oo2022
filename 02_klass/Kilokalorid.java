public class Kilokalorid {
	private String andmed;
	public Kilokalorid(String uusAndmed) {andmed=uusAndmed;}
	public String kondimine() {
		Double kalorid = Integer.parseInt(andmed.substring(0,2)) * (3 * 3.5 * Integer.parseInt(andmed.substring(2,4))) / 200;
		String teade = kalorid + " kalorit kulutatud kõndides." + "(" + andmed.substring(0,2) + "minutit ja " + andmed.substring(2,4) + "kg kehakaal)";
		return teade;
	}
	public Double jooksmine() {
		Double kalorid = Integer.parseInt(andmed.substring(0,2)) * (9.8 * 3.5 * Integer.parseInt(andmed.substring(2,4))) / 200;
		return kalorid;
	}
}