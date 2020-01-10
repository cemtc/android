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

public class WalletPasswordAty_ViewBinding implements Unbinder {
  private WalletPasswordAty target;

  private View view2131296863;

  @UiThread
  public WalletPasswordAty_ViewBinding(WalletPasswordAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletPasswordAty_ViewBinding(final WalletPasswordAty target, View source) {
    this.target = target;

    View view;
    target.nllWalletPassword = Utils.findRequiredViewAsType(source, R.id.nll_wallet_password, "field 'nllWalletPassword'", NavigationLucencyLayout.class);
    target.ppeWalletSetpassword = Utils.findRequiredViewAsType(source, R.id.ppe_wallet_setpassword, "field 'ppeWalletSetpassword'", PayPwdEditText.class);
    target.ppeWalletAffirmpassword = Utils.findRequiredViewAsType(source, R.id.ppe_wallet_affirmpassword, "field 'ppeWalletAffirmpassword'", PayPwdEditText.class);
    view = Utils.findRequiredView(source, R.id.tv_password_next, "method 'onClick'");
    view2131296863 = view;
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
    WalletPasswordAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllWalletPassword = null;
    target.ppeWalletSetpassword = null;
    target.ppeWalletAffirmpassword = null;

    view2131296863.setOnClickListener(null);
    view2131296863 = null;
  }
}
