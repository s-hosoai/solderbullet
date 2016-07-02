datasheet AT250N0B {
	import spi
	import spi.*
	device AT25010B {
		pins {CS, SO, WP, SI, SCK, HOLD}
		port spi {SO, SI, SCK, CS}
		
		function set_write_enable_latch(){
			spi_write_byte(0b0000110)
		}
		
		function reset_write_enable_latch(){
			spi_write_byte(0b0000100)
		}
		
		function byte read_status_register(){
			spi_write_byte(0b0000101)
			var temp 
			temp = spi_read_byte()
			return temp
		}
		
		function write_status_register(byte status){
			spi_write_byte(0b00000011)
			spi_write_byte(~status)
		}
		
		function byte read(byte address){
			spi_write_byte(0b00000010)
			spi_write_byte(~address)
			var temp
			temp = spi_read_byte()
			return temp
		}
		
		function write(byte address, byte value){
			spi_write_byte(0b00000010)
			spi_write_byte(~address)
			spi_write_byte(~value)		
		}
		
		package DIP, TSSOP{
			CS(1),
			SO(2),
			WP(3),
			GND(4),
			SI(5),
			SCK(6),
			HOLD(7),
			VCC(8)
		}
	}
}