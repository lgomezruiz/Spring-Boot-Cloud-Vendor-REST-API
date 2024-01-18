package com.lgomezruiz.restapisql.repository;

import com.lgomezruiz.restapisql.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

/*
El repositorio tenemos que extenderlo de JpaRepository. Le pasamos el modelo al que
queremos aplicarlo (CloudVendor en este caso), seguido del tipo de dato que es el ID
(String en este caso)
 */
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {


}
