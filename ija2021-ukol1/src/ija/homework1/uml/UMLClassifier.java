/**********************************************************/
/*                                                        */
/* File: UMLClassifier.java                               */
/* Created: 2022-03-02                                    */
/* Last change: 2022-03-02                                */
/* Author: David Chocholaty <xchoch09@stud.fit.vutbr.cz>  */
/* Project: First homework for course IJA at FIT BUT      */
/* Description: TODO                                      */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

/* TODO public, private, protected */
public class UMLClassifier extends Element{
    private boolean isUserDefined;

    public UMLClassifier(String name) {        
        super(name);
        isUserDefined = true;
    }

    public UMLClassifier(String name, boolean isUserDefined) {
        super(name);
        this.isUserDefined = isUserDefined;
    }

    public static UMLClassifier forName(String name) {
        return new UMLClassifier(name);
    }

    public boolean isUserDefined() {
        return isUserDefined;
    }

    public String toString() {
        return super.getName() + "(" + String.valueOf(isUserDefined) + ")";
    }
}
