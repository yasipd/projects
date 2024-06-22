public class Box<T> { //T is a placeholder for the type
    private T value;
    public void set(T value){
        this.value=value;
    }
    public T get(){
        return value;
    }
    
}
