# Stockage de Données Personnelles
## Description générale du projet
Le but de ce projet est de réaliser un systeme de stockage des données personnelles en proposant un emplacement efficace pour des donnees de type variable.

* Trouver le meilleur emplacement 
* Gestion des conflits
* Eviter la création de trou de mémoire dans les nœuds

## Les taches
* tache_1 (structure_data) : Creation de la struture de donnee
* tache_2 (stockage_etape1) : stockage efficace de donnee en placant les donnees les unes apres les autres
* tache_3 (gestion des conflits) : gestion des conflits
* tache-4 (optimisation) : optimisation (elle s'est fait dans le main )

## Les Differentes classes developpées dans ce projet
* **Arc** : permet de creer des arcs 
* **Tree** : permet d'implémenter des graphes. La répresentation utiliser est la répresentation ensembliste.
* **Donnee** : permet de répresenter des données.
* **Noeud** : permet de creer un noeud. 
* **NoeudSysteme** : cette classe hérite de la classe Noeud. Elle permet de representer des noeuds capables de contenir des données.
* **Utilisateur** : cette classe hérite de la classe Noeud. Il s'agit d'un noeud qui est interessé par des données et désire les stocker.

## Les exigences concernant l’environnement de développement
le projet est developpé en **Java** ceci dit est fonctionne sur tout environnement de developpement java.

## Instruction pour l’installation et l’utilisation.
#### Etape 1 : telecharge le dossier 
$ git clone https://github.com/RICHARD-90/Stockage-de-Donnees-Personnelles.git

#### Etape 2 :
Executer tous les fichiers .java dans le meme dossier</br>
ou alors :</br>
$ import Noeud.*

## Principe et notion utilisés

Principe de conception SOLID
* Single responsibility principle
* Open/closed principle
* Liskov substitution principle
* Interface segregation principle
* Dependency inversion principle

