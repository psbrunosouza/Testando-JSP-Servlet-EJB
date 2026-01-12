package ejb;

import jakarta.ejb.Stateless;

@Stateless
public class LivrosEJB {
    public String sayHello(String name) {
        return "Olá, " + name + "! Isso é um EJB rodando no WildFly.";
    }
}
