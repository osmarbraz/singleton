
public final class Singleton {

    private static Singleton instancia;
    public String valor;

    private Singleton(String valor) {
        // O código a seguir emula a inicialização lenta.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }

    /**
     * Retorna a instancia armazenadada na classe.
     * @param valor
     * @return A instância da classe.
     */
    public static Singleton getInstance(String valor) {
        if (instancia == null) {
            //Criando a primeira vez
            instancia = new Singleton(valor);
        }
        //Retorna a instância criada pela primeira vez
        return instancia;
    }
}
