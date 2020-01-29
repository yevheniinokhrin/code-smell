package com.danix.code.smell.example001;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author  danix
 */
public class CustomerTest {
    @Test
    public void customerTest() {
        Account account = getPremiumAccount(5);
        Customer customer = CustomerTestUtils.getPersonCustomer(account);
        assertThat(customer.getName(), is("danix"));
        assertThat(customer.getEmail(), is("dan@mail.com"));
    }

    private Account getPremiumAccount(final int daysOverdrawn) {
        AccountType normal = new AccountType(true);
        return new Account(normal, daysOverdrawn);
    }
}
