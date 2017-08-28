/**
         * Created by degget on 01.06.2017.
         */
        public class Recursion {

            static int factorial(int n){

                int result;

                if (n == 1)
                    return 1;
                result = factorial(n - 1) * n;
                return result;
    }

    public static void main(String[] args) {


        System.out.println(factorial(5));
    }

}
