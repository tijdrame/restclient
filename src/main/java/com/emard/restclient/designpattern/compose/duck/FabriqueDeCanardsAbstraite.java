package com.emard.restclient.designpattern.compose.duck;

public abstract class FabriqueDeCanardsAbstraite {
    public abstract Cancaneur creerColvert();

    public abstract Cancaneur creerMandarin();

    public abstract Cancaneur creerAppelant();

    public abstract Cancaneur creerCanardEnPlastique();
}
