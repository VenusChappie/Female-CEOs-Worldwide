package org.femmefatale.CountryStats;

import java.text.CollationKey;
import java.util.Collection;

public interface Countries {

    Collection<String> countries();

    Collection<Company> countryCompanies(String aCountry);
}
