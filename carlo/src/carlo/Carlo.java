package carlo;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;


public class Carlo {
	
	private static ArrayList<String> elenCarlo;
	private static ArrayList<String> elenCarloXXX;
	private static BufferedReader in;
	
	
	public static void popolaLista() {
		elenCarlo.add("montecarlo");
		elenCarlo.add("caricarlo");
		elenCarlo.add("coricarlo");
		elenCarlo.add("moltiplicarlo");
		elenCarlo.add("marcarlo");
		elenCarlo.add("imbucarlo");
		elenCarlo.add("svaccarlo");
		elenCarlo.add("ubriacarlo");
		elenCarlo.add("masticarlo");
		elenCarlo.add("ubicarlo");
		elenCarlo.add("ammaccarlo");
		elenCarlo.add("orticarlo");
		elenCarlo.add("paracarlo");
		elenCarlo.add("er pizzicarlo");
		elenCarlo.add("tizio carlo e semprone");
		elenCarlo.add("la casa di carlo");
		elenCarlo.add("affumicarlo");
		elenCarlo.add("mancarlo");
		elenCarlo.add("supermercarlo");
		elenCarlo.add("sbancarlo");
		elenCarlo.add("sbiancarlo");
		elenCarlo.add("avvocarlo");
		elenCarlo.add("avocarlo");
		elenCarlo.add("significarlo");
		elenCarlo.add("prevaricarlo");
		elenCarlo.add("stoccarlo");
		elenCarlo.add("sto gran carlo");
		elenCarlo.add("abbarbicarlo");
		elenCarlo.add("abboccarlo");
		elenCarlo.add("imboccarlo");
		elenCarlo.add("imboscarlo");
		elenCarlo.add("accalcarlo");
		elenCarlo.add("accavalcarlo");
		elenCarlo.add("scroccarlo");
		elenCarlo.add("accecarlo");
		elenCarlo.add("addomesticarlo (ft. piccolo principe)");
		elenCarlo.add("adescarlo");
		elenCarlo.add("affiancarlo");
		elenCarlo.add("affrancarlo");
		elenCarlo.add("affrescarlo");
		elenCarlo.add("aggiudicarlo");
		elenCarlo.add("giudicarlo");
		elenCarlo.add("allocarlo TOP");
		elenCarlo.add("ammanicarlo");
		elenCarlo.add("ammiccarlo");
		elenCarlo.add("ammaccarlo");
		elenCarlo.add("amplificarlo");
		elenCarlo.add("calcarlo");
		elenCarlo.add("anticalcarlo");
		elenCarlo.add("appacificarlo");
		elenCarlo.add("appiccarlo");
		elenCarlo.add("appiccicarlo");
		elenCarlo.add("applicarlo");
		elenCarlo.add("arrampicarlo");
		elenCarlo.add("arrecarlo");
		elenCarlo.add("arrancarlo");
		elenCarlo.add("arrisicarlo");
		elenCarlo.add("arroccarlo");
		elenCarlo.add("attaccarlo");
		elenCarlo.add("attraccarlo");
		elenCarlo.add("auspicarlo");
		elenCarlo.add("autenticarlo");
		elenCarlo.add("certificarlo");
		elenCarlo.add("azzeccarlo");
		elenCarlo.add("bacarlo");
		elenCarlo.add("sbaraccarlo");
		elenCarlo.add("barricarlo");
		elenCarlo.add("battibeccarlo");
		elenCarlo.add("bazzicarlo");
		elenCarlo.add("mozzicarlo");
		elenCarlo.add("beatificarlo SE VABBEH");
		elenCarlo.add("beccarlo");
		elenCarlo.add("bonificarlo");
		elenCarlo.add("biascicarlo");
		elenCarlo.add("biforcarlo");
		elenCarlo.add("bivaccarlo");
		elenCarlo.add("bloccarlo");
		elenCarlo.add("braccarlo");
		elenCarlo.add("sbroccarlo (male)");
		elenCarlo.add("brucarlo");
		elenCarlo.add("brulicarlo");
		elenCarlo.add("bucarlo");
		elenCarlo.add("abbuscarlo");
		elenCarlo.add("cacarlo AHAH");
		elenCarlo.add("cascarlo");
		elenCarlo.add("cementificarlo WE FAI OCCHIO");
		elenCarlo.add("cercarlo");
		elenCarlo.add("schimicarlo ft. Danilo");
		elenCarlo.add("cioccarlo");
		elenCarlo.add("classificarlo");
		elenCarlo.add("cliccarlo");
		elenCarlo.add("codificarlo");
		elenCarlo.add("collocarlo");
		elenCarlo.add("complicarlo");
		elenCarlo.add("comunicarlo");
		elenCarlo.add("conficcarlo ft. my beloved coltellooo");
		elenCarlo.add("confiscarlo");
		elenCarlo.add("indicarlo");
		elenCarlo.add("replicarlo");
		elenCarlo.add("convocarlo");
		elenCarlo.add("corcarlo (di mazzate)");
		elenCarlo.add("cornificarlo SORRY :(");
		elenCarlo.add("craccarlo (e carlo craccarlo? carloception)");
		elenCarlo.add("criticarlo");
		elenCarlo.add("cuccarlo");
		elenCarlo.add("imbacuccarlo");
		elenCarlo.add("damascarlo");
		elenCarlo.add("amplificarlo");
		elenCarlo.add("defecarlo");
		elenCarlo.add("imprecarlo");
		elenCarlo.add("de/umidificarlo");
		elenCarlo.add("disboscarlo");
		elenCarlo.add("dimenticarlo");
		elenCarlo.add("sradicarlo");
		elenCarlo.add("nevicarlo");
		elenCarlo.add("affumicarlo");
		elenCarlo.add("ubicarlo");
		elenCarlo.add("intossicarlo");
		elenCarlo.add("rosicarlo");
		elenCarlo.add("scomunicarlo");
		elenCarlo.add("spiluccarlo");
		elenCarlo.add("spizzicarlo");
		elenCarlo.add("incespicarlo");
		elenCarlo.add("rampicarlo");
		elenCarlo.add("zoppicarlo");
		elenCarlo.add("sbrilluccicarlo ft. Edward Cullen");
		elenCarlo.add("pioviccicarlo");
		elenCarlo.add("spiaccicarlo");
		elenCarlo.add("abdicarlo");
		elenCarlo.add("predicarlo (bene e razzolare male)");
		elenCarlo.add("vendicarlo MUAHAHA");
		elenCarlo.add("indicarlo");
		elenCarlo.add("spregiudicarlo");
		elenCarlo.add("pregiudicarlo");
		elenCarlo.add("intricarlo");
		elenCarlo.add("lastricarlo");
		elenCarlo.add("fabbricarlo");
		elenCarlo.add("pubblicarlo su insta");
		elenCarlo.add("implicarlo =>");
		elenCarlo.add("(solo che pensavo a quanto è inutile) farneticarlo");
		elenCarlo.add("faticarlo");
		elenCarlo.add("sgrammaticarlo");
		elenCarlo.add("sofisticarlo");
		elenCarlo.add("trafficarlo ft. Johnny Stecchino @ Palemmo");
		elenCarlo.add("narcotrafficarlo");
		elenCarlo.add("mummificarlo (ricetta wurstel + pasta frolla)");
		elenCarlo.add("specificarlo");
		elenCarlo.add("falsificarlo");
		elenCarlo.add("modificarlo");
		elenCarlo.add("riqualificarlo come le panche");
		elenCarlo.add("panificarlo TOP per lockdown 2");
		elenCarlo.add("sanificarlo AMUCHINAAA");
		elenCarlo.add("tonificarlo (forse va in XXX)");
		elenCarlo.add("sacrificarlo");
		elenCarlo.add("plastificarlo");
		elenCarlo.add("sicarlo");
		elenCarlo.add("corso siccarlo");
		elenCarlo.add("educarlo ft. Sabrina");
		elenCarlo.add("evocarlo");
		elenCarlo.add("sbucarlo");
		elenCarlo.add("baccalà mantecarlo");
		elenCarlo.add("intersecarlo");
		elenCarlo.add("sprecarlo NON SI FAAA");
		elenCarlo.add("ipotecarlo OCCHIOO");
		elenCarlo.add("sbracarlo");
		elenCarlo.add("placarlo");
		elenCarlo.add("stomacarlo");
		elenCarlo.add("sporcarlo");
		elenCarlo.add("cercarlo (il nome)");
		elenCarlo.add("imbarcarlo MAGARYYY :c");
		elenCarlo.add("giuocarlo");
		elenCarlo.add("soffocarlo");
		elenCarlo.add("traslocarlo... vabbè");
		elenCarlo.add("trincarlo TCT ft. NPZ");
		elenCarlo.add("stroncarlo");
		elenCarlo.add("impanicarlo ft. la sottoscritta");
		elenCarlo.add("mancarlo (non se è una lattina al luna park)");
		elenCarlo.add("intascarlo ft. accendino");
		elenCarlo.add("ricascarlo (es. ci son cascato di nuovo)");
		elenCarlo.add("pescarlo");
		elenCarlo.add("imbacuccarlo");
		elenCarlo.add("struccarlo (il male di vivere quando è tardi e ti accorgi che devi fare questo al viso)");
		elenCarlo.add("che peccarlo");
		elenCarlo.add("paccarlo");
		elenCarlo.add("spaccarlo");
		elenCarlo.add("ammaccarlo ft. io che guido per la gioia dei carrozziery");
		elenCarlo.add("tabaccarlo");
		elenCarlo.add("impasticcarlo");
		elenCarlo.add("shoccarlo");
		elenCarlo.add("bloccarlo (...)");
		elenCarlo.add("ritoccarlo NO VABBE' QUESTO NO CHE NON E' CAPACE");
		elenCarlo.add("scoccarlo della mezzanotte e torniamo a casa con cenerentola (decreto 18 ottobre 2020)");
		elenCarlo.add("taroccarlo");
		elenCarlo.add("sboccarlo");
		elenCarlo.add("abboccarlo");
		elenCarlo.add("maleducarlo - Achille Lauro");

	}
	
	public static void popolaListaX() {
		elenCarloXXX.add("sucarlo a un pruno");
		elenCarloXXX.add("cavalcarlo");
		elenCarloXXX.add("ficcarlo");
		elenCarloXXX.add("fornicarlo");
		elenCarloXXX.add("solleticarlo");
		elenCarloXXX.add("lubrificarlo");
		elenCarloXXX.add("secarlo");
		elenCarloXXX.add("slumacarlo");
		elenCarloXXX.add("provocarlo");
		elenCarloXXX.add("sfiancarlo");
		elenCarloXXX.add("leccarlo");
		elenCarloXXX.add("staccarlo MUAHAHA");
		elenCarloXXX.add("toccarlo");
	}
	
	public static void main(String[] args) throws IOException {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		String scelta = "";;
		
		elenCarlo = new ArrayList<String>();
		elenCarloXXX = new ArrayList<String>();
		
		popolaLista();
		popolaListaX();
		
		Random r = new Random();	
		
		do {
			System.out.println("Vuoi un nome normale o un nome XXX?\n1 - normale\n2 - xxx");
			
			scelta = in.readLine();
			
			switch(scelta) {
				case "1":{
					String carlo = scegliCarloACaso();
					System.out.println("Quale sarà il prossimo nome di insta di Carlo?");
//					for(String c : elenCarlo) {
//						System.out.println(elenCarlo.indexOf(c)+") "+c);
//					}
//					System.out.println("Il nome sarà:");
					System.out.println(carlo);
					System.out.println();
					break;

				}
				case "2":{
					String carlo = scegliCarloXXXACaso();
					System.out.println("Quale sarà il prossimo nome XXX di insta di Carlo?");
//					for(String c : elenCarloXXX) {
//						System.out.println(elenCarloXXX.indexOf(c)+") "+c);
//					}
//					System.out.println("Il nome sarà:");
					System.out.println(carlo);
					System.out.println();
					break;
				}
			}
		}while(scelta!="0");
			
		
	}
	
	
	public static String scegliCarloACaso() {
		
		Random r = new Random();
		int index = r.nextInt(elenCarlo.size());
		
		return elenCarlo.get(index);
		
	}
	
	public static String scegliCarloXXXACaso() {
		
		Random r = new Random();
		int index = r.nextInt(elenCarloXXX.size());
		
		return elenCarloXXX.get(index);
		
	}

}
