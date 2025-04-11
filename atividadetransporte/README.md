Comunicação TCP em Java - Cliente e Servidor
Execução (exemplo copiado do terminal)

Servidor:

Servidor aguardando conexões na porta 65432
Cliente conectado: /127.0.0.1
Cliente: Olá servidor!
Cliente: sair
Conexão encerrada pelo cliente.

Cliente:
Conectado ao servidor em 127.0.0.1:65432
Você: Olá servidor!
Servidor: Mensagem recebida: Olá servidor!
Você: sair

## Relatório

Este codigo tem como finalidade demonstrar o funcionamento de uma comunicação entre processos via sockets TCP na linguagem Java, através da criação de um servidor e um cliente. O servidor aguarda conexões e responde mensagens enviadas por um cliente conectado. O cliente, por sua vez, envia mensagens interativas via terminal, recebendo confirmações do servidor. A comunicação é encerrada quando o cliente envia a palavra-chave “sair”.

O código está dividido em dois arquivos: `ServidorTCP` e `ClienteTCP`. Ambos utilizam as classes da API de rede do Java (`Socket`, `ServerSocket`, `BufferedReader`, `PrintWriter`) para estabelecer e manter a comunicação.

A execução segue uma lógica simples: o servidor é iniciado e fica escutando uma porta; o cliente se conecta, envia mensagens e recebe respostas. O processo se repete até que o cliente deseje encerrar a conversa. Essa estrutura representa a base da camada de transporte no modelo TCP/IP, com ênfase na comunicação confiável fim a fim.

A execução e os testes foram feitos localmente, utilizando `localhost (127.0.0.1)` e a porta `65432`. Os exemplos de terminal incluídos neste README ilustram claramente o comportamento esperado da aplicação.


Objetivo 

Este codigo implementa uma aplicação cliente-servidor em Java utilizando sockets TCP. O objetivo é permitir que um cliente envie mensagens interativas para um servidor, que responde com uma confirmação. A comunicação é encerrada quando o cliente digita "sair".

Como executar

Compile os arquivos Java:javac ServidorTCP.java ClienteTCP.java



Este projeto implementa uma aplicação cliente-servidor em Java utilizando sockets TCP. O objetivo é permitir que um cliente envie mensagens interativas para um servidor, que responde com uma confirmação. A comunicação é encerrada quando o cliente digita "sair".

Como executar

Compile os arquivos Java:
javac ServidorTCP.java ClienteTCP.java

Execute o servidor:
java ServidorTCP

Em outro terminal, execute o cliente:
java ClienteTCP

Digite mensagens no cliente e observe as respostas do servidor. Para encerrar a comunicação, digite sair.

Funcionamento do código

ServidorTCP.java

Cria um ServerSocket que escuta na porta 65432. Quando um cliente se conecta, o servidor lê as mensagens enviadas, exibe no terminal e responde com a mensagem: “Mensagem recebida: ”. Se o cliente enviar “sair”, a conexão é encerrada.

ClienteTCP.java

Cria um Socket que se conecta ao servidor, envia mensagens digitadas pelo usuário e exibe as respostas. A comunicação é encerrada ao digitar “sair”.


