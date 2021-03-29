package sali.test;
// Generated by ComTest BEGIN
import sali.SailoException;
import java.util.*;
import java.io.*;
import static org.junit.Assert.*;
import org.junit.*;
import sali.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.29 14:55:29 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class SaliTest {


  // Generated by ComTest BEGIN  // Sali: 40
   private Sali sali; 
   private Suoritus kyykkysarja1; 
   private Suoritus kyykkysarja2; 
   private int sid1; 
   private int sid2; 
   private Harjoitus treeni21; 
   private Harjoitus treeni11; 
   private Harjoitus treeni22; 
   private Harjoitus treeni12; 
   private Harjoitus treeni23; 
   private Liike pystypunnerrus; 
   private Liike dippi; 

   public void alustaSali() {
     sali = new Sali(); 
     treeni21 = new Harjoitus(); treeni21.rekisteroi(); 
     treeni11 = new Harjoitus(); treeni11.rekisteroi(); 
     treeni22 = new Harjoitus(); treeni22.rekisteroi(); 
     treeni12 = new Harjoitus(); treeni12.rekisteroi(); 
     treeni23 = new Harjoitus(); treeni23.rekisteroi(); 
     kyykkysarja1 = new Suoritus(); kyykkysarja1.taytaKyykkyTiedoilla(treeni21.getHarjoitusID()); kyykkysarja1.rekisteroi(); 
     kyykkysarja2 = new Suoritus(); kyykkysarja2.taytaKyykkyTiedoilla(treeni11.getHarjoitusID()); kyykkysarja2.rekisteroi(); 
     pystypunnerrus = new Liike(); pystypunnerrus.rekisteroi(); pystypunnerrus.setLiikeNimi("pystypunnerrus"); 
     dippi = new Liike(); dippi.rekisteroi(); dippi.setLiikeNimi("dippi"); 
     sid1 = kyykkysarja1.getTunnusNro(); 
     sid2 = kyykkysarja2.getTunnusNro(); 
     try {
     sali.lisaa(kyykkysarja1); 
     sali.lisaa(kyykkysarja2); 
     sali.lisaa(treeni21); 
     sali.lisaa(treeni11); 
     sali.lisaa(treeni22); 
     sali.lisaa(treeni12); 
     sali.lisaa(treeni23); 
     sali.lisaa(pystypunnerrus); 
     sali.lisaa(dippi); 
     } catch ( Exception e) {
        System.err.println(e.getMessage()); 
     }
   }
  // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLisaa95 
   * @throws SailoException when error
   */
  @Test
  public void testLisaa95() throws SailoException {    // Sali: 95
    Sali sali = new Sali(); 
    Suoritus kyykkysarja1 = new Suoritus(), kyykkysarja2 = new Suoritus(); 
    kyykkysarja1.rekisteroi(); kyykkysarja2.rekisteroi(); 
    assertEquals("From: Sali line: 100", 0, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 101", 1, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja2); assertEquals("From: Sali line: 102", 2, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 103", 3, sali.getSuorituksia()); 
    assertEquals("From: Sali line: 104", 3, sali.getSuorituksia()); 
    assertEquals("From: Sali line: 105", kyykkysarja1, sali.annaSuoritus(0)); 
    assertEquals("From: Sali line: 106", kyykkysarja2, sali.annaSuoritus(1)); 
    assertEquals("From: Sali line: 107", kyykkysarja1, sali.annaSuoritus(2)); 
    try {
    assertEquals("From: Sali line: 108", kyykkysarja1, sali.annaSuoritus(3)); 
    fail("Sali: 108 Did not throw IndexOutOfBoundsException");
    } catch(IndexOutOfBoundsException _e_){ _e_.getMessage(); }
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 109", 4, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 110", 5, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 111", 6, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 112", 7, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 113", 8, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 114", 9, sali.getSuorituksia()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLisaa127 
   * @throws SailoException when error
   */
  @Test
  public void testLisaa127() throws SailoException {    // Sali: 127
    Sali sali = new Sali(); 
    Harjoitus harjoitus1 = new Harjoitus(); 
    Harjoitus harjoitus2 = new Harjoitus(); 
    assertEquals("From: Sali line: 132", 0, sali.getHarjoituksia()); 
    sali.lisaa(harjoitus1); sali.lisaa(harjoitus2); 
    assertEquals("From: Sali line: 134", 2, sali.getHarjoituksia()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLisaa147 
   * @throws SailoException when error
   */
  @Test
  public void testLisaa147() throws SailoException {    // Sali: 147
    Sali sali = new Sali(); 
    Liike kyykky = new Liike(), penkki = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); 
    penkki.setLiikeNimi("penkki"); 
    assertEquals("From: Sali line: 154", 0, sali.getLiikkeita()); 
    sali.lisaa(kyykky); sali.lisaa(penkki); 
    assertEquals("From: Sali line: 156", 2, sali.getLiikkeita()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testKorvaaTaiLisaa170 
   * @throws SailoException when error
   */
  @Test
  public void testKorvaaTaiLisaa170() throws SailoException {    // Sali: 170
    alustaSali(); 
    Suoritus kyykkysarja5 = new Suoritus(); 
    kyykkysarja5.rekisteroi(); 
    assertEquals("From: Sali line: 175", 2, sali.getSuorituksia()); 
    sali.korvaaTaiLisaa(kyykkysarja1); 
    assertEquals("From: Sali line: 177", 2, sali.getSuorituksia()); 
    sali.korvaaTaiLisaa(kyykkysarja5); 
    assertEquals("From: Sali line: 179", 3, sali.getSuorituksia()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testPoista192 
   * @throws Exception when error
   */
  @Test
  public void testPoista192() throws Exception {    // Sali: 192
    alustaSali(); 
    assertEquals("From: Sali line: 195", 2, sali.getSuorituksia()); 
    assertEquals("From: Sali line: 196", 1, sali.poista(kyykkysarja1)); 
    assertEquals("From: Sali line: 197", 1, sali.getSuorituksia()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testPoistaHarjoitus212 
   * @throws Exception when error
   */
  @Test
  public void testPoistaHarjoitus212() throws Exception {    // Sali: 212
    alustaSali(); 
    assertEquals("From: Sali line: 215", 5, sali.annaHarjoitukset().size()); 
    assertEquals("From: Sali line: 216", treeni11.getHarjoitusID(), kyykkysarja2.getHarjoitusID()); 
    assertEquals("From: Sali line: 217", 2, sali.getSuorituksia()); 
    sali.poistaHarjoitus(treeni11); 
    assertEquals("From: Sali line: 219", 1, sali.getSuorituksia()); 
    assertEquals("From: Sali line: 220", 4, sali.annaHarjoitukset().size()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testPoistaTurhatLiikkeet233 */
  @Test
  public void testPoistaTurhatLiikkeet233() {    // Sali: 233
    alustaSali(); 
    assertEquals("From: Sali line: 235", 2, sali.getLiikkeita()); 
    Suoritus dippisarja = new Suoritus(); 
    dippisarja.rekisteroi(); dippisarja.asetaLiike(dippi); 
    sali.poistaTurhatLiikkeet(); 
    assertEquals("From: Sali line: 239", 1, sali.getLiikkeita()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testAnnaSuoritukset271 */
  @Test
  public void testAnnaSuoritukset271() {    // Sali: 271
    alustaSali(); 
    List<Suoritus> loytyneet; 
    loytyneet = sali.annaSuoritukset(); 
    assertEquals("From: Sali line: 277", 2, loytyneet.size()); 
    assertEquals("From: Sali line: 278", kyykkysarja1, loytyneet.get(0)); 
    assertEquals("From: Sali line: 279", kyykkysarja2, loytyneet.get(1)); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testHaeEnnatys292 */
  @Test
  public void testHaeEnnatys292() {    // Sali: 292
    alustaSali(); 
    kyykkysarja1.aseta(2, "1"); kyykkysarja1.aseta(4, "2"); kyykkysarja1.aseta(5, "170"); 
    assertEquals("From: Sali line: 295", kyykkysarja1, sali.haeEnnatys(1)); 
    kyykkysarja2.aseta(2, "1"); kyykkysarja2.aseta(4, "1"); kyykkysarja2.aseta(5, "180"); 
    assertEquals("From: Sali line: 297", kyykkysarja2, sali.haeEnnatys(1)); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testAnnaSuoritukset311 
   * @throws SailoException when error
   */
  @Test
  public void testAnnaSuoritukset311() throws SailoException {    // Sali: 311
    Sali sali = new Sali(); 
    Harjoitus treeni1 = new Harjoitus(), treeni2 = new Harjoitus(), treeni3 = new Harjoitus(); 
    treeni1.rekisteroi(); treeni2.rekisteroi(); treeni3.rekisteroi(); 
    int id1 = treeni1.getHarjoitusID(); 
    int id2 = treeni2.getHarjoitusID(); 
    Suoritus kyykky11 = new Suoritus(id1); sali.lisaa(kyykky11); 
    Suoritus kyykky12 = new Suoritus(id1); sali.lisaa(kyykky12); 
    Suoritus kyykky21 = new Suoritus(id2); sali.lisaa(kyykky21); 
    Suoritus kyykky22 = new Suoritus(id2); sali.lisaa(kyykky22); 
    Suoritus kyykky23 = new Suoritus(id2); sali.lisaa(kyykky23); 
    List<Suoritus> loytyneet; 
    loytyneet = sali.annaSuoritukset(treeni3); 
    assertEquals("From: Sali line: 328", 0, loytyneet.size()); 
    loytyneet = sali.annaSuoritukset(treeni1); 
    assertEquals("From: Sali line: 330", 2, loytyneet.size()); 
    assertEquals("From: Sali line: 331", true, loytyneet.get(0) == kyykky11); 
    assertEquals("From: Sali line: 332", true, loytyneet.get(1) == kyykky12); 
    loytyneet = sali.annaSuoritukset(treeni2); 
    assertEquals("From: Sali line: 334", 3, loytyneet.size()); 
    assertEquals("From: Sali line: 335", true, loytyneet.get(0) == kyykky21); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLueTiedostosta383 
   * @throws SailoException when error
   */
  @Test
  public void testLueTiedostosta383() throws SailoException {    // Sali: 383
    Sali sali = new Sali(); 
    Harjoitus reeni1 = new Harjoitus(); reeni1.rekisteroi(); 
    Harjoitus reeni2 = new Harjoitus(); reeni2.rekisteroi(); 
    Suoritus kyykky1 = new Suoritus(); kyykky1.taytaKyykkyTiedoilla(reeni1.getHarjoitusID()); kyykky1.rekisteroi(); 
    Suoritus kyykky2 = new Suoritus(); kyykky2.taytaKyykkyTiedoilla(reeni1.getHarjoitusID()); kyykky2.rekisteroi(); 
    Suoritus kyykky3 = new Suoritus(); kyykky3.taytaKyykkyTiedoilla(reeni2.getHarjoitusID()); kyykky3.rekisteroi(); 
    Suoritus kyykky4 = new Suoritus(); kyykky4.taytaKyykkyTiedoilla(reeni2.getHarjoitusID()); kyykky4.rekisteroi(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); penkki.setLiikeNimi("penkki"); maastaveto.setLiikeNimi("maastaveto"); 
    String hakemisto = "testiharjoittelija"; 
    File dir = new File(hakemisto); 
    File fhtied  = new File(hakemisto+"/harjoitukset.dat"); 
    File fltied = new File(hakemisto+"/liikkeet.dat"); 
    File fstied = new File(hakemisto+"/suoritukset.dat"); 
    dir.mkdir(); 
    fhtied.delete(); 
    fltied.delete(); 
    fstied.delete(); 
    sali.lueTiedostosta(hakemisto); 
    sali.lisaa(reeni1); 
    sali.lisaa(reeni2); 
    sali.lisaa(kyykky1); 
    sali.lisaa(kyykky2); 
    sali.lisaa(kyykky3); 
    sali.lisaa(kyykky4); 
    sali.tallenna(); 
    sali = new Sali(); 
    sali.lueTiedostosta(hakemisto); 
    Collection<Suoritus> kaikki = sali.annaSuoritukset(1); 
    Iterator<Suoritus> it = kaikki.iterator(); 
    assertEquals("From: Sali line: 423", kyykky1.toString(), it.next().toString()); 
    assertEquals("From: Sali line: 424", kyykky2.toString(), it.next().toString()); 
    assertEquals("From: Sali line: 425", false, it.hasNext()); 
    List<Suoritus> loytyneet = sali.annaSuoritukset(reeni1); 
    Iterator<Suoritus> ih = loytyneet.iterator(); 
    assertEquals("From: Sali line: 428", kyykky1.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 429", kyykky2.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 430", false, ih.hasNext()); 
    loytyneet = sali.annaSuoritukset(reeni2); 
    ih = loytyneet.iterator(); 
    assertEquals("From: Sali line: 433", kyykky3.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 434", kyykky4.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 435", false, ih.hasNext()); 
    sali.lisaa(reeni2); 
    sali.lisaa(kyykky4); 
    Liike kulmasoutu = new Liike(); kulmasoutu.rekisteroi(); kulmasoutu.setLiikeNimi("kulmasoutu"); 
    sali.lisaa(kulmasoutu); 
    sali.tallenna(); 
    assertEquals("From: Sali line: 441", true, fhtied.delete()); 
    assertEquals("From: Sali line: 442", true, fltied.delete()); 
    assertEquals("From: Sali line: 443", true, fstied.delete()); 
    File fhbak = new File(hakemisto+"/harjoitukset.bak"); 
    File flbak = new File(hakemisto+"/liikkeet.bak"); 
    File fsbak = new File(hakemisto+"/suoritukset.bak"); 
    assertEquals("From: Sali line: 447", true, fhbak.delete()); 
    flbak.delete();  // === true;
    assertEquals("From: Sali line: 449", true, fsbak.delete()); 
    assertEquals("From: Sali line: 450", true, dir.delete()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testOnkoLiike529 
   * @throws SailoException when error
   */
  @Test
  public void testOnkoLiike529() throws SailoException {    // Sali: 529
    Sali sali = new Sali(); 
    Liike kyykky = new Liike(), penkki = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); 
    penkki.setLiikeNimi("penkki"); 
    sali.lisaa(kyykky); sali.lisaa(penkki); 
    assertEquals("From: Sali line: 537", false, sali.onkoLiike("petteri")); 
    assertEquals("From: Sali line: 538", true, sali.onkoLiike("kyykky")); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testAnnaHarjoitus573 */
  @Test
  public void testAnnaHarjoitus573() {    // Sali: 573
    alustaSali(); 
    assertEquals("From: Sali line: 575", treeni21, sali.annaHarjoitus(treeni21.getHarjoitusID())); 
    assertEquals("From: Sali line: 576", null, sali.annaHarjoitus(99999)); 
  } // Generated by ComTest END
}