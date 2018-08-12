
package cobaoperasistring;


public class CobaOperasiString {


    public static void main(String[] args) {
        String identitas = " Yosieka Putri Wibawa / X RPL 6 / 40";
        System.out.println("identitas : " + identitas);
        
        String x = "operasi";
        System.out.println("isi variable x : " + x);
        System.out.println("\"" + x + "\" panjang karakter = " + x.length());
        System.out.println("x adalah kosong : " + x.isEmpty());
        String y = "";
        System.out.println("isi variable y " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        String z = "operasi";
        System.out.println("isi variable z : " + z);
        System.out.println("isi x sama dengan z (Case Sensitive) : " + x.equals(z));
        String r = "operasi";
        System.out.println("isi variable r : " + r);
        System.out.println("isi x sama dengan r (Case Sensitive) : " + x.equals(r));
        System.out.println("isi x sama dengan r ( Not Case Sensitive) : " + x.equalsIgnoreCase(r));
        
        
    }
    
}
