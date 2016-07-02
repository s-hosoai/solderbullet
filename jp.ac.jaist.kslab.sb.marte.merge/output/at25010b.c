#include "at25010b.h"

void set_write_enable_latch(){
	spi_write_byte();
}
void reset_write_enable_latch(){
	spi_write_byte();
}
unsigned char read_status_register(){
	spi_write_byte();
	spi_read_byte();
}
void write_status_register(){
	spi_write_byte();
	spi_write_byte();
}
unsigned char read(){
	spi_write_byte();
	spi_write_byte();
	spi_read_byte();
}
void write(){
	spi_write_byte();
	spi_write_byte();
	spi_write_byte();
}
