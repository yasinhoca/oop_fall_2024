package hafta02;

public class silindir_hacmi {
    static float silindirHacmi(float r, float p,int h){
        float hacim;
        hacim = (float) p*r*r*h;
        return hacim;    // return (float) p*r*r*h; şeklinde de yazılabilir
    }


    public static void main(String[] args) {
        System.out.println(silindirHacmi(3.0f,3.14f,5));
    }
}
