public class String66 {
    public static void main(String[] args){
        String s = "Программа";
        char[] c = s.toCharArray();
        String res = "";
        String res1 = "";
        for(int i = 0; i < c.length; i++){
            if((i + 1) % 2 == 0){
                res += c[i];
            }
            else{
                res1 = c[i] + res1;
            }
        }
        System.out.println(res + res1);
    }
}
