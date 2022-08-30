package com.Elect.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Elect.Entity.Device;
import com.Elect.Repository.DeviceRepo;

@Service
public class DeviceService {
@Autowired
	private DeviceRepo repository;

public Device saveDevice(Device device) {
	return repository.save(device);
}

public List<Device> saveDevices(List<Device> devices) {
	return repository.saveAll(devices);
}

public List<Device> getDevices(){
	return repository.findAll();
}
public Device getDevicesById(int id){
	return repository.findById(id).orElse(null);
}
public Device getDevicesByName(String name){
	return repository.findByName(name).orElse(null);
}
public String deleteDevice(int id) {
	repository.deleteById(id);
	return "device not"+id;
}
public Device updateDevice(Device device) {
Device existingDevice = new Device(0, null, null, 0);
existingDevice.setName(device.getName());
existingDevice.setCategory(device.getCategory());
existingDevice.setPrice(device.getPrice());
return repository.save(existingDevice);

}

public Device getDeviceById(int id) {
	
	return null;
}

public Device getDeviceByName(String name) {

	return null;
}
}

