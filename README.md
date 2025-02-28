# Progetto TCP Communication

**Jakub Allababidi** 

---

## Scopo del Progetto

Simulare una comunicazione tra client e server tramite il protocollo TCP. Il progetto include la gestione della connessione tra un client e un server.

---

## Classi e Struttura del Codice

### Classe `Server`
- **Descrizione**: Gestisce la connessione in entrata dei client e la comunicazione.
- **Funzioni principali**:
  - Ascolta le richieste di connessione dei client.
  - Gestisce la comunicazione con un client.
  - Gestisce l'assegnazione dei messaggi  e delle risposte al client.

### Classe `Client`
- **Descrizione**: Rappresenta il client che si connette al server e scambia messaggi con esso.
- **Funzioni principali**:
  - Si connette al server e invia messaggi.
  - Riceve messaggi dal server e li visualizza.
  - Gestisce la disconnessione dal server.

---

## Librerie Utilizzate

- `java.net.ServerSocket`: Per la gestione delle connessioni del server.
- `java.net.Socket`: Per la gestione della connessione del client.
- `java.io.InputStreamReader`: Per leggere i messaggi in entrata dal client.
- `java.io.OutputStreamWriter`: Per inviare i messaggi al client.
- `java.util.Scanner`: Per l'input dell'utente (per il client).
