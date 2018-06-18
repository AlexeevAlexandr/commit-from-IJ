package String_Shift;

public class Test {
        public static void main(String[] args) {
            System.out.println(Shift.rightShift("ABCDE", 1000000009).equals("BCDEA"));
            System.out.println(Shift.rightShift("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1000000008).equals("GHIJKLMNOPQRSTUVWXYZABCDEF"));
            System.out.println(Shift.rightShift("", 1000000009).equals(""));
        }
}
