import java.util.Scanner;
public class Kuis{

    public void bersihkanlayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
	

	static int pil;
	static int rsusi = 213456;
	int rbudi = 314865;
	int salsusi = 2000000;
	int salbudi = 0;
	int rek;
	int[] mutasi = new int[100];
	int index = 0;


	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Kuis function = new Kuis();
		while(pil!=3) {
			System.out.println ("Selamat Datang di Bank ANGEL");
			System.out.println ("Nama = Susi");
			System.out.println ("Nomor Rekening = " +rsusi);
			System.out.println ("1. Transfer");
			System.out.println ("2. Mutasi");
			System.out.println ("3. Keluar");
			System.out.print ("Pilih Menu = ");
			pil = keyboard.nextInt();
            function.bersihkanlayar();
				switch(pil) {
					case 1 : function.transfer(keyboard); break;
					case 2 : function.mutasi(keyboard); break;
				}
		
			
		}
		
	}
	
	
	public void mutasi(Scanner keyboard) {
		int pil2 = 0;
			while(pil2!=2) {
				System.out.println ("Mutasi");
				System.out.println ("1. Cek Mutasi");
				System.out.println ("2. Keluar");
				System.out.print ("Pilih Menu = ");
				pil2 = keyboard.nextInt();
				if(pil2==1) {
					for(int i = 0; i < index; i++) {
					    System.out.println ("Susi Transfer " + mutasi[i] + " Ke Rekening Budi");	    
					}
					if(index==0) {
						System.out.println ("Belum Terdapat Mutasi");
					}
				
				}
				
				
				else if(pil2==2) {
					break;
				}
					
			}
				
	}	


	public void transfer(Scanner keyboard) {
		int jumlah = 0;
		int pil1 = 0;
			while(pil1!=2) {
				System.out.println ("Transaksi");
				System.out.println ("--------------");
				System.out.println ("Nama = Susi");
				System.out.println ("Sisa Saldo = " +salsusi);
				System.out.println ("1. Transfer");
				System.out.println ("2. Keluar");
				System.out.print ("Pilih Menu = ");
				pil1 = keyboard.nextInt();
				switch(pil1) {
				case 1 : System.out.print ("Masukkan Nomor Rekening yang Hendak Ditransfer = ");
					rek = keyboard.nextInt();
					if(rek==rbudi) {
						System.out.println ("Rekening yang Hendak Ditransfer = Budi");
						do {
						System.out.print ("Nominal yang Ingin Ditransfer = ");
						jumlah = keyboard.nextInt();
						System.out.println ("Transaksi Sebesar = " +jumlah);
							if(jumlah > salsusi) System.out.println ("Saldo Anda Tidak Mencukupi");
							
							else{
								System.out.println ("Transaksi Anda Berhasil");
							}
						}
						while(jumlah > salsusi);
						salbudi += jumlah;
						salsusi -= jumlah;
						mutasi[index] = jumlah;
						index++;
						break;
					}
					else {
						System.out.println ("Nomor Rekening yang Anda Input Salah");
					}
				}
			}
			
		}

}

