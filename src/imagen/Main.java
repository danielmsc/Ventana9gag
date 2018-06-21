package imagen;

public class Main {

	public static void main(String[] args) {
		ImagenGag i = new ImagenGag();
		ClienteGUI gui = new ClienteGUI("Test");
		
		Post gag = i.getPost();
		gui.imprimir(gag.getTitulo());
		gui.imprimirImagen(gag.getLink());
		//System.out.println(gag.getTitulo() + " - " + gag.getLink());
	}
}
