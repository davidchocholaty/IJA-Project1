/**********************************************************/
/*                                                        */
/* Soubor: ClassDiagram.java                              */
/* Vytvoren: 2022-03-02                                   */
/* Posledni zmena: 2022-03-06                             */
/* Autor: David Chocholaty <xchoch09@stud.fit.vutbr.cz>   */
/* Projekt: First homework for course IJA at FIT BUT      */
/* Popis: Trida reprezentujici diagram trid               */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

import java.util.List;
import java.util.ArrayList;

/**
* Trida reprezentuje diagram trid. Je odvozen od tridy Element (ma nazev). 
* Obsahuje seznam trid (instance tridy UMLClass) prip. klasifikatoru 
* pro uzivatelsky nedefinovane typy (instance tridy UMLClassifier).
*/
public class ClassDiagram extends Element {    
    private List<UMLClassifier> classifiers;

    /**
    * Konstruktor pro vytvoreni instance diagramu. 
    * Kazdy diagram ma svuj nazev.
    *
    * @param name Nazev diagramu
    */
    public ClassDiagram(String name) {
        super(name);        
        this.classifiers = new ArrayList<UMLClassifier>();
    }

    /**
    * Vytvori instanci UML tridy a vlozi ji do diagramu. 
    * Pokud v diagramu jiz existuje trida stejneho nazvu, nedela nic.
    *
    * @param name Nazev vytvarene tridy.
    * @return     Objekt (instance) reprezentujici tridu. 
    *             Pokud trida s danym nazvem jiz existuje, vraci null.
    */
    public UMLClass createClass(String name) {
        for(UMLClassifier listClassifier : classifiers) {
            if(listClassifier.getName().equals(name)) {
                return null;
            }
        }

        UMLClass newClass = new UMLClass(name);
        classifiers.add(newClass);

        return newClass;
    }

    /**
    * Vyhleda v diagramu klasifikator podle nazvu. 
    * Pokud neexistuje, vytvori instanci tridy Classifier 
    * reprezentujici klasifikator, ktery neni v diagramu zachycen 
    * (viz UMLClassifier.forName(java.lang.String)); 
    * vyuzito napr. pro modelovani typu promenne, ktery v diagramu neni. 
    * Tato instance je zarazena do struktur diagramu, tzn. ze pri dalsim 
    * pokusu o vyhledani se pouzije tato jiz vytvorena instance.
    *
    * @param name Nazev klasifikatoru.
    * @return     Nalezeny, prip. vytvoreny, klasifikator.
    */
    public UMLClassifier classifierForName(String name) {
        for(UMLClassifier classifier : classifiers) {
            if(classifier.getName().equals(name)) {
                return classifier;
            }
        }

        UMLClassifier newClassifier = UMLClassifier.forName(name);
        classifiers.add(newClassifier);

        return newClassifier;
    }

    /**
    * Vyhleda v diagramu klasifikator podle nazvu.
    *
    * @param name Nazev klasifikatoru.
    * @return     Nalezeny klasifikator. Pokud v diagramu neexistuje 
    *             klasifikator daneho jmena, vraci null.
    */
    public UMLClassifier findClassifier(String name) {
        for(UMLClassifier classifier : classifiers) {
            if(classifier.getName().equals(name)) {
                return classifier;
            }
        }

        return null;
    }
}