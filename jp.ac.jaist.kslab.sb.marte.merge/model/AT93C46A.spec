datasheet AT93C {
	import spi
	import spi.*
	
	device AT93C46A{
		pins {CS, SK, DI, DO, GND, ORG, NC, VCC}
		port spi {SK, DI, DO, CS}
		function write_data(byte address){
		}
		
		function byte read_data(byte address){
			var result
			result = spi_read_byte()
			return result
		}
		
		package PDIP8 ,SOIC, TSSOP, BGA8, MLP{
			CS(1),
			SK(2),
			DI(3),
			DO(4),
			GND(5),
			ORG(6),
			NC(7),
			VCC(8)			
		}		
	}
}