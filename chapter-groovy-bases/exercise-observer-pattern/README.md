---
type: exercise
template: document
slug: exercise-groovy-observer
image:
tags:
- groovy
- exercise
---

Implémentation d'un système de Chatroom utilisant le patron Observer
====================================

## Abstract

Cet exercice complet vous permet de manipuler différents éléments syntaxiques du langage Groovy.

# Contenu

Le patron observateur est un patron de conception de la famille des patrons comportementaux. Il s'agit de l'un des vingt-trois patrons de l'ouvrage du « Gang of Four » Design Patterns – Elements of Reusable Object-Oriented Software1.

Il est utilisé pour envoyer un signal à des modules qui jouent le rôle d'observateurs. En cas de notification, les observateurs effectuent alors l'action adéquate en fonction des informations qui parviennent depuis les modules qu'ils observent (les observables).

Explications détaillées : [https://refactoring.guru/fr/design-patterns/observer](https://refactoring.guru/fr/design-patterns/observer)

Implémentez un exemple de chatroom qui utilise le système d'observer pour notifier quand un nouveau message a été écris dans la chatroom aux participants.

### Créer l'objet Chatroom

L'objet Chatroom permet d'envoyer un message à tous les utilisateurs du groupe de discussion.

Pour envoyer un message au groupe de discussion, il faut passer son identifiant (objet Susbscriber) et le message.

L'objet permet également d'enregister un nouvel utilisateur au groupe de discussion.

### Créer l'objet Message

Un message contient le message proprement dit et le Participant.

**Astuce** : Eventuellement, vous pouvez l'implémenter via un record.

### Créer l'utilisateur

L'utilisateur est appelé Participant.  

Un participant contient une référence à l'objet Chatroom afin de pouvoir communiquer avec.

Le participant possède deux méthodes : 

* envoyer un message à la chatroom.
* recevoir des notifications de messages de la part de la Chatroom.

### Evolutions possibles

* Gérer la désinscription d'un utilisateur
* Est-il possible de supprimer le lien participant -> chatroom, quel est l'impact ? 

### Exemples

Lire un exemple Java ici [ici](https://www.ionos.fr/digitalguide/sites-internet/developpement-web/quest-ce-que-lobserver-pattern/).