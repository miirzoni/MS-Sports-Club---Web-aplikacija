# Lab-1 - MS Sports Club

# MS Sports Club
# Radili: Sanjin Samardžić i Mirza Haračić
# Model Team (Tim)

Predstavlja jedan sportski tim.
# Atributi:

id – jedinstveni identifikator tima

name – naziv tima

city – grad iz kojeg tim dolazi

logo – putanja do slike loga tima

players – lista svih igrača koji pripadaju tom timu

Relacije:

Jedan tim može imati više igrača (1:N veza sa modelom Player).

Jedan tim može imati više akcija, ako se akcije odnose na tim (npr. ukupni golovi, pobjede i sl.).

# Model Player (Igrač)

Predstavlja jednog igrača koji pripada određenom timu.
Atributi:

id – jedinstveni identifikator igrača

name – ime i prezime igrača

age – broj godina

position – pozicija na terenu (npr. napadač, golman, odbrambeni)

team – tim kojem igrač pripada

actions – lista akcija koje je igrač napravio

# Relacije:

Više igrača može pripadati jednom timu (N:1 veza prema modelu Team).

Jedan igrač može imati više akcija (1:N veza prema modelu Action).

# Model Action (Akcija)

Predstavlja neku radnju ili događaj koji je igrač napravio tokom utakmice.
Atributi:

id – jedinstveni identifikator akcije

type – tip akcije (npr. gol, asistencija, faul)

minute – minuta u kojoj se akcija desila

player – igrač koji je izveo akciju

# Relacije:

Više akcija može biti povezano s jednim igračem (N:1 veza prema modelu Player).

 Relacije između modela

Jedan Team ima više Player.

Jedan Player ima više Action.

Jedna Action pripada tačno jednom Player, a svaki Player pripada tačno jednom Team.

Drugim riječima:

1 Tim → više Igrača

1 Igrač → više Akcija

# Screenshotovi aplikacije: 
<img width="1365" height="632" alt="3" src="https://github.com/user-attachments/assets/8f871690-2558-4a75-bbf2-851f4729c197" />
<img width="1365" height="636" alt="2" src="https://github.com/user-attachments/assets/b95042dc-8cd3-4633-8c7a-33076d90a043" />
<img width="1365" height="633" alt="1" src="https://github.com/user-attachments/assets/f8930715-561a-44ae-84d3-79f96ff02acf" />


# Lab-2: Nadogradnja i REST API

# Novi model: Trainer

# Opis logike i svrha:

Novi model Trainer predstavlja trenera sportskih časova.

Omogućava dodavanje trenera, praćenje njihovih specijalizacija i godina iskustva.

Povezan je sa modelom SportClass (1:N veza, jedan trener može imati više časova).

# Relacije:

1 Trainer → više SportClass

SportClass → tačno jedan Trainer

# Funkcionalnosti controller-a
# Thymeleaf controller (TrainerController)

Prikazuje listu svih trenera

Omogućava dodavanje novih trenera putem forme

Podaci se spremaju u bazu podataka

# REST controller (TrainerRestController)

Endpoint vraća sve trenere u JSON formatu

Omogućava integraciju s front-endom ili drugim aplikacijama

# SportClassController

Omogućava prikaz i dodavanje sportskih časova

Veza sa trenerom se uspostavlja preko izabranog trenera iz forme

# Konfiguracija baze

Za aplikaciju je korištena MySQL baza podataka

Baza je kreirana i administrirana pomoću MySQL Workbench

Entiteti iz aplikacije su povezani s bazom pomoću Spring Data JPA

Svi podaci se čuvaju u MySQL bazi, in-memory liste više nisu korištene

# Screenshotovi aplikacije: 
<img width="1365" height="673" alt="treneri" src="https://github.com/user-attachments/assets/8ad4f2d1-595c-4b05-a744-b754270738e3" />
<img width="1365" height="675" alt="casovi" src="https://github.com/user-attachments/assets/8143a9c7-4a62-4470-b905-d78bbec55598" />

