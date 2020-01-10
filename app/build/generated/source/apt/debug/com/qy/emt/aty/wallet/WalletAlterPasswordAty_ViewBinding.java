// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import com.qy.emt.view.group.password.PayPwdEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletAlterPasswordAty_ViewBinding implements Unbinder {
  private WalletAlterPasswordAty target;

  private View view2131296861;

  @UiThread
  public WalletAlterPasswordAty_ViewBinding(WalletAlterPasswordAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletAlterPasswordAty_ViewBinding(final WalletAlterPasswordAty target, View source) {
    this.target = target;

    View view;
    target.nllWalletPassword = Utils.findRequiredViewAsType(source, R.id.nll_wallet_password, "field 'nllWalletPassword'", NavigationLucencyLayout.class);
    target.ppeWalletAfterSetpassword = Utils.findRequiredViewAsType(source, R.id.ppe_wallet_after_setpassword, "field 'ppeWalletAfterSetpassword'", PayPwdEditText.class);
    target.ppeWalletFterAffirmpassword = Utils.findRequiredViewAsType(source, R.id.ppe_wallet_after_affirmpassword, "field 'ppeWalletFterAffirmpassword'", PayPwdEditText.class);
    view = Utils.findRequiredView(source, R.id.tv_password_after_next, "method 'onClick'");
    view2131296861 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletAlterPasswordAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletPassword = null;
    target.ppeWalletAfterSetpassword = null;
    target.ppeWalletFterAffirmpassword = null;

    view2131296861.setOnClickListener(null);
    view2131296861 = null;
  }
}
