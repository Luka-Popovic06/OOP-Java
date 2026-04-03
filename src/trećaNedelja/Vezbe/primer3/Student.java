package trećaNedelja.Vezbe.primer3;

class Student {
    private int brIndexa;
    private String ime;
    private String prezime;

    /// Konsytruktor
    public Student(int br,String ime,String prezime){
        this.brIndexa = br;
        this.ime = ime;
        this.prezime = prezime;
    }

    private void prikaziIndex(){
        System.out.println("Broj Index-a: "+this.brIndexa);
    }
    public void prikaziOsobu(){
        System.out.println("ime: "+ime+" prezime: "+prezime);
        prikaziIndex();
    }
}
