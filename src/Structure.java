import java.util.Arrays;

public abstract class Structure {
    /**
     * Rozszerza tablice dynamicznie o nowa wartosc
     * 
     * @param previousObject tablica w poprzednim stanie
     * @param newValue       nowa zmienna jaka ma zostac dodana do tablicy
     * @return zwraca rozszerzona tablice z nowa wartoscia
     */
    public static Object[] extendArray(Object[] previousObject,
            Object newValue) {
        int nowyRozmiar = previousObject.length + 1;

        Object[] nowaTablica = Arrays.copyOf(previousObject, nowyRozmiar);
        nowaTablica[nowyRozmiar - 1] = newValue;

        return nowaTablica;
    }
}
