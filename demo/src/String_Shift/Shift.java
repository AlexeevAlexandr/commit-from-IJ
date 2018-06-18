package String_Shift;

import static java.lang.Math.abs;

class Shift {
    static String rightShift(String arg, int delta) {
            if (arg.length() == 0 || delta == 0){return arg;}
            else {
                delta %= arg.length();
                if (delta >= 0) {
                    for (int i = 0; i < delta; i++) {
                        arg = arg.charAt(arg.length() - 1) + arg.substring(0, arg.length() - 1);
                    }
                } else {
                    delta = abs(delta);
                    arg = String.valueOf(new StringBuilder(arg).reverse());
                    for (int i = 0; i < delta; i++) {
                        arg = arg.charAt(arg.length() - 1) + arg.substring(0, arg.length() - 1);
                    }
                    arg = String.valueOf(new StringBuilder(arg).reverse());
                }
            }
        System.out.println(arg);
            return arg;
        }
    }