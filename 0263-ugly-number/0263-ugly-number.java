class Solution {
    
    public boolean isUgly1(long n) {
        if (n <= 0) {
            return false; // Ugly numbers are always positive
        }

        if (n == 1) {
            return true; // 1 is considered an ugly number
        }

        for (int i=2; i<=5; i++) {

            while (n % i == 0) {
                n = n / i;
            }

        }

 
        return n == 1;
    }

        public boolean isUgly(long n) {
        if (n <= 0) {
            return false; // Ugly numbers are always positive
        }

        if (n == 1) {
            return true; // 1 is considered an ugly number
        }

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                return false;
            }
        }
 
        return n == 1;
    }
}


// TL EXCEEDED HERE

//    public static boolean isPrime(int num) {
//
//        for(int i=2; i<Math.sqrt(num); ++i) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//
//    }
//
//    public static boolean isUgly(int n) {
//
//        ArrayList<Integer> lst = new ArrayList<Integer>();
//
//        for(int i=2; i<=n; i++) {
//
//            // check if num used to devide isPrime
//
//            if(isPrime(i)){
//                while(n % i == 0) {
//                    if (i != 2 && i != 3 && i != 5) {
//                        return false;
//                    }
//                    n = n / i;
//                }
//            }
//        }
//
//        return true;
//    }