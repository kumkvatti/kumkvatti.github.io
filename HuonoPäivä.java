package tehtavat;

//Ohjelman käyttöön tuodaan Scanner-luokka.
import java.util.Scanner;

public class HuonoPäivä {
	// Toimintoja on eroteltu omiksi aliohjelmikseen niin, että main metodista saatiin 
	// mahdollisimman yksinkertainen. Aliohjelmia kutsutaan tarvittaessa.	
		private static void terve() {

			Scanner lukemista = new Scanner(System.in);
			// Tässä tulostettavat merkkijonot on jaettu moneen eri tulostukseen eikä
			// erotettu \n rivinvaihtoa käyttäen
			// jotta minun olisi näppärämpi muokata sisältöä.
			System.out.println("\tHUONO PÄIVÄ\n*****     *****     *****");
			System.out.println(
					"Olet hakenut töitä NASAlta, toivot kovasti pääsyä asteroidilennolle 2025 ja Marsin lennolle 2030-luvulla.");
			System.out.println(
					"Tielläsi kohti tähtiä on enää työhaastattelu, jossa on oltava paikalla ajoissa, siistinä ja tietenkin");
			System.out.println(
					"vastattava kysymyksiin hyvin. Mieti siis tarkkaan, mitä aamun aikana teet! Vaihtoehtoja on jokaisessa ");
			System.out.println("tilanteessa aina kolme, ja vain yksi vaihtoehdoista vie täysin ongelmitta eteenpäin. ");
			System.out.println("Paina enter aloittaaksesi pelin.");
			System.out.println("***** ");
			lukemista.nextLine();
			

			System.out.println(
					"Onnea peliin, muista välttää sotkua ja myöhästymistä. Se voi kuitenkin olla vaikeaa, sillä sinulla on HUONO PÄIVÄ!");
			System.out.println("***** ");

		}

	// Myöhästymistä testataan jokaisen kysymyksen jälkeen. Mikäli int myohassa saa 
	// tarpeeksi suuren arvon, siirrytään myohastyit() -metodiin ja peli päättyy..
		private static void myohastyit() {
			System.out.println("***\nVoi harmi, olet jo niin paljon myöhässä ettet pääse edes työhaastatteluun saakka!");
			System.exit(0);
		}

	// Sottaisuutta testataan kymmenen kysymyksen jälkeen, mikäli Mikäli int sotku 
	// saa tarpeeksi suuren arvon, siirrytään sottainen() -metodiin ja peli päättyy.
		private static void sottainen() {
			System.out.println(
					"***\nEhdit työhaastatteluun. Olet kuitenkin kaiken toilailusi jäljiltä niin sottainen, että arvasit varmasti itsekin, \nettei sinua palkata.");
			System.exit(0);
		}

	// Mikäli int sotku tai int myohassa eivät ole saaneet liian suuria arvoja, 
	// pelaaja pääsee pelissä kysymyksiin 11-13, jota ennen siirrytään metodiin
	// tyohaastattelu() joka tulostaa ruudulle viestin onnistumisesta.
		private static void tyohaastattelu() {
			System.out.println("***\nMahtavaa, ehdit ajoissa työhaastatteluun etkä edes ole mahdottoman epäsiisti!");
		}

	//Kysymyksien 11-13 jälkeen testataan haastattelun onnistumista. Mikäli int onnistuminen saa liian pienen arvon,
	//siirrytään haastatteluhuonosti() metodiin ja peli päättyy.
		private static void haastatteluhuonosti() {
			System.out.println(
					"***\nVoi voi, haastattelu ei mennyt ihan putkeen ja valinta ei kohdistunut tällä kertaa sinuun.");
			System.exit(0);
		}

	// Jos taas int onnistuminen saa tarpeeksi suuren arvon, siirrytään haastatteluhyvin() metodiin joka tulostaa ruudulle
	// onnittelut pelin läpäisemisestä ja sitten siirrytään takaisin päämetodiin (ja peli päättyy koska päämetodi päättyy).
		private static void haastatteluhyvin() {
			System.out.println("***\nOnneksi olkoon! Työ on sinun, avaruus odottaa.");
		}

		public static void main(String[] args) {
			// Main -metodiin luodaan Scanner-olio, ja asetetaan se muuttujan
			// lukija arvoksi.
			Scanner lukija = new Scanner(System.in);

			// Tässä esitellään int- muuttujat, jotka kasvavat pelin aikana pelaajan
			// vastausten perusteella. Kahta ensimmäistä käytetään kysymyksissä 1-10,
			// viimeisintä kysymyksissä 11-13. En halunnut laittaa niitä luetteloksi
			// koska koin tämän merkitsemistavan selkeämmäksi.
			int sotku = 0;
			int myohassa = 0;
			int onnistuminen = 0;

			// Tässä esitellään String oliot, joihin tallennetaan pelaajan vastaukset.
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

			// Aliohjelma kutsutaan tervehtimään pelaajaa ja kuvaamaan lyhyesti pelin
			// ideaa.
			terve();

			// Pääohjelma on hyvin yksinkertainen, se koostuu do-while toistolauseista ja
			// niiden sisällä
			// olevista if-else valintarakenteista, int sotku, myohassa ja onnistuminen
			// -arvojen suuruuden
			// testaamisesta sekä aliohjelmien kutsumisesta tarpeen mukaan.
			do {

				System.out.println(
						"\nNyt on tärkeä aamu. Työhaastattelu on parin tunnin päästä, mutta herätyskellon soidessa vielä väsyttäisi. \nMikä houkuttaa eniten: YLÖS NOUSEMINEN, TORKUTUS vai KYLJEN KÄÄNTÄMINEN?");
				// Olio lukija kutsuu metodia nextLine, joka palauttaa syötteenä annetun rivin.
				// Mikäli pelaaja vastaa "ylös nouseminen", kasvatetaan arvoa int sotku yhdellä.
				vastaus1 = lukija.nextLine();
				if (vastaus1.equalsIgnoreCase("ylös nouseminen")) {
					sotku++;
					System.out.println(
							"Liian vähäiset yöunet saivat silmäsi verestämään. Näytät kieltämättä aika epäsiistiltä.");
					break;
				} else if (vastaus1.equalsIgnoreCase("kyljen kääntäminen")) {
					// Mikäli pelaaja vastaa "kyljen kääntäminen", kasvatetaan arvoa int myohassa
					// neljällä. Kysymyksissä 2-9 arvo kasvaa maksimissaan yhdellä.
					myohassa = +4;
					System.out.println("Nukuit sitten puolille päivin suljettuasi herätyskellon ja käännettyäsi kylkeä!");
					break;
				} else if (vastaus1.equalsIgnoreCase("torkutus")) {
					// Mikäli pelaaja vastaa "torkutus", ei kasvateta mitään arvoja, tulostetaan
					// vain ruudulle alla oleva viesti.
					System.out.println(
							"Torkutus oli hyvä vaihtoehto, heräät kymmenen minuutin kuluttua virkeänä ja valmiina päivän haasteisiin.");
					break;
				} else {
					System.out.println();
					System.out.println("Nyt vastasit jotenkin hassusti. Katsotaanpa kysymystä tarkemmin.");
				}
			} while (true);

			// Myöhästymistä eli int myohassa -luvun arvoa testataan jokaisen kysymyksen
			// jälkeen. Mikäli myohassa on yhtäsuuri tai suurempi kuin 4, siirrytään
			// aliohjelmaan myohastyit, joka ilmoittaa pelaajalle pelin päättymisestä ja
			// lopettaa ohjelman suorittamisen.

			// Periaatteessa ensimmäisestä kysymyksestä selvinnyt ei voi olla liian myöhässä
			// ennen viidettä kysymystä (int myohassa on aluksi nolla ja kasvaa yhdellä
			// jokaisen myöhästymiseen johtavan valinnan jälkeen lukuunottamatta ensimmäistä
			// kysymystä jolloin se kasvaa kerralla neljällä jos vastaa väärin ja peli
			// päättyy) heti. Halusin kuitenkin lisätä sen säännöllisesti jokaisen
			// kysymyksen
			// perään, jotta peliin on myöhemmin helpompi tehdä mahdollisia muutoksia,
			// lisäksi
			// koen säännöllisenä toistuvan rakenteen selkeämmäksi.

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nKatsoessasi peiliin huomaat, että voisit näyttää paremmaltakin. Miten pelastat tilanteen? \nVai auttaako tähän naamaan enää mikään? \nNyt on vaihtoehtoina SUIHKU, PARRANAJO ja LUOVUTTAMINEN.");
				vastaus2 = lukija.nextLine();
				if (vastaus2.equalsIgnoreCase("luovuttaminen")) {
					sotku++;
					System.out.println(
							"Huhhuh! Olisit kyllä voinut yrittää edes jotain. Ei se pärstä ainakaan pahemmaksi olisi voinut muuttua.");
					break;
				} else if (vastaus2.equalsIgnoreCase("suihku")) {
					myohassa++;
					System.out.println("Olet suihkun jäljiltä puhdas, raikas ja aikataulusta jäljessä.");
					break;
				} else if (vastaus2.equalsIgnoreCase("parranajo")) {
					System.out.println("Parranajollahan oli suuri vaikutus! Et näytä enää sottaiselta rosvolta.");
					break;
				} else {
					System.out.println();
					System.out.println("Mikäs se kysymys olikaan?");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			// Halusin laittaa kysymyksiin vastausvaihtoehdot eri järjestyksissä niin, ettei
			// selkästi erotu monennenko vaihtoehdon vastaaminen tuottaa parhaan
			// lopputuloksen. Kuitenkin jokaisen do-while silmukan valintalauseet
			// ovat samassa järjestyksessä ohjelman lähdekoodin
			// selkiyttämiseksi.
			do {

				System.out.println(
						"\nHaastatteluun on tärkeää pukeutua hyvin. Otatko vaatteesi LATTIALTA, PYYKKINARULTA vai VAATEKAAPISTA?");
				vastaus3 = lukija.nextLine();
				if (vastaus3.equalsIgnoreCase("lattialta")) {
					sotku++;
					System.out.println(
							"Lattialla lojuneen vaatekasan päällimmäisenä oli ryppyisiä ja epämiellyttävältä haiskahtavia vaatteita. \nToivottavasti työhaastattelussa ei kiinnitetä siihen liikaa huomiota!");
					break;
				} else if (vastaus3.equalsIgnoreCase("vaatekaapista")) {
					myohassa++;
					System.out.println(
							"Vaatteiden valinnassa vaatekaapista kestää aikaa, etkä huomaa katsoa kelloa. Onkohan sinulla liikaa \nvaatteita vai oletko vain päättämätön");
					break;
				} else if (vastaus3.equalsIgnoreCase("pyykkinarulta")) {
					System.out.println(
							"Loistavaa! Pyykkinarulla oli puhtaita ja hyväntuoksuisia vaatteita. Niissä kelpaa mennä haastateltavaksi.");
					break;
				} else {
					System.out.println();
					System.out.println("Vastaus oli virheellinen. Mietihän vielä.");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			// Kuten viimeistään tässä kohti huomaa, pelin mekaniikka toistaa itseään pitkin
			// matkaa. Jokaisen kysymyksen kohdalla suoritetaan
			// samat toistolauseet.
			do {

				System.out.println("\nKenkien on sovittava asuun. Puetko TENNARIT, NAHKAKENGÄT vai CROCSIT?");
				vastaus4 = lukija.nextLine();
				if (vastaus4.equalsIgnoreCase("Tennarit")) {
					sotku++;
					System.out.println(
							"Tennarit ovat melko kehno valinta, et kyllä onnistu näyttämään niissä millään siistiltä ja asialliselta.");
					break;
				} else if (vastaus4.equalsIgnoreCase("nahkakengät")) {
					myohassa++;
					System.out.println(
							"Nahkakengät kaipaavat selvästi lankkaamista. Viehän se aikaa, mutta tuntuu juuri nyt tärkeältä...");
					break;
				} else if (vastaus4.equalsIgnoreCase("crocsit")) {
					System.out.println(
							"Sukkien väriset crocsit näyttävät yllättäen melko asiallisilta. Kummallinen, mutta ilmeisen oikea valinta");
					break;
				} else {
					System.out.println();
					System.out.println("Kenkien valinta tuottaa selvästi haasteita. Yritäs uudestaan!");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}
			// Vastausvaihtoehdot on tekstissä kirjoitettu isoin kirjaimin
			// toimintavaihtoehtojen selkiyttämiseksi pelaajalle.
			// equalsIgnoreCase on käytössä, jotta fonttikoolla ei olisi merkitystä.
			do {

				System.out.println(
						"\nAamiaisen aika! Päätät tehdä munakasta, mutta minkä linnun munista? VIIRIÄISEN, KANAN vai STRUTSIN?");
				vastaus5 = lukija.nextLine();
				if (vastaus5.equalsIgnoreCase("Kanan")) {
					sotku++;
					System.out.println(
							"Hups, osa munista rikkoutui hassusti ja paitaasi tuli pieni tahra. No, onneksi se on melko huomaamaton.");
					break;
				} else if (vastaus5.equalsIgnoreCase("Strutsin")) {
					myohassa++;
					System.out.println(
							"Miten ihmeessä strutsin munan saa rikki? Ei ollutkaan niin helppoa tämä. \nYritettyäsi käsin, vasaralla ja lekalla huomaat hukanneesi uskomattoman paljon tärkeitä minuutteja.");
					break;
				} else if (vastaus5.equalsIgnoreCase("viiriäisen")) {
					System.out.println(
							"Munakas oli kieltämättä melko pieni, mutta herkullinen. Päätät ostaa viiriäisen munia useammin heti kun NASA:n miljoonapalkat vyöryvät tilillesi.");
					break;
				} else {
					System.out.println();
					System.out.println("Mietihän vielä!");
				}
				// Mikäli pelaaja vastaa jotain kummallista, tulostaa ohjelma yllä
				// olevan kaltaisen virheilmoituksen ja aloittaa do-while silmukan
				// alusta niin monta kertaa, että pelaaja lopulta antaa
				// kelvollisen vastauksen.
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println("\nOtatko palanpainikkeeksi KAHVIA, TEETÄ vai pelkkää VETTÄ?");
				vastaus6 = lukija.nextLine();
				if (vastaus6.equalsIgnoreCase("vettä")) {
					sotku++;
					System.out.println(
							"Olisit selvästi tarvinnut kofeiinia, nuo silmäpussit saavat sinut näyttämään homssuiselta.");
					break;
				} else if (vastaus6.equalsIgnoreCase("kahvia")) {
					myohassa++;
					System.out.println(
							"Pitikö hienostella itse jauhettujen kopi luwak -papujen kanssa? Se vei niin paljon aikaa, että tästä \neteenpäin pitää olla kellon kanssa tarkkana.");
					break;
				} else if (vastaus6.equalsIgnoreCase("teetä")) {
					System.out.println("Kylläpäs Pirkan pussitee virkisti. Tästä on hyvä jatkaa!");
					break;
				} else {
					System.out.println();
					System.out.println("Hmm. Vastauksesi oli jollain tapaa virheellinen. Yritetäänpä uudelleen!");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nPäätät vielä etsiä tietoa NASAsta, jotta kuulostaisit työhaastattelussa skarpilta. \nMistä etsit tietoa, WIKIPEDIASTA, NASAN SIVUILTA vai TIEDE-LEHDISTÄ?");
				vastaus7 = lukija.nextLine();
				if (vastaus7.equalsIgnoreCase("Tiede-lehdistä")) {
					sotku++;
					System.out.println(
							"Kaadat innostuksissasi huojuvat lehtipinot ja olet aivan paperipölyssä. \nOlisikohan kannattanut säilyttää lehtiä muuten kuin isoissa, huojuvissa pinoissa?");
					break;
				} else if (vastaus7.equalsIgnoreCase("Wikipediasta")) {
					myohassa++;
					System.out.println(
							"Wikipediahan onkin mielenkiintoinen paikka. Klikkaat yhteen artikkeliin, sitten seuraavaan ja yhä seuraavaan. \nMuistathan vilkaista kelloa välillä!");
					break;
				} else if (vastaus7.equalsIgnoreCase("NASAn sivuilta")) {
					System.out.println(
							"NASAn sivut olivat niin tylsät, että kyllästyt hetkessä eikä valmistautumiseen siten kulu liikaa aikaa. \nOnneksi todellisuus NASAlla työskentelystä on jännittävämpää, \net malta odottaa kohtaamisia avaruushirviöiden kanssa!");
					break;
				} else {
					System.out.println();
					System.out.println(
							"Kurkataanpa vastausvaihtoehtoja uudelleen, ehkä saisit kertauksen myötä annettua kelvollisen vastauksen.");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nJouni-kissa tulee pyörimään jalkoihisi. Päätätkö SILITTÄÄ, ANTAA HERKUN vai JÄTTÄÄ HUOMIOTTA?");
				vastaus8 = lukija.nextLine();
				if (vastaus8.equalsIgnoreCase("silittää")) {
					sotku++;
					System.out.println(
							"Jouni-kissa kehrää, mutta vasta myöhemmin huomaat vaatteittesi olevan kissankarvojen peitossa. \nEhkä haastattelija ymmärtää, voihan hänelläkin olla kissa?");
					break;
				} else if (vastaus8.equalsIgnoreCase("jättää huomiotta")) {
					myohassa++;
					System.out.println(
							"Nyt Jouni-kissa loukkaantui verisesti ja päätti karata ikkunasta. \nSen perässä pihalla juokseminen vei hyvän tovin kallista aikaasi.");
					break;
				} else if (vastaus8.equalsIgnoreCase("antaa herkun")) {
					System.out.println("Jouni-kissa pitää herkuista ja alkaa hyristä tyytyväisenä.");
					break;
				} else {
					System.out.println();
					System.out.println("Kurkkaas vielä mitä vaihtoehtoja olikaan.");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println(
						"\nKohta pitäisi lähteä. Kuinka aiot huolehtia perille löytämisestä? \nPRINTTAAMALLA KARTAN, LUOTTAMALLA VAISTOIHIN vai KÄYTTÄMÄLLÄ KARTTASOVELLUSTA?");
				vastaus9 = lukija.nextLine();
				if (vastaus9.equalsIgnoreCase("printtaamalla kartan")) {
					sotku++;
					System.out.println(
							"Kartta kyllä toimii, mutta se olisi selvästi pitänyt printata jo aiemmin. \nKäsissäsi on nyt mustetahroja joita et itse edes huomaa.");
					break;
				} else if (vastaus9.equalsIgnoreCase("käyttämällä karttasovellusta")) {
					myohassa++;
					System.out.println(
							"Karttasovellus saa akkusi loppumaan heti ulkoportailla. \nKartatta olemisen aiheuttama hätäännys ja jahkailu kuluttaa kallisarvoista aikaasi.");
					break;
				} else if (vastaus9.equalsIgnoreCase("luottamalla vaistoihin")) {
					System.out.println(
							"Vaistosi ovat hämmentävän toimivat. Pysyt rauhallisena ja luottavaisena \neikä oikean suunnan päätteleminen tule olemaan homma eikä mikään.");
					break;
				} else {
					System.out.println();
					System.out.println(
							"Vaihtoehdot olivat kyllä aika pitkiä. Keskityhän, nyt tarvittaisiin kaksi sanaa vastaukseksi!");
				}
			} while (true);

			while (myohassa >= 4) {
				myohastyit();
			}

			do {

				System.out.println("\nMillä kuljet haastatteluun? PYÖRÄLLÄ, BUSSILLA vai AUTOLLA?");
				vastaus10 = lukija.nextLine();
				if (vastaus10.equalsIgnoreCase("pyörällä")) {
					sotku++;
					System.out.println(
							"Pyöräily sujuu kieltämättä nopeasti, mutta ohi ajava bussi roiskii kokonaisen lätäkön päällesi!");
					break;
				} else if (vastaus10.equalsIgnoreCase("autolla")) {
					myohassa++;
					System.out.println(
							"Löydät haastattelupaikan ajoissa, mutta parkkipaikan etsiminen onkin sitten toinen juttu.");
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
			// myohastyit() ja sottainen() metodit kutsutaan vain mikäli arvo int myohassa
			// on suurempi kuin neljä tai int sotku on suurempi kuin viisi.
			while (myohassa >= 4) {
				myohastyit();
			}

			while (sotku >= 5) {
				sottainen();
			}
			// Mikäli yllä olevien metodien kutsulle ei ole tarvetta, siirrytään metodiin
			// tyohaastattelu().
			tyohaastattelu();

			// Kysymyksissä 11-13 jokaisessa yksi vaihtoehto kasvattaa muuttujan int
			// onnistuminen arvoa.
			// Kysymyksestä 12 löytyy myös poikkeuksellisesti vaihtoehto, joka laskee sen
			// arvoa.
			do {

				System.out.println(
						"\nHaastattelija kysyy, mikä sai sinut hakemaan NASAlle töihin. Mielessäsi pyörivät vastausvaihtoehdot \nAVARUUSHIRVIÖT, KUULUISUUS ja URAKEHITYS. Mitä vastaat?");
				vastaus11 = lukija.nextLine();
				if (vastaus11.equalsIgnoreCase("avaruushirviöt")) {
					onnistuminen++;
					System.out.println(
							"\"Mahtavaa!\" huudahtaa haastattelija. Tarvitsemmekin lisää ihmisiä taisteluun avaruushirviöitä vastaan.");
					break;
				} else if (vastaus11.equalsIgnoreCase("kuuluisuus")) {
					System.out.println(
							"Haastattelija vain mumisee ja siirtyy seuraavaan kysymykseen. Tämä ei tainnut olla hyvä vastaus?");
					break;
				} else if (vastaus11.equalsIgnoreCase("urakehitys")) {
					System.out.println(
							"\"Vastaathan seuraavaan kysymykseen jotain sellaista mitä emme kuule joka päivä,\" toteaa haastattelija.");
					break;
				} else {
					System.out.println();
					System.out.println("Luehan vastausvaihtoehdot vielä uudestaan.");
				}
			} while (true);

			do {

				System.out.println(
						"\n\"Mistä sait kuulla avoimesta työpaikastamme?\" kysyy haastattelija. Vastaisitko totuuden, TELEPAATTISESTI \nAVARUUDESTA, vai valehtelisitko kuulleesi paikasta LEHDESTÄ tai NETISTÄ.");
				vastaus12 = lukija.nextLine();
				if (vastaus12.equalsIgnoreCase("netistä")) {
					onnistuminen++;
					System.out.println(
							"\"Osaat siis käyttää tietokonetta,\" haastattelija sanoo iloisesti. Sitä taitoa meillä tarvitaankin.");
					break;
				} else if (vastaus12.equalsIgnoreCase("lehdestä")) {
					System.out.println(
							"Haastattelija näyttää hieman tyytymättömältä. He eivät nimittäin ole julkaisseet ilmoitusta lehdessä. Hups!");
					break;
				} else if (vastaus12.equalsIgnoreCase("telepaattisesti avaruudesta")) {
					onnistuminen--;
					System.out.println(
							"No nyt oli selvästi liian hullu vastaus. Haastattelija katsoo sinua järkyttyneenä päätään puistellen.");
					break;
				} else {
					System.out.println();
					System.out.println(
							"Yritähän vielä. (Vinkki: vaihtoehdot olivat telepaattisesti avaruudesta, lehdestä, netistä.)");
				}
			} while (true);

			do {

				System.out.println(
						"\n\"Mikä on suurin vahvuutesi,\" kysyy työhaastattelija vielä lopuksi. Vain yksi vahvuus! Mietit \nsanoisitko vahvuuteni on VAHVUUTENI ja kertoisit penkkipunnerrustuloksistasi, \nvastaisit TAISTELUTAITONI (joita olet harjoitellut pelaamalla tekstiseikkailupelejä) \nvai TIETONI AVARUUDESTA (sillä saathan jatkuvasti uutta telepaattista tietoa).");
				vastaus13 = lukija.nextLine();
				if (vastaus13.equalsIgnoreCase("vahvuuteni")) {
					onnistuminen++;
					System.out.println(
							"Haastattelija myhäilee tyytyväisenä. Penkkipunnerrusten tulokset taisivat vakuuttaa hänet.");
					break;
				} else if (vastaus13.equalsIgnoreCase("taistelutaitoni")) {
					System.out.println("Tämä ei tainnut vakuuttaa haastattelijaa.");
					break;
				} else if (vastaus13.equalsIgnoreCase("tietoni avaruudesta")) {
					System.out.println("Haastattelija näyttää kyllästyneeltä. Ehkä nyt olisi kaivattu jotain muuta.");
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
