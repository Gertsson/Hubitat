/**
 *  Aeotec HEM Child Device
 *
 *  Copyright 2023 Jonas Gertsson
 *  All code is so far original from Artur Draga - ClassicGOD
 *  Just changed namespace to match parent HEM device
 *
 */
metadata {
	definition (name: "Aeotec Home Energy Meter Child Device", namespace: "Gertsson", author: "Artur Draga") {
		capability "Energy Meter"
		capability "Power Meter"
		capability "Voltage Measurement"
		capability "Refresh"
		
		command "resetEnergy"
		
		attribute "current", "number"
	}
}

def refresh() { parent.refresh(device.deviceNetworkId[-1].toInteger()) }
def resetEnergy() { parent.resetEnergy(device.deviceNetworkId[-1].toInteger()) }