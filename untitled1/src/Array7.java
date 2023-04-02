public class Array7 {
    private static void print(int[] array, int index)
    {
        try
        {
            int element = array[index];
            print(array, index + 1);
            System.out.println(element);
        }
        catch (ArrayIndexOutOfBoundsException ignored) { }
    }

    public static void main(String[] args)
    {
        int[] a = { 2, 4, 6, 8, 10};
        print(a, 0);
    }
}
