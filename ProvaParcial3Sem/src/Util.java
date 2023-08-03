import static javax.swing.JOptionPane.*;

public class Util {

	private Lista<Empresa> l = new Lista<>();

	public void menu() {

		int aux = 0;

		while (true) {

			aux = Integer.parseInt(showInputDialog(
					"Sistema de Reserva de Cargas \n1. Reservar Carga \n2. Pesquisar Carga \n3. Imprimir Cargas Reservadas "
							+ "\n4. Excluir Carga \n5. Finalizar"));

			if (aux == 1) {

				reservar();

			} else if (aux == 2) {

				pesquisar();

			} else if (aux == 3) {

				listar();

			} else if (aux == 4) {

				excluir();

			} else if (aux == 5) {

				showMessageDialog(null, "Operação finalizada com sucesso!");
				break;

			} else {

				showMessageDialog(null, "Insira uma operação válida");
				return;

			}

		}

	}

	public void reservar() {

		String nome, destino, cnpj;
		double carga;

		nome = showInputDialog("Insira o nome da empresa:");
		cnpj = showInputDialog("Insira o CNPJ da empresa:");
		destino = showInputDialog("Insira o destino da carga:");
		carga = Double.parseDouble(showInputDialog("Insira o total da carga (em kg)"));

		Empresa e = new Empresa();

		e.setNome(nome);
		e.setCarga(carga);
		e.setDestino(destino);
		e.setCnpj(cnpj);

		
		l.inserirfim(e);


	}

	public void pesquisar() {

		String cnpj = showInputDialog("CNPJ para pesquisa:");

		if (l.pesquisar(new Empresa(cnpj)) == null) {

			showMessageDialog(null, "CNPJ não encontrado");

		} else {

			showMessageDialog(null, l.consultar(new Empresa(cnpj)));

		}

	}

	public void listar() {

		l.imprimir();

	}

	public void excluir() {

		String cnpj = showInputDialog("CNPJ para pesquisa:");

		if (l.pesquisar(new Empresa(cnpj)) == null) {

			showMessageDialog(null, "CNPJ não encontrado");

		} else {

			showMessageDialog(null, l.consultar(new Empresa(cnpj)));

			showMessageDialog(null, "Carga excluída com sucesso!");

			l.remover(new Empresa(cnpj));

		}

	}

}
