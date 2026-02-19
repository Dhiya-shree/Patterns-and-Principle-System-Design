package src.design00_Patterns.pattern24_Object_Pool_Design_Pattern;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract  class ObjectPool<T> {
    private long deadTime;
    private Hashtable<T,Long> locked;
    private Hashtable<T,Long> unLocked;

    public ObjectPool() {
        this.deadTime = 50000;// in ms == 50 sec
        this.locked = new Hashtable<>();
        this.unLocked = new Hashtable<>();
    }

    abstract T create();

    abstract boolean validate(T obj);

    abstract void dead(T t);

    public synchronized void takeIn(T t){
        locked.remove(t);
        unLocked.put(t,System.currentTimeMillis());
    }


    public synchronized T takeOut(){
        long now=System.currentTimeMillis();
        T key;Long value;

        if(unLocked.size()>0){

            Set<Map.Entry<T,Long>> entrySet=unLocked.entrySet();
            Iterator<Map.Entry<T,Long>> itr=entrySet.iterator();
            while(itr.hasNext()){
                Map.Entry<T,Long> entry=itr.next();
                key=entry.getKey();//Connection
                value=entry.getValue();// Time
                // dead and invalid connections
                if(now-value>deadTime || !validate(key)){
                    unLocked.remove(key);
                    dead(key);
                }
                else{
                    // Not dead + validated
                     unLocked.remove(key);
                     locked.put(key,now);
                     return key;
                }
            }
        }
        // no keys
        key=create();
        locked.put(key,now);
        return key;
    }


}
