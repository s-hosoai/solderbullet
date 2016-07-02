protocol i2c {
	i2c_initializie()
	byte i2c_read_byte(byte address)
	i2c_write_byte(byte address, byte val)
}
