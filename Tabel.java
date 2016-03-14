
public class Tabel {
	static String[] tabel = {"1","2","3","4","5","6","7","8","9"};
	
	public static void n�itaTabelit(){
		System.out.println(" "+tabel[0]+" | "+tabel[1]+" | "+tabel[2]);
		System.out.println("-----------");
		System.out.println(" "+tabel[3]+" | "+tabel[4]+" | "+tabel[5]);
		System.out.println("-----------");
		System.out.println(" "+tabel[6]+" | "+tabel[7]+" | "+tabel[8]);
	}
	
//	Sisestatakse arv String kujul ja kui tabelis sellel kohal on arv, siis kirjutatakse sinna x v�i o
//  Boolean ehk t�ev��rtus on sellep�rast, et m�nguts�kklis saaks korraldada nii, et �kski k�ik raisku ei l�heks
	
	public static boolean kirjutaTabelisse(String arv, String xo){
		if(tabel[Integer.valueOf(arv)-1].equals(arv)){
			tabel[Integer.valueOf(arv)-1] = xo;
			return true;
		}
		else {
			return false;
		}
	}
	
// v�idukontroll tagastab ainult t�ev��rtuse, mida kasutatakse m�nguts�kklis
	
	public static boolean kontrolliV�itu(String xo){
		// V�idu kontroll ridade kaupa
		if(tabel[0].equals(xo)&&tabel[1].equals(xo)&&tabel[2].equals(xo)){
			return true;
		}
		if(tabel[3].equals(xo)&&tabel[4].equals(xo)&&tabel[5].equals(xo)){
			return true;
		}
		if(tabel[6].equals(xo)&&tabel[7].equals(xo)&&tabel[8].equals(xo)){
			return true;
		}
		//V�idu kontroll veergude kaupa
		if(tabel[0].equals(xo)&&tabel[3].equals(xo)&&tabel[6].equals(xo)){
			return true;
		}
		if(tabel[1].equals(xo)&&tabel[4].equals(xo)&&tabel[7].equals(xo)){
			return true;
		}
		if(tabel[2].equals(xo)&&tabel[5].equals(xo)&&tabel[8].equals(xo)){
			return true;
		}
		//V�idu kontroll �le diagonaalide
		if(tabel[0].equals(xo)&&tabel[4].equals(xo)&&tabel[8].equals(xo)){
			return true;
		}
		if(tabel[2].equals(xo)&&tabel[4].equals(xo)&&tabel[6].equals(xo)){
			return true;
	    }	
		else{
			return false;
		}
     }
}


