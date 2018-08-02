package com.github.satoshun.reactivex.webkit;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.github.satoshun.reactivex.webkit.data.RxWebChromeClientData;
import com.github.satoshun.reactivex.webkit.internal.ObjectHelper;
import io.reactivex.Observable;

/**
 * static factory methods for creating {@linkplain io.reactivex.Observable}
 */
public class RxWebChromeClient {

  /**
   * Create an observable of WebView from WebChromeClient.
   */
  @CheckResult @NonNull
  public static Observable<RxWebChromeClientData> events(@NonNull WebView webView) {
    return events(webView, null);
  }

  /**
   * Create an observable of WebView from WebChromeClient.
   */
  @CheckResult @NonNull
  public static Observable<RxWebChromeClientData> events(@NonNull WebView webView, @Nullable WebChromeClient delegate) {
    ObjectHelper.requireNonNull(webView, "webView is null");
    return new AllChromeOnObservable(webView, delegate);
  }
}
