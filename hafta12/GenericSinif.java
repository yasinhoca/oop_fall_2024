package hafta12;

public class GenericSinif <T>{
    T obj;


    //constructer
    GenericSinif(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }
}
