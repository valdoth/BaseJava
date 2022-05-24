
public class IfSwitchCompare {
	
	public static final int NB_LOOP_IF_SWITCH = 1_000_000_000;
	
	public static void TestIfSwitch_if() {
		int nbMod0 = 0;
		int nbMod1 = 0;
		int nbMod2 = 0;
		int nbMod3 = 0;
		int nbMod4 = 0;
		int nbMod5 = 0;
		int nbMod6 = 0;
		int nbMod7 = 0;
		int nbMod8 = 0;
		int nbMod9 = 0;
		
		int value = 0;
		for(int i=0; i<NB_LOOP_IF_SWITCH; i++) {
			value = i%10;
			if (value == 0) {
				nbMod0++;
			} else if(value == 1) {
				nbMod1++;
			} else if(value == 2) {
				nbMod2++;
			} else if(value == 3) {
				nbMod3++;
			} else if(value == 4) {
				nbMod4++;
			} else if(value == 5) {
				nbMod5++;
			} else if(value == 6) {
				nbMod6++;
			} else if(value == 7) {
				nbMod7++;
			} else if(value == 8) {
				nbMod8++;
			} else if(value == 9) {
				nbMod9++;
			}
		}
		
		System.out.printf("%s - %s - %s - %s - %s - %s - %s - %s - %s - %s", 
				nbMod0, nbMod1, nbMod2, nbMod3, nbMod4, nbMod5, nbMod6, nbMod7, nbMod8, nbMod9);
		
	}
	
	public static void TestIfSwitch_switch() {
		int nbMod0 = 0;
		int nbMod1 = 0;
		int nbMod2 = 0;
		int nbMod3 = 0;
		int nbMod4 = 0;
		int nbMod5 = 0;
		int nbMod6 = 0;
		int nbMod7 = 0;
		int nbMod8 = 0;
		int nbMod9 = 0;
		
		int value = 0;
		for(int i=0; i<NB_LOOP_IF_SWITCH; i++) {
			value = i%10;
			switch(value) {
				case 0: nbMod0++;break;
				case 1: nbMod1++;break;
				case 2: nbMod2++;break;
				case 3: nbMod3++;break;
				case 4: nbMod4++;break;
				case 5: nbMod5++;break;
				case 6: nbMod6++;break;
				case 7: nbMod7++;break;
				case 8: nbMod8++;break;
				case 9: nbMod9++;break;
				default: break;
			}
		}
		
		System.out.printf("%s - %s - %s - %s - %s - %s - %s - %s - %s - %s", 
				nbMod0, nbMod1, nbMod2, nbMod3, nbMod4, nbMod5, nbMod6, nbMod7, nbMod8, nbMod9);
		
	}

	public static void main(String[] args) {
		
		TestIfSwitch_if();
		System.out.println();
		System.out.println();
		TestIfSwitch_switch();
	
	}

}
