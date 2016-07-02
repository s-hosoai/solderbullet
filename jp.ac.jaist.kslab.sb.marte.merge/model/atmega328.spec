
datasheet Atmega328{
	import i2c.*
	import spi.*
	
	mcu Atmega328 {
		pins {ADC0, ADC1, ADC2, ADC3, ADC4, ADC5, ADC6, ADC7, AIN0, AIN1, AREF, AVCC, CLKO, GND, ICP1, INT0, INT1, MISO, MOSI, OC0A, OC0B, OC1A, OC1B, OC2A, OC2B, PB0, PB1, PB2, PB3, PB4, PB5, PB6, PB7, PC0, PC1, PC2, PC3, PC4, PC5, PC6, PCINT0, PCINT1, PCINT10, PCINT11, PCINT12, PCINT13, PCINT14, PCINT16, PCINT17, PCINT18, PCINT19, PCINT2, PCINT20, PCINT21, PCINT22, PCINT23, PCINT3, PCINT4, PCINT5, PCINT6, PCINT7, PCINT8, PCINT9, PD0, PD1, PD2, PD3, PD4, PD5, PD6, PD7, RESET, RXD, SCK, SCL, SDA, SS, T0, T1, TOSC1, TOSC2, TXD, VCC, XCK, XTAL1, XTAL2}
		port i2c {SDA, SCL}
		port spi {MISO, MOSI, SCK, SS}
		port usart0 {XCK, TXD, RXD}
		port portb {PB0, PB1, PB2, PB3, PB4, PB5, PB6, PB7}
		port portc {PC0, PC1, PC2, PC3, PC4, PC5, PC6}
		port portd {PD0, PD1, PD2, PD3, PD4, PD5, PD6, PD7}
		port adc {ADC0, ADC1, ADC2, ADC3, ADC4, ADC5, ADC6, ADC7}
		
		peripheral i2c implements i2c {
			impl i2c_initializie(){
				
			}
			impl byte i2c_read_byte(byte address){
				$TWCR <= 1
//				while(!(TWCR & (1<<TWCR=>))){}
				// while((TWSR & 0xFB) != 0x08 );
				
				$TWDR <= ~address
				$TWCR <= 0x00
				//wait(100)
			}
			
			impl i2c_write_byte(byte address, byte value){
				$TWCR <= 0b11001111
				while(!($TWCR & (#TWCR.TWINT))){}
				while($TWSR != 0x08 ){}

				$TWDR <= ~address
				$TWCR <= 0x00
				//wait(100)
			}
		}
		
		peripheral spi implements spi {
			impl spi_initialize(){
				$DDRB <= #DDRB.DDB3 //| DDRB.DDB5 
				$SPCR <= #SPCR.SPE //|(1<<MSTR) | (1<<SPR0) */
			}
			impl byte spi_transfer(byte data){
				$SPDR <= ~data
				while(!($SPSR & #SPSR.SPIF)){}
				return $SPDR
			}
			impl byte spi_read_byte(){
				$SPDR <= 0x00
				while(!($SPSR & #SPSR.SPIF)){}
				return $SPDR
			}
			impl spi_write_byte(byte data){
				$SPDR <= ~data
				while(!($SPSR & #SPSR.SPIF)){}
			}
			impl spi_end(){
				
			}
		}

		sfrs {
			0xC6: UDR0{, , , , , , , },
			0xC5: UBRR0H{, , , , , , , },
			0xC4: UBRR0L{, , , , , , , },
			0xC2: UCSR0C{UMSEL01, UMSEL00, UPM01, UPM00, USBS0, UCSZ01, UCSZ00, UCPOL0},
			0xC1: UCSR0B{RXCIE0, TXCIE0, UDRIE0, RXEN0, TXEN0, UCSZ02, RXB80, TXB80},
			0xC0: UCSR0A{RXC0, TXC0, UDRE0, FE0, DOR0, UPE0, U2X0, MPCM0},
			0xBD: TWAMR{TWAM6, TWAM5, TWAM4, TWAM3, TWAM2, TWAM1, TWAM0, },
			0xBC: TWCR{TWINT, TWEA, TWSTA, TWSTO, TWWC, TWEN, , TWIE},
			0xBB: TWDR{, , , , , , , },
			0xBA: TWAR{TWA6, TWA5, TWA4, TWA3, TWA2, TWA1, TWA0, TWGCE},
			0xB9: TWSR{TWS7, TWS6, TWS5, TWS4, TWS3, , TWPS1, TWPS0},
			0xB8: TWBR{, , , , , , , },
			0xB6: ASSR{, EXCLK, AS2, TCN2UB, OCR2AUB, OCR2BUB, TCR2AUB, TCR2BUB},
			0xB4: OCR2B{, , , , , , , },
			0xB3: OCR2A{, , , , , , , },
			0xB2: TCNT2{, , , , , , , },
			0xB1: TCCR2B{FOC2A, FOC2B, , , WGM22, CS22, CS21, CS20},
			0xB0: TCCR2A{COM2A1, COM2A0, COM2B1, COM2B0, , , WGM21, WGM20},
			0x8B: OCR1BH{, , , , , , , },
			0x8A: OCR1BL{, , , , , , , },
			0x89: OCR1AH{, , , , , , , },
			0x88: OCR1AL{, , , , , , , },
			0x87: ICR1H{, , , , , , , },
			0x86: ICR1L{, , , , , , , },
			0x85: TCNT1H{, , , , , , , },
			0x84: TCNT1L{, , , , , , , },
			0x82: TCCR1C{FOC1A, FOC1B, , , , , , },
			0x81: TCCR1B{ICNC1, ICES1, , WGM13, WGM12, CS12, CS11, CS10},
			0x80: TCCR1A{COM1A1, COM1A0, COM1B1, COM1B0, , , WGM11, WGM10},
			0x7F: DIDR1{, , , , , , AIN1D, AIN0D},
			0x7E: DIDR0{, , ADC5D, ADC4D, ADC3D, ADC2D, ADC1D, ADC0D},
			0x7C: ADMUX{REFS1, REFS0, ADLAR, , MUX3, MUX2, MUX1, MUX0},
			0x7B: ADCSRB{, ACME, , , , ADTS2, ADTS1, ADTS0},
			0x7A: ADCSRA{ADEN, ADSC, ADATE, ADIF, ADIE, ADPS2, ADPS1, ADPS0},
			0x79: ADCH{, , , , , , , },
			0x78: ADCL{, , , , , , , },
			0x70: TIMSK2{, , , , , OCIE2B, OCIE2A, TOIE2},
			0x6F: TIMSK1{, , ICIE1, , , OCIE1B, OCIE1A, TOIE1},
			0x6E: TIMSK0{, , , , , OCIE0B, OCIE0A, TOIE0},
			0x6D: PCMSK2{PCINT23, PCINT22, PCINT21, PCINT20, PCINT19, PCINT18, PCINT17, PCINT16},
			0x6C: PCMSK1{, PCINT14, PCINT13, PCINT12, PCINT11, PCINT10, PCINT9, PCINT8},
			0x6B: PCMSK0{PCINT7, PCINT6, PCINT5, PCINT4, PCINT3, PCINT2, PCINT1, PCINT0},
			0x69: EICRA{, , , , ISC11, ISC10, ISC01, ISC00},
			0x68: PCICR{, , , , , PCIE2, PCIE1, PCIE0},
			0x66: OSCCAL{, , , , , , , },
			0x64: PRR{PRTWI, PRTIM2, PRTIM0, , PRTIM1, PRSPI, PRUSART0, PRADC},
			0x61: CLKPR{CLKPCE, , , , CLKPS3, CLKPS2, CLKPS1, CLKPS0},
			0x60: WDTCSR{WDIF, WDIE, WDP3, WDCE, WDE, WDP2, WDP1, WDP0},
			0x3F: SREG{I, T, H, S, V, N, Z, C},
			0x3E: SPH{, , , , , SP10, SP9, SP8},
			0x3D: SPL{SP7, SP6, SP5, SP4, SP3, SP2, SP1, SP0},
			0x37: SPMCSR{SPMIE, RWWSB, , RWWSRE, BLBSET, PGWRT, PGERS, SELFPRGEN},
			0x35: MCUCR{, BODS, BODSE, PUD, , , IVSEL, IVCE},
			0x34: MCUSR{, , , , WDRF, BORF, EXTRF, PORF},
			0x33: SMCR{, , , , SM2, SM1, SM0, SE},
			0x30: ACSR{ACD, ACBG, ACO, ACI, ACIE, ACIC, ACIS1, ACIS0},
			0x2E: SPDR{, , , , , , , },
			0x2D: SPSR{SPIF, WCOL, , , , , , SPI2X},
			0x2C: SPCR{SPIE, SPE, DORD, MSTR, CPOL, CPHA, SPR1, SPR0},
			0x2B: GPIOR2{, , , , , , , },
			0x2A: GPIOR1{, , , , , , , },
			0x28: OCR0B{, , , , , , , },
			0x27: OCR0A{, , , , , , , },
			0x26: TCNT0{, , , , , , , },
			0x25: TCCR0B{FOC0A, FOC0B, , , WGM02, CS02, CS01, CS00},
			0x24: TCCR0A{COM0A1, COM0A0, COM0B1, COM0B0, , , WGM01, WGM00},
			0x23: GTCCR{TSM, , , , , , PSRASY, PSRSYNC},
			0x22: EEARH{, , , , , , , },
			0x21: EEARL{, , , , , , , },
			0x20: EEDR{, , , , , , , },
			0x1F: EECR{, , EEPM1, EEPM0, EERIE, EEMPE, EEPE, EERE},
			0x1E: GPIOR0{, , , , , , , },
			0x1D: EIMSK{, , , , , , INT1, INT0},
			0x1C: EIFR{, , , , , , INTF1, INTF0},
			0x1B: PCIFR{, , , , , PCIF2, PCIF1, PCIF0},
			0x17: TIFR2{, , , , , OCF2B, OCF2A, TOV2},
			0x16: TIFR1{, , ICF1, , , OCF1B, OCF1A, TOV1},
			0x15: TIFR0{, , , , , OCF0B, OCF0A, TOV0},
			0x0B: PORTD{PORTD7, PORTD6, PORTD5, PORTD4, PORTD3, PORTD2, PORTD1, PORTD0},
			0x0A: DDRD{DDD7, DDD6, DDD5, DDD4, DDD3, DDD2, DDD1, DDD0},
			0x09: PIND{PIND7, PIND6, PIND5, PIND4, PIND3, PIND2, PIND1, PIND0},
			0x08: PORTC{, PORTC6, PORTC5, PORTC4, PORTC3, PORTC2, PORTC1, PORTC0},
			0x07: DDRC{, DDC6, DDC5, DDC4, DDC3, DDC2, DDC1, DDC0},
			0x06: PINC{, PINC6, PINC5, PINC4, PINC3, PINC2, PINC1, PINC0},
			0x05: PORTB{PORTB7, PORTB6, PORTB5, PORTB4, PORTB3, PORTB2, PORTB1, PORTB0},
			0x04: DDRB{DDB7, DDB6, DDB5, DDB4, DDB3, DDB2, DDB1, DDB0},
			0x03: PINB{PINB7, PINB6, PINB5, PINB4, PINB3, PINB2, PINB1, PINB0}
		}
		
		package MLF32 {
			PD3(1){PCINT19,OC2B,INT1},
			PD4(2){PCINT20,XCK,T0},
			GND(3),
			VCC(4),
			GND(5),
			VCC(6),
			PB6(7){PCINT6,XTAL1,TOSC1},
			PB7(8){PCINT7,XTAL2,TOSC2},
			PD5(9){PCINT21,OC0B,T1},
			PD6(10){PCINT22,OC0A,AIN0},
			PD7(11){PCINT23,AIN1},
			PB0(12){PCINT0,CLKO,ICP1},
			PB1(13){PCINT1,OC1A},
			PB2(14){PCINT2,SS,OC1B},
			PB3(15){PCINT3,OC2A,MOSI},
			PB4(16){PCINT4,MISO},
			PB5(17){SCK,PCINT5},
			AVCC(18),
			ADC6(19),
			AREF(20),
			GND(21),
			ADC7(22),
			PC0(23){ADC0,PCINT8},
			PC1(24){ADC1,PCINT9},
			PC2(25){ADC2,PCINT10},
			PC3(26){ADC3,PCINT11},
			PC4(27){ADC4,SDA,PCINT12},
			PC5(28){ADC5,SCL,PCINT13},
			PC6(29){RESET,PCINT14},
			PD0(30){RXD,PCINT16},
			PD1(31){TXD,PCINT17},
			PD2(32){INT0,PCINT18}
		}
		package TQFP32 {
			PD3(1){PCINT19,OC2B,INT1},
			PD4(2){PCINT20,XCK,T0},
			GND(3),
			VCC(4),
			GND(5),
			VCC(6),
			PB6(7){PCINT6,XTAL1,TOSC1},
			PB7(8){PCINT7,XTAL2,TOSC2},
			PD5(9){PCINT21,OC0B,T1},
			PD6(10){PCINT22,OC0A,AIN0},
			PD7(11){PCINT23,AIN1},
			PB0(12){PCINT0,CLKO,ICP1},
			PB1(13){PCINT1,OC1A},
			PB2(14){PCINT2,SS,OC1B},
			PB3(15){PCINT3,OC2A,MOSI},
			PB4(16){PCINT4,MISO},
			PB5(17){SCK,PCINT5},
			AVCC(18),
			ADC6(19),
			AREF(20),
			GND(21),
			ADC7(22),
			PC0(23){ADC0,PCINT8},
			PC1(24){ADC1,PCINT9},
			PC2(25){ADC2,PCINT10},
			PC3(26){ADC3,PCINT11},
			PC4(27){ADC4,SDA,PCINT12},
			PC5(28){ADC5,SCL,PCINT13},
			PC6(29){RESET,PCINT14},
			PD0(30){RXD,PCINT16},
			PD1(31){TXD,PCINT17},
			PD2(32){INT0,PCINT18}			
		}
		package DIP {
			PC6(1){PCINT14,RESET},
			PD0(2){PCINT16,RXD},
			PD1(3){PCINT17,TXD},
			PD2(4){PCINT18,INT0},
			PD3(5){PCINT19,OC2B,INT1},
			PD4(6){PCINT20,XCK,T0},
			VCC(7),
			GND(8),
			PB6(9){PCINT6,XTAL1,TOSC1},
			PB7(10){PCINT7,XTAL2,TOSC2},
			PD5(11){PCINT21,OC0B,T1},
			PD6(12){PCINT22,OC0A,AIN0},
			PD7(13){PCINT23,AIN1},
			PB0(14){PCINT0,CLKO,ICP1},
			PB1(15){OC1A,PCINT1},
			PB2(16){SS,OC1B,PCINT2},
			PB3(17){MOSI,OC2A,PCINT3},
			PB4(18){MISO,PCINT4},
			PB5(19){SCK,PCINT5},
			AVCC(20),
			AREF(21),
			GND(22),
			PC0(23){ADC0,PCINT8},
			PC1(24){ADC1,PCINT9},
			PC2(25){ADC2,PCINT10},
			PC3(26){ADC3,PCINT11},
			PC4(27){ADC4,SDA,PCINT12},
			PC5(28){ADC5,SCL,PCINT13}
		}
		package MLF28 {
			PD3(1){PCINT19,OC2B,INT1},
			PD4(2){PCINT20,XCK,T0},
			VCC(3),
			GND(4),
			PB6(5){PCINT6,XTAL1,TOSC1},
			PB7(6){PCINT7,XTAL2,TOSC2},
			PD5(7){PCINT21,OC0B,T1},
			PD6(8){PCINT22,OC0A,AIN0},
			PD7(9){PCINT23,AIN1},
			PB0(10){PCINT0,CLKO,ICP1},
			PB1(11){PCINT1,OC1A},
			PB2(12){PCINT2,SS,OC1B},
			PB3(13){PCINT3,OC2A,MOSI},
			PB4(14){PCINT4,MISO},
			PB5(15){SCK,PCINT5},
			AVCC(16),
			AREF(17),
			GND(18),
			PC0(19){ADC0,PCINT8},
			PC1(20){ADC1,PCINT9},
			PC2(21){ADC2,PCINT10},
			PC3(22){ADC3,PCINT11},
			PC4(23){ADC4,SDA,PCINT12},
			PC5(24){ADC5,SCL,PCINT13},
			PC6(25){RESET,PCINT14},
			PD0(26){RXD,PCINT16},
			PD1(27){TXD,PCINT17},
			PD2(28){INT0,PCINT18}
		}
	}
}
