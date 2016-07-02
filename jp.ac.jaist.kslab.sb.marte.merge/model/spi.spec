protocol spi {
	spi_initialize()
	byte spi_transfer(byte value) // read & write
	byte spi_read_byte()
	spi_write_byte(byte value)
	spi_end()
}
