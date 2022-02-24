public class Kodu {
	public static void main(String[] args) {
		Kilokalorid isik1 = new Kilokalorid("1060"); // aeg (10 min) ja kehakaal (60 kg)
		Kilokalorid isik2 = new Kilokalorid("3070");
		System.out.println(isik1.kondimine());
		System.out.println(isik2.kondimine());
		System.out.println(isik1.jooksmine());
		System.out.println(isik2.jooksmine());
	}
}