interface StringFunc{
    String func(String n);
    }
class MyStringOps {
    static String strReverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            result.append(str.charAt(i));
        return result.toString();
    }
}
class Lambda_reference_to_static_method {
    private static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String args[]) {
        String inStr = "Lambda";
        String outStr;
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("input string: " + inStr);
        System.out.println("revers string: " + outStr);
    }
}