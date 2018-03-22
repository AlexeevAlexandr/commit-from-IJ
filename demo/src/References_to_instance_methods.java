interface SF{
    String func(String n);
}
class MS{
    static String SR(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            result.append(str.charAt(i));
        return result.toString();
    }
}
class References_to_instance_methods {
    private static String stringOp(SF sf, String s) {
        return sf.func(s);
    }
    public static void main(String args[]) {
        String inStr = "Lambda";
        String outStr;
        outStr = stringOp(MS::SR, inStr);
        System.out.println("input string: " + inStr);
        System.out.println("revers string: " + outStr);
    }
}
