class layangan{
    public static void main(String[] args) {
        int i;
        int j;
        int n = 19;
        int c1 = (n-1)/2;
        int c2 = 3 * n/2 - 1;

        for(i=0; i<n; i++){
            for(j=0; j<n; i++){
                if(i+j==c1 || i-j==c1 || j-i==c1 || i+j==c2 || i==c1 || j==c1){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}