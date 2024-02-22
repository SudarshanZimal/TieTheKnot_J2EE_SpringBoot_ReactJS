package com.springcrud.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.crud.dao.VendorDao;
import com.springcrud.crud.model.Vendor;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorDao vendorDao;

	@Override
	public List<Vendor> getVendors() {
		return vendorDao.findAll();
	}

	@Override
	public Vendor getVendor(long vendorId) {
		return vendorDao.findById(vendorId).get();
	}

	@Override
	public Vendor addVendor(Vendor vendor) {
		vendorDao.save(vendor);
		return vendor;
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		vendorDao.save(vendor);
		return vendor;
	}

	@Override
	public Vendor deleteVendor(long vendorId) {
		Vendor vendor = vendorDao.findById(vendorId).get();
		vendorDao.delete(vendor);
		return vendor;
	}
}
