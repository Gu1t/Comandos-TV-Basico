public class Usuário {
    public static void main(String[] args) throws Exception {
        SmarTv smarTv = new SmarTv();
        
        smarTv.ligar();
        //smarTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smarTv.ligada);

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        System.out.println("Canal Atual: " + smarTv.canal);
        smarTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smarTv.canal);

        System.out.println("TV ligada? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume Atual: " + smarTv.volume);


    }
}
