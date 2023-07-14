
public class FlippingBits {
    public static void main(String[] args) {
        long num = 1;
        System.out.println(flippingBits(num));
    }

    public static long flippingBits(long n) {
        String binary = Long.toBinaryString(n);
        String binaryString = String.format("%32s", binary).replaceAll(" ","0");
        String[] binaryArr;
        binaryArr = binaryString.split("");
        for (int i=0; i<binaryArr.length; i++){
            if (binaryArr[i].equals("0")){
                binaryArr[i] = "1";
            } else {
                binaryArr[i] = "0";
            }
        }
        return Long.parseLong(String.join("", binaryArr),2);
    }

}
