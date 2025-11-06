import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class nav_array_without_index {
    public static void main(String[] args) throws Exception {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);

        int[] arr = {10, 20, 30};

        int base = unsafe.arrayBaseOffset(int[].class);
        int scale = unsafe.arrayIndexScale(int[].class);

        System.out.println("Base offset: " + base);
        System.out.println("Scale (element size): " + scale);

         for (int i = 0; i < arr.length; i++) {
            int value = unsafe.getInt(arr, (long) base + (long) i * scale);
            System.out.println( value);
        }
    }
}
