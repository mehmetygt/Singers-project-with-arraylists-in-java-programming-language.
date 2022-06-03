
import java.util.Scanner;


public class Test {
    private static Sarkicilar sarkıcılar=new Sarkicilar();
    private static Scanner scanner=new Scanner(System.in);
    
    
    public static void islemleri_bastir(){
        
        System.out.println("\t -----İşlemler----");
        System.out.println("\t 0-İşlemleri görüntüle");
        System.out.println("\t 1-Şarkıcıları görüntüle");
        System.out.println("\t 2-Şarkıcı ekle");
        System.out.println("\t 3-Şarkıcı güncelle");
        System.out.println("\t 4-Şarkıcı sil");
        System.out.println("\t 5-Şarkıcı ara");
        System.out.println("\t 6-Uygulamdan çık");
        
        
        
    }
    public  static  void sarkıcı_goruntule(){
     sarkıcılar.sarkıcı_bastır();
    }
     public  static  void sarkıcı_ekle(){
         System.out.println("eklemek istediğin şarkıcıyı gir : ");
         String isim=scanner.nextLine();
         sarkıcılar.sarkıcı_ekle(isim);
}
     public  static  void sarkıcı_guncelle(){
         System.out.println("güncelleme istediğin şarkıcıyı ve indexi gir : ");
         System.out.print("şarkıcı ismi : ");String isim=scanner.nextLine();
         System.out.print("nereye ekleyeleim : ");int index=scanner.nextInt();
         scanner.nextLine();
         sarkıcılar.sarkıcı_güncelle(isim, index-1);
}
     public  static  void sarkıcı_sil(){
         System.out.println("silmek istediğin şarkıcı ismini yaz ");
         String isim=scanner.nextLine();
         sarkıcılar.sarkıcı_sil(isim);
}
     public  static  void sarkıcı_ara(){
         System.out.println("aramak istediğin şarkıcı ismini yaz ");
         String isim=scanner.nextLine();
         sarkıcılar.sarkıcı_ara(isim);
}
    
    public static void main(String[] args) {
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz");
        islemleri_bastir();
        
        boolean cikis=false;
        int islem;
        while (!cikis) {    
            System.out.println("\t bir islem seçiniz");
            
            islem=scanner.nextInt();
            scanner.nextLine();
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkıcı_goruntule();
                    break;
                case 2:
                    sarkıcı_ekle();
                    break;
                case 3:
                    sarkıcı_guncelle();
                    break;
                case 4:
                    sarkıcı_sil();
                    break;
                case 5:
                    sarkıcı_ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan çıkılıyor");
                  break;
                    
            }
            
        }
        
        
        
        
        
        
    }
    
}
