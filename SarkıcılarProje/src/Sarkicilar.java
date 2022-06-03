
import java.util.ArrayList;


public class Sarkicilar {
    private ArrayList<String> sarkıcı_listesi=new ArrayList<String>();
    
    public  void sarkıcı_bastır(){
        System.out.println("Listemizde "+sarkıcı_listesi.size()+" şarkıcı var");
        
        for (int i = 0; i <sarkıcı_listesi.size(); i++) {
            
            System.out.println((i+1)+". Şarkıcı : "+sarkıcı_listesi.get(i));
            
        }
    }
    public void  sarkıcı_ekle(String isim){
    sarkıcı_listesi.add(isim);
        System.out.println("Listemize yeni eleman eklendi");
    }
    public void sarkıcı_güncelle(String isim,int index){
    sarkıcı_listesi.set(index, isim);
    System.out.println("Listemiz güncellendi");
    }
    public void sarkıcı_sil(String sarkıcı_ismi){
        
        int durum=sarkıcı_listesi.indexOf(sarkıcı_ismi);
        if (durum>=0) {
            
         sarkıcı_listesi.remove(sarkıcı_ismi);
        System.out.println(sarkıcı_ismi+"isimli sarkıcı listeden silindi");
        } else {
            System.out.println("böyle bir şarkıcı listede yok");
        }
   
    }
    public void sarkıcı_ara(String sarkıcı_ismi){
        
        int durum=sarkıcı_listesi.indexOf(sarkıcı_ismi);
        if (durum>=0) {
         System.out.println("Şarkıcı bulundu");   
        System.out.println(sarkıcı_ismi+" isimli sarkıcı listenin "+durum+1+". indxinde.");
        } else {
            System.out.println("böyle bir şarkıcı listede yok");
        }
   
    }
    
    
}
