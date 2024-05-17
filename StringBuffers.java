public class StringBuffers {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Felix");

        sb.append(" Olali");

        String str = sb.toString();

        System.out.println(str);
    }
}
