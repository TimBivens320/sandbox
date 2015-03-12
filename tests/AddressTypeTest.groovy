/**
 * Created by bivenst on 3/11/2015.
 */
class AddressTypeTest extends GroovyTestCase {
    void setUp() {
        super.setUp()

    }

    void tearDown() {

    }

    void testGetId() {
        assertEquals(1, AddressType.Mailing.getId());
        assertEquals(2, AddressType.Shipping.getId());
        assertEquals(3, AddressType.Billing.getId());
    }

    void testGetDescription() {
        assertEquals("Mailing", AddressType.Mailing.getDescription());
        assertEquals("Shipping", AddressType.Shipping.getDescription());
        assertEquals("Billing", AddressType.Billing.getDescription());
    }
}