package sali.test;
// Generated by ComTest BEGIN
import sali.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.02 15:32:42 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class LiikkeetTest {



  // Generated by ComTest BEGIN
  /** 
   * testLisaa57 
   * @throws SailoException when error
   */
  @Test
  public void testLisaa57() throws SailoException {    // Liikkeet: 57
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(),
    dippi = new Liike(), pystypunnerrus = new Liike(), alatalja = new Liike(); 
    assertEquals("From: Liikkeet line: 62", 0, liikkeet.getLkm()); 
    liikkeet.lisaa(kyykky); assertEquals("From: Liikkeet line: 63", 1, liikkeet.getLkm()); 
    liikkeet.lisaa(penkki); assertEquals("From: Liikkeet line: 64", 2, liikkeet.getLkm()); 
    liikkeet.lisaa(maastaveto); assertEquals("From: Liikkeet line: 65", 3, liikkeet.getLkm()); 
    try {
    liikkeet.lisaa(maastaveto); 
    fail("Liikkeet: 66 Did not throw SailoException");
    } catch(SailoException _e_){ _e_.getMessage(); }
    assertEquals("From: Liikkeet line: 67", kyykky, liikkeet.anna(0)); 
    assertEquals("From: Liikkeet line: 68", penkki, liikkeet.anna(1)); 
    assertEquals("From: Liikkeet line: 69", maastaveto, liikkeet.anna(2)); 
    assertEquals("From: Liikkeet line: 70", false, liikkeet.anna(1) == kyykky); 
    assertEquals("From: Liikkeet line: 71", true, liikkeet.anna(1) == penkki); 
    try {
    assertEquals("From: Liikkeet line: 72", kyykky, liikkeet.anna(3)); 
    fail("Liikkeet: 72 Did not throw IndexOutOfBoundsException");
    } catch(IndexOutOfBoundsException _e_){ _e_.getMessage(); }
    liikkeet.lisaa(dippi); assertEquals("From: Liikkeet line: 73", 4, liikkeet.getLkm()); 
    liikkeet.lisaa(pystypunnerrus); assertEquals("From: Liikkeet line: 74", 5, liikkeet.getLkm()); 
    liikkeet.lisaa(alatalja); assertEquals("From: Liikkeet line: 75", 6, liikkeet.getLkm()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testPoista99 
   * @throws SailoException when error
   */
  @Test
  public void testPoista99() throws SailoException {    // Liikkeet: 99
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    int id1 = kyykky.getLiikeID(); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    assertEquals("From: Liikkeet line: 106", 1, liikkeet.poista(id1+1)); 
    assertEquals("From: Liikkeet line: 107", null, liikkeet.annaId(id1+1)); assertEquals("From: Liikkeet line: 107", 2, liikkeet.getLkm()); 
    assertEquals("From: Liikkeet line: 108", 1, liikkeet.poista(id1)); assertEquals("From: Liikkeet line: 108", 1, liikkeet.getLkm()); 
    assertEquals("From: Liikkeet line: 109", 0, liikkeet.poista(id1+3)); assertEquals("From: Liikkeet line: 109", 1, liikkeet.getLkm()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testAnnaId142 
   * @throws SailoException when error
   */
  @Test
  public void testAnnaId142() throws SailoException {    // Liikkeet: 142
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    int id1 = kyykky.getLiikeID(); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    assertEquals("From: Liikkeet line: 149", true, liikkeet.annaId(id1  ) == kyykky); 
    assertEquals("From: Liikkeet line: 150", true, liikkeet.annaId(id1+1) == penkki); 
    assertEquals("From: Liikkeet line: 151", true, liikkeet.annaId(id1+2) == maastaveto); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLiikkeetIterator165 
   * @throws SailoException when error
   */
  @Test
  public void testLiikkeetIterator165() throws SailoException {    // Liikkeet: 165
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    StringBuffer ids = new StringBuffer(30); 
    for (Liike liike:liikkeet) // Kokeillaan for-silmukan toimintaa
    ids.append(" "+liike.getLiikeID()); 
    String tulos = " " + kyykky.getLiikeID() + " " + penkki.getLiikeID() + " " + maastaveto.getLiikeID(); 
    assertEquals("From: Liikkeet line: 182", tulos, ids.toString()); 
    ids = new StringBuffer(30); 
    for (Iterator<Liike>  i=liikkeet.iterator(); i.hasNext(); ) { // ja iteraattorin toimintaa
    Liike liike = i.next(); 
    ids.append(" "+liike.getLiikeID()); 
    }
    assertEquals("From: Liikkeet line: 190", tulos, ids.toString()); 
    Iterator<Liike>  i=liikkeet.iterator(); 
    assertEquals("From: Liikkeet line: 193", true, i.next() == kyykky); 
    assertEquals("From: Liikkeet line: 194", true, i.next() == penkki); 
    assertEquals("From: Liikkeet line: 195", true, i.next() == maastaveto); 
    try {
    i.next(); 
    fail("Liikkeet: 197 Did not throw NoSuchElementException");
    } catch(NoSuchElementException _e_){ _e_.getMessage(); }
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testEtsiId258 
   * @throws SailoException when error
   */
  @Test
  public void testEtsiId258() throws SailoException {    // Liikkeet: 258
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    int id1 = kyykky.getLiikeID(); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    assertEquals("From: Liikkeet line: 265", 1, liikkeet.etsiId(id1+1)); 
    assertEquals("From: Liikkeet line: 266", 2, liikkeet.etsiId(id1+2)); 
  } // Generated by ComTest END
}