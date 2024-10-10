package hafta03;

public class Hacim {

    int hesaplaKup(int a){
        return a*a*a;
        //return Math.pow(a,3);
    }

    int hesaplaDikdortgenPrisma(int en, int boy, int yukseklik){
        return en*boy*yukseklik;
    }

    float hesaplaSilindir(int r,int h){
        return (float) Math.PI*r*r*h;
    }

    float hesaplaKure(int r){
        return (float) Math.PI*r*r*r*(4/3);
    }

    static float hesaplaPiramit(int e,int b,int y){ //nesne tanımlamadan ulaşmak istediğim için başına static yazdım
        float hesap = (float) e*b*y*((float)1/3);
        return hesap;
    }

}
