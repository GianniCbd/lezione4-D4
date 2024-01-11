package it.be.epicode.esercizio4;

public class Dipendente {
    public static double stipendioB = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;


    public Dipendente(String matricola, double stipendio,double importoOrarioStraordinario,Livello livello,Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }
    public Dipendente(String matricola, Dipartimento dipartimento){
        this.stipendio = stipendioB;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }
    public static double getStipendioB() {
        return stipendioB;
    }
    public String getMatricola() {
        return matricola;
    }
    public double getStipendio() {
        return stipendio;
    }
    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


    public void stampaDatiDipendente(){
        System.out.println("Matricola num: " + this.matricola);
        System.out.println("Stipendio: "+ this.stipendio);
        System.out.println("Imp orario Extra: " + this.importoOrarioStraordinario);
        System.out.println("Livello: "+this.livello);
        System.out.println("Dipartimento: "+ this.dipartimento);
        System.out.println("Il dipendente " + this.matricola + " è stato promosso a " + this.promuovi());
    }



    public Livello promuovi(){
        if(this.livello == Livello.OPERAIO){
        this.stipendio = Dipendente.stipendioB*Livello.IMPIEGATO.getMoltiplicatoreStipendi();
        return Livello.IMPIEGATO;
        } else if (this.livello == Livello.IMPIEGATO) {
            this.stipendio = Dipendente.stipendioB*Livello.QUADRO.getMoltiplicatoreStipendi();
            return Livello.QUADRO;
        } else if (this.livello == Livello.QUADRO) {
            this.stipendio = Dipendente.stipendioB*Livello.DIRIGENTE.getMoltiplicatoreStipendi();
            return Livello.DIRIGENTE;
        }else {
            return this.livello;
        }
    }



   public static double calcolaPaga(Dipendente dipendente){
        return dipendente.getStipendio();
   }

   public static double calcolaPaga(Dipendente dipendente, double oreExtra){
        double extra =  oreExtra*dipendente.importoOrarioStraordinario;
        double stipendio = dipendente.getStipendio();
        return extra+stipendio;
   }

}
