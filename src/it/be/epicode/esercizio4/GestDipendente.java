package it.be.epicode.esercizio4;

public class GestDipendente {


    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("1", 1000, 10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente("2", 1000, 15, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente d3 = new Dipendente("3", 1200, 18, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente d4 = new Dipendente("4", 2000, 2, Livello.DIRIGENTE, Dipartimento.VENDITE);
        Dipendente[] dipendenti = {d1, d2, d3, d4};

        d1.promuovi();
        d2.promuovi();
        d3.promuovi();
        d4.promuovi();


        double totale = 0;
        for( Dipendente d: dipendenti) {
            totale += Dipendente.calcolaPaga(d, 5);
            d.stampaDatiDipendente();
        }
        System.out.println("Totale complessivo degli stipendi e degli extra: " + totale + " €");
    }
}