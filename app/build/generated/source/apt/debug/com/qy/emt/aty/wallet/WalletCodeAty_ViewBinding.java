// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletCodeAty_ViewBinding implements Unbinder {
  private WalletCodeAty target;

  private View view2131296843;

  @UiThread
  public WalletCodeAty_ViewBinding(WalletCodeAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletCodeAty_ViewBinding(final WalletCodeAty target, View source) {
    this.target = target;

    View view;
    target.tvWalletCode = Utils.findRequiredViewAsType(source, R.id.tv_wallet_code, "field 'tvWalletCode'", TextView.class);
    target.ivCodeCopy = Utils.findRequiredViewAsType(source, R.id.iv_code_copy, "field 'ivCodeCopy'", ImageView.class);
    target.nl_wallet_code = Utils.findRequiredViewAsType(source, R.id.nl_wallet_code, "field 'nl_wallet_code'", NavigationLucencyLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_code_copy, "method 'OnClick'");
    view2131296843 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletCodeAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvWalletCode = null;
    target.ivCodeCopy = null;
    target.nl_wallet_code = null;

    view2131296843.setOnClickListener(null);
    view2131296843 = null;
  }
}
