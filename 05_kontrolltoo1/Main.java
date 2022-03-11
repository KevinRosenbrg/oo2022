public class Main {
    public static void main(String[] args) {
        Teisendamine.toBinary(18);
        Teisendamine.toOctal(266);
        Teisendamine.toHex(44);
        System.out.println("");
        Teisendamine.binToDecimal("101010");
        Teisendamine.octToDecimal("523");
        Teisendamine.hexToDecimal("1AE");
        System.out.println("");
        System.out.println("Binary to...");
        Teisendamine.binToOctal("10110");
        Teisendamine.binToHex("10110");
        System.out.println("");
        System.out.println("Octal to...");
        Teisendamine.octToBinary("256");
        Teisendamine.octToHex("256");
        System.out.println("");
        System.out.println("Hex to...");
        Teisendamine.hexToBinary("1AE");
        Teisendamine.hexToOctal("1AE");
    }
}
