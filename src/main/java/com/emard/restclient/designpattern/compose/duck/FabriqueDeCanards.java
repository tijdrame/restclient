package com.emard.restclient.designpattern.compose.duck;
/**
 * Fabrique abstraite.
 * creer canard sans décorateur
 */
public class FabriqueDeCanards extends FabriqueDeCanardsAbstraite {

    @Override
    public Cancaneur creerColvert() {
        return new Colvert();
    }

    @Override
    public Cancaneur creerMandarin() {
        return new Mandarin();
    }

    @Override
    public Cancaneur creerAppelant() {
        return new Appelant();
    }

    @Override
    public Cancaneur creerCanardEnPlastique() {
        return new CanardEnPlastique();
    }
    
}
