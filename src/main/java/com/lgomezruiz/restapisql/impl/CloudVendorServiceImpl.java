package com.lgomezruiz.restapisql.impl;

import com.lgomezruiz.restapisql.model.CloudVendor;
import com.lgomezruiz.restapisql.repository.CloudVendorRepository;
import com.lgomezruiz.restapisql.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

/*
A la implementación tenemos que implementarle el servicio
correspondiente (CloudVendorService). Al hacer esto, nos salta
un error que nos recomienda implementar los métodos y sobreescribirlos.
 */
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    //Creamos una instancia del repositorio para trabajar servicios-repositorio
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deteleCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
