// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletAdvertisingAty_ViewBinding implements Unbinder {
  private WalletAdvertisingAty target;

  @UiThread
  public WalletAdvertisingAty_ViewBinding(WalletAdvertisingAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletAdvertisingAty_ViewBinding(WalletAdvertisingAty target, View source) {
    this.target = target;

    target.nllRegister = Utils.findRequiredViewAsType(source, R.id.nll_register, "field 'nllRegister'", NavigationLucencyLayout.class);
    target.lr_id = Utils.findRequiredViewAsType(source, R.id.lr_id, "field 'lr_id'", LRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletAdvertisingAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllRegister = null;
    target.lr_id = null;
  }
}
