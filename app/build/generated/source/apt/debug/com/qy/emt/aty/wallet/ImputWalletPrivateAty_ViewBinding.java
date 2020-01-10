// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ImputWalletPrivateAty_ViewBinding implements Unbinder {
  private ImputWalletPrivateAty target;

  private View view2131296902;

  private View view2131296905;

  @UiThread
  public ImputWalletPrivateAty_ViewBinding(ImputWalletPrivateAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ImputWalletPrivateAty_ViewBinding(final ImputWalletPrivateAty target, View source) {
    this.target = target;

    View view;
    target.nllPrivateWallet = Utils.findRequiredViewAsType(source, R.id.nll_private_wallet, "field 'nllPrivateWallet'", NavigationLucencyLayout.class);
    target.etPrivateWallet = Utils.findRequiredViewAsType(source, R.id.et_private_wallet, "field 'etPrivateWallet'", EditText.class);
    target.tvPrivateWallet = Utils.findRequiredViewAsType(source, R.id.tv_private_wallet, "field 'tvPrivateWallet'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_wallet_imput, "field 'tvWalletImput' and method 'onClick'");
    target.tvWalletImput = Utils.castView(view, R.id.tv_wallet_imput, "field 'tvWalletImput'", TextView.class);
    view2131296902 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvWalletWallet = Utils.findRequiredViewAsType(source, R.id.tv_wallet_what, "field 'tvWalletWallet'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_wallet_reset, "method 'onClick'");
    view2131296905 = view;
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
    ImputWalletPrivateAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllPrivateWallet = null;
    target.etPrivateWallet = null;
    target.tvPrivateWallet = null;
    target.tvWalletImput = null;
    target.tvWalletWallet = null;

    view2131296902.setOnClickListener(null);
    view2131296902 = null;
    view2131296905.setOnClickListener(null);
    view2131296905 = null;
  }
}
