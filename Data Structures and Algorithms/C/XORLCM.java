import java.io.*;

public class XORLCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-->0) {
            long c = Long.parseLong(br.readLine().trim());
            int bits = 64 - Long.numberOfLeadingZeros(c);
            long b = c<<bits;
            sb.append(c).append(' ').append(b).append('\n');
        }
        System.out.println(sb);
    }
}
