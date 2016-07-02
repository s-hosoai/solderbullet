datasheet KXP84{
	import i2c
	import i2c.*
	device KXP84{		
		pins {GND, Vdd, MOT, FF, X, Y, Z, Reset, 
			nCS, ADDR0, SDI, SDA, SDO, SCL, SCLK, IOVdd, DNC
		}
		port i2c{ADDR0, SDA, SCL}
		port spi{SDI, SDO, SCLK, nCS}
		port analog{X, Y, Z}
				
		function byte readRegister(byte address) {
			var result
			i2c_write_byte(0x00110000)  // slave addr(0x001100) + Addr0 + WriteOperation
			i2c_write_byte(~address)
			result = i2c_read_byte()
			return result
		}

		package P2050{
			GND(1),  // Ground
			Vdd(2),  // The power supply input. Decouple this pin to ground with a 0.1uF ceramic capacitor (C1).
			MOT(3),  // Motion interrupt
			FF(4),   // Free-fall interrupt
			X(5),    // Output Analog output of the x-channel. Optionally, a capacitor (C2) placed between this pin and ground will form a low pass filter.
			Y(6),    // Output Analog output of y-channel. Optionally, a capacitor (C3) placed between this pin and ground will form a low pass filter.
			Z(7),    // Output Analog output of z-channel. Optionally, a capacitor (C4)placed between this pin and ground will form a low pass filter.
			Reset(8), // Reset clears all KXP84 registers
			nCS(9),  // SPI Chip Select and I2C/SPI mode selection: (1 = I2C mode, 0 = SPI mode)
			ADDR0(10){SDI}, // ADDR0/SDI I2C programmable address bit/SPI Serial Data Input
			SDA(11){SDO},   // SDA/SD0 I2C Serial Data/SPI Serial Data Output
			SCL(12){SCLK},  // SCL/SCLK I2C Serial Clock/SPI Serial Clock
			IOVdd(13),  // Vdd The power supply input for the I/O pads
			DNC(14)  // DoNt Care
		}
		registers {			
			// for I2C
			0x00 : XOUT_H,		// R
			0x01 : XOUT_L,		// R
			0x02 : YOUT_H,		// R
			0x03 : YOUT_L,		// R
			0x04 : ZOUT_H,		// R
			0x05 : ZOUT_L,		// R
			0x06 : FF_INT,		// R/W
			0x07 : FF_DELAY,	// R/W
			0x08 : MOT_INT,	// R/W
			0x09 : MOT_DELAY,	// R/W
			0x0A : CTRL_REGC,	// R/W
			0x0B : CTRL_REGB,	// R/W
			0x0C : CTRL_REGA,	// R
			// for SPI
			0x80 : R_XOUT_H,		// R
			0x81 : R_XOUT_L,		// R
			0x82 : R_YOUT_H,		// R
			0x83 : R_YOUT_L,		// R
			0x84 : R_YOUT_L,		// R
			0x85 : R_ZOUT_L,		// R
			0x86 : R_FF_INT,		// R/W Write Address 0x06
			0x87 : R_FF_DELAY,	// R/W Write Address 0x07
			0x88 : R_MOT_INT,	// R/W Write Address 0x08
			0x89 : R_MOT_DELAY,	// R/W Write Address 0x09
			0x8A : R_CTRL_REGC,	// R/W Write Address 0x0A
			0x8B : R_CTRL_REGB,	// R/W Write Address 0x0B
			0x8C : R_CTRL_REGA	// R
		}
	}
}