import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestCoche{
	@Test
	public void test_al_crear_coche_un_coche_su_velocidad_es_cero() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
}