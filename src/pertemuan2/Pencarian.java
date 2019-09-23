package pertemuan2;

import java.util.Scanner;

public class Pencarian {
	
	//membuat array himpunan
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int[] himpunan = new int[n];
    
        void isiHimpunan() {
           for (int i = 0; i < himpunan.length; i++) {
			himpunan[i] = sc.nextInt();
           }       
        }
        
    void tampilkanHimpunan() {
        System.out.print("Himpunan Nilai: ");
        for (int i = 0; i < himpunan.length; i++) {
         System.out.print(himpunan[i]);
            }
        System.out.println("");
        }
    
    void isiData() {
    	System.out.println("Pencarian Sequential : ");
    	int A = sc.nextInt();
    	pencarianSequential (A);
    	
    	System.out.println("Pencarian Binary : ");
    	int B = sc.nextInt();
    	pencarianBinary (B);
    }

public void pencarianSequential(int x) {
    String hasil = "";

    boolean ketemu = false;
    
    int sama = 0;

    for (int i = 0; i < himpunan.length; i++) {
        //jika nilai himpunan indekske-i == nilai yang dicari
        if (himpunan[i] == x) {
            ketemu = true;
            //contact hasil jika nilai yang dicari ada yang sama
            hasil = hasil + "  " + i;
            sama++;
        }
    }
    
if (ketemu) {
    System.out.println("Data Ada Di Index Ke " + hasil);
    System.out.println("Data yang sama : " + sama);
} else {
    System.out.println("Data Tidak Ditemukan");
    }
}

void pencarianBinary(int x) {
    int awal, akhir, tengah, sama;
    boolean ketemu;

    awal = 0; 
    tengah = 0;
    akhir = himpunan.length - 1;
    String hasil = "";
    sama = 0;
    ketemu = false;

    //selama awal kurang dari sama dengan akhir dan ketemu == false
    while(awal <= akhir && ketemu == false) {
        //cari nilai tengah, didapat dari nilai awal + nilai akhir div 2
    	
        tengah = (awal + akhir) / 2;
            //jika nilai yang dicari berada diindeks tengah
        if (x == himpunan[tengah]) {
        	for (int i = 0; i < himpunan.length; i++) {
        		ketemu = true;
        		if (x == himpunan[i]) {
        			sama = sama + 1;
        			hasil = hasil + " " + i;
					
				}
			}
            
            //jika nilai yang dicari bukan diindeks tengah
        } else {
            //cari bagian kanan
            if(himpunan[tengah] <= x) {
                awal = tengah + 1 ;
                //cari bagian kiri
        } else {
            akhir = tengah - 1;
        }
    }
}
    	if (ketemu) {
    		System.out.println("Data ada di index ke " + hasil);
    		System.out.println("Data yang sama : " + sama);
    	} else {
    		System.out.println("Data tidak ditemukan");
    	}
}
}
