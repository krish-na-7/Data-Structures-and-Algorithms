package src.data_structures.arrays;

public class ReverseString {

    private static String reverseStringUsingWhileLoop(String str){
        if(str.length()<2)
        {
            return str;
        }
        int i=str.length()-1;
        String result = "";
        while(i>=0){
            result=result+str.charAt(i);
            i--;
        }
        return result;
    }

    private static String reverseStringUsingForLoop(String str) {

        if(str.length()<2)
        {
            return str;
        }

        String result = "";
        final int length = str.length()-1;
        for (int i = length; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    private static String reverseStringWithStringBuilder(String str) {
        if(str.length()<2)
        {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStringUsingWhileLoop("123456"));
        System.out.println(reverseStringUsingForLoop("ram"));
        System.out.println(reverseStringWithStringBuilder("madam"));
    }
}
