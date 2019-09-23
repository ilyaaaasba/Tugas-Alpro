package latihan1;

public class MesinKarakter {
	public void hitungJmlHuruf(String kata){
		System.out.println("Di kata " + kata + " Jumlahnya ada : " + kata.length());
	}
	
	public void hitungSpesifikKarakter(String karakter, String kata){
		//membuat array untuk menampung karakter/huruf
		String[] hasil = new String[kata.length()];
		//Memisahkan tiap huruf dari variable reference "kata"
		hasil = kata.split("");
		int karakterCounter = 0;
		for (int i = 0; i < hasil.length; i++) {
			//jika nilai di array sama dengan nilai yang di cari
			if(hasil[i].equals(karakter)){
				karakterCounter++;
			}
		}
		System.out.println("Di kata " + kata + " ada " + karakterCounter + " buah huruf " + karakter);
	}
	public void hitungKata(String kalimat){
		//menghitung kata dari kalimat
		int panjang = kalimat.split(" ").length;
		//membuat array untuk menampung kata kata dari kalimat
		String[] hasil = new String[panjang];
		//memasukan kata ke array
		hasil = kalimat.split(" ");
		
		System.out.println("Ada " + panjang + " kata dari kalimat : ");
	}
	public void checkHuruf(String kata, int index){
		System.out.println("Index ke " + index + " dari kata " + " adalah " + kata.charAt(index));
	}
	public void charAtLoop(String kata){
		//looping karakter dari kata satu per satu menggunakan charAt
		for (int i = 0; i < kata.length(); i++) {
			System.out.println("Index ke " + i + " dari kata " + kata + " adalah : " + kata.charAt(i));
		}
	}
	public void splitArrayLoop(String kata){
		//looping karakter menggunakan array
		String[] hasil = new String[kata.length()];
		hasil = kata.split("");
		for (int i = 0; i < hasil.length; i++) {
			System.out.println(hasil[i]);
			
		}
	}
	
	public void ambilCharAwal(String kalimat) {
		//menampung banyak kalimat
		int panjang = kalimat.split(" ").length;
		String[] hasil = new String[panjang];
		hasil = kalimat.split(" ");
		char[] awal = new char[panjang];
		
		for (int i = 0; i < awal.length; i++) {
			//variabel awal menampung panjang dan hasil awal adalah variabel hasil i dan charAt index ke 0
			awal[i] = hasil[i].charAt(0);
			System.out.print(awal[i]);
			
		}
	}
}
