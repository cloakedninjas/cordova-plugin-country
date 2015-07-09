cordova-plugin-country
======================

Get the 2-letter ISO code from Android's Locale package. Useful when your device may not have GPS or cellular data.

# Usage #

```javascript
function success (countryCode) {
  console.log(countryCode);
}

function error () {
  console.warn('An error occured');
}

plugins.country.get(success, error);
```
