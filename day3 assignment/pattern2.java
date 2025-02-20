public class pattern2 {
    public static void main(String args[]){
        for(int i = 0;i < 4;i++){
            if(i == 0){
                for(int j = 1;j <= 4;j++){
                    System.out.print(j);
                }
            }
            else if(i == 1){
                for(int j = 4;j >= 2;j--){
                    System.out.print(j);
                }
            }
            else if(i == 2){
                for(int j = 3;j <= 4 ;j++){
                    System.out.print(j);
                }
            }
            else if(i == 3){
                System.out.print(4);
            }
            System.out.println();
        }
    }
}
