public class E_pattern {
        public static void main(String arg[]){
            int n=8;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==0 || j==0 || i==3 || i==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

