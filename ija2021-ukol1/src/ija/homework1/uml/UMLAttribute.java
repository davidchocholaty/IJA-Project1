/**********************************************************/
/*                                                        */
/* Soubor: UMLAttribute.java                              */
/* Vytvoren: 2022-03-02                                   */
/* Posledni zmena: 2022-03-06                             */
/* Autor: David Chocholaty <xchoch09@stud.fit.vutbr.cz>   */
/* Projekt: First homework for course IJA at FIT BUT      */
/* Popis: Trida reprezentuje atribut se jmenem a typem    */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

/* TODO public, private, protected */

/**
* Trida reprezentuje atribut, ktery ma sve jmeno a typ. 
* Je odvozena (rozsiruje) od tridy Element. Typ atributu 
* je reprezentovan tridou UMLClassifier. Lze pouzit 
* jako atribut UML tridy nebo argument operace.
*/
public class UMLAttribute extends Element {
    private UMLClassifier type;
    
    /**
    * Vytvori instanci atributu.
    *
    * @param name Nazev atributu.
    * @param type Typ atributu.
    */
    public UMLAttribute(String name, UMLClassifier type) {
        super(name);
        this.type = type;
    }

    /**
    * Poskytuje informaci o typu atributu.
    *
    * @return Typ atributu.
    */
    public UMLClassifier getType() {
        return type;
    }

    /**
    * Vraci retezec reprezentujici stav atributu v podobe "nazev:typ".
    *
    * @return Retezec reprezentujici atribut.
    */
    @Override
    public String toString() {        
        return super.getName() + ":" + type.toString();
    }
}