/**********************************************************/
/*                                                        */
/* Soubor: Element.java                                   */
/* Vytvoren: 2022-03-02                                   */
/* Posledni zmena: 2022-03-06                             */
/* Autor: David Chocholaty <xchoch09@stud.fit.vutbr.cz>   */
/* Projekt: First homework for course IJA at FIT BUT      */
/* Popis: Trida reprezentujici pojmenovany element        */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

/**
* Trida reprezentuje pojmenovany element (thing), 
* ktery muze byt soucastu jakekoliv casti v diagramu.
*/
public class Element {
    private String name;

    /**
    * Vytvori instanci se zadanym nazvem.
    *
    * @param name Nazev elementu
    */
    protected Element(String name) {
        this.name = name;
    }

    /**
    * Vrati nazev elementu.
    *
    * @return Nazev elementu
    */
    public String getName() {
        return name;
    }

    /**
    * Prejmenuje element.
    *
    * @param newName Novy nazev elementu
    */
    public void rename(String newName) {
        this.name = newName;
    }
}