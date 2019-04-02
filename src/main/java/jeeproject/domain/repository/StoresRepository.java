/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeeproject.domain.repository;

import jeeproject.domain.model.Stores;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author 宋觅源
 */
public interface StoresRepository extends JpaRepository<Stores, Integer> {
           public Stores findByEmail(String email);
}