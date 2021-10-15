import org.junit.Test;

/**
 * @author sANbA111
 * @date 2021/5/3 21:36
 */
public class Num0067addBinary {

    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int upper = 0;
        while (aLength >= 0 || bLength >= 0 || upper != 0) {
            if(aLength>=0){
                upper += a.charAt(aLength) == '1' ? 1 : 0;

            }
            if(bLength>=0){
                upper += b.charAt(bLength) == '1' ? 1 : 0;
            }
            str.append(upper%2);
            upper /= 2;
            aLength--;
            bLength--;
        }
        return str.reverse().toString();
    }
    /*public String addBinary(String a, String b) {
        do {
            a= addStr(a,b);
            b = addUpper(a);
            a = addTwo(a);
        } while (new BigInteger(b).compareTo(new BigInteger("0"))>0);
        return a;
    }

    public String addStr(String a, String b) {
        BigInteger aInt= new BigInteger(a);
        BigInteger bInt= new BigInteger(b);
        return (aInt.add(bInt)).toString();
    }

    public static String addTwo(String a){
        char[] aStr = a.toCharArray();
        int location = aStr.length-1;
        for (int i = aStr.length-1; i>=0; i--) {
            if('2'==aStr[i]){
                aStr[i]='0';
            }else if('1'==aStr[i]){
                location = i;
            }
        }
        return new String(aStr);
    }

    public static String addUpper(String a){
        char[] aStr = a.toCharArray();
        char[] bStr = new char[aStr.length+1];
        bStr[bStr.length-1]='0';
        int location=aStr.length-1;
        for (int i = aStr.length-1; i>=0; i--) {
            if('2'==aStr[i]){
                bStr[i]='1';
                location=i;
            } else{
                bStr[i]='0';
            }
        }
        return new String(bStr);
    }*/
    @Test
    public void test(){
        String a = "11";
        String b = "1";
        String s = addBinary(a, b);
        System.out.println("s = " + s);
    }


}
