/**********************************************************/
/*                                                        */
/* Soubor: UMLClassifier.java                             */
/* Vytvoren: 2022-03-02                                   */
/* Posledni zmena: 2022-03-06                             */
/* Autor: David Chocholaty <xchoch09@stud.fit.vutbr.cz>   */
/* Projekt: First homework for course IJA at FIT BUT      */
/* Popis: Trida reprezentujici klasifikator v diagramu    */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

/* TODO public, private, protected */

/**
* 
* Trida reprezentuje klasifikator v diagramu. 
* Odvozene tridy reprezentuji konkretni podoby 
* klasifikatoru (trida, rozhrani, atribut, apod.)
*/
public class UMLClassifier extends Element {
    private boolean isUserDefined;

    /**
    * Vytvori instanci tridy Classifier. Instance je uzivatelsky definovana 
    * (je soucasti diagramu).
    *
    * @param name Nazev klasifikatoru.
    */
    public UMLClassifier(String name) {
        super(name);
        isUserDefined = true;
    }

    /**
    * Vytvori instanci tridy Classifier.
    *
    * @param name          Nazev klasifikatoru.
    * @param isUserDefined Uzivatelsky definovan (soucasti diagramu).
    */
    public UMLClassifier(String name, boolean isUserDefined) {
        super(name);
        this.isUserDefined = isUserDefined;
    }

    /**
    * Tovarni metoda pro vytvoreni instance tridy Classifier pro zadane jmeno.
    * Instance reprezentuje klasifikator, ktery neni v diagramu modelovan.
    *
    * @param name Nazev klasifikatoru.
    * @return     Vytvoreny klasifikator.
    */
    public static UMLClassifier forName(String name) {
        return new UMLClassifier(name, false);
    }

    /**
    * Zjistuje, zda objekt reprezentuje klasifikator, ktery je modelovan uzivatelem v diagramu nebo ne.
    *
    * @return Pokud je klasifikator uzivatelsky definovan (je primo soucasti diagramu), vraci true. Jinak false.
    */
    public boolean isUserDefined() {
        return isUserDefined;
    }

    /**
    * Vraci retezec reprezentujici klasifikator v podobe "nazev(userDefined)", kde userDefined je true nebo false.
    *
    * @return Retezec reprezentujici klasifikator.
    */
    @Override
    public String toString() {
        return super.getName() + "(" + String.valueOf(isUserDefined) + ")";
    }
}
