package com.emard.restclient.designpattern.compose.duck;
/**
 * Ici on a juste des patterns qui collaborent mais pas un pattern composé
 */
public class SimulateurDeCanards {
    public static void main(String[] args) {
        SimulateurDeCanards simulateur = new SimulateurDeCanards();
        FabriqueDeCanardsAbstraite fabriqueAbstraite = new FabriqueDeComptage();
        // simulateur.simuler();
        simulateur.simuler(fabriqueAbstraite);
    }

    private void simuler(FabriqueDeCanardsAbstraite fabriqueDeCanards) {
        // Cancaneur colvert = fabriqueDeCanards.creerColvert();
        Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
        Cancaneur appelant = fabriqueDeCanards.creerAppelant();
        Cancaneur canardEnPlastique = fabriqueDeCanards.creerCanardEnPlastique();
        Cancaneur canardOie = new AdaptateurDOie(new Oie());

        Troupe troupeDeCanards = new Troupe();
        troupeDeCanards.add(mandarin);
        troupeDeCanards.add(appelant);
        troupeDeCanards.add(canardEnPlastique);
        troupeDeCanards.add(canardOie);

        Troupe troupeDeColverts = new Troupe();
        Cancaneur colvertUn = fabriqueDeCanards.creerColvert();
        Cancaneur colvertDeux = fabriqueDeCanards.creerColvert();
        Cancaneur colvertTrois = fabriqueDeCanards.creerColvert();
        Cancaneur colvertQuatre = fabriqueDeCanards.creerColvert();

        troupeDeColverts.add(colvertUn);
        troupeDeColverts.add(colvertDeux);
        troupeDeColverts.add(colvertTrois);
        troupeDeColverts.add(colvertQuatre);

        troupeDeCanards.add(troupeDeColverts);

        /*System.out.println("\nSimulateur de canards : Toute la troupe");
        simuler(troupeDeCanards);

        System.out.println("\nSimulateur de canards : Troupe de colverts");
        simuler(troupeDeColverts);
        System.out.println("\nNous avons compté " +
                CompteurDeCouacs.getCouacs() + " couacs");*/

        System.out.println("\nSimulateur de canards : avec Observateur");
        Cancanologue cancanologue = new Cancanologue();
        troupeDeCanards.enregistrerObservateur(cancanologue);
        simuler(troupeDeCanards);
        System.out.println("\nNous avons compté " +
                CompteurDeCouacs.getCouacs() + " couacs");

        /*
         * System.out.println("\nSimulateur de canards");
         * 
         * simuler(colvert);
         * simuler(mandarin);
         * simuler(appelant);
         * simuler(canardEnPlastique);
         * simuler(canardOie);
         * 
         * System.out.println("Nous avons compté " + CompteurDeCouacs.getCouacs() +
         * " couacs");
         */
    }

    private void simuler() {
        // Cancaneur colvert = new Colvert(); // sans décorateur
        Cancaneur colvert = new CompteurDeCouacs(new Colvert()); // avec décorateur
        Cancaneur mandarin = new CompteurDeCouacs(new Mandarin());
        Cancaneur appelant = new CompteurDeCouacs(new Appelant());
        Cancaneur canardEnPlastique = new CanardEnPlastique(); // sans décorateur
        Cancaneur canardOie = new CompteurDeCouacs(new AdaptateurDOie(new Oie()));

        System.out.println("\nSimulateur de canards");

        simuler(colvert);
        simuler(mandarin);
        simuler(appelant);
        simuler(canardEnPlastique);
        simuler(canardOie);

        System.out.println("Nous avons compté " + CompteurDeCouacs.getCouacs());
    }

    private void simuler(Cancaneur canard) {
        canard.cancaner();
    }
}
