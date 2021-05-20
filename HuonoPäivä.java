package tehtavat;

//Ohjelman k�ytt��n tuodaan Scanner-luokka.
import java.util.Scanner;

public class HuonoP�iv� {
	// Toimintoja on eroteltu omiksi aliohjelmikseen niin, ett� main metodista saatiin 
	// mahdollisimman yksinkertainen. Aliohjelmia kutsutaan tarvittaessa.	
		private static void terve() {

			Scanner lukemista = new Scanner(System.in);
			// T�ss� tulostettavat merkkijonot on jaettu moneen eri tulostukseen eik�
			// erotettu \n rivinvaihtoa k�ytt�en
			// jotta minun olisi n�pp�r�mpi muokata sis�lt��.
			System.out.println("\tHUONO P�IV�\n*****     *****     *****");
			System.out.println(
					"Olet hakenut t�it� NASAlta, toivot kovasti p��sy� asteroidilennolle 2025 ja Marsin lennolle 2030-luvulla.");
			System.out.println(
					"Tiell�si kohti t�hti� on en�� ty�haastattelu, jossa on oltava paikalla ajoissa, siistin� ja tietenkin");
			System.out.println(
					"vastattava kysymyksiin hyvin. Mieti siis tarkkaan, mit� aamun aikana teet! Vaihtoehtoja on jokaisessa ");
			System.out.println("tilanteessa aina kolme, ja vain yksi vaihtoehdoista vie t�ysin ongelmitta eteenp�in. ");
			System.out.println("Paina enter aloittaaksesi pelin.");
			System.out.println("***** ");
			lukemista.nextLine();
			

			System.out.println(
					"Onnea peliin, muista v�ltt�� sotkua ja my�h�stymist�. Se voi kuitenkin olla vaikeaa, sill� sinulla on HUONO P�IV�!");
			System.out.println("***** ");

		}

	// My�h�stymist� testataan jokaisen kysymyksen j�lkeen. Mik�li int myohassa saa 
	// tarpeeksi suuren arvon, siirryt��n myohastyit() -metodiin ja peli p��ttyy..
		private static void myohastyit() {
			System.out.println("***\nVoi harmi, olet jo niin paljon my�h�ss� ettet p��se edes ty�haastatteluun saakka!");
			System.exit(0);
		}

	// Sottaisuutta testataan kymmenen kysymyksen j�lkeen, mik�li Mik�li int sotku 
	// saa tarpeeksi suuren arvon, siirryt��n sottainen() -metodiin ja peli p��ttyy.
		private static void sottainen() {
			System.out.println(
					"***\nEhdit ty�haastatteluun. Olet kuitenkin kaiken toilailusi j�ljilt� niin sottainen, ett� arvasit varmasti itsekin, \nettei sinua palkata.");
			System.exit(0);
		}

	// Mik�li int sotku tai int myohassa eiv�t ole saaneet liian suuria arvoja, 
	// pelaaja p��see peliss� kysymyksiin 11-13, jota ennen siirryt��n metodiin
	// tyohaastattelu() joka tulostaa ruudulle viestin onnistumisesta.
		private static void tyohaastattelu() {
			System.out.println("***\nMahtavaa, ehdit ajoissa ty�haastatteluun etk� edes ole mahdottoman ep�siisti!");
		}

	//Kysymyksien 11-13 j�lkeen testataan haastattelun onnistumista. Mik�li int onnistuminen saa liian pienen arvon,
	//siirryt��n haastatteluhuonosti() metodiin ja peli p��ttyy.
		private static void haastatteluhuonosti() {
			System.out.println(
					"***\nVoi voi, haastattelu ei mennyt ihan putkeen ja valinta ei kohdistunut t�ll� kertaa sinuun.");
			System.exit(0);
		}

	// Jos taas int onnistuminen saa tarpeeksi suuren arvon, siirryt��n haastatteluhyvin() metodiin joka tulostaa ruudulle
	// onnittelut pelin l�p�isemisest� ja sitten siirryt��n takaisin p��metodiin (ja peli p��ttyy koska p��metodi p��ttyy).
		private static void haastatteluhyvin() {
			System.out.println("***\nOnneksi olkoon! Ty� on sinun, avaruus odottaa.");
		}

		public static void main(String[] args) {
			// Main -metodiin luodaan Scanner-olio, ja asetetaan se muuttujan
			// lukija arvoksi.
			Scanner lukija = new Scanner(System.in);

			// T�ss� esitell��n int- muuttujat, jotka kasvavat pelin aikana pelaajan
			// vastausten perusteella. Kahta ensimm�ist� k�ytet��n kysymyksiss� 1-10,
			// viimeisint� kysymyksiss� 11-13. En halunnut laittaa niit� luetteloksi
			// koska koin t�m�n merkitsemistavan selke�mm�ksi.
			int sotku = 0;
			int myohassa = 0;
			int onnistuminen = 0;

			// T�ss� esitell��n String oliot, joihin tallennetaan pelaajan vastaukset.
			String vastaus1;
			String vastaus2;
			String vastaus3;
			String vastaus4;
			String vastaus5;
			String vastaus6;
			String vastaus7;
			String vastaus8;
			String vastaus9;
			String vastaus10;
			String vastaus11;
			String vastaus12;
			String vastaus13;

			// Aliohjelma kutsutaan tervehtim��n pelaajaa ja kuvaamaan lyhyesti pelin
			// ideaa.
			terve();

			// P��ohjelma on hyvin yksinkertainen, se koostuu do-while toistolauseista ja
			// niiden sis�ll�
			// olevista if-else valintarakenteista, int sotku, myohassa ja onnistuminen
			// -arvojen suuruuden
			// testaamisesta sek� aliohjelmien kutsumisesta tarpeen mukaan.
			do {

				System.out.println(
						"\nNyt on t�rke� aamu. Ty�haastattelu on parin tunnin p��st�, mutta her�tyskellon soidessa viel� v�sytt�isi. \nMik� houkuttaa eniten: YL�S NOUSEMINEN, TORKUTUS vai KYLJEN K��NT�MINEN?");
				// Olio lukija kutsuu metodia nextLine, joka palauttaa sy�tteen� annetun rivin.
				// Mik�li pelaaja vastaa "yl�s nouseminen", kasvatetaan arvoa int sotku yhdell�.
				vastaus1 = lukija.nextLine();
				if (vastaus1.equalsIgnoreCase("yl�s nouseminen")) {
					sotku++;
					System.out.println(
							"Liian v�h�iset y�unet saivat silm�si verest�m��n. N�yt�t kielt�m�tt� aika ep�siistilt�.");
					break;
				} else if (vastaus1.equalsIgnoreCase("kyljen k��nt�minen")) {
					// Mik�li pelaaja vastaa "kyljen k��nt�minen", kasvatetaan arvoa int myohassa
					// nelj�ll�. Kysymyksiss� 2-9 arvo kasvaa maksimissaan yhdell�.
					myohassa = +4;
					System.out.println("Nukuit sitten puolille p�ivin suljettuasi her�tyskellon ja k��nnetty�si kylke�!");
					break;
				} else if (vastaus1.equalsIgnoreCase("torkutus")) {
					// Mik�li pelaaja vastaa "torkutus", ei kasvateta mit��n arvoja, tulostetaan
					// vain ruudulle alla oleva viesti.
					System.out.println(
							"Torkutus oli hyv� vaihtoehto, her��t kymmenen minuutin kuluttua virke�n� ja valmiina p�iv�n haasteisiin.");
					break;
				} else {
					System.out.println();
					System.out.println("Nyt vastasit jotenkin hassusti. Katsotaanpa kysymyst� tarkemmin.");
				}
			} while (true);

			// My�h�stymist� eli int myohassa -luvun arvoa testataan jokaisen kysymyksen
			// j�lkeen. Mik�li myohassa on yht�suuri tai suurempi kuin 4, siirryt��n
			// aliohjelmaan myohastyit, joka ilmoittaa pelaajalle pelin p��ttymisest� ja
			// lopettaa ohjelman suorittamisen.

			// Periaatteessa ensimm�isest� kysymyksest� selvinnyt ei voi olla liian my�h�ss�
			// ennen viidett� kysymyst� (int myohassa on aluksi nolla ja kasvaa yhdell�
			// jokaisen my�h�stymiseen johtavan valinnan j�lkeen lukuunottamatta ensimm�ist�
			// kysymyst� jolloin se kasvaa kerralla nelj�ll� jos vastaa v��rin ja peli
			// p��ttyy) heti. Halusin kuitenkin lis�t� sen s��nn�llisesti jokaisen
			// kysymyksen
			// per��n, jotta peliin on my�hemmin helpompi tehd� mahdollisia muutoksia,
			// lis�ksi
			// koen s��nn�llisen� toistuvan rakenteen selke�mm�ksi.

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nKatsoessasi peiliin huomaat, ett� voisit n�ytt�� paremmaltakin. Miten pelastat tilanteen? \nVai auttaako t�h�n naamaan en�� mik��n? \nNyt on vaihtoehtoina SUIHKU, PARRANAJO ja LUOVUTTAMINEN.");
				vastaus2 = lukija.nextLine();
				if (vastaus2.equalsIgnoreCase("luovuttaminen")) {
					sotku++;
					System.out.println(
							"Huhhuh! Olisit kyll� voinut yritt�� edes jotain. Ei se p�rst� ainakaan pahemmaksi olisi voinut muuttua.");
					break;
				} else if (vastaus2.equalsIgnoreCase("suihku")) {
					myohassa++;
					System.out.println("Olet suihkun j�ljilt� puhdas, raikas ja aikataulusta j�ljess�.");
					break;
				} else if (vastaus2.equalsIgnoreCase("parranajo")) {
					System.out.println("Parranajollahan oli suuri vaikutus! Et n�yt� en�� sottaiselta rosvolta.");
					break;
				} else {
					System.out.println();
					System.out.println("Mik�s se kysymys olikaan?");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			// Halusin laittaa kysymyksiin vastausvaihtoehdot eri j�rjestyksiss� niin, ettei
			// selk�sti erotu monennenko vaihtoehdon vastaaminen tuottaa parhaan
			// lopputuloksen. Kuitenkin jokaisen do-while silmukan valintalauseet
			// ovat samassa j�rjestyksess� ohjelman l�hdekoodin
			// selkiytt�miseksi.
			do {

				System.out.println(
						"\nHaastatteluun on t�rke�� pukeutua hyvin. Otatko vaatteesi LATTIALTA, PYYKKINARULTA vai VAATEKAAPISTA?");
				vastaus3 = lukija.nextLine();
				if (vastaus3.equalsIgnoreCase("lattialta")) {
					sotku++;
					System.out.println(
							"Lattialla lojuneen vaatekasan p��llimm�isen� oli ryppyisi� ja ep�miellytt�v�lt� haiskahtavia vaatteita. \nToivottavasti ty�haastattelussa ei kiinnitet� siihen liikaa huomiota!");
					break;
				} else if (vastaus3.equalsIgnoreCase("vaatekaapista")) {
					myohassa++;
					System.out.println(
							"Vaatteiden valinnassa vaatekaapista kest�� aikaa, etk� huomaa katsoa kelloa. Onkohan sinulla liikaa \nvaatteita vai oletko vain p��tt�m�t�n");
					break;
				} else if (vastaus3.equalsIgnoreCase("pyykkinarulta")) {
					System.out.println(
							"Loistavaa! Pyykkinarulla oli puhtaita ja hyv�ntuoksuisia vaatteita. Niiss� kelpaa menn� haastateltavaksi.");
					break;
				} else {
					System.out.println();
					System.out.println("Vastaus oli virheellinen. Mietih�n viel�.");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			// Kuten viimeist��n t�ss� kohti huomaa, pelin mekaniikka toistaa itse��n pitkin
			// matkaa. Jokaisen kysymyksen kohdalla suoritetaan
			// samat toistolauseet.
			do {

				System.out.println("\nKenkien on sovittava asuun. Puetko TENNARIT, NAHKAKENG�T vai CROCSIT?");
				vastaus4 = lukija.nextLine();
				if (vastaus4.equalsIgnoreCase("Tennarit")) {
					sotku++;
					System.out.println(
							"Tennarit ovat melko kehno valinta, et kyll� onnistu n�ytt�m��n niiss� mill��n siistilt� ja asialliselta.");
					break;
				} else if (vastaus4.equalsIgnoreCase("nahkakeng�t")) {
					myohassa++;
					System.out.println(
							"Nahkakeng�t kaipaavat selv�sti lankkaamista. Vieh�n se aikaa, mutta tuntuu juuri nyt t�rke�lt�...");
					break;
				} else if (vastaus4.equalsIgnoreCase("crocsit")) {
					System.out.println(
							"Sukkien v�riset crocsit n�ytt�v�t yll�tt�en melko asiallisilta. Kummallinen, mutta ilmeisen oikea valinta");
					break;
				} else {
					System.out.println();
					System.out.println("Kenkien valinta tuottaa selv�sti haasteita. Yrit�s uudestaan!");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}
			// Vastausvaihtoehdot on tekstiss� kirjoitettu isoin kirjaimin
			// toimintavaihtoehtojen selkiytt�miseksi pelaajalle.
			// equalsIgnoreCase on k�yt�ss�, jotta fonttikoolla ei olisi merkityst�.
			do {

				System.out.println(
						"\nAamiaisen aika! P��t�t tehd� munakasta, mutta mink� linnun munista? VIIRI�ISEN, KANAN vai STRUTSIN?");
				vastaus5 = lukija.nextLine();
				if (vastaus5.equalsIgnoreCase("Kanan")) {
					sotku++;
					System.out.println(
							"Hups, osa munista rikkoutui hassusti ja paitaasi tuli pieni tahra. No, onneksi se on melko huomaamaton.");
					break;
				} else if (vastaus5.equalsIgnoreCase("Strutsin")) {
					myohassa++;
					System.out.println(
							"Miten ihmeess� strutsin munan saa rikki? Ei ollutkaan niin helppoa t�m�. \nYritetty�si k�sin, vasaralla ja lekalla huomaat hukanneesi uskomattoman paljon t�rkeit� minuutteja.");
					break;
				} else if (vastaus5.equalsIgnoreCase("viiri�isen")) {
					System.out.println(
							"Munakas oli kielt�m�tt� melko pieni, mutta herkullinen. P��t�t ostaa viiri�isen munia useammin heti kun NASA:n miljoonapalkat vy�ryv�t tilillesi.");
					break;
				} else {
					System.out.println();
					System.out.println("Mietih�n viel�!");
				}
				// Mik�li pelaaja vastaa jotain kummallista, tulostaa ohjelma yll�
				// olevan kaltaisen virheilmoituksen ja aloittaa do-while silmukan
				// alusta niin monta kertaa, ett� pelaaja lopulta antaa
				// kelvollisen vastauksen.
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println("\nOtatko palanpainikkeeksi KAHVIA, TEET� vai pelkk�� VETT�?");
				vastaus6 = lukija.nextLine();
				if (vastaus6.equalsIgnoreCase("vett�")) {
					sotku++;
					System.out.println(
							"Olisit selv�sti tarvinnut kofeiinia, nuo silm�pussit saavat sinut n�ytt�m��n homssuiselta.");
					break;
				} else if (vastaus6.equalsIgnoreCase("kahvia")) {
					myohassa++;
					System.out.println(
							"Pitik� hienostella itse jauhettujen kopi luwak -papujen kanssa? Se vei niin paljon aikaa, ett� t�st� \neteenp�in pit�� olla kellon kanssa tarkkana.");
					break;
				} else if (vastaus6.equalsIgnoreCase("teet�")) {
					System.out.println("Kyll�p�s Pirkan pussitee virkisti. T�st� on hyv� jatkaa!");
					break;
				} else {
					System.out.println();
					System.out.println("Hmm. Vastauksesi oli jollain tapaa virheellinen. Yritet��np� uudelleen!");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nP��t�t viel� etsi� tietoa NASAsta, jotta kuulostaisit ty�haastattelussa skarpilta. \nMist� etsit tietoa, WIKIPEDIASTA, NASAN SIVUILTA vai TIEDE-LEHDIST�?");
				vastaus7 = lukija.nextLine();
				if (vastaus7.equalsIgnoreCase("Tiede-lehdist�")) {
					sotku++;
					System.out.println(
							"Kaadat innostuksissasi huojuvat lehtipinot ja olet aivan paperip�lyss�. \nOlisikohan kannattanut s�ilytt�� lehti� muuten kuin isoissa, huojuvissa pinoissa?");
					break;
				} else if (vastaus7.equalsIgnoreCase("Wikipediasta")) {
					myohassa++;
					System.out.println(
							"Wikipediahan onkin mielenkiintoinen paikka. Klikkaat yhteen artikkeliin, sitten seuraavaan ja yh� seuraavaan. \nMuistathan vilkaista kelloa v�lill�!");
					break;
				} else if (vastaus7.equalsIgnoreCase("NASAn sivuilta")) {
					System.out.println(
							"NASAn sivut olivat niin tyls�t, ett� kyll�styt hetkess� eik� valmistautumiseen siten kulu liikaa aikaa. \nOnneksi todellisuus NASAlla ty�skentelyst� on j�nnitt�v�mp��, \net malta odottaa kohtaamisia avaruushirvi�iden kanssa!");
					break;
				} else {
					System.out.println();
					System.out.println(
							"Kurkataanpa vastausvaihtoehtoja uudelleen, ehk� saisit kertauksen my�t� annettua kelvollisen vastauksen.");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nJouni-kissa tulee py�rim��n jalkoihisi. P��t�tk� SILITT��, ANTAA HERKUN vai J�TT�� HUOMIOTTA?");
				vastaus8 = lukija.nextLine();
				if (vastaus8.equalsIgnoreCase("silitt��")) {
					sotku++;
					System.out.println(
							"Jouni-kissa kehr��, mutta vasta my�hemmin huomaat vaatteittesi olevan kissankarvojen peitossa. \nEhk� haastattelija ymm�rt��, voihan h�nell�kin olla kissa?");
					break;
				} else if (vastaus8.equalsIgnoreCase("j�tt�� huomiotta")) {
					myohassa++;
					System.out.println(
							"Nyt Jouni-kissa loukkaantui verisesti ja p��tti karata ikkunasta. \nSen per�ss� pihalla juokseminen vei hyv�n tovin kallista aikaasi.");
					break;
				} else if (vastaus8.equalsIgnoreCase("antaa herkun")) {
					System.out.println("Jouni-kissa pit�� herkuista ja alkaa hyrist� tyytyv�isen�.");
					break;
				} else {
					System.out.println();
					System.out.println("Kurkkaas viel� mit� vaihtoehtoja olikaan.");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nKohta pit�isi l�hte�. Kuinka aiot huolehtia perille l�yt�misest�? \nPRINTTAAMALLA KARTAN, LUOTTAMALLA VAISTOIHIN vai K�YTT�M�LL� KARTTASOVELLUSTA?");
				vastaus9 = lukija.nextLine();
				if (vastaus9.equalsIgnoreCase("printtaamalla kartan")) {
					sotku++;
					System.out.println(
							"Kartta kyll� toimii, mutta se olisi selv�sti pit�nyt printata jo aiemmin. \nK�siss�si on nyt mustetahroja joita et itse edes huomaa.");
					break;
				} else if (vastaus9.equalsIgnoreCase("k�ytt�m�ll� karttasovellusta")) {
					myohassa++;
					System.out.println(
							"Karttasovellus saa akkusi loppumaan heti ulkoportailla. \nKartatta olemisen aiheuttama h�t��nnys ja jahkailu kuluttaa kallisarvoista aikaasi.");
					break;
				} else if (vastaus9.equalsIgnoreCase("luottamalla vaistoihin")) {
					System.out.println(
							"Vaistosi ovat h�mment�v�n toimivat. Pysyt rauhallisena ja luottavaisena \neik� oikean suunnan p��tteleminen tule olemaan homma eik� mik��n.");
					break;
				} else {
					System.out.println();
					System.out.println(
							"Vaihtoehdot olivat kyll� aika pitki�. Keskityh�n, nyt tarvittaisiin kaksi sanaa vastaukseksi!");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println("\nMill� kuljet haastatteluun? PY�R�LL�, BUSSILLA vai AUTOLLA?");
				vastaus10 = lukija.nextLine();
				if (vastaus10.equalsIgnoreCase("py�r�ll�")) {
					sotku++;
					System.out.println(
							"Py�r�ily sujuu kielt�m�tt� nopeasti, mutta ohi ajava bussi roiskii kokonaisen l�t�k�n p��llesi!");
					break;
				} else if (vastaus10.equalsIgnoreCase("autolla")) {
					myohassa++;
					System.out.println(
							"L�yd�t haastattelupaikan ajoissa, mutta parkkipaikan etsiminen onkin sitten toinen juttu.");
					break;
				} else if (vastaus10.equalsIgnoreCase("bussilla")) {
					System.out.println(
							"Bussi kuljettaa sinut mukavasti perille. Matkalla ehdit jopa valmistautua haastatteluun.");
					break;
				} else {
					System.out.println();
					System.out.println("Vastaahan uudestaan hieman tarkemmin.");
				}
			} while (true);
			// myohastyit() ja sottainen() metodit kutsutaan vain mik�li arvo int myohassa
			// on suurempi kuin nelj� tai int sotku on suurempi kuin viisi.
			while (myohassa >= 4) {
				myohastyit();
			}

			while (sotku >= 5) {
				sottainen();
			}
			// Mik�li yll� olevien metodien kutsulle ei ole tarvetta, siirryt��n metodiin
			// tyohaastattelu().
			tyohaastattelu();

			// Kysymyksiss� 11-13 jokaisessa yksi vaihtoehto kasvattaa muuttujan int
			// onnistuminen arvoa.
			// Kysymyksest� 12 l�ytyy my�s poikkeuksellisesti vaihtoehto, joka laskee sen
			// arvoa.
			do {

				System.out.println(
						"\nHaastattelija kysyy, mik� sai sinut hakemaan NASAlle t�ihin. Mieless�si py�riv�t vastausvaihtoehdot \nAVARUUSHIRVI�T, KUULUISUUS ja URAKEHITYS. Mit� vastaat?");
				vastaus11 = lukija.nextLine();
				if (vastaus11.equalsIgnoreCase("avaruushirvi�t")) {
					onnistuminen++;
					System.out.println(
							"\"Mahtavaa!\" huudahtaa haastattelija. Tarvitsemmekin lis�� ihmisi� taisteluun avaruushirvi�it� vastaan.");
					break;
				} else if (vastaus11.equalsIgnoreCase("kuuluisuus")) {
					System.out.println(
							"Haastattelija vain mumisee ja siirtyy seuraavaan kysymykseen. T�m� ei tainnut olla hyv� vastaus?");
					break;
				} else if (vastaus11.equalsIgnoreCase("urakehitys")) {
					System.out.println(
							"\"Vastaathan seuraavaan kysymykseen jotain sellaista mit� emme kuule joka p�iv�,\" toteaa haastattelija.");
					break;
				} else {
					System.out.println();
					System.out.println("Luehan vastausvaihtoehdot viel� uudestaan.");
				}
			} while (true);

			do {

				System.out.println(
						"\n\"Mist� sait kuulla avoimesta ty�paikastamme?\" kysyy haastattelija. Vastaisitko totuuden, TELEPAATTISESTI \nAVARUUDESTA, vai valehtelisitko kuulleesi paikasta LEHDEST� tai NETIST�.");
				vastaus12 = lukija.nextLine();
				if (vastaus12.equalsIgnoreCase("netist�")) {
					onnistuminen++;
					System.out.println(
							"\"Osaat siis k�ytt�� tietokonetta,\" haastattelija sanoo iloisesti. Sit� taitoa meill� tarvitaankin.");
					break;
				} else if (vastaus12.equalsIgnoreCase("lehdest�")) {
					System.out.println(
							"Haastattelija n�ytt�� hieman tyytym�tt�m�lt�. He eiv�t nimitt�in ole julkaisseet ilmoitusta lehdess�. Hups!");
					break;
				} else if (vastaus12.equalsIgnoreCase("telepaattisesti avaruudesta")) {
					onnistuminen--;
					System.out.println(
							"No nyt oli selv�sti liian hullu vastaus. Haastattelija katsoo sinua j�rkyttyneen� p��t��n puistellen.");
					break;
				} else {
					System.out.println();
					System.out.println(
							"Yrit�h�n viel�. (Vinkki: vaihtoehdot olivat telepaattisesti avaruudesta, lehdest�, netist�.)");
				}
			} while (true);

			do {

				System.out.println(
						"\n\"Mik� on suurin vahvuutesi,\" kysyy ty�haastattelija viel� lopuksi. Vain yksi vahvuus! Mietit \nsanoisitko vahvuuteni on VAHVUUTENI ja kertoisit penkkipunnerrustuloksistasi, \nvastaisit TAISTELUTAITONI (joita olet harjoitellut pelaamalla tekstiseikkailupelej�) \nvai TIETONI AVARUUDESTA (sill� saathan jatkuvasti uutta telepaattista tietoa).");
				vastaus13 = lukija.nextLine();
				if (vastaus13.equalsIgnoreCase("vahvuuteni")) {
					onnistuminen++;
					System.out.println(
							"Haastattelija myh�ilee tyytyv�isen�. Penkkipunnerrusten tulokset taisivat vakuuttaa h�net.");
					break;
				} else if (vastaus13.equalsIgnoreCase("taistelutaitoni")) {
					System.out.println("T�m� ei tainnut vakuuttaa haastattelijaa.");
					break;
				} else if (vastaus13.equalsIgnoreCase("tietoni avaruudesta")) {
					System.out.println("Haastattelija n�ytt�� kyll�styneelt�. Ehk� nyt olisi kaivattu jotain muuta.");
					break;
				} else {
					System.out.println();
					System.out.println("Vastauksesi ei kelpaa");
				}
			} while (true);

			while (onnistuminen < 2) {
				haastatteluhuonosti();
			}

			haastatteluhyvin();

			lukija.close();

		}

	}
