package RestAsurred;

import org.junit.Test;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.Response.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CicloCompleto_API {
	
	@Test
	public void efetuarVotacao() {
			
		given().
			contentType("application/json").
			// Formato do corpo que estamos usando
			body("{\"image_id\": \"c1v\", \"value\": true, \"sub_id\": \"demo-644706\"}\r\n"
					+ "").
			// Corpo que meu link gerou ao votar na API
			header("x-api-key", "03d582ca-fff3-48c7-8723-594b2a32b7a9").
			//  Header é aonde inserimos as senhas das nossas API pois algumas necessitam de senhas
		when().
			post("https://api.thecatapi.com/v1/votes/").
			// POST é onde estou fazendo o comando
		then().
			statusCode(200).
			// Status da requisição, que foi um sucesso
			body("message", is("SUCCESS") ).
			// Verificar se a mensagem de id foi um sucesso
			log().all();
			// Todos os logs da requisição
	
	}
	
	
	@Test
	public void pegarVotacao() {
		Response response = 
		given().
			//contentType("application/json").
			
			header("x-api-key","03d582ca-fff3-48c7-8723-594b2a32b7a9").
		when().
			get("https://api.thecatapi.com/v1/votes");
		response.then().
			log().all();
		
		String id = response.jsonPath().getString("id");
		System.out.println("ID RETORNADO =>" + id);
		
		

	}
	@Test
	public void deletarVotacao() {
		
		given().
		when().
		then().
			log().all();
	}
}	
