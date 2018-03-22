interface MyFunc<T> {
    boolean func(T v1, T v2);
}
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }
        boolean lessThanTemp (HighTemp ht2){
            return hTemp < ht2.hTemp;
        }
    }
class InstanceMethWithObjectRefDemo{
    private static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (T val : vals)
            if (f.func(val, v)) count++;
        return count;
    }
        public static void main (String args [] ){
        int count ;
        HighTemp [] weekDayHighs = { new HighTemp (89), new HighTemp (82), new HighTemp (90) , new HighTemp (89), new HighTemp (89), new HighTemp(91),new HighTemp (84), new HighTemp (83)};
        count = counter (weekDayHighs, HighTemp :: sameTemp, new HighTemp (89));
        System.out.println("Дней , когда максималь н а я температура бЬ1Ла 8 9 : " + count ) ;
        HighTemp [] weekDayHighs2 = {new HighTemp (32) ,new HighTemp (12), new HighTemp (24) ,new HighTemp (19), new HighTemp (18), new HighTemp (12), new HighTemp ( - 1 ) , new HighTemp (13)};
        count = counter ( weekDayHighs2 , HighTemp :: sameTemp, new HighTemp (12));
        System.out.println("Дней , когда максималь на я температур а была 12: " + count);
        count = counter ( weekDayHighs , HighTemp :: lessThanTemp, new HighTemp (89));
        System.out.println("Дней , когда максимал ь н а я температур а была ме ньше 8 9 : " + count);
        count = counter (weekDayHighs2, HighTemp :: lessThanTemp, new HighTemp (19));
        System.out.println("Дней , когда максималь н а я темпера тура была ме н ь ше 19 : " + count);
        }
    }
