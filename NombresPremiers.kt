/**
 * Fonction principale
 * Affiche tout les nombres premiers entre 1 et 100.
 */
fun main(args: Array<String>)
{
    for(i in 1..100)
    {
        if(isPremier(i)) {
            println("$i")
        }
    }
}

/**
 * Fonction permettant d'indiquer si un nombre est premier ou non.
 */
fun isPremier(nombre:Int):Boolean
{
    var compteur = 0;

    for (i in 1..nombre)
    {
        if(nombre%i == 0)
        {
            compteur++;
        }
    }
    return (compteur == 2)
}