package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class is very similar to the StringQueue class, but it can be used with every datatype,
 * not only with Strings.
 *
 * @author Sarah Graschl
 * @author Darlene Antonino
 * @since  03.07.2020
 * @date   04.07.2020
 */

public class GenericsQueue<T> implements IQueue<T> {

    /**
     * attributes
     */
    private int maxSize = 5;
    private List<T> generics = new ArrayList<T>();

    /**
     * creates a generic the the given integer maxsize so change the maxSize
     *
     * @param maxsize
     */
    GenericsQueue(int maxSize) {
        this.maxSize = maxSize;
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
