datasheet HMC6352 {
	import i2c
	import i2c.*

	device HMC6352 {
		pins {SDI, SDO, PGM, SCL, SS}
		port i2c{SDI, SDO, SCL}


		function void write_eeprom(int address, byte data){
			i2c_write_byte(0x77)
			i2c_write_byte(~address)
			i2c_write_byte(~data)
		}
		function byte read_eeprom(int address){
			i2c_write_byte(0x72)
			i2c_write_byte(~address)
			var data
			data = i2c_read_byte()
			return data
		}
		function void write_ram(int ramaddress, byte data){
			i2c_write_byte(0x47)
			i2c_write_byte(~ramaddress)
			i2c_write_byte(~data)
		}
		function byte read_ram(int ramaddress){
			i2c_write_byte(0x67)
			i2c_write_byte(~ramaddress)
			var data
			data = i2c_read_byte()
			return data
		}
		function void enter_sleepmode( ){
			i2c_write_byte(0x53)
		}
		function void exit_sleepmode( ){
			i2c_write_byte(0x57)	
		}
		function void update_bridge_offset( ){
			i2c_write_byte(0x4F)
		}
		function void enter_user_calibrationmode( ){
			i2c_write_byte(0x43)
		}
		function void exit_user_calibrationmode( ){
			i2c_write_byte(0x45)
		}
		function void save_opmode_to_eeprom( ){
			i2c_write_byte(0x4C)			
		}
		
		function int get_data() {
			i2c_write_byte(0x41)
			var msb
			msb = i2c_read_byte()
			var lsb
			lsb = i2c_read_byte()
			return msb//<<8 | lsb
		}
		
		package DIP{
			"OF-"(1),	//No User Connection (Offset Strap Negative) 
			"SR+"(2),	//No User Connection (Set/Reset Strap Positive) 
			NC(3),		//No User Connection 
			NC(4),		//No User Connection 
			GND(5),		//Supply/System Ground 
			NC(6),		//No User Connection 
			SDI(7),		//I2C Data Output (SPI Data In) 
			SDO(8),		//No User Connection (SPI Data Out) 
			PGM(9),		//No User Connection (Program Enable) 
			SCL(10),	//I2C Clock (SPI Clock) 
			SS(11),		//No User Connection (Slave Select) 
			NC(12),		//No User Connection 
			NC(13),		//No User Connection 
			VDD(14),	//Supply Voltage Positive Input (+2.7VDC to +5.0VDC) 
			NC(15),		//No User Connection 
			NC(16),		//No User Connection  
			NC(17),		//No User Connection 
			NC(18),		//No User Connection 
			CB2(19),	//Amplifier B Filter Capacitor Connection 
			CB1(20),	//Amplifier B Filter Capacitor Connection 
			NC(21),		//No User Connection 
			CA2(22),	//Amplifier A Filter Capacitor Connection 
			CA1(23),	//Amplifier A Filter Capacitor Connection 
			"OF+"(24)	//No User Connection (Offset Strap Positive)
		}
		
		registers {				// default value
			0x00:i2cslvaddr,	// 0x42
			0x01:xoffsetmsb,	
			0x02:xoffsetlsb,
			0x03:yoffsetmsb,
			0x04:yoffsetlsb,
			0x05:timedelay,		// 0x01
			0x06:measurment,	// 0x04
			0x07:vsersion,		// 0x01
			0x08:mode,
			// RAM Register address
			0x4E:outputmode{,,,,,MODE1,MODE2,MODE3},	// 0b01100000 (0x50)
			0x74:reg{,M_RATE_H,M_RATE_L,PER_SR,,,OP_MODE_H,OP_MODE_L}
		}
	}
}