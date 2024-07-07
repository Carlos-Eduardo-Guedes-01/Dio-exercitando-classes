import Class.SmartTv;

public class App {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv(false, 0, 0);
        System.out.println("");
        System.out.println("Ligada: " + tv.isLigada());
        System.out.println("Volume atual: " + tv.getVolume());
        System.out.println("Canal atual: " + tv.getCanal());
        System.out.println("");
        tv.ligar();
        System.out.println("----------------LIGANDO---------------------");
        System.out.println("Ligada: " + tv.isLigada());
        tv.aumentarVolume();
        System.out.println("----------------AUMENTANDO VOLUME-----------");
        System.out.println("Volume atual: " + tv.getVolume());
        tv.diminuirVolume();
        System.out.println("----------------DIMINUINDO VOLUME-----------");
        System.out.println("Volume atual: " + tv.getVolume());
        tv.mudarCanal(13);
        System.out.println("----------------MUDANDO CANAL-----------");
        System.out.println("Canal atual: " + tv.getCanal());
        tv.aumentarCanal();
        System.out.println("----------------AUMENTANDO CANAL-----------");
        System.out.println("Canal atual: " + tv.getCanal());
        tv.diminuirCanal();
        System.out.println("----------------DIMINUINDO CANAL-----------");
        System.out.println("Canal atual: " + tv.getCanal());
        tv.desligar();
        System.out.println("----------------DESLIGANDO---------------------");
        System.out.println("Ligada: " + tv.isLigada());
    }
}