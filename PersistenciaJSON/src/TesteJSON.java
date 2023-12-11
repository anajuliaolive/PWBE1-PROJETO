import com.fasterxml.jackson.databind.ObjectMapper;
public class TesteJSON {

	public static void main(String[] args) {
		try {
			ObjectMapper objeto = new ObjectMapper();
			//objeto para utilizar na serialização
			Pessoa pes = new Pessoa("Ana", 16);
			
			//serializar o obj pes
			String json = objeto.writeValueAsString(pes);
			
			System.out.println("objeto serializado");
			System.out.println(json);
			
			//desseriarizar o JSON para o objeto pes
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para obj Pessoa:");
			System.out.println("Nome:" + desPessoa.getNome());
			System.out.println("Idade" + desPessoa.getIdade());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
