package kata_cuatro;

public interface Identificable<K> {
    K getID();
    boolean tieneMismoID(K id);
}
