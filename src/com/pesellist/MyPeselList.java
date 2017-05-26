package com.pesellist;

public class MyPeselList {

    private com.pesellist.Pesel firstItem;
    private com.pesellist.Pesel lastItem;
    private int size;

    public static boolean check(Object data) {

        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        String data2 = data.toString();
        if (data2.length() != 11)
        {
            return false;
        }
        int suma = 0;
        for (int i = 0; i < 10; i++) {

            suma += Integer.parseInt(data2.substring(i, i + 1)) * wagi[i];
        }

        int cyfraKontrolna = Integer.parseInt(data2.substring(10, 11));

        suma %= 10;

        suma = 10 - suma;

        suma %= 10;

        return (suma == cyfraKontrolna);
    }


    public void add(Object data) {
        check(data);
        if( check(data)) {
            com.pesellist.Pesel item = new com.pesellist.Pesel(data);


            if (this.firstItem == null) {
                this.firstItem = item;
                this.lastItem = item;

            } else {
                this.lastItem.setNext(item);
                this.lastItem = item;
            }

            this.size++;
            System.out.println("Pesel dodany!");
        }
    else{
            System.out.println("Niepoprawny pesel!");
        }



    }



    public Object get(int index) {
        if (this.firstItem == null) {
            return null;
        } else {
            com.pesellist.Pesel current = this.firstItem;
            int i = 0;

            do {
                if (i == index) {
                    return current.getData();
                } else {
                    i++;
                    current = current.getNext();
                }
            } while (current != null);

            return null;
        }
    }

    public int getSize() {
        return this.size;
    }

}
