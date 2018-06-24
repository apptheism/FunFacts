package rocks.appvanced.funfacts.model;

import java.util.Random;

public class FactBook {

    private static final String TAG = FactBook.class.getSimpleName();

    // Fields or Member Vriables  - Properties about the object
    String[] facts = {
            "Ameisen dehnen sich, wenn sie morgens aufwachen.",
            "Strauße können schneller laufen als Pferde.",
            "Olympische Goldmedaillen bestehen überwiegend aus Silber.",
            "Du wirst mit 300 Knochen geboren. Als Erwachsener hast du nur noch 206.",
            "Licht benötigt ungefähr 8 Minuten von der Sonne bis zur Erde.",
            "Manche Bambusarten wachsen bis zu 1 Meter pro Tag.",
            "Florida ist größer als England.",
            "Manche Pinguine können außerhalb vom Wasser zwei bis drei Meter weit springen.",
            "Durchschnittlich dauert es 66 Tage, bis eine neue Gewohnheit geformt wird.",
            "Mammuts liefen noch über die Erde, als die großen Pyramiden gebaut wurden.",
            "Das Croissant (halbmondformiges Gebäck) wurde zur Freude über den Sieg gegen die Türken (1683) von einem Wiener Bäcker entworfen.",
            "In Saudi-Arabien sind Barbie-Puppen illegal.",
            "Lippenstift enthält Fischschuppen.",
            "Bei 82 % aller Beatles-Songs geht es um die Liebe.",
            "Die erste Sportart mit Weltmeisterschaft war Billard (1873).",
            "Der längste Satz in einem Buch besteht aus 823 Wörtern, geschrieben von Victor Hugo im Roman „Les Miserables“.",
            "Die Wurzel aus 123456789 = 11111,111",
            "Kein US-Präsident war Einzelkind.",
            "Kroatien war das erste Land, das den Staat USA anerkannte (1776).",
            "Neben den 879 aktiven Satelliten kreisen noch etwa 10.000 Teile Weltraumschrott (alte Satelliten, Raketenteile etc.) im Orbit.",
            "Monaco und Vatikanstadt sind kleiner als der New Yorker Central Park.",
            "Die V2-Rakete der Nazis führte zu 3 mal mehr Todesopfern unter den Ingenieuren als unter den Bombardierten.",
            "Von 221 Staaten der Welt haben derzeit 59 Linksverkehr.",
            "In über 50 Jahren des Systems 6 aus 49 gab es insgesamt mehr als 1.700 Lottomillionäre.",
            "Nicht Hollywood oder Bollywood produzieren die meisten Filme pro Jahr, sondern „Nollywood“ in Nigeria (ca. 2.000 Filme jährlich).",
            "Österreich war das erste Land, das die Todesstrafe abschaffte (1787).",
            "Die Löcher im Schweizer Käse nennt man „Augen“.",
            "Somalia hat mehr Ziegen als Einwohner.",
            "Australien hieß von 1644 bis 1814 „Neuholland“ (von Abel Tasman). Matthew Flinders gab dem Kontinent den heutigen Namen.",
            "Adolf Hitler wurde 1939 für den Friedensnobelpreis nominiert. Natürlich vor dem Einmarsch in Polen.",
            "Die breiteren Wachstumsringe eines Baumes zeigen nach Süden."
    };

    // Methods - Actionbs the object can take
    public String getFact(){
        // Randomly select a fact
        //Log.d(TAG, String.valueOf(facts.length));
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }

    public String getInitialFact(){
        return facts[0];
    }

}
