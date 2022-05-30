import java.util.List;
public class Banco {
       public String nome;
        private List<ContaBytecode>listaContas;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setListaContas(List<ContaBytecode> listaContas) {
            this.listaContas = listaContas;
        }

        public List<ContaBytecode> getListaContas() {
            return listaContas;
        }
    }

