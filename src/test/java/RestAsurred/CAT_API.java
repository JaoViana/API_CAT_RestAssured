package RestAsurred;

import static io.restassured.RestAssured.*;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class CAT_API {
	
	@Test
	public void API_TEST_Cadastro() {
		given().
			contentType("application/json").
			body("{\"email\": \"brisatc733@gmail.com\", \"appDescription\": \"TESTE1 PARA TESTES DE API\"}").
		when()
			.post("https://api.thecatapi.com/v1/user/passwordlesssignup").
		then().
			statusCode(200).
			log().all();		
		
	}
	
	@Test
	public void campoObrigatorio() {
		given().
			contentType("application/json").
			body("{\"appDescription\": \"TESTE1 PARA TESTES DE API\"}\r\n"
					+ "").
		when()
			.post("https://api.thecatapi.com/v1/user/passwordlesssignup").
		then().
			log().all().
			body("message", containsString("\"email\" is required")).
			statusCode(400);
	}	

	@Test
	public void efetuarVotação() {
		// Nesse ciclo vamos efetuar um ciclo completo, fazendo uma votação
		// Votar
		// Deletar depois da votação
		given().
			contentType("application/json").
			body("").
		when()
			.post("").
		then().
			statusCode(200).
			log().all();
	}
}



