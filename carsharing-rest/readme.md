
---------------------------------
  CarSharing
---------------------------------


-- 16 novembre 2015 - CHANGE REQUEST CR

Implementare i servizi REST utilizzando le JAX-RS 1.1 per la gestione del car sharing:
Dovranno essere presenti le resource:

 - car 
 - carbooking (prenotazione)
 - user
 
e per ognuna di queste risorse dovrà essere possibile chiamare i metodi: 
	GET
	PUT
	POST
	DELETE


I metodi REST produrranno e consumeranno contenuti di tipo "text/plain", esempio:

license_plate=0UT4T1M3
model=DMC-12
year=2012

Tutti i servizi implementati dovranno controllare che effettivamente il formato del testo ricevuto sia corretto 
Utilizzare opportunamente gli http status code (200, 400, 404...) a seconda del risultato dell'operazione.




-- 12 novembre 2015

Scrivere una applicazione che contenga almeno le seguenti funzionalità:

- Si deve gestire un elenco automobili, unico (risorsa unitaria), di diverse tipologie di mezzi: berlina ed utilitaria
	Necessario creare e tenere in memoria l’elenco (massimo 10 automobili in elenco)
	
- Si devono gestire le prenotazioni come indicato di seguito:
	- E’ disponibile una tipologia (berlina/utilitaria) di auto per il noleggo?

	- Prenotazione di un’auto (tramite targa, tipologia e utente)
		- Se l’auto è disponibile deve essere indicata come prenotata fino a riconsegna
		- Deve essere prodotta una scheda di prenotazione

	- Riconsegna auto (targa, km percorsi e utente)
		- Devono essere registrati il km percorsi
		- L’auto non risulta più prenotata

- Anagrafica Parco Auto
	- Quante berline/utlitarie?
	- Info singola vettura

Vanno applicati i pattern visti (Singleton, Builder) nei limiti del possibile
Va aggiunta una libreria per il logging delle azioni (Log4J)




