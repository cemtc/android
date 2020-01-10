// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.qy.emt.R;
import com.qy.emt.view.group.NavigationLucencyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ImputWalletPriAty_ViewBinding implements Unbinder {
  private ImputWalletPriAty target;

  @UiThread
  public ImputWalletPriAty_ViewBinding(ImputWalletPriAty target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ImputWalletPriAty_ViewBinding(ImputWalletPriAty target, View source) {
    this.target = target;

    target.addWalletNew = Utils.findRequiredViewAsType(source, R.id.add_wallet_new, "field 'addWalletNew'", NavigationLucencyLayout.class);
    target.lRecyclerView = Utils.findRequiredViewAsType(source, R.id.lr_id, "field 'lRecyclerView'", LRecyclerView.class);
    target.import_create_btn = Utils.findRequiredViewAsType(source, R.id.import_create_btn, "field 'import_create_btn'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ImputWalletPriAty target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.addWalletNew = null;
    target.lRecyclerView = null;
    target.import_create_btn = null;
  }
}
