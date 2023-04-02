import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestCoche{
	@Test
	public void test_al_crear_coche_un_coche_su_velocidad_es_cero_Pablo() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_Pablo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_Pablo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_Pablo(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad=50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
}
