/* ******************************************************************************* */
/*   File:MiArrayList.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/24 10:29                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/24 12:38												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo10.Array_Generics.Generics;

public class MyArrayList<T> {
    private T [] array;
    private int size;
    private int initialCapacity;

    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity)
    {
        this.array = (T[])new Object[initialCapacity];
        this.size = 0;
        this.initialCapacity = initialCapacity;
    }
    
    /**
     * size
     * Returns the number of elements that array contains
     * @return The number of elements
     */
    public int size()
    {
        return this.size;
    }

    /**
     * isEmpty
     * Determinies if there is not any element in array
     * @return true if is empty false in other case
     */
    public boolean isEmpty()
     {
        return this.size == 0;
     }

    /**
     * add
     * Add an element to the array at the end
     * @param elem Element to add
     */
    @SuppressWarnings("unchecked")
     public void add(T elem)
     {
        if (size == array.length)
        {
            if (array != null) {
                 T[] aux = array.clone();
            array = (T[])(new Object[size+this.initialCapacity]);
            for (int i = 0; i < aux.length; i++)
                array[i] = aux[i];
            }
            else
            {
                array = (T[])(new Object[size+this.initialCapacity]);
            }
           
        }
        array[size++]=elem;
     }

    /**
     * add 
     * Insert an element to the array in a specified position
     * @param index Position to insert
     * @param elem  Element to inesert
     */
    @SuppressWarnings("unchecked")
     public void add(int index, T elem)
     {
        if (index>=0 && index < size)
        {
            T[] aux = array.clone();
            if (size == array.length)
            {
                array = (T[])(new Object[size+this.initialCapacity]);
            }
            for (int i = 0; i < index; i++)
                array[i] = aux[i];
            array[index] = elem;
            for (int i = index; i < size; i++)
                    array[i+1]= aux[i];
        }
        else
            throw new IndexOutOfBoundsException();
     }

    /**
     * get
     * Obtain an Element from a position
     * @param index Position of the element to obtain
     * @return  The previous element in that position
     */
     public T get(int index)
     {
        if (index>=0 && index < size)
            return array[index];
        else
            throw new IndexOutOfBoundsException();

     }

    /**
     * set
     * Update an element of a specified position
     * @param index Position to update
     * @param elem  Element to save
     * @return  The previous element in that position
     */
     public T set(int index, T elem)
     {
    
        if (index>=0 && index < size)
        {
            T previous = array[index];
            array[index] = elem;
            return previous;

        }
    else
        throw new IndexOutOfBoundsException();

     }

    /**
     * remove
     * Remove an element from a  position in the array
     * @param index
     * @return The previous element in thta position
     */
     public T remove (int index)
     {
        T previous = array[index];
        if (index>=0 && index < size)
        {
            for (int i = index; i < size-1; i++)
            {
                array[i] = array[i+1];
            }
            array[--size] = null;

        }
    else
        throw new IndexOutOfBoundsException();
        return previous;
     }


    /**
     * clear
     * borrar todos los elementos del array y liberar espacio
     */
     public void clear()
     {
        array = null;
        size = 0;
     }

     @Override
     public String toString()
     {
         String ret = "[";
        for (int i = 0; i < size-1; i++) 
        ret+=array[i]+", ";
         ret+="]";
         return ret;
     }
}
