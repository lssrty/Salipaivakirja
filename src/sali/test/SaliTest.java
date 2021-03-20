package sali.test;
// Generated by ComTest BEGIN
import java.util.*;
import java.io.*;
import static org.junit.Assert.*;
import org.junit.*;
import sali.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.20 16:44:59 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class SaliTest {



  // Generated by ComTest BEGIN
  /** 
   * testLisaa47 
   * @throws SailoException when error
   */
  @Test
  public void testLisaa47() throws SailoException {    // Sali: 47
    Sali sali = new Sali(); 
    Suoritus kyykkysarja1 = new Suoritus(), kyykkysarja2 = new Suoritus(); 
    kyykkysarja1.rekisteroi(); kyykkysarja2.rekisteroi(); 
    assertEquals("From: Sali line: 52", 0, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 53", 1, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja2); assertEquals("From: Sali line: 54", 2, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 55", 3, sali.getSuorituksia()); 
    assertEquals("From: Sali line: 56", 3, sali.getSuorituksia()); 
    assertEquals("From: Sali line: 57", kyykkysarja1, sali.annaSuoritus(0)); 
    assertEquals("From: Sali line: 58", kyykkysarja2, sali.annaSuoritus(1)); 
    assertEquals("From: Sali line: 59", kyykkysarja1, sali.annaSuoritus(2)); 
    try {
    assertEquals("From: Sali line: 60", kyykkysarja1, sali.annaSuoritus(3)); 
    fail("Sali: 60 Did not throw IndexOutOfBoundsException");
    } catch(IndexOutOfBoundsException _e_){ _e_.getMessage(); }
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 61", 4, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 62", 5, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 63", 6, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 64", 7, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 65", 8, sali.getSuorituksia()); 
    sali.lisaa(kyykkysarja1); assertEquals("From: Sali line: 66", 9, sali.getSuorituksia()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testAnnaSuoritukset101 
   * @throws SailoException when error
   */
  @Test
  public void testAnnaSuoritukset101() throws SailoException {    // Sali: 101
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
    assertEquals("From: Sali line: 118", 0, loytyneet.size()); 
    loytyneet = sali.annaSuoritukset(treeni1); 
    assertEquals("From: Sali line: 120", 2, loytyneet.size()); 
    assertEquals("From: Sali line: 121", true, loytyneet.get(0) == kyykky11); 
    assertEquals("From: Sali line: 122", true, loytyneet.get(1) == kyykky12); 
    loytyneet = sali.annaSuoritukset(treeni2); 
    assertEquals("From: Sali line: 124", 3, loytyneet.size()); 
    assertEquals("From: Sali line: 125", true, loytyneet.get(0) == kyykky21); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLueTiedostosta163 
   * @throws SailoException when error
   */
  @Test
  public void testLueTiedostosta163() throws SailoException {    // Sali: 163
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
    sali.lisaa(kyykky); 
    sali.lisaa(penkki); 
    sali.lisaa(maastaveto); 
    sali.tallenna(); 
    sali = new Sali(); 
    sali.lueTiedostosta(hakemisto); 
    Collection<Suoritus> kaikki = sali.annaSuoritukset(1); 
    Iterator<Suoritus> it = kaikki.iterator(); 
    assertEquals("From: Sali line: 205", kyykky1.toString(), it.next().toString()); 
    assertEquals("From: Sali line: 206", kyykky2.toString(), it.next().toString()); 
    assertEquals("From: Sali line: 207", false, it.hasNext()); 
    List<Suoritus> loytyneet = sali.annaSuoritukset(reeni1); 
    Iterator<Suoritus> ih = loytyneet.iterator(); 
    assertEquals("From: Sali line: 210", kyykky1.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 211", kyykky2.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 212", false, ih.hasNext()); 
    loytyneet = sali.annaSuoritukset(reeni2); 
    ih = loytyneet.iterator(); 
    assertEquals("From: Sali line: 215", kyykky3.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 216", kyykky4.toString(), ih.next().toString()); 
    assertEquals("From: Sali line: 217", false, ih.hasNext()); 
    sali.lisaa(reeni2); 
    sali.lisaa(kyykky4); 
    sali.lisaa(kyykky); 
    sali.tallenna(); 
    assertEquals("From: Sali line: 222", true, fhtied.delete()); 
    assertEquals("From: Sali line: 223", true, fltied.delete()); 
    assertEquals("From: Sali line: 224", true, fstied.delete()); 
    File fhbak = new File(hakemisto+"/harjoitukset.bak"); 
    File flbak = new File(hakemisto+"/liikkeet.bak"); 
    File fsbak = new File(hakemisto+"/suoritukset.bak"); 
    assertEquals("From: Sali line: 228", true, fhbak.delete()); 
    flbak.delete();  // === true;
    assertEquals("From: Sali line: 230", true, fsbak.delete()); 
    assertEquals("From: Sali line: 231", true, dir.delete()); 
  } // Generated by ComTest END
}