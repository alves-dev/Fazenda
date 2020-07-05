package ClassesDados;

public class statusPastos {

    public statusPastos(int cod_status, String status) {
        this.cod_status = cod_status;
        this.status = status;
    }

    private int cod_status;
    private String status;

    public statusPastos() {
      
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

}
