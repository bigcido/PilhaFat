package view;
import controller.FatPilha;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		FatPilha pf = new FatPilha();
		int n;
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			
			if (n < 1 || n > 10) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			}
		}while (n < 1 || n > 10);
		
		JOptionPane.showMessageDialog(null, "Fatorial: " +pf.fatorial(n));
		}
}