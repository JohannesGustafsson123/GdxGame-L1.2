package com.gdx.game.inventory.set;

import com.gdx.game.inventory.item.InventoryItem;

import java.util.HashMap;

/**
 * EquipmentSet representerar en uppsättning utrustning i spelet, 
 * där varje uppsättning har ett unikt ID, en beskrivning och bonusar kopplade till den.
 */
public class EquipmentSet {

    /**
     * En unik identifierare för den här uppsättningen av föremål, definierad av InventoryItem.ItemSetID.
     */
    private InventoryItem.ItemSetID itemSetID;

    /**
     * En kort beskrivning av den här uppsättningen föremål.
     */
    private String itemSetDescription;

    /**
     * En samling av bonusar som den här uppsättningen ger. 
     * Användningen av en HashMap tillåter snabb uppslagning av bonusar baserat på nyckeln (som kan representera 
     * bonusens typ, t.ex. "attack", "defense" eller "speed"). Värdet är en sträng som beskriver bonusens storlek 
     * eller effekt (t.ex. "+10%" eller "+5 attack").
     * 
     * Exempel:
     * - Nyckel: "attack", Värde: "+5"
     * - Nyckel: "defense", Värde: "+3"
     */
    private HashMap<String, String> bonus = new HashMap<>();

    /**
     * Standardkonstruktör som skapar ett tomt EquipmentSet.
     */
    public EquipmentSet() {
    }

    /**
     * Kopieringskonstruktör som skapar ett nytt EquipmentSet baserat på ett befintligt.
     * @param equipmentSet EquipmentSet-objektet som ska kopieras.
     */
    public EquipmentSet(EquipmentSet equipmentSet) {
        this.itemSetID = equipmentSet.getItemSetID();
        this.itemSetDescription = equipmentSet.getItemSetDescription();
        this.bonus = equipmentSet.getBonus();
    }

    /**
     * Hämtar ID för uppsättningen.
     * @return ItemSetID för den här EquipmentSet.
     */
    public InventoryItem.ItemSetID getItemSetID() {
        return itemSetID;
    }

    /**
     * Sätter ID för uppsättningen.
     * @param itemSetID Det nya ItemSetID för den här EquipmentSet.
     */
    public void setItemSetID(InventoryItem.ItemSetID itemSetID) {
        this.itemSetID = itemSetID;
    }

    /**
     * Hämtar beskrivningen av uppsättningen.
     * @return Beskrivningen av den här EquipmentSet.
     */
    public String getItemSetDescription() {
        return itemSetDescription;
    }

    /**
     * Sätter beskrivningen för uppsättningen.
     * @param itemSetDescription Den nya beskrivningen för den här EquipmentSet.
     */
    public void setItemSetDescription(String itemSetDescription) {
        this.itemSetDescription = itemSetDescription;
    }

    /**
     * Hämtar bonusarna som är kopplade till uppsättningen.
     * @return En HashMap som innehåller bonusar med deras nycklar och värden.
     */
    public HashMap<String, String> getBonus() {
        return bonus;
    }

    /**
     * Sätter bonusarna för uppsättningen.
     * @param bonus En HashMap som innehåller bonusarna att associera med den här uppsättningen.
     */
    public void setBonus(HashMap<String, String> bonus) {
        this.bonus = bonus;
    }
}
