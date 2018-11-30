class A <T>{
    void method(T o){
        System.out.println(o);
    }
}

class B{
    public static void main(String[] args) {
        A<java.io.Serializable> a = new A<>();
        a.method("string");
        a.method(1);




    }
}
