/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mikado.db;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author barcvilla
 */
public interface Database 
{
    List<String> load(String key);
    void store(Map<String, Serializable> data);
}
