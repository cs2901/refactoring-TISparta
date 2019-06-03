void renderBanner(){
  final boolean isMacOS = platform.toUpperCase().indexOf("MAC") > -1;
  final boolean isIE = browser.toUpperCase().indexOf("IE") > -1);
  final boolean wasResized = resize > 0;
  if (isMacOS && isIE && wasInitialized() && wasResized){
    // do something
  }
}