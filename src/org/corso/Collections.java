package org.corso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

    public void stampa() {
        List<Integer> lista = new ArrayList<>();
        lista.add(156);
        lista.add(460);
        lista.add(570);
        lista.add(4);
        // System.out.println(lista);
        for (Integer item : lista) {
            System.out.println(item);
        }
        Integer i = (Integer) 570;
        lista.remove(i);
        for (Integer item : lista) {
            System.out.println(item);
        }

        System.out.println(lista.contains(i));

    }

    public void stampaOggetti() {
        List<Persona> persone = new ArrayList<>();
        Persona persona1 = new Persona("Danilo");
        Persona persona2 = new Persona("Luca");
        Persona persona3 = new Persona("Remo");
        Persona persona4 = new Persona("Diego");

        persone.add(persona1);
        persone.add(persona2);
        persone.add(persona3);
        persone.add(persona4);

        /*
         * for (Persona item : persone) { System.out.println(item.getNome()); }
         */
        persone.remove(persona1);
        for (Persona item : persone) {
            System.out.println(item.getNome());
        }
        /*
        Iterator<Persona> iteraPersona = persone.iterator();
        while(iteraPersona.hasNext()){
            System.out.println(iteraPersona.next().getNome());
        }*/
    }

    public void stampaListaGenerica() {
        List lista = new ArrayList<>();
        Persona persona1 = new Persona("Danilo");
        Persona persona2 = new Persona("Luca");
        Persona persona3 = new Persona("Remo");

        Animale animale1 = new Animale("Tigre");
        Animale animale2 = new Animale("Leone");

        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);

        lista.add(animale1);
        lista.add(animale2);

        for (Object item : lista) {
            if (item instanceof Persona)
                System.out.println(((Persona) item).getNome());
            if (item instanceof Animale)
                System.out.println(((Animale) item).getRazza());
        }
    }
}
