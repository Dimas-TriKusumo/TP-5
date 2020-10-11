import java.util.Scanner;

class HariBerikutPrancis {
	public static void main(String[] datk) {
		int hariIni,
			nHari;

		String 	hari = "",
				hariBerikutnya = "",
				nHari1 = "";

		Scanner userInput = new Scanner(System.in);
	
		System.out.print("Masukkan Hari Sekarang (1-7) : ");
		hariIni = userInput.nextInt();
		System.out.print("Masukkan N Hari Kedepaan : ");
		nHari = userInput.nextInt();

		switch (hariIni) {
		case 1:
			hari = "Lundi";
			hariBerikutnya = "Mardi";
			break;
		case 2:
			hari = "Mardi";
			hariBerikutnya = "Mercredi";
			break;
		case 3:
			hari = "Mercredi";
			hariBerikutnya = "Jeudi";
			break;
		case 4:
			hari = "Jeudi";
			hariBerikutnya = "Vendredi";
			break;
		case 5:
			hari = "Vendredi";
			hariBerikutnya = "Samedi";
			break;
		case 6:
			hari = "Samedi";
			hariBerikutnya = "Dimanche";
			break;
		case 7:
			hari = "Dimanche";
			hariBerikutnya = "Lundi";
			break;
		default:
			System.out.println("Tidak ada hari ke - " + hariIni);
		break;
		}

		System.out.println("Hari ini hari " + hari);
		System.out.println("Besok hari " + hariBerikutnya);


		if(nHari % 7 == 0) {
			nHari1 = hari;
			System.out.println(nHari + " Hari Kedepaan " + nHari1);
		}else{
			int sum = nHari + hariIni;
			if (sum >7){
				sum %= 7;
			}
			switch (sum) {
			case 1:
				nHari1 = "Lundi";
				break;
			case 2:
				nHari1 = "Mardi";
				break;
			case 3:
				nHari1 = "Mercredi";
				break;
			case 4:
				nHari1 = "Jeudi";
				break;
			case 5:
				nHari1 = "Vendredi";
				break;
			case 6:
				nHari1 = "Samedi";
				break;
			case 7:
				nHari1 = "Dimanche";
				break;
		}
			 
		System.out.println(nHari + " Hari Kedepaan " + nHari1);
		}
}
}
