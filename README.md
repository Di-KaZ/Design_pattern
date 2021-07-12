# TP Design Pattern


## Exercice 1
> (Modélisation UML)
Tous les personnes ont un nom et un niveau
Deux grandes catégories : magiciens et cogneurs
Les magicien ont besoin de « mana », ils disposent d’une certaine quantité et d’une capacité maximale
Les cogneurs sont soit des guerriers soit des rôdeurs.
Les guerriers doivent accumuler de la rage
Les rôdeurs sont toujours accompagnés d’un familier qui possède son propre nom et son propre niveau. ils sont liés à la vie à la mort, si l’un meurt l’autre aussi

![Exo 1 UML](https://github.com/Di-KaZ/Design_pattern/raw/main/Exercice_1.png)

## Exercice 2
> (Modélisation UML)
Tous les personnes ont un nom et un niveau
Deux grandes capacités : la magie et la force, la 1er requiert de la mana, la 2nd de la rage
Trois types de personnages : magiciens, guerriers et paladin
Les magiciens ne peuvent faire que la magie grâce à leur mana
Les guerriers ne peuvent utiliser que la force grâce à leur rage
Les paladins peuvent faire les deux grâce à leur mana et leur rage

![Exo 2 UML](https://github.com/Di-KaZ/Design_pattern/raw/main/Exercice_2.png)

## Exercice 3
>  FileDataSource a faire avec le pattern décorator

- Implementation :
  - [FileDataSourceInterface.java](https://github.com/Di-KaZ/Design_pattern/blob/main/src/main/java/_decorator_/_exercice/FileDataSourceInterface.java)
  - [FileDataSourceDecorator.java](https://github.com/Di-KaZ/Design_pattern/blob/main/src/main/java/_decorator_/_exercice/FileDataSourceDecorator.java)
  - [Encrypt.java](https://github.com/Di-KaZ/Design_pattern/blob/main/src/main/java/_decorator_/_exercice/Encrypt.java)
  - [Compress.java](https://github.com/Di-KaZ/Design_pattern/blob/main/src/main/java/_decorator_/_exercice/Compress.java)

- Utilisation : [Demo.java](https://github.com/Di-KaZ/Design_pattern/blob/604d2f13c83017e6d67b228b591d3f535bc099a0/src/main/java/_decorator_/_exercice/Demo.java#L27-L39)

## Exercice 4

> Iterator : Compléter la classe iterator Arbre2

- Implementation : [Arbre2.java](https://github.com/Di-KaZ/Design_pattern/blob/main/src/main/java/_iterator_/Arbre2.java)
- Utilisation : [Client.java](https://github.com/Di-KaZ/Design_pattern/blob/586deb6bc571289e0221185e10975a41ff9fb8eb/src/main/java/_iterator_/Client.java#L47-L57)

## Exercice 5
> Nommer le design pattern à utiliser dans ces cas :
- A) Parser XML qui va enrregistrer en bdd le contenu des fichier dans des tables spécifiques

On utiliseras surement un systeme de DAO avec mapping qui va lire le fichier et le remapper en un/des objet(s) afin de le persister en bdd

- B) Creation fenetre d'une application windows rajouter les options : scroll horizontal, scroll vertical, bordure droite et gauche

On utilise ici le design pattern Observer car on doit gerer des 'evenements' on doit observé si un evenement est en cours
