import java.util.Scanner;

public class M�ng {

	public static void main(String[] args) {
		boolean j�tkumine = true;
		
		String alustaja = "x"; // Tee Math.random()-iga meetod vms, mis m��raks kas alustaja on "x"
		String l�petaja = "o"; // ja l�petaja on "o" (nagu opel) v�i vastupidi
		
		Tabel.n�itaTabelit();
		

	// while(true) ts�kkli sees on kaks while(j�tkumine) ts�kklit, mis kujutavad endast ts�kkleid esimese
	// ja teise m�ngija jaoks
		
//�le�ldine ts�kkel			
		while(true){
			
	//esimese(alustaja) m�ngija ts�kkel
			while(j�tkumine){
				Scanner scan = new Scanner(System.in);
				System.out.println("Sisesta koht "+alustaja+" jaoks: ");
				String koht = scan.next();
				
				if(Tabel.kirjutaTabelisse(koht, alustaja)){
					Tabel.kirjutaTabelisse(koht, alustaja);
					j�tkumine=false;
					// Kui sai tabelisse kirjutatud siis tullakse esimese m�ngija ts�kklist v�lja
				}
				else{
					System.out.println("Sellele kohale on juba m�rgitud, vali uus koht!");
					//Tabelisse ei saanud kirjutada ja esimese m�ngija ts�kkel algab otsast peale
				}
			}
			Tabel.n�itaTabelit();
			if(Tabel.kontrolliV�itu(alustaja)){
				System.out.println("M�ngija " + alustaja + " on v�itnud m�ngu!");
				break;
			}
			j�tkumine = true;
			
	// teise (l�petaja) m�ngija ts�kkel		
			while(j�tkumine){
				Scanner scan = new Scanner(System.in);
				System.out.println("Sisesta koht "+l�petaja+" jaoks: ");
				String koht = scan.next();
				
				if(Tabel.kirjutaTabelisse(koht, l�petaja)){
					Tabel.kirjutaTabelisse(koht, l�petaja);
					j�tkumine=false;
					//Sama loogika, mis esimese m�ngija ts�kkli puhul
				}
				else{
					System.out.println("Sellele kohale on juba m�rgitud, vali uus koht!");
					// Sama loogika, mis esimese m�ngija ts�kkli puhul
				}
			}
			Tabel.n�itaTabelit();
			if(Tabel.kontrolliV�itu(l�petaja)){
				System.out.println("M�ngija " + l�petaja + " on v�itnud m�ngu!");
				break;
			}
			j�tkumine = true;
			
			}
			
			
		}
				
	}
		

	



