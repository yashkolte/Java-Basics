public class StarProblem {
    public static void main(String[] args) {
        // int n = 4;
        // int m = 5;

        /*

        ! *****
        ! *   *
        ! *   *
        ! *****

         */

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= m; j++){
        //         if (i == 1 || j == 1 || j == m || i == n) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        /*

        ! * 
        ! **
        ! ***
        ! ****

         */

        //  int n = 6;
        //  int m = 6;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*

        ! ******
        ! *****
        ! ****
        ! ***
        ! **
        ! *

         */

        //  for(int i = 1; i <= n; i++){
        //     for(int j = m; j >= i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        /*

        ! *****
        !  ***
        !   *
        
         */

        //  int n = 5;
        //  int m = 3;

        //  for(int i = 1; i <= m; i++){
        //     for(int j = 1; j <= n; j++){
        //!         if (j == 1 && i==2 || j == 5 && i == 2 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 4 || i == 3 && j == 5 ) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        //  }

        /*

         * * * * * 
          * * * * 
           * * * 
            * * 
             *  
         
         */

        //  int star = 5;

        //  for(int i = 1; i <= star; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = i; j <= star; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

         /*

             *
            * *
           * * *
          * * * *
         * * * * *

          */

        //   int star = 5;

        //   for(int i = 1; i <= star; i++){
        //     for(int j = star; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        //   }

        // ! Diamond Pattern
        /*

        !     *
        !    * *
        !   * * *
        !  * * * *
        ! * * * * *
        !  * * * *
        !   * * *
        !    * *
        !     *

         */

        //  int star = 5;

        //  for(int i = 1; i < star; i++){
        //     for(int j = 5; j >= i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        //  for(int i = star; i >= 1; i--){
        //     for(int j = 5; j >= i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        /* 
        !     *
        !    **
        !   ***
        !  ****
        ! *****

         */

        //  int star = 5;

        // for(int i = 1; i <= star; i++){
        //     for(int j = star; j >= i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // ! Butterfly Pattern
        /*
        
        ! *         *
        ! **       **
        ! ***     ***
        ! ****   ****
        ! ***** *****
        ! ***** *****
        ! ****   ****
        ! ***     ***
        ! **       **
        ! *         *
        
        */

        // int star = 5;

        // for(int i = 1; i <= star; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     // for(int j = star*2; j >= i*2; j--){
        //     for(int j = 1; j <= (star-i)*2; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = star; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j <= (star-i)*2; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
         
        ! ***** *****
        ! ****   ****
        ! ***     ***
        ! **       **
        ! *         *
        ! *         *
        ! **       **
        ! ***     ***
        ! ****   ****
        ! ***** *****

         */

        // int star = 5;

        // for(int i = 1; i <= star; i++){
        //     for(int j = star; j >= i; j--){
        //         System.out.print("*");
        //     }
        //     for(int j = 1*2; j <= i*2; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = star; j >= i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = star; i >= 1; i--){
        //     for(int j = star; j >= i; j--){
        //         System.out.print("*");
        //     }
        //     for(int j = 1*2; j <= i*2; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = star; j >= i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //! for(int i = 1; i <= star; i++){
        //!     for(int j = 1; j <= i; j++){
        //!        System.out.print("*");
        //!     }
        //!     for(int j = star*2; j >= i*2; j--){
        //!         System.out.print(" ");
        //!     }
        //!     for(int j = 1; j <= i; j++){
        //!         System.out.print("*");
        //!     }
        //!     System.out.println();
        //! }

        /*
         
        !    *   
        !    *   
        !    *   
        ! *******
        !    *   
        !    *   
        !    *   

         */

        //  int num = 7;
         
        //  for(int i = 1; i <= num; i++){
        //     for(int j = 1; j <= num; j++){
        //         if(j == 4 || i == 4){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        //  }


        /*

        ! 1
        ! 12
        ! 123
        ! 1234
        ! 12345

         */

        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //? Floy'd Triangle

        /*

        ! 1
        ! 2 3
        ! 4 5 6
        ! 7 8 9 10
        ! 10 11 12 13 14 15

         */

        // int num = 1;
        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(num +" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        //? 0-1 Triangle

        /*

        ! 1
        ! 0 1
        ! 1 0 1
        ! 0 1 0 1
        ! 1 0 1 0 1

         */

        // for(int i = 1; i <= 5; i++) {
        //     for(int j = 1; j <= i; j++){
        //         if((i + j) % 2 == 0){
        //             System.out.print("1");
        //         } else {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }


        // ! Soild Rhombus
        /*

        !      *****
        !     *****
        !    *****
        !   *****
        ! ******

         */

        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= (5-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 5; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //! Number Pyramid
        
        /*
        
        !     1
        !    2 2
        !   3 3 3
        !  4 4 4 4
        ! 5 5 5 5 5   

         */

        // int num = 5;
        // for(int i = 1; i <= num; i++){
        //     for(int j = 1; j <= (num - i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }


        //! Palindromic Pattern

        /*

        !     1
        !    212
        !   32123
        !  4321234
        ! 543212345
        
         */

        int num = 5;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= (num - i); j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
