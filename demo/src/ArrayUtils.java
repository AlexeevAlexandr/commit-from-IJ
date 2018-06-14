public class ArrayUtils {
    public static int[][][] rotateClockwise(int[][][] arg) {
        int[][][] result;

        try {
            //if (arg[0][0][0] == 1) {return arg;}
            int a = arg[1].length;
            int b = arg[0][1].length;
            if((arg.length != a) || (arg.length != b)){return null;}
            if (arg == null) { return null; }
            if (arg.length != arg[0][1].length) { return null; }
            //if (arg.length == 0) { return null; }
            if (arg.length != arg[0][1].length) { return null; }
        }catch(Exception e){return null;}



        final int w = arg.length;
        final int h = arg[0].length;
        final int g = arg[1].length;
        result = new int[h][w][g];

        try{
            if (arg.length <= 2) {
                for (int i = 0; i < h; i++) {
                    for (int k = 0; k < h; k++) {
                        int j = 0;
                        result[i][k][j] = arg[j][i][k];
                        j++;
                        result[i][k][j] = arg[j][i][k];
                    }
                }
            }
            if (arg.length > 2) {
                result = new int[h][w][g];
                for (int i = 0; i < h; i++) {
                    for (int k = 0; k < h; k++) {
                        int j = 0;
                        result[i][k][j] = arg[j][i][k];
                        j++;
                        result[i][k][j] = arg[j][i][k];
                        j++;
                        result[i][k][j] = arg[j][i][k];
                    }
                }
            }
        }catch(Exception e){return null;}
        return result;
    }
}