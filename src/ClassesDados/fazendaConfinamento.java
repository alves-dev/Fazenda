package ClassesDados;

public class fazendaConfinamento {

    private int cod_fazenda;
    private int bezerrosA;
    private int bezerrosB;
    private int garrotesA;
    private int garrotesB;
    private int boisA;
    private int boisB;
    private int boisVelhosA;
    private int boisVelhosB;
    private double KgDiaBezerros;
    private double KgDiaGarrotes;
    private double KgDiaBois;
    private double KgDiaBoisVelhos;
    private int m2Bezerros;
    private int m2Garrotes;
    private int m2Bois;
    private int m2BoisVelhos;
    private int periodo1A;
    private int periodo1B;
    private int alimentacao1;
    private int periodo2A;
    private int periodo2B;
    private int alimentacao2;
    private int periodo3A;
    private int periodo3B;
    private int alimentacao3;
    private int periodo4A;
    private int periodo4B;
    private int alimentacao4;

    public fazendaConfinamento(int cod_fazenda, int bezerrosA, int bezerrosB, int garrotesA, int garrotesB, int boisA,
            int boisB, int boisVelhosA, int boisVelhosB, double KgDiaBezerros, double KgDiaGarrotes, double KgDiaBois,
            double KgDiaBoisVelhos, int m2Bezerros, int m2Garrotes, int m2Bois, int m2BoisVelhos, int periodo1A,
            int periodo1B, int alimentacao1, int periodo2A, int periodo2B, int alimentacao2, int periodo3A, int periodo3B,
            int alimentacao3, int periodo4A, int periodo4B, int alimentacao4) {
        
        this.cod_fazenda = cod_fazenda;
        this.bezerrosA = bezerrosA;
        this.bezerrosB = bezerrosB;
        this.garrotesA = garrotesA;
        this.garrotesB = garrotesB;
        this.boisA = boisA;
        this.boisB = boisB;
        this.boisVelhosA = boisVelhosA;
        this.boisVelhosB = boisVelhosB;
        this.KgDiaBezerros = KgDiaBezerros;
        this.KgDiaGarrotes = KgDiaGarrotes;
        this.KgDiaBois = KgDiaBois;
        this.KgDiaBoisVelhos = KgDiaBoisVelhos;
        this.m2Bezerros = m2Bezerros;
        this.m2Garrotes = m2Garrotes;
        this.m2Bois = m2Bois;
        this.m2BoisVelhos = m2BoisVelhos;
        this.periodo1A = periodo1A;
        this.periodo1B = periodo1B;
        this.alimentacao1 = alimentacao1;
        this.periodo2A = periodo2A;
        this.periodo2B = periodo2B;
        this.alimentacao2 = alimentacao2;
        this.periodo3A = periodo3A;
        this.periodo3B = periodo3B;
        this.alimentacao3 = alimentacao3;
        this.periodo4A = periodo4A;
        this.periodo4B = periodo4B;
        this.alimentacao4 = alimentacao4;
    }
    
    public fazendaConfinamento(){
        
    }

    /**
     * @return the cod_fazenda
     */
    public int getCod_fazenda() {
        return cod_fazenda;
    }

    /**
     * @param cod_fazenda the cod_fazenda to set
     */
    public void setCod_fazenda(int cod_fazenda) {
        this.cod_fazenda = cod_fazenda;
    }

    /**
     * @return the bezerrosA
     */
    public int getBezerrosA() {
        return bezerrosA;
    }

    /**
     * @param bezerrosA the bezerrosA to set
     */
    public void setBezerrosA(int bezerrosA) {
        this.bezerrosA = bezerrosA;
    }

    /**
     * @return the bezerrosB
     */
    public int getBezerrosB() {
        return bezerrosB;
    }

    /**
     * @param bezerrosB the bezerrosB to set
     */
    public void setBezerrosB(int bezerrosB) {
        this.bezerrosB = bezerrosB;
    }

    /**
     * @return the garrotesA
     */
    public int getGarrotesA() {
        return garrotesA;
    }

    /**
     * @param garrotesA the garrotesA to set
     */
    public void setGarrotesA(int garrotesA) {
        this.garrotesA = garrotesA;
    }

    /**
     * @return the garrotesB
     */
    public int getGarrotesB() {
        return garrotesB;
    }

    /**
     * @param garrotesB the garrotesB to set
     */
    public void setGarrotesB(int garrotesB) {
        this.garrotesB = garrotesB;
    }

    /**
     * @return the boisA
     */
    public int getBoisA() {
        return boisA;
    }

    /**
     * @param boisA the boisA to set
     */
    public void setBoisA(int boisA) {
        this.boisA = boisA;
    }

    /**
     * @return the boisB
     */
    public int getBoisB() {
        return boisB;
    }

    /**
     * @param boisB the boisB to set
     */
    public void setBoisB(int boisB) {
        this.boisB = boisB;
    }

    /**
     * @return the boisVelhosA
     */
    public int getBoisVelhosA() {
        return boisVelhosA;
    }

    /**
     * @param boisVelhosA the boisVelhosA to set
     */
    public void setBoisVelhosA(int boisVelhosA) {
        this.boisVelhosA = boisVelhosA;
    }

    /**
     * @return the boisVelhosB
     */
    public int getBoisVelhosB() {
        return boisVelhosB;
    }

    /**
     * @param boisVelhosB the boisVelhosB to set
     */
    public void setBoisVelhosB(int boisVelhosB) {
        this.boisVelhosB = boisVelhosB;
    }

    /**
     * @return the KgDiaBezerros
     */
    public double getKgDiaBezerros() {
        return KgDiaBezerros;
    }

    /**
     * @param KgDiaBezerros the KgDiaBezerros to set
     */
    public void setKgDiaBezerros(double KgDiaBezerros) {
        this.KgDiaBezerros = KgDiaBezerros;
    }

    /**
     * @return the KgDiaGarrotes
     */
    public double getKgDiaGarrotes() {
        return KgDiaGarrotes;
    }

    /**
     * @param KgDiaGarrotes the KgDiaGarrotes to set
     */
    public void setKgDiaGarrotes(double KgDiaGarrotes) {
        this.KgDiaGarrotes = KgDiaGarrotes;
    }

    /**
     * @return the KgDiaBois
     */
    public double getKgDiaBois() {
        return KgDiaBois;
    }

    /**
     * @param KgDiaBois the KgDiaBois to set
     */
    public void setKgDiaBois(double KgDiaBois) {
        this.KgDiaBois = KgDiaBois;
    }

    /**
     * @return the KgDiaBoisVelhos
     */
    public double getKgDiaBoisVelhos() {
        return KgDiaBoisVelhos;
    }

    /**
     * @param KgDiaBoisVelhos the KgDiaBoisVelhos to set
     */
    public void setKgDiaBoisVelhos(double KgDiaBoisVelhos) {
        this.KgDiaBoisVelhos = KgDiaBoisVelhos;
    }

    /**
     * @return the m2Bezerros
     */
    public int getM2Bezerros() {
        return m2Bezerros;
    }

    /**
     * @param m2Bezerros the m2Bezerros to set
     */
    public void setM2Bezerros(int m2Bezerros) {
        this.m2Bezerros = m2Bezerros;
    }

    /**
     * @return the m2Garrotes
     */
    public int getM2Garrotes() {
        return m2Garrotes;
    }

    /**
     * @param m2Garrotes the m2Garrotes to set
     */
    public void setM2Garrotes(int m2Garrotes) {
        this.m2Garrotes = m2Garrotes;
    }

    /**
     * @return the m2Bois
     */
    public int getM2Bois() {
        return m2Bois;
    }

    /**
     * @param m2Bois the m2Bois to set
     */
    public void setM2Bois(int m2Bois) {
        this.m2Bois = m2Bois;
    }

    /**
     * @return the m2BoisVelhos
     */
    public int getM2BoisVelhos() {
        return m2BoisVelhos;
    }

    /**
     * @param m2BoisVelhos the m2BoisVelhos to set
     */
    public void setM2BoisVelhos(int m2BoisVelhos) {
        this.m2BoisVelhos = m2BoisVelhos;
    }

    /**
     * @return the periodo1A
     */
    public int getPeriodo1A() {
        return periodo1A;
    }

    /**
     * @param periodo1A the periodo1A to set
     */
    public void setPeriodo1A(int periodo1A) {
        this.periodo1A = periodo1A;
    }

    /**
     * @return the periodo1B
     */
    public int getPeriodo1B() {
        return periodo1B;
    }

    /**
     * @param periodo1B the periodo1B to set
     */
    public void setPeriodo1B(int periodo1B) {
        this.periodo1B = periodo1B;
    }

    /**
     * @return the alimentacao1
     */
    public int getAlimentacao1() {
        return alimentacao1;
    }

    /**
     * @param alimentacao1 the alimentacao1 to set
     */
    public void setAlimentacao1(int alimentacao1) {
        this.alimentacao1 = alimentacao1;
    }

    /**
     * @return the periodo2A
     */
    public int getPeriodo2A() {
        return periodo2A;
    }

    /**
     * @param periodo2A the periodo2A to set
     */
    public void setPeriodo2A(int periodo2A) {
        this.periodo2A = periodo2A;
    }

    /**
     * @return the periodo2B
     */
    public int getPeriodo2B() {
        return periodo2B;
    }

    /**
     * @param periodo2B the periodo2B to set
     */
    public void setPeriodo2B(int periodo2B) {
        this.periodo2B = periodo2B;
    }

    /**
     * @return the alimentacao2
     */
    public int getAlimentacao2() {
        return alimentacao2;
    }

    /**
     * @param alimentacao2 the alimentacao2 to set
     */
    public void setAlimentacao2(int alimentacao2) {
        this.alimentacao2 = alimentacao2;
    }

    /**
     * @return the periodo3A
     */
    public int getPeriodo3A() {
        return periodo3A;
    }

    /**
     * @param periodo3A the periodo3A to set
     */
    public void setPeriodo3A(int periodo3A) {
        this.periodo3A = periodo3A;
    }

    /**
     * @return the periodo3B
     */
    public int getPeriodo3B() {
        return periodo3B;
    }

    /**
     * @param periodo3B the periodo3B to set
     */
    public void setPeriodo3B(int periodo3B) {
        this.periodo3B = periodo3B;
    }

    /**
     * @return the alimentacao3
     */
    public int getAlimentacao3() {
        return alimentacao3;
    }

    /**
     * @param alimentacao3 the alimentacao3 to set
     */
    public void setAlimentacao3(int alimentacao3) {
        this.alimentacao3 = alimentacao3;
    }

    /**
     * @return the periodo4A
     */
    public int getPeriodo4A() {
        return periodo4A;
    }

    /**
     * @param periodo4A the periodo4A to set
     */
    public void setPeriodo4A(int periodo4A) {
        this.periodo4A = periodo4A;
    }

    /**
     * @return the periodo4B
     */
    public int getPeriodo4B() {
        return periodo4B;
    }

    /**
     * @param periodo4B the periodo4B to set
     */
    public void setPeriodo4B(int periodo4B) {
        this.periodo4B = periodo4B;
    }

    /**
     * @return the alimentacao4
     */
    public int getAlimentacao4() {
        return alimentacao4;
    }

    /**
     * @param alimentacao4 the alimentacao4 to set
     */
    public void setAlimentacao4(int alimentacao4) {
        this.alimentacao4 = alimentacao4;
    }

}
