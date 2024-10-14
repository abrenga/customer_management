## Documentazione

Il progetto si comporta come un’agenda, raccoglie gli appuntamenti, e tiene traccia delle cose da fare.
é suddiviso nelle seguenti entità:

### Agenda:
Segna i giorni del mese e tiene traccia in ogni giorno degli impegni assegnati a quel giorno.
 Verranno mostrate scadenze, pagamenti, check-in da eseguire, documenti da consegnare, pratiche da saldare
Ogni finestra che contiene gli appuntamenti del giorno potrà:
-Cancellare un appuntamento
-Inserirne uno nuovo
-aprire un appuntamento


### Anagrafica Cliente
- Il cliente avrà una scheda con relativo nome e cognome un contatto, dove possibile associato ad un account social.
- La scheda del cliente avrà tre colori di riferimento: Il verde(buon cliente),il giallo(medio), rosso(perditempo).
- I colori si scelgono in base a quanti preventivi gli sono stati fatti e se questo ha confermato o meno, nel specifico: dopo i 3 preventivi se il cliente non conferma verrà catalogato con il rosso, se dopo conferma tornerà a verde, se le richieste del clienti diventano molteplici il cliente avrà il giallo,
- Si potrà scegliere il colore della scheda del cliente anche a mano.
- Un cliente che ha confermato avrà un ulteriore scheda che riassume il viaggio prenotato, la data, la destinazione, altre richieste del cliente, e gli acconti da lui versati e la modalità di acconto(Poss- bonifico- contanti)

##Funzionalità anagrafica cliente:

### Funzionalità dell'anagrafica del cliente:

### Contatti
Aggiungere un contatto
Modificare un contatto

### Fatturazione
Aggiungere dati fatturazione
Modificare fatturazione

### stato Buon Cliente(Enum)
Aggiungere stato buon cliente
Modificare stato buon cliente


Riferimento al viaggio prenotato(oggetto)


### Viaggio Prenotato:
Destinazione
Date
Id_del_cliente(FK)
Codice prenotazione(indice Unique)



### Tickets
I ticket potranno avere tre categorie:
(enum)
- Preventivo
- Appuntamento
- Cose da fare
N.B ogniuno di questi rappresenta una Classe distinta.

- Specifiche relative alla chiusura
-  I ticket di tipo appuntamento e preventivo aperti saranno marcati con un “Nome” che corrisponde al cognome del cliente da gestire


#### Preventivo
dettaglio
Destinazione
Date
Id_del_cliente(FK)
Codice Opzione(indice Unique e nullable)


#### Appunamento
Nome
Data
Id_del_cliente(FK)


#### Cose da fare
Specifiche
scadenza massima.


Specifiche di tutti i ticket:
- I ticket chiusi devono essere risolti con le info relative del caso e la data di gestione.
- Non sarà possibile cancellare un ticket segnato, solo posticiparlo.
- Una volta eseguito il ticket si potrà chiudere, (rimarrà nello storico)


### Contatti Tour-Operator
- conterrà una sezione per l’accesso ai Link dei tour Operator, contatti e nome referente
Nume tour Operator
contatti
enum(numer di telefono, email)
nome utente
pw
Link del sito





