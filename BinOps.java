public class BinOps {
    public String sum(String a, String b) {
       int x = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
       System.out.println(x);
       return Integer.toBinaryString(x);
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        System.out.println(x);
        return Integer.toBinaryString(x);
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/

    }
}
