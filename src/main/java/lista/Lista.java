package lista;

public class Lista {
    private int[] list;
    private int pojemnosc;
    private int rozmiar;

    public Lista(int n) {
        if (n <= 0) throw new IllegalArgumentException("Number must be more tham 1");
        list = new int[n];
        pojemnosc = n;
        rozmiar = 0;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void dodajElement(int i) throws ArrayIndexOutOfBoundsException {
        if (rozmiar <= pojemnosc) {
            list[rozmiar] = i;
            rozmiar++;
        } else {
            System.out.println("Nie można dodać nowego elementu, osiągnięto max. pojemność");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int znajdz(int i) {

        for (int j = 0; j < list.length; j++) {
            if (list[j] == i) {
                return j;
            }
        }
        return -1;
    }

    public void pisz() {
        String space = "\t\t";
        System.out.println("Lista:");
        System.out.println(space + "Pojemność: " + pojemnosc);
        System.out.println(space + "Rozmiar: " + rozmiar);
        System.out.print(space + "Elementy: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public void usunPierwszy(int i) {
        int index = znajdz(i);

        if (index >= 0) {
            for (int j = index; j < rozmiar; j++) {
                list[j] = list[j + 1];
            }
            rozmiar--;
        }
    }



}