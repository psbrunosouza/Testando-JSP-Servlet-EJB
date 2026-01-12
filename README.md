# 🏛 Projeto Java EE Legado - EJB + Servlet + JSP

Este é um **projeto de exemplo legado** utilizando **Java EE / Jakarta EE**, com **EJBs**, **Servlets** e **JSPs**.  
O objetivo é demonstrar uma arquitetura clássica de aplicações web Java, típica de sistemas corporativos antigos, rodando em **servidores compatíveis com Jakarta EE**, como **WildFly** ou **Payara**.

---

## 🔹 Funcionalidade

O projeto faz algo simples, mas completo para fins de estudo:

- **EJBs**: implementam a lógica de negócio (ex.: gerenciamento de livros, usuários ou pedidos);
- **Servlets**: recebem requisições HTTP e chamam os EJBs;
- **JSPs**: apresentam os dados no navegador;
- Demonstra a integração entre camadas, mantendo a lógica separada da apresentação.

---

## 🔹 Estrutura do Projeto

```text
meu-projeto-legado/
 ├─ src/
 │   └─ main/
 │       ├─ java/
 │       │   └─ br/com/meuprojeto/
 │       │       ├─ ejb/
 │       │       │   └─ LivroEJB.java       # Lógica de negócio
 │       │       └─ servlets/
 │       │           └─ HelloServlet.java   # Recebe requisições HTTP
 │       ├─ resources/                        # Configurações (opcional)
 │       └─ webapp/
 │           ├─ index.jsp                     # Página inicial
 │           └─ WEB-INF/
 │               └─ web.xml                  # Configuração do Servlet e welcome-file
 ├─ pom.xml                                   # Arquivo Maven (opcional)
 └─ README.md
