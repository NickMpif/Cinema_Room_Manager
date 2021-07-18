import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        String[][] star=new String[x][x];
        for (int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==j||i==x-1-j||i==x/2||j==x/2){
                    star[i][j]=" *";
                }else{
                    star[i][j]=" .";
                }
            }
        }
            for(int i=0;i<x;i++){
                for(int j=0;j<x;j++){
                    System.out.print(star[i][j]);
                }
                System.out.println();

          }

    }
}