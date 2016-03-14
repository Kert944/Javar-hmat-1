import java.util.Scanner;

public class Mäng {

	public static void main(String[] args) {
		boolean jätkumine = true;
		
		String alustaja = "x"; // Tee Math.random()-iga meetod vms, mis määraks kas alustaja on "x"
		String lõpetaja = "o"; // ja lõpetaja on "o" (nagu opel) või vastupidi
		
		Tabel.näitaTabelit();
		

	// while(true) tsükkli sees on kaks while(jätkumine) tsükklit, mis kujutavad endast tsükkleid esimese
	// ja teise mängija jaoks
		
//üleüldine tsükkel			
		while(true){
			
	//esimese(alustaja) mängija tsükkel
			while(jätkumine){
				Scanner scan = new Scanner(System.in);
				System.out.println("Sisesta koht "+alustaja+" jaoks: ");
				String koht = scan.next();
				
				if(Tabel.kirjutaTabelisse(koht, alustaja)){
					Tabel.kirjutaTabelisse(koht, alustaja);
					jätkumine=false;
					// Kui sai tabelisse kirjutatud siis tullakse esimese mängija tsükklist välja
				}
				else{
					System.out.println("Sellele kohale on juba märgitud, vali uus koht!");
					//Tabelisse ei saanud kirjutada ja esimese mängija tsükkel algab otsast peale
				}
			}
			Tabel.näitaTabelit();
			if(Tabel.kontrolliVõitu(alustaja)){
				System.out.println("Mängija " + alustaja + " on võitnud mängu!");
				break;
			}
			jätkumine = true;
			
	// teise (lõpetaja) mängija tsükkel		
			while(jätkumine){
				Scanner scan = new Scanner(System.in);
				System.out.println("Sisesta koht "+lõpetaja+" jaoks: ");
				String koht = scan.next();
				
				if(Tabel.kirjutaTabelisse(koht, lõpetaja)){
					Tabel.kirjutaTabelisse(koht, lõpetaja);
					jätkumine=false;
					//Sama loogika, mis esimese mängija tsükkli puhul
				}
				else{
					System.out.println("Sellele kohale on juba märgitud, vali uus koht!");
					// Sama loogika, mis esimese mängija tsükkli puhul
				}
			}
			Tabel.näitaTabelit();
			if(Tabel.kontrolliVõitu(lõpetaja)){
				System.out.println("Mängija " + lõpetaja + " on võitnud mängu!");
				break;
			}
			jätkumine = true;
			
			}
			
			
		}
				
	}
		

	



