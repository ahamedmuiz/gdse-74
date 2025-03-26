/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.Main.controller;

import edu.ijse.mvc.Main.dto.ItemDto;
import edu.ijse.mvc.Main.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ahamed
 */
public class ItemController {
    private ItemModel itemModel;

    public ItemController() {
        itemModel = new ItemModel();
    }
    
    public String saveItem(ItemDto dto) throws SQLException, ClassNotFoundException{
        
    String result = itemModel.saveItem(dto);
    return result;
    
    }
    public String updateItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        String result = itemModel.updateItem(dto);
            return result;

    }
   public String deleteItem(String itemCode) throws SQLException, ClassNotFoundException{
        String result = itemModel.deleteItem(itemCode);
        return result;
    }
   
   public ItemDto searchItem(String code) throws SQLException, ClassNotFoundException{
        ItemDto result = itemModel.searchItem(code);
        return result;
    }
    
    public ArrayList<ItemDto> getAllItem() throws  SQLException, ClassNotFoundException{
        ArrayList<ItemDto> resp = itemModel.getAll();
        return resp;
    }
}
    

