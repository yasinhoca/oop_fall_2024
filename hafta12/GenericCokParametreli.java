package hafta12;

public class GenericCokParametreli <T, U>{
    T obj1;
    U obj2;



    //constructer
    GenericCokParametreli(T obj1,U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }


}
