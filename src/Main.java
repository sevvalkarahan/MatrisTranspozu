import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] matris={{1,2,3},{4,5,6}};
        int[][] transpoz=new int[3][2];

        System.out.println("Matris: ");
        for (int[] row:matris){
            for (int col:row){
                System.out.print(col +" ");
            }
            System.out.println();
        }


        for (int i = 0; i < transpoz.length ; i++) {
            for (int j = 0; j < matris.length ; j++) {
                transpoz[i][j]=matris[j][i];
            }
        }


        System.out.println("Transpoz: ");
        for (int[] row:transpoz){
            for (int col:row){
                System.out.print(col +" ");
            }
            System.out.println();
        }




    }
}
