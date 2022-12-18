import java.util.*;


public class Main {

static  ArrayList<Integer> oyuncu1pozisyon = new ArrayList<Integer>();
    static  ArrayList<Integer> oyuncu2pozisyon = new ArrayList<Integer>();

    String isim1,isim2;
    int s1,s2;

    public static void main(String[] args) {

        baslama b1 = new baslama();
        b1.baslama();
        Scanner girdi = new Scanner(System.in);
        boolean bayrak=true;
        String sonuc;
        char[][] tahta = {
                {'*',' ','*',' ','*'},
                {'*',' ','*',' ','*'},
                {'*',' ','*',' ','*'}
        };
        tahtayaz(tahta);
        int siralama = 0;
        int sonucsayi=1;
        while (sonucsayi==1){
            bayrak=kazanankontrol();
    siralama++;
if (bayrak==true) {
    if (siralama % 2 == 1) {
  int oyuncugirdi = girdi.nextInt();
        System.out.println("1-9 arasında bir sayı giriniz");
        System.out.println(oyuncugirdi);
        isaretkoyma(tahta, oyuncugirdi, "kullanici1");
        tahtayaz(tahta);
    } else  {
        int oyuncugirdi = girdi.nextInt();
        System.out.println("1-9 arasında bir sayı giriniz");
        System.out.println(oyuncugirdi);
        isaretkoyma(tahta, oyuncugirdi, "kullanici2");
        tahtayaz(tahta);
    }
}
else {
sonucsayi=0;
}

}
 }




  public static void isaretkoyma(char[][] tahta,int pos,String user){
        char isaret = ' ';
        if (user.equals("kullanici1")){
          isaret= '❌';
          oyuncu1pozisyon.add(pos);
        } else if (user.equals("kullanici2")) {
           isaret='⭕';
            oyuncu2pozisyon.add(pos);
        }
      switch (pos){
          case 1:
              if(tahta[0][0]=='*'){
                  tahta[0][0]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda ");
              };
              break;
          case 2:
              if(tahta[0][2]=='*'){
                  tahta[0][2]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
          case 3:
              if(tahta[0][4]=='*'){
                  tahta[0][4]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
          case 4:
              if(tahta[1][0]=='*'){
                  tahta[1][0]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
          case 5:
              if(tahta[1][2]=='*'){
                  tahta[1][2]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
          case 6:
              if(tahta[1][4]=='*'){
                  tahta[1][4]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
          case 7:
              if(tahta[2][0]=='*'){
                  tahta[2][0]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
          case 8:
              if(tahta[2][2]=='*'){
                  tahta[2][2]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
          case 9:
              if(tahta[2][4]=='*'){
                  tahta[2][4]= isaret;
              }
              else {
                  System.out.println("Dolu yere giriş yapmaya çalıştınız sıra diğer oyuncuda");
              };
              break;
      }
  }

public  static void tahtayaz(char[][] tahta){
    for (char[] siralama :tahta){

        for (char c : siralama){
            System.out.print(c);

        }

        System.out.println();

    }
}

public static Boolean kazanankontrol(){

    List ustkazanma = Arrays.asList(1,2,3);
    List ortakazanma = Arrays.asList(4,5,6);
    List altkazanma = Arrays.asList(7,8,9);
    List solkazanma = Arrays.asList(1,4,7);
    List ortadikkazanma = Arrays.asList(2,5,8);
    List sagkazanma = Arrays.asList(3,6,9);
    List caprazkazanma1 = Arrays.asList(1,5,9);
    List caprazkazanma2 = Arrays.asList(3,5,7);

    List<List> kazanma = new ArrayList<List>();
    kazanma.add(ustkazanma);
    kazanma.add(ortakazanma);
    kazanma.add(altkazanma);
    kazanma.add(solkazanma);
    kazanma.add(ortadikkazanma);
    kazanma.add(sagkazanma);
    kazanma.add(caprazkazanma1);
    kazanma.add(caprazkazanma2);
for (List l : kazanma){
    if (oyuncu1pozisyon.containsAll(l)){
        System.out.println("Oyuncu 1 kazandı tebrikler");
        return false;
    } else if (oyuncu2pozisyon.containsAll(l)){
        System.out.println("Oyuncu 2 kazandı tebrikler");
        return false;
    }
    else if(oyuncu1pozisyon.size()+oyuncu2pozisyon.size()==9&&!oyuncu2pozisyon.containsAll(l)&&!oyuncu1pozisyon.containsAll(l)){
        System.out.println("Oyun beraber sonuçlandı");
        return false;
    }
}
return true;
    }

}
