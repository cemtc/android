// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CurrVersionAty_ViewBinding implements Unbinder {
  private CurrVersionAty target;

  @UiThread
  public CurrVersionAty_ViewBinding(CurrVersionAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CurrVersionAty_ViewBinding(CurrVersionAty target, View source) {
    this.target = target;

    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    target.local_version = Utils.findRequiredViewAsType(source, R.id.local_version, "field 'local_version'", TextView.class);
    target.server_version = Utils.findRequiredViewAsType(source, R.id.server_version, "field 'server_version'", TextView.class);
    target.check_update = Utils.findRequiredViewAsType(source, R.id.check_update, "field 'check_update'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CurrVersionAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
    target.local_version = null;
    target.server_version = null;
    target.check_update = null;
  }
}
