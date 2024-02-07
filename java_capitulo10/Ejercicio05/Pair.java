package java_capitulo10.Ejercicio05;

public class Pair <K,V>
{
    private K key;
    private V value;
    
    Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getkey()
    {
        return this.key;
    }
    public V getValue()
    {
        return value;
    }
}
