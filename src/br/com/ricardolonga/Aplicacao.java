package br.com.ricardolonga;

public class Aplicacao {
    
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        
        playerController.play();
        playerController.pause();
        playerController.stop();
        playerController.record();
    }
    
}
