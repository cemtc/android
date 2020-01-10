// Generated code from Butter Knife. Do not modify!
package com.qy.emt.fragment.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NonImportWalletInAty_ViewBinding implements Unbinder {
  private NonImportWalletInAty target;

  @UiThread
  public NonImportWalletInAty_ViewBinding(NonImportWalletInAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NonImportWalletInAty_ViewBinding(NonImportWalletInAty target, View source) {
    this.target = target;

    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    target.nenemic_word_id = Utils.findRequiredViewAsType(source, R.id.nenemic_word_id, "field 'nenemic_word_id'", EditText.class);
    target.wallet_name_id = Utils.findRequiredViewAsType(source, R.id.wallet_name_id, "field 'wallet_name_id'", EditText.class);
    target.create_wallet_buttom_id = Utils.findRequiredViewAsType(source, R.id.create_wallet_buttom_id, "field 'create_wallet_buttom_id'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NonImportWalletInAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
    target.nenemic_word_id = null;
    target.wallet_name_id = null;
    target.create_wallet_buttom_id = null;
  }
}
