package at.fhj.iit;

class Generics<T> {

    /**
     *name for the generic T
     */
    private T t;

    /**
     * default constructor
     */
    Generics(){

    }

    /**
     * creates a generic the the given value t
     *
     * @param t
     */
    Generics(T t){
        this.t = t;
    }

    /**
     * sets the value for the generic t
     *
     * @param t
     */
    public void setT(T t){
        this.t = t;
    }

    /**
     * return the value of the generic t
     *
     * @return the generic t
     */
    public T getT(){
        return t;
    }

}