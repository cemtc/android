// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VerificationMnemonicWordAty_ViewBinding implements Unbinder {
  private VerificationMnemonicWordAty target;

  private View view2131296857;

  @UiThread
  public VerificationMnemonicWordAty_ViewBinding(VerificationMnemonicWordAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VerificationMnemonicWordAty_ViewBinding(final VerificationMnemonicWordAty target,
      View source) {
    this.target = target;

    View view;
    target.nllVerificationMnemonic = Utils.findRequiredViewAsType(source, R.id.nll_verification_mnemonic, "field 'nllVerificationMnemonic'", NavigationLucencyLayout.class);
    target.rvVerificationMnemonic = Utils.findRequiredViewAsType(source, R.id.rv_verification_mnemonic, "field 'rvVerificationMnemonic'", RecyclerView.class);
    target.tvVerificationMnemonic = Utils.findRequiredViewAsType(source, R.id.tv_verification_mnemonic, "field 'tvVerificationMnemonic'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_mnemonic_next, "method 'onClick'");
    view2131296857 = view;
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
    VerificationMnemonicWordAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nllVerificationMnemonic = null;
    target.rvVerificationMnemonic = null;
    target.tvVerificationMnemonic = null;

    view2131296857.setOnClickListener(null);
    view2131296857 = null;
  }
}
