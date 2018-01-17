# RxWebView

[![](https://jitpack.io/v/satoshun/RxWebView.svg)](https://jitpack.io/#satoshun/RxWebView) [![CircleCI](https://circleci.com/gh/satoshun/RxWebView.svg?style=svg)](https://circleci.com/gh/satoshun/RxWebView) [![codecov](https://codecov.io/gh/satoshun/RxWebView/branch/master/graph/badge.svg)](https://codecov.io/gh/satoshun/RxWebView)

this project inspires [RxBinding](https://github.com/JakeWharton/RxBinding). It was very helpful. thx!


## install

```
repositories {
  maven { url "https://jitpack.io" }
}

implementation 'com.github.satoshun.RxWebView:rxwebview:2.0.0'

// with kotlin
implementation 'com.github.satoshun.RxWebView:rxwebview-kotlin:2.0.0'
```


## usage

### WebViewClient

observes all events.

```java
WebView webview = new WebView(context);
WebViewClient client = new WebViewClient();
RxWebViewClient.events(webview, client)
    .subscribeOn(AndroidSchedulers.mainThread())
    .ofType(ANY_DATA_TYPE.class)
    .subscribe();
```

For example, you want a `onPageFinished` event.
  
```java
WebView webview = new WebView(context);
WebViewClient client = new WebViewClient();
RxWebViewClient.events(webview, client)
    .subscribeOn(AndroidSchedulers.mainThread())
    .ofType(OnPageFinished.class)
    .subscribe();
```


other types defines into [package](reactivex/src/main/java/com/github/satoshun/reactivex/webkit/data)


### WebChromeClient

observes all events.

```java
WebView webview = new WebView(context);
RxWebChromeClient.events(webview)
    .subscribeOn(AndroidSchedulers.mainThread())
    .ofType(DATA_TYPE.class)
    .subscribe();
```

other types defines into [package](reactivex/src/main/java/com/github/satoshun/reactivex/webkit/data)


## more

- [sample source code](app/src/main/java/com/github/satoshun/reactivex/webkit/example)
