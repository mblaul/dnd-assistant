/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

import static dnd_inventory_mng.ArrayList_Generator.itemList;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Dixie_Flatline
 */
public class ItemListRenderer extends DefaultListCellRenderer {
    @Override
public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
    String name = ((itemList) value).getName();
    return super.getListCellRendererComponent(list, name, index, isSelected, cellHasFocus);
}}
}
