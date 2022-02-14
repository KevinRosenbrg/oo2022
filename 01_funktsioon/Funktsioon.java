public class Funktsioon {
	public static int tunde(int tunnid){
		return 23-tunnid; // 24 tunni asemel 23 tundi, sest minutit lisavad aega juurde
	}
	public static int minuteid(int minutid){
		return 60-minutid;
	}
	public static void main(String[] args) {
		if (args.length>1){ // kui on sisestatud rohkem kui 1 argument
			int tund=Integer.parseInt(args[0]); // tundide sisestus int
			int minut=Integer.parseInt(args[1]); // minutite sisestus int
			System.out.println(tunde(tund) + " tundi " + minuteid(minut) + " minutit keskööni.");
		} else {
			System.out.println("Lisa tunnid ja minutid!");
		}
	}
}