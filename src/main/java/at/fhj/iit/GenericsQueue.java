package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*
 * Created by Sarah Graschl; 03.07.2020
 * Last changed by Darlene Antonino; 04.07.2020
 * This class is very similar to the StringQueue class, but it can be used with every datatype,
 * not only with Strings.
 */

abstract class GenericsQueue<T> implements IQueue<T> {

	//attributes
	  private List<T> generics = new ArrayList<T>();
	  private int maxSize = 5;

    /**
     * default constructor
     */
    GenericsQueue(){
    }

    /**
     * creates a generic the the given integer maxsize so change the maxSize
     *
     * @param maxsize
     */
    GenericsQueue(int maxsize){
        this.maxSize = maxsize;
    }


    @Override
    public boolean offer(T obj) {
      if (generics.size() != maxSize)
    	  generics.add(obj);
      else
        return false;

      return true;
    }

    @Override
    public T poll() {
      T element = peek();

      if (generics.size() > 0) {
    	  generics.remove(0);
      }

      return element;
    }

    @Override
    public T remove() {
      T element = poll();
      if (element == null)
        throw new NoSuchElementException("there's no element any more");

      return element;
    }

    @Override
    public T peek() {
      T element;
      if (generics.size() > 0)
        element = generics.get(0);
      else
        element = null;

      return element;
    }

    @Override
    public T element() {
      T element = peek();
      if (element == null)
        throw new NoSuchElementException("there's no element any more");

      return element;
    }
    
}
