package it.be.epicode.esercizio4;

public enum Livello {
    OPERAIO(1),
    IMPIEGATO(1.2),
    QUADRO(1.5),
    DIRIGENTE(2);


    public double moltiplicatoreStipendi;
private Livello(double moltiplicatoreStipendi){
    this.moltiplicatoreStipendi = moltiplicatoreStipendi;
}

    public double getMoltiplicatoreStipendi() {
        return moltiplicatoreStipendi;
    }



}





