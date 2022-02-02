package com.primeiroprojeto.dio.springbootweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TesteController {

        @Test
        public void TesteUnit(){
            Controller controller = new Controller();
            String resultado = controller.saudacao("DIO");
            assertEquals("Bem-vindo, DIO", resultado);
        }
}
