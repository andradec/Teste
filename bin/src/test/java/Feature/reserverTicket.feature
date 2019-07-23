#language: pt
Funcionalidade: Reserver 1 ticket

Contexto: Login
Dado que Acessar a URL
	E Informar UserName
	E Informar Password
Quando Clicar no bot�o Sign-In

Cenario: Reservar 1 ticket
Dado Selecionar a cidade de origem - Departing From
	E Selecionar a cidade de destino - Arriving In
	E Selecionar data > que data corrente
	E Selecionar a Class
Quando Selecionar Passengers = 1
	E Clicar no bot�o Continue
	E Selecionar o voo
Quando Clicar no bot�o Continue
	E Preencher First name e Last Name
	E Preencher n�mero do cart�o
	E Preencher o nome do passageiro Passenger Name
Entao Clicar em Secure Purchase

Cenario: Criar Massa de dados - Reserva
Dado Selecionar a op��o "One Way"
	E Selecionar a cidade de origem - Coluna Departing From
	E Selecionar a cidade de destino - Coluna Arriving In
	E Selecionar data - Coluna On
Quando Selecionar a Class - Coluna Class
	E Selecionar a quantidade de Passengers - Coluna Passengers
Quando Clicar no bot�o Continue
	E Selecionar o voo de acordo com o excel - FlightNumber
Quando Clicar no bot�o Continue
	E Preencher First name e Last Name
	E Preencher n�mero do cart�o
	E Preencher o nome do passageiro Passenger Name
Entao Clicar em Secure Purchase