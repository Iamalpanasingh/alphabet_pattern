public class h_pattern {
        public static void main(String arg[]){
            int n=8;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(j==0 || j==7 || i==4){
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