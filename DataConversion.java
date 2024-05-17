public class DataConversion {
    public static void main(String[] args){
        byte b = 127;
        int a = b;
        byte k = (byte) a;

        float f = 5.6f;
        int t = (int) f;  // 5

        byte byte1 = 10;
        byte byte2 = 30;
        int byte_result = byte1 * byte2; // 300  type promotion

        System.out.println(byte_result);
    }
}
