# 📧 Email Service com AWS SES

[![Java](https://img.shields.io/badge/Java-21-blue?logo=java)](https://adoptium.net/) 
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.6-green?logo=spring)](https://spring.io/projects/spring-boot) 
[![AWS SES](https://img.shields.io/badge/AWS%20SES-orange?logo=amazon-aws)](https://aws.amazon.com/ses/) 
[![Maven](https://img.shields.io/badge/Maven-3.9.0-red?logo=apache-maven)](https://maven.apache.org/)

Este projeto é um serviço de envio de emails desenvolvido em **Spring Boot**, utilizando o **Amazon Simple Email Service (AWS SES)**.  
Ele fornece uma API simples e segura para enviar emails transacionais ou de notificação.

---

## 🚀 Tecnologias

- Java 21+  
- Spring Boot 3.5.6  
- AWS SES  
- Maven 3+  

---

## 📂 Estrutura do Projeto

src/
├─ main/
│ ├─ java/com/seuprojeto/emailservice/ # Código fonte
│ └─ resources/
│ ├─ application.properties # Configurações da aplicação
│ └─ templates/ # (opcional) Templates de email
└─ test/ # Testes unitários

yaml
Copiar código

---

## ⚙️ Configuração

### 1. Criar credenciais IAM
- Acesse o [AWS Console IAM](https://console.aws.amazon.com/iam/).  
- Crie um usuário com permissões de **AmazonSESFullAccess**.  
- Gere a **Access Key** e **Secret Key**.

> ⚠️ Nunca exponha suas chaves no repositório!

### 2. Configurar variáveis de ambiente
```bash
export AWS_ACCESS_KEY_ID=SEU_ACCESS_KEY
export AWS_SECRET_ACCESS_KEY=SEU_SECRET_KEY
export AWS_REGION=us-east-1   # Ajuste para sua região SES
3. Configurar application.properties
properties
Copiar código
spring.cloud.aws.credentials.accessKey=${AWS_ACCESS_KEY_ID}
spring.cloud.aws.credentials.secretKey=${AWS_SECRET_ACCESS_KEY}
spring.cloud.aws.region.static=${AWS_REGION}
▶️ Executando o projeto
Via Maven
bash
Copiar código
mvn spring-boot:run
Via IDE (IntelliJ, Eclipse, VS Code)
Execute a classe principal EmailServiceApplication.

📡 Endpoints
POST /send-email
Envia um email para o destinatário informado.

Request Body:

json
Copiar código
{
  "to": "destinatario@exemplo.com",
  "subject": "Teste de envio",
  "body": "Olá! Este é um email enviado via AWS SES."
}
Response:

json
Copiar código
{
  "status": "Email enviado com sucesso!"
}
✅ Verificação de Domínio/Email
Para enviar emails pelo SES:

No Console da AWS SES, adicione e verifique o domínio ou email remetente.

Configure os registros DNS (CNAME/DKIM) no seu provedor.

Após a verificação, use esse email como remetente (from) no envio.

🛡️ Segurança
Variáveis de ambiente para credenciais.

GitHub Push Protection evita exposição de chaves.

Em produção, recomenda-se usar AWS Secrets Manager ou Parameter Store.

📜 Licença
MIT License – sinta-se livre para usar, modificar e distribuir.
