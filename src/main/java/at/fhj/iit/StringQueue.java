package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;
/*
  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }
  
  maxSize = maxSize; does nothing. Also, since this is a constructor, it every attribut should start with a "this." followed by the attributes name.
  Additionally, the valuename is "maxsize" with a lowercase 's'.
*/
  
    public StringQueue(int maxsize) {
    this.maxSize = maxsize;
  }
  
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /*
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() == 0) {
      elements.remove(0);
    }

    return element;
  }
  
  This is a simple mistake. If the size of the list equals 0, you cannot remove the first element. It would result in a OOB Error.
  But since (in this specific case) it does not matter, if the size is greater than or not equals 0, we chose greater than.
*/
    @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }
  /*
  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
  
  Here is the problem the line "element = "";", because it makes the previous line (String element = poll();) useless.
*/
  
    @Override
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
  
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}
