/**********************************************************/
/*                                                        */
/* File: ClassDiagram.java                                */
/* Created: 2022-03-02                                    */
/* Last change: 2022-03-02                                */
/* Author: David Chocholaty <xchoch09@stud.fit.vutbr.cz>  */
/* Project: First homework for course IJA at FIT BUT      */
/* Description: TODO                                      */
/*                                                        */
/**********************************************************/

package ija.homework1.uml;

import java.util.List;
import java.util.ArrayList;

/* TODO public, private, protected */
public class ClassDiagram extends Element {
    private List<UMLClass> classes;
    private List<UMLClassifier> classifiers;

    public ClassDiagram(String name) {
        super(name);
        this.classes = new ArrayList<UMLClass>();
        this.classifiers = new ArrayList<UMLClassifier>();
    }

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

    public UMLClass createClass(String name) {
        for(UMLClass listClass : classes) {
            if(listClass.getName().equals(name)) {
                return null;
            }
        }

        UMLClass newClass = new UMLClass(name);
        classes.add(newClass);

        return newClass;
    }

    public UMLClassifier findClassifier(String name) {
        for(UMLClassifier classifier : classifiers) {
            if(classifier.getName().equals(name)) {
                return classifier;
            }
        }

        return null;
    }
}