// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.MyWebView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FindFragkl_ViewBinding implements Unbinder {
  private FindFragkl target;

  @UiThread
  public FindFragkl_ViewBinding(FindFragkl target, View source) {
    this.target = target;

    target.myv_advertising = Utils.findRequiredViewAsType(source, R.id.myv_advertising, "field 'myv_advertising'", MyWebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FindFragkl target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.myv_advertising = null;
  }
}
