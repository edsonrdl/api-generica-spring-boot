
# **Api teste**


### **Comandos para rodar a aplicação com Docker Compose**

#### **1. Iniciar o Banco de Dados**
 clone o repositório abaixo e siga as instruções no arquivo README:

#### **2. Iniciar a Aplicação**

Execute o comando abaixo para iniciar o container da aplicação:

```bash
docker-compose -f docker-compose-api.yml up -d
```

Isso irá construir a imagem da aplicação e iniciar o serviço na porta `8080`.

#### **3. Iniciar a Banco de dados**

Execute o comando abaixo para iniciar o container da aplicação:

```bash
docker-compose -f docker-compose-db.yml up -d

```
#### **4. Verificar se os Containers Estão em Execução**

Use o comando abaixo para verificar se os containers estão rodando:

```bash
docker ps
```

#### **5. Parar os Containers**

Para parar os containers, utilize os seguintes comandos:

```bash
docker-compose -f docker-compose-api.yml down

docker-compose -f docker-compose-db.yml down
```

### **Estrutura do Projeto**

- **`docker-compose-app.yml`**: Configuração para a aplicação Spring Boot.
- **`Dockerfile`**: Configuração para a construção da imagem Docker da aplicação.
- **`pom.xml`**: Arquivo Maven para configuração do projeto Java.
- **`src/`**: Código fonte da aplicação.

### **Variáveis de Ambiente**

- **SPRING_DATASOURCE_USERNAME**: Usuário para a conexão com o banco de dados.
- **SPRING_DATASOURCE_PASSWORD**: Senha para a conexão com o banco de dados.
- **SPRING_DATASOURCE_URL**: URL de conexão do banco de dados (formato: `jdbc:postgresql://db:5432/nome_banco`).

## **Acessar a API pelo Swagger**

Você pode acessar a documentação da API pelo Swagger através do link:

```
http://localhost:8080/api-generica-spring-boot/swagger-ui/index.html#/user-controller/createUser
```
