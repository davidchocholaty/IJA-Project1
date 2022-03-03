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

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/* TODO public, private, protected */
public class UMLOperation extends UMLAttribute {
    private List<UMLAttribute> args;
    
    public UMLOperation(String name, UMLClassifier type) {
        super(name, type);
        this.args = new ArrayList<UMLAttribute>();
    }

    public boolean addArgument(UMLAttribute arg) {
        for(UMLAttribute attr : args) {
            if(attr.getName().equals(arg.getName())) {
                return false;
            }
        }

        args.add(arg);

        return true;
    }

    public List<UMLAttribute> getArguments() {
       return Collections.unmodifiableList(args);
    }

    public static UMLOperation create(String name, UMLClassifier type, UMLAttribute... args) {
        UMLOperation newOperation = new UMLOperation(name, type);
        //newOperation.args.addAll(args);
        for(UMLAttribute attr : args) {
            // TODO jestli otestovani true false
            newOperation.addArgument(attr);
        }

        return newOperation;
    }    
}