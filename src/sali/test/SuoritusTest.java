package sali.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import sali.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.02.25 14:32:22 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class SuoritusTest {



  // Generated by ComTest BEGIN
  /** testGetHarjoitusID52 */
  @Test
  public void testGetHarjoitusID52() {    // Suoritus: 52
    Suoritus kyykkysarja = new Suoritus(); 
    assertEquals("From: Suoritus line: 54", 0, kyykkysarja.getHarjoitusID()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetLiikeID65 */
  @Test
  public void testGetLiikeID65() {    // Suoritus: 65
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.taytaKyykkyTiedoilla(); 
    assertEquals("From: Suoritus line: 68", 1, kyykkysarja.getLiikeID()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testRekisteroi116 */
  @Test
  public void testRekisteroi116() {    // Suoritus: 116
    Suoritus kyykkysarja1 = new Suoritus(); 
    assertEquals("From: Suoritus line: 118", 0, kyykkysarja1.getTunnusNro()); 
    kyykkysarja1.rekisteroi(); 
    Suoritus kyykkysarja2 = new Suoritus(); 
    kyykkysarja2.rekisteroi(); 
    int n1 = kyykkysarja1.getTunnusNro(); 
    int n2 = kyykkysarja2.getTunnusNro(); 
    assertEquals("From: Suoritus line: 124", n2-1, n1); 
  } // Generated by ComTest END
}