/**********************************************************/
/*                                                        */
/* File: UMLAttribute.java                                */
/* Created: 2022-03-02                                    */
/* Last change: 2022-03-02                                */
/* Author: David Chocholaty <xchoch09@stud.fit.vutbr.cz>  */
/* Project: First homework for course IJA at FIT BUT      */
/* Description: TODO                                      */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

/* TODO public, private, protected */
public class UMLAttribute extends Element {
    private UMLClassifier type;
    
    public UMLAttribute(String name, UMLClassifier type) {
        super(name);
        this.type = type;
    }

    public UMLClassifier getType() {
        return type;
    }

    public String toString() {        
        return super.getName() + ":" + type.toString();
    }
}