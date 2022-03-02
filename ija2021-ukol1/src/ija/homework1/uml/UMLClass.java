/**********************************************************/
/*                                                        */
/* File: UMLClass.java                                    */
/* Created: 2022-03-02                                    */
/* Last change: 2022-03-02                                */
/* Author: David Chocholaty <xchoch09@stud.fit.vutbr.cz>  */
/* Project: First homework for course IJA at FIT BUT      */
/* Description: TODO                                      */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

import java.util.List;

/* TODO public, private, protected */
public class UMLClass extends UMLClassifier {
    private boolean isAbstract;    
    private List<UMLAttribute> attributes;

    public UMLClass(String name) {
        super(name);
        this.isAbstract = false;
        this.attributes = new ArrayList<UMLAttribute>();
    }

    public boolean addAttribute(UMLAttribute attr) {
        //TODO atribut stejneho jmena
        attributes.add(attr);
    }

    public List<UMLAttribute> getAttributes() {
        return attributes;
    }

    public int getAttrPosition(UMLAttribute attr) {
        return attributes.indexOf(attr);
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public int moveAttrAtPosition(UMLAttribute attr, int pos) {
        // TODO
    }

    public void setAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }
}