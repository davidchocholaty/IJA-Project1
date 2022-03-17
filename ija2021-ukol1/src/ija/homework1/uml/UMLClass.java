/**********************************************************/
/*                                                        */
/* Soubor: UMLClass.java                                  */
/* Vytvoren: 2022-03-02                                   */
/* Posledni zmena: 2022-03-06                             */
/* Autor: David Chocholaty <xchoch09@stud.fit.vutbr.cz>   */
/* Projekt: First homework for course IJA at FIT BUT      */
/* Popis: Trida reprezentujici model tridy z jazyka UML   */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
* Trida (jeji instance) reprezentuje model tridy z jazyka UML. 
* Rozsiruje tridu UMLClassifier. Obsahuje seznam atributu a operaci (metod). 
* Trida muze byt abstraktni.
*/
public class UMLClass extends UMLClassifier {
    private boolean isAbstract;
    private List<UMLAttribute> attributes;

    /**
    * Vytvori instanci reprezentujici model tridy z jazyka UML. 
    * Trida neni abstraktni.
    *
    * @param name Nazev tridy (klasifikatoru).
    */
    public UMLClass(String name) {
        super(name);
        this.isAbstract = false;
        this.attributes = new ArrayList<UMLAttribute>();
    }

    /**
    * Test, zda objekt reprezentuje model abstraktni tridy.
    *
    * @return Pokud je trida abstraktni, vraci true. Jinak vraci false.
    */
    public boolean isAbstract() {
        return isAbstract;
    }

    /**
    * Zmeni informaci objektu, zda reprezentuje abstraktni tridu.
    *
    * @param isAbstract Zda se jedna o abstraktni tridu nebo ne.
    */
    public void setAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    /**
    * Vlozi atribut do modelu UML tridy. Atribut se vlozi na konec seznamu 
    * (posledni polozka). Pokud jiz trida obsahuje atribut stejneho jmena, 
    * nedela nic.
    *
    * @param attr Vkladany atribut.
    * @return     Uspech akce (pokud se podarilo vlozit, vraci true, jinak false).
    */
    public boolean addAttribute(UMLAttribute attr) {
        for(UMLAttribute listAttr : attributes) {
            if(listAttr.getName().equals(attr.getName())) {
                return false;
            }
        }
        
        attributes.add(attr);

        return true;
    }

    /**
    * Vraci pozici atributu v seznamu atributu. Pozice se indexuje 
    * od hodnoty 0. Pokud trida dany atribut neobsahuje, vraci -1.
    *
    * @param attr Hledany atribut.
    * @return     Pozice atributu. 
    */
    public int getAttrPosition(UMLAttribute attr) {
        return attributes.indexOf(attr);
    }    

    /**
    * Presune pozici atributu na nove zadanou. Pozice se indexuje 
    * od hodnoty 0. Pokud trida dany atribut neobsahuje, nic neprovadi 
    * a vraci -1. Pri presunu na pozici pos se vsechny stavajici polozky 
    * (atributy) od pozice pos (vcetne) posunou o jednu pozici doprava.
    *
    * @param attr Presunovany atribut.
    * @param pos  Nova pozice.
    * @return     Uspech operace.
    */
    public int moveAttrAtPosition(UMLAttribute attr, int pos) {
        if(attributes.remove(attr)) {
            attributes.add(pos, attr);

            return 0;
        }
        
        return -1;
    }

    /**
    * Vraci nemodifikovatelny seznam atributu. 
    * Lze vyuzit pro zobrazeni atributu tridy.
    *
    * @return Nemodifikovatelny seznam atributu.
    */
    public List<UMLAttribute> getAttributes() {
        return Collections.unmodifiableList(attributes);        
    }        
}