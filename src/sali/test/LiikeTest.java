package sali.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import sali.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.29 16:47:38 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class LiikeTest {



  // Generated by ComTest BEGIN
  /** testRekisteroi46 */
  @Test
  public void testRekisteroi46() {    // Liike: 46
    Liike kyykky = new Liike(); 
    assertEquals("From: Liike line: 48", 0, kyykky.getLiikeID()); 
    kyykky.rekisteroi(); 
    Liike penkki = new Liike(); 
    penkki.rekisteroi(); 
    int n1 = kyykky.getLiikeID(); 
    int n2 = penkki.getLiikeID(); 
    assertEquals("From: Liike line: 54", n2-1, n1); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testToString88 */
  @Test
  public void testToString88() {    // Liike: 88
    Liike penkki = new Liike(); 
    penkki.parse("   2  |  penkki"); 
    assertEquals("From: Liike line: 91", "2|penkki", penkki.toString()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testParse106 */
  @Test
  public void testParse106() {    // Liike: 106
    Liike penkki = new Liike(); 
    penkki.parse("   2  |  penkki"); 
    assertEquals("From: Liike line: 109", 2, penkki.getLiikeID()); 
    assertEquals("From: Liike line: 110", "2|penkki", penkki.toString()); 
    penkki.rekisteroi(); 
    int n = penkki.getLiikeID(); 
    penkki.parse(""+(n+20));  // Otetaan merkkijonosta vain liikeID
    penkki.rekisteroi();  // ja tarkistetaan että seuraavalla kertaa tulee yhtä isompi
    assertEquals("From: Liike line: 116", n+20+1, penkki.getLiikeID()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetLiikeNimi131 */
  @Test
  public void testGetLiikeNimi131() {    // Liike: 131
    Liike dippi = new Liike(); 
    dippi.setLiikeNimi("dippi"); 
    assertEquals("From: Liike line: 134", "Dippi", dippi.getLiikeNimi()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testSetLiikeNimi146 */
  @Test
  public void testSetLiikeNimi146() {    // Liike: 146
    Liike pystypunnerrus = new Liike(); 
    pystypunnerrus.setLiikeNimi("pystypunnerrus"); 
    assertEquals("From: Liike line: 149", "Pystypunnerrus", pystypunnerrus.getLiikeNimi()); 
  } // Generated by ComTest END
}