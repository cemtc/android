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

public class CreateImportWalletInAty_ViewBinding implements Unbinder {
  private CreateImportWalletInAty target;

  @UiThread
  public CreateImportWalletInAty_ViewBinding(CreateImportWalletInAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreateImportWalletInAty_ViewBinding(CreateImportWalletInAty target, View source) {
    this.target = target;

    target.nll_wallet_market = Utils.findRequiredViewAsType(source, R.id.nll_wallet_market, "field 'nll_wallet_market'", NavigationLucencyLayout.class);
    target.create_wallet_buttom_id = Utils.findRequiredViewAsType(source, R.id.create_wallet_buttom_id, "field 'create_wallet_buttom_id'", Button.class);
    target.wallet_name_id = Utils.findRequiredViewAsType(source, R.id.wallet_name_id, "field 'wallet_name_id'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateImportWalletInAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nll_wallet_market = null;
    target.create_wallet_buttom_id = null;
    target.wallet_name_id = null;
  }
}
