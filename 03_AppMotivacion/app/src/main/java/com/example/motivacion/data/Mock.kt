package com.example.motivacion.data

import com.example.motivacion.infra.MotivacionConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)
class Mock {

    private val all = MotivacionConstants.FILTER.ALL
    private val happy = MotivacionConstants.FILTER.HAPPY
    private val sunny = MotivacionConstants.FILTER.SUNNY

    private val mListPhrase = listOf<Phrase>(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", happy),
        Phrase("Quando está mais escuro, vemos mais estrelas!", happy),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", happy),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", happy),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", happy),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Phrase("Você perde todas as chances que você não aproveita.", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Phrase("Se você acredita, faz toda a diferença.", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny),
        Phrase("Abra as janelas da sua casa e deixe a felicidade entrar com a brisa.", sunny),
        Phrase("Assim como as flores buscam a luz do sol, encontre a sua fonte de alegria diária.", sunny),
        Phrase("Em cada sorriso compartilhado, encontramos um raio de sol na vida.", happy),
        Phrase("Navegue pelos mares da vida com otimismo e o sol guiará seu caminho.", sunny),
        Phrase("A felicidade é o combustível que aquece o motor da vida em casa.", happy),
        Phrase("Deixe que os raios do sucesso iluminem cada cômodo da sua jornada.", sunny),
        Phrase("Com um coração alegre, cada dia é um banquete de raios de sol.", happy),
        Phrase("A vida é um campo vasto e alegre, pronto para ser explorado.", sunny),
        Phrase("Cultive a positividade como um jardim e veja flores de alegria desabrocharem.", happy),
        Phrase("O sorriso é o raio de sol que derrete até o mais gélido dos momentos.", happy),
        Phrase("Não tenha medo de dançar sob a chuva, pois o sol sempre retorna.", sunny),
        Phrase("Que cada dia comece com a promessa de um sol brilhante iluminando sua casa.", sunny),
        Phrase("A alegria é a cola que mantém as memórias radiantes unidas.", happy),
        Phrase("Deixe que a felicidade seja a bússola que guia você pelos altos e baixos da vida.", sunny),
        Phrase("Sob o sol da gratidão, encontre a beleza nas pequenas coisas da vida.", sunny),
        Phrase("Cada momento de riso é um raio de sol dourando os dias cinzentos.", happy),
        Phrase("Com amor e risos, transforme sua casa em um verdadeiro paraíso ensolarado.", happy),
        Phrase("A coragem é o sol que dissipa as nuvens do medo e da incerteza.", sunny),
        Phrase("A vida é um piquenique ensolarado, onde a felicidade é o prato principal.", happy),
        Phrase("Com confiança, você pode escalar montanhas e alcançar os picos mais ensolarados.", sunny)
    )

    //value = 1
    fun getPhrase(value: Int): String{
        val filtered = mListPhrase.filter { it.categoryId == value || value == all}
        return filtered[Random.nextInt(filtered.size)].description
    }
}