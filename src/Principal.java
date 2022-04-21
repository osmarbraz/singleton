
public class Principal {

    public static void main(String[] args) {
        System.out.println("Se você vir o mesmo valor, o singleton foi reutilizado (yay!))" + "\n"
                + "ISe você vir valores diferentes, então 2 singletons foram criados (booo!!)" + "\n\n"
                + "RESULTADO:" + "\n");
        
        Singleton singleton = Singleton.getInstance("Objeto1");
        Singleton outrorSingleton = Singleton.getInstance("Objeto2");
        
        System.out.println(singleton.valor);
        System.out.println(outrorSingleton.valor);
    }
}
