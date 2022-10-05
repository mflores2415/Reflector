public class HW2 {

    public static void main(String[] args) {
        Reflector ref = Reflector.getInstance();

        for (int i = -5;i < 100; i++){
            final int a1 = ref.reflect(i);
            final String a2 = Reflector.getInstance().unconvert(i);

            System.out.print("     ");
            System.out.print(i);
            if(i<10)
                System.out.print(" ");
            System.out.print("     ");
            System.out.print(a1);
            if(a1<10)
                System.out.print(" ");
            System.out.print("     ");
            System.out.println(a2);
        }
    }
}
