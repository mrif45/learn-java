class latArray{
    public static void main(String[] args) {
        long cariData;
        long[] larik;
        larik = new long[100]; 
        int nElemen = 0; 
        int i; 
        //---------------------------------------------------------------------
        larik[0] = 57; 
        larik[1] = 89;
        larik[2] = 49;
        larik[3] = 5;
        larik[4] = 12;
        larik[5] = 90;
        larik[6] = 1;
        larik[7] = 0;
        larik[8] = 63;
        larik[9] = 25;
        nElemen = 10;
        //---------------------------------------------------------------------
        // menampilkan data array
        for(i=0; i<nElemen; i++) {
            System.out.print(larik[i] + " ");
        }
        //---------------------------------------------------------------------
        // mencari data 5
        cariData = 5; 
        for(i=0; i<nElemen; i++) {
            if(larik[i] == cariData) 
            break;
        }
        if(i == nElemen) {
            System.out.println("Data " + cariData + " tidak ditemukan ");
        }else{
        System.out.println("Data " + cariData + " ditemukan");
        }
        //---------------------------------------------------------------------
        cariData = 90; // menghapus data 90
        for(i=0; i<nElemen; i++){
            if(larik[i] == cariData)
            break;
        }
        for(int j=i; j<nElemen-1; j++){
        larik[j] = larik[j+1];
        nElemen--;
        }
        //---------------------------------------------------------------------
        // menampilkan data
        for(i=0; i<nElemen; i++) {
        System.out.print( larik[i] + " ");
        }
    } 
} 
