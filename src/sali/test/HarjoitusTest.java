package sali.test;
// Generated by ComTest BEGIN
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.Assert.*;
import org.junit.*;
import sali.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.29 16:47:33 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class HarjoitusTest {



  // Generated by ComTest BEGIN
  /** testHarjoitus46 */
  @Test
  public void testHarjoitus46() {    // Harjoitus: 46
    LocalDateTime paivamaara = LocalDateTime.now(); 
    DateTimeFormatter pvmMuotoilija = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm.ss"); 
    String pvm = paivamaara.format(pvmMuotoilija); 
    Harjoitus treeni = new Harjoitus(); 
    assertEquals("From: Harjoitus line: 53", pvm, treeni.getPvm()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testRekisteroi85 */
  @Test
  public void testRekisteroi85() {    // Harjoitus: 85
    Harjoitus treeni1 = new Harjoitus(); 
    assertEquals("From: Harjoitus line: 87", 0, treeni1.getHarjoitusID()); 
    treeni1.rekisteroi(); 
    Harjoitus treeni2 = new Harjoitus(); 
    treeni2.rekisteroi(); 
    int n1 = treeni1.getHarjoitusID(); 
    int n2 = treeni2.getHarjoitusID(); 
    assertEquals("From: Harjoitus line: 93", n2-1, n1); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testParse119 */
  @Test
  public void testParse119() {    // Harjoitus: 119
    Harjoitus treeni1 = new Harjoitus(); 
    treeni1.parse("   2  |  07.03.2021_15:04.35"); 
    assertEquals("From: Harjoitus line: 122", 2, treeni1.getHarjoitusID()); 
    assertEquals("From: Harjoitus line: 123", "2|07.03.2021_15:04.35", treeni1.toString()); 
    treeni1.rekisteroi(); 
    int n = treeni1.getHarjoitusID(); 
    treeni1.parse(""+(n+20));  // Otetaan merkkijonosta vain harjoitusID
    treeni1.rekisteroi();  // ja tarkistetaan että seuraavalla kertaa tulee yhtä isompi
    assertEquals("From: Harjoitus line: 129", n+20+1, treeni1.getHarjoitusID()); 
  } // Generated by ComTest END
}