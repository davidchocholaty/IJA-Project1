/**********************************************************/
/*                                                        */
/* Soubor: UMLOperation.java                              */
/* Vytvoren: 2022-03-02                                   */
/* Posledni zmena: 2022-03-06                             */
/* Autor: David Chocholaty <xchoch09@stud.fit.vutbr.cz>   */
/* Projekt: First homework for course IJA at FIT BUT      */
/* Popis: Trida reprezentujici operaci                    */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
* Trida reprezentuje operaci, ktera ma sve jmeno, navratovy typ 
* a seznam argumentu. Je odvozena (rozsiruje) od tridy UMLAttribute, 
* od ktere prejima nazev a navratovy typ. Argument je reprezentovan 
* tridou UMLAttribute. Lze pouzit jako soucast UML klasifikatoru trida 
* nebo rozhrani.
*/
public class UMLOperation extends UMLAttribute {
    private List<UMLAttribute> args;
    
    /**
    * Konstruktor pro vytvoreni operace s danym nazvem a navratovym typem.
    *
    * @param name Nazev operace.
    * @param type Navratovy typ operace.
    */
    public UMLOperation(String name, UMLClassifier type) {
        super(name, type);
        this.args = new ArrayList<UMLAttribute>();
    }

    /**
    * Tovarni metoda pro vytvoreni instance operace.
    *
    * @param name Nazev operace.
    * @param type Navratovy typ operace.
    * @param args Seznam argumentu operace.
    * @return     Objekt reprezentujici operaci v diagramu UML.
    */
    public static UMLOperation create(String name, UMLClassifier type, UMLAttribute... args) {
        UMLOperation newOperation = new UMLOperation(name, type);

        for(UMLAttribute attr : args) {            
            newOperation.addArgument(attr);
        }

        return newOperation;
    }

    /**
    * Prida novy argument do seznamu argumentu. 
    * Argument se vlozi na konec seznamu. 
    * Pokud v seznamu jiz existuje argument stejneho nazvu, operaci neprovede.
    *
    * @param arg Vkladany argument.
    * @return    Uspech operace - true, pokud se podarilo vlozit, jinak false.
    */
    public boolean addArgument(UMLAttribute arg) {
        for(UMLAttribute attr : args) {
            if(attr.getName().equals(arg.getName())) {
                return false;
            }
        }

        args.add(arg);

        return true;
    }

    /**
    * Vraci nemodifikovatelny seznam argumentu. Lze vyuzit pro zobrazeni.
    *
    * @return Nemodifikovatelny seznam argumentu.
    */
    public List<UMLAttribute> getArguments() {
       return Collections.unmodifiableList(args);
    }       
}