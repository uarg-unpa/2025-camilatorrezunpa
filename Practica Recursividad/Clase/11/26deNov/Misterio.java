public class Misterio {
    public static int misterio (int a, int b){
        if(a == 0){
            return b;
        } else {
            return misterio(a - 1, b + 1);
        }
    }
}
