package RestAsurred;

import static io.restassured.RestAssured.*;
import org.junit.Test;


public class Submarino {
	
	@Test
	public void submarino() {
		
		given().
		// GIVEN: Usado para uma pr�-condi��o
		when()
			.get("https://cep-v2-submarino-npf.b2w.io/cep/41180390").
			
		// Aqui passo minhas requisi��es
		then().
			log().all();
		//"Ent�o": Aqui eu vejo o que foi me foi pedido no GIVEN. Estou usando os comandos log all para ver se minha requi��o de GET foi atendida.
	}
}
