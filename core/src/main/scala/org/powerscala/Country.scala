package org.powerscala

/**
 * @author Matt Hicks <mhicks@powerscala.org>
 */
sealed class Country(val fullName: String) extends EnumEntry[Country] {
  override def toString = fullName
}

object Country extends Enumerated[Country] {
  val US = new Country("United States of America")
  val CA = new Country("Canada")
  val GB = new Country("United Kingdom")
  val AF = new Country("Afghanistan")
  val AO = new Country("Angola")
  val AI = new Country("Anguilla")
  val AG = new Country("Antigua")
  val AR = new Country("Argentina")
  val AW = new Country("Aruba")
  val AU = new Country("Australia")
  val AT = new Country("Austria")
  val BS = new Country("Bahamas")
  val BH = new Country("Bahrain")
  val BD = new Country("Bangladesh")
  val BB = new Country("Barbados")
  val BE = new Country("Belgium")
  val BM = new Country("Bermuda")
  val BO = new Country("Bolivia")
  val XB = new Country("Bonaire")
  val BA = new Country("Bosnia and Herzegovina")
  val BW = new Country("Botswana")
  val BR = new Country("Brazil")
  val BG = new Country("Bulgaria")
  val KY = new Country("Cayman Islands")
  val CL = new Country("Chile")
  val CN = new Country("China")
  val CO = new Country("Colombia")
  val CR = new Country("Costa Rica")
  val CI = new Country("Cote d'Ivoire")
  val HR = new Country("Croatia")
  val XC = new Country("Curacao")
  val CY = new Country("Cyprus")
  val CZ = new Country("Czech Republic")
  val DK = new Country("Denmark")
  val DM = new Country("Dominica")
  val DO = new Country("Dominican Republic")
  val EC = new Country("Ecuador")
  val EG = new Country("Egypt")
  val SV = new Country("El Salvador")
  val EE = new Country("Estonia")
  val FJ = new Country("Fiji")
  val FI = new Country("Finland")
  val FR = new Country("France")
  val GA = new Country("Gabon")
  val DE = new Country("Germany")
  val GR = new Country("Greece")
  val GD = new Country("Grenada")
  val GP = new Country("Guadeloupe")
  val GU = new Country("Guam")
  val GT = new Country("Guatemala")
  val GY = new Country("Guyana (British)")
  val GF = new Country("Guyana (French)")
  val HT = new Country("Haiti")
  val HN = new Country("Honduras")
  val HK = new Country("Hong Kong")
  val HU = new Country("Hungary")
  val IS = new Country("Iceland")
  val IN = new Country("India")
  val ID = new Country("Indonesia")
  val IR = new Country("Iran")
  val IQ = new Country("Iraq")
  val IE = new Country("Ireland, Republic Of")
  val IL = new Country("Israel")
  val IT = new Country("Italy")
  val JM = new Country("Jamaica")
  val JP = new Country("Japan")
  val JO = new Country("Jordan")
  val KZ = new Country("Kazakhstan")
  val KR = new Country("Korea, Republic Of")
  val KW = new Country("Kuwait")
  val LV = new Country("Latvia")
  val LB = new Country("Lebanon")
  val LS = new Country("Lesotho")
  val LT = new Country("Lithuania")
  val LU = new Country("Luxembourg")
  val MY = new Country("Malaysia")
  val MT = new Country("Malta")
  val MQ = new Country("Martinique")
  val MU = new Country("Mauritius")
  val MS = new Country("Montserrat")
  val MZ = new Country("Mozambique")
  val NP = new Country("Nepal")
  val NL = new Country("Netherlands")
  val XN = new Country("Nevis")
  val NZ = new Country("New Zealand")
  val NI = new Country("Nicaragua")
  val NG = new Country("Nigeria")
  val NO = new Country("Norway")
  val OM = new Country("Oman")
  val PK = new Country("Pakistan")
  val PA = new Country("Panama")
  val PG = new Country("Papua New Guinea")
  val PY = new Country("Paraguay")
  val PE = new Country("Peru")
  val PH = new Country("Philippines")
  val PL = new Country("Poland")
  val PT = new Country("Portugal")
  val PR = new Country("Puerto Rico")
  val QA = new Country("Qatar")
  val UG = new Country("Republic of Uganda")
  val RE = new Country("Reunion Islands")
  val RO = new Country("Romania")
  val RU = new Country("Russian Federation The")
  val SA = new Country("Saudi Arabia")
  val RS = new Country("Serbia")
  val SC = new Country("Seychelles")
  val SG = new Country("Singapore")
  val SK = new Country("Slovak Republic")
  val SI = new Country("Slovenia")
  val ZA = new Country("South Africa")
  val ES = new Country("Spain")
  val LK = new Country("Sri Lanka")
  val XY = new Country("St Barthelem")
  val XE = new Country("St Eustatius")
  val KN = new Country("St Kitts")
  val LC = new Country("St Lucia")
  val VC = new Country("St Vincent")
  val XM = new Country("St. Maarten")
  val SR = new Country("Suriname")
  val SE = new Country("Sweden")
  val CH = new Country("Switzerland")
  val TW = new Country("Taiwan")
  val ZZ = new Country("Test Country")
  val TH = new Country("Thailand")
  val TT = new Country("Trinidad and Tobago")
  val TR = new Country("Turkey")
  val TC = new Country("Turks and Caicos Islands")
  val UA = new Country("Ukraine")
  val AE = new Country("United Arab Emirates")
  val TZ = new Country("United Republic of Tanzania")
  val UY = new Country("Uruguay")
  val VE = new Country("Venezuela")
  val VN = new Country("Vietnam")
  val VG = new Country("Virgin Islands (British)")
  val VI = new Country("Virgin Islands (US)")
  val ZM = new Country("Zambia")
  val ZW = new Country("Zimbabwe")
}