if (isWinter()) {
  charge = quantity * winterRate + winterServiceCharge;
} else {
  charge = quantity * summerRate;
}

boolean isWinter () { return date.before(SUMMER_START) || date.after(SUMMER_END); }