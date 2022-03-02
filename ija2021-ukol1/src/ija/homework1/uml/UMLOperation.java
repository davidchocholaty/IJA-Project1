/**********************************************************/
/*                                                        */
/* File: UMLOperation.java                                */
/* Created: 2022-03-02                                    */
/* Last change: 2022-03-02                                */
/* Author: David Chocholaty <xchoch09@stud.fit.vutbr.cz>  */
/* Project: First homework for course IJA at FIT BUT      */
/* Description: TODO                                      */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

/* TODO public, private, protected */
public class UMLOperation extends UMLAttribute {
    private List<UMLAttribute> attributes;
    
    public UMLOperation(String name, UMLClassifier type) {
        super(name, type);
    }

    public boolean addArgument(UMLAttribute arg) {

    }

    public static UMLOperation create(String name, UMLClassifier type, UMLAttribute... args) {

    }

    public List<UMLAttribute> getArguments() {

    }
}