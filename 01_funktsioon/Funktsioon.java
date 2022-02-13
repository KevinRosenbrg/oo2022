public class Funktsioon {
	public static int tunde(int tunnid){
		return 24-tunnid;
	}
	public static int minuteid(int minutid){
		return 60-minutid;
	}
	public static void main(String[] args) {
		if (args.length>1){
			int tund=Integer.parseInt(args[0]);
			int minut=Integer.parseInt(args[1]);
			System.out.println(tunde(tund) + " tundi " + minuteid(minut) + " minutit keskööni.");
		}
	}
}