package ClassesDados;

import java.util.Date;

public class pastos {

    public pastos(int cod_pasto, String pasto, int cod_status, String status, int ladoA, int ladoB, int ladoC, int ladoD, int diagonal, int perimetro, int area, Date dtCadastro, Date dtUltimaAteracao, int cod_fazenda) {
        this.cod_pasto = cod_pasto;
        this.pasto = pasto;
        this.cod_status = cod_status;
        this.status = status;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        this.diagonal = diagonal;
        this.perimetro = perimetro;
        this.area = area;
        this.dtCadastro = dtCadastro;
        this.dtUltimaAteracao = dtUltimaAteracao;
        this.cod_fazenda = cod_fazenda;
    }

    private int cod_pasto; 
    private String pasto;
    private int cod_status;
    private String status;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int ladoD;
    private int diagonal;
    private int perimetro;
    private int area;
    private Date dtCadastro;
    private Date dtUltimaAteracao;
    private int cod_fazenda;

    public pastos() {
      
    }

    /**
     * @return the cod_pasto
     */
    public int getCod_pasto() {
        return cod_pasto;
    }

    public int getCod_fazenda() {
        return cod_fazenda;
    }

    public void setCod_fazenda(int cod_fazenda) {
        this.cod_fazenda = cod_fazenda;
    }

    /**
     * @param cod_pasto the cod_pasto to set
     */
    public void setCod_pasto(int cod_pasto) {
        this.cod_pasto = cod_pasto;
    }

    /**
     * @return the pasto
     */
    public String getPasto() {
        return pasto;
    }

    /**
     * @param pasto the pasto to set
     */
    public void setPasto(String pasto) {
        this.pasto = pasto;
    }

    /**
     * @return the cod_status
     */
    public int getCod_status() {
        return cod_status;
    }

    /**
     * @param cod_status the cod_status to set
     */
    public void setCod_status(int cod_status) {
        this.cod_status = cod_status;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the ladoA
     */
    public int getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public int getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * @return the ladoC
     */
    public int getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    /**
     * @return the ladoD
     */
    public int getLadoD() {
        return ladoD;
    }

    /**
     * @param ladoD the ladoD to set
     */
    public void setLadoD(int ladoD) {
        this.ladoD = ladoD;
    }

    /**
     * @return the diagonal
     */
    public int getDiagonal() {
        return diagonal;
    }

    /**
     * @param diagonal the diagonal to set
     */
    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    /**
     * @return the perimetro
     */
    public int getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the dtCadastro
     */
    public Date getDtCadastro() {
        return dtCadastro;
    }

    /**
     * @param dtCadastro the dtCadastro to set
     */
    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    /**
     * @return the dtUltimaAteracao
     */
    public Date getDtUltimaAteracao() {
        return dtUltimaAteracao;
    }

    /**
     * @param dtUltimaAteracao the dtUltimaAteracao to set
     */
    public void setDtUltimaAteracao(Date dtUltimaAteracao) {
        this.dtUltimaAteracao = dtUltimaAteracao;
    }
    
}
