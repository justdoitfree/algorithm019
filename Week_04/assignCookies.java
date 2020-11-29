import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution042 {
    public int findContentChildren(int[] g, int[] s) {
        int g0 = 0;
        int s0 = 0;
        //先对两个数组排序，g是胃口大小数组，s是饼干大小数组
        Arrays.sort(g);
        Arrays.sort(s);
        if( g == null|| s == null) return 0;
        //这里循环的条件是两个指针不达到两个数组的长度，也就是没有元素移动了
        while(g0<g.length && s0<s.length){
            if(g[g0]<=s[s0]){
                //当胃口比饼干小，那么匹配成功，分给小孩
                g0++;
            }
            s0++;
        }
        return g0;
    }
}

public class assignCookies {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] g = stringToIntegerArray(line);
            line = in.readLine();
            int[] s = stringToIntegerArray(line);

            int ret = new Solution042().findContentChildren(g, s);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}