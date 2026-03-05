public class AddingArrays {

    public static void main(String[] args) {
        int[][][] a = new int[2][2][2];
        int[][][] b = new int[2][2][2];
        int[][][] sum = new int[2][2][2];
        a[0][0][0] = 2;
        a[0][0][1] = 4;
        a[0][1][0] = 6;
        a[0][1][1] = 8;
        a[1][0][0] = 10;
        a[1][0][1] = 12;
        a[1][1][0] = 14;
        a[1][1][1] = 16;
        b[0][0][0] = 18;
        b[0][0][1] = 20;
        b[0][1][0] = 22;
        b[0][1][1] = 24;
        b[1][0][0] = 26;
        b[1][0][1] = 28;
        b[1][1][0] = 30;
        b[1][1][1] = 32;
        
        
        
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a[i].length;j++){
                for(int k = 0;k < a[i][j].length;k++){
                sum[i][j][k] = a[i][j][k] + b[i][j][k];
                    System.out.print(sum[i][j][k] + " ");
                }                            
                System.out.println();
            }            
            System.out.println("-------");
        }       
    }
}
