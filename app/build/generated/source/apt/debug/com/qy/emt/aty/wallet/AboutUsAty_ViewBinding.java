// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutUsAty_ViewBinding implements Unbinder {
  private AboutUsAty target;

  @UiThread
  public AboutUsAty_ViewBinding(AboutUsAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutUsAty_ViewBinding(AboutUsAty target, View source) {
    this.target = target;

    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutUsAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
  }
}
