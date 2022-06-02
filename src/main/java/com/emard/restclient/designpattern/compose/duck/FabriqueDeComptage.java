package com.emard.restclient.designpattern.compose.duck;
/**
 * Fabrique abstraite.
 * creer canard avec décorateur
 */
public class FabriqueDeComptage extends FabriqueDeCanardsAbstraite{

    @Override
    public Cancaneur creerColvert() {
        return new CompteurDeCouacs(new Colvert());
    }

    @Override
    public Cancaneur creerMandarin() {
        return new CompteurDeCouacs(new Mandarin());
    }

    @Override
    public Cancaneur creerAppelant() {
        return new CompteurDeCouacs(new Appelant());
    }

    @Override
    public Cancaneur creerCanardEnPlastique() {
        return new CompteurDeCouacs(new CanardEnPlastique());
    }
    
}
