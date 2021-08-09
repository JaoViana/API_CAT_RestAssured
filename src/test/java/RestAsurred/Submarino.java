package RestAsurred;

import static io.restassured.RestAssured.*;
import org.junit.Test;


public class Submarino {
	
	@Test
	public void submarino() {
		
		given().
		// GIVEN: Usado para uma pré-condição
		when()
			.get("https://cep-v2-submarino-npf.b2w.io/cep/41180390").
			
		// Aqui passo minhas requisições
		then().
			log().all();
		//"Então": Aqui eu vejo o que foi me foi pedido no GIVEN. Estou usando os comandos log all para ver se minha requição de GET foi atendida.
	}
}
