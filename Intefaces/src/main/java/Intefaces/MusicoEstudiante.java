package Intefaces;

public class MusicoEstudiante implements Musico,Estudiante{
    @Override
    public void hablar() {
        System.out.println("Estoy hablando.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Estoy tocando una guitarra.");
    }

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando.");
    }
}
