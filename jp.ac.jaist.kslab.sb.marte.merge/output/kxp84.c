#include "kxp84.h"

unsigned char readRegister(){
	i2c_write_byte();
	i2c_write_byte();
	i2c_read_byte();
}
