package verkettete_liste_doppelt;

public interface liste_doppelt_interface {

    boolean isEmpty();
    
    boolean hasAccess();
    
    void next();
    
    void previous();
    
    void toFirst();
    
    void toLast();
    
    Object getObject();
    
    void setObject(Object pObject);
    
    void append(Object pObject);
    
    void insert(Object pObject);
    
    void concat(liste_doppelt pList);
    
    void remove();
    
}
