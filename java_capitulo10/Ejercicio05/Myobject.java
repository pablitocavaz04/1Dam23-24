package java_capitulo10.Ejercicio05;

public class Myobject<T> {
    private T value;
    Myobject()
    {
        this.value = null;
    }
    
    Myobject(T value)
    {
        this.value = null;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }
}
