// Generated code from Butter Knife. Do not modify!
package com.qy.emt.aty.wallet;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NoticeTwoFrag_ViewBinding implements Unbinder {
  private NoticeTwoFrag target;

  @UiThread
  public NoticeTwoFrag_ViewBinding(NoticeTwoFrag target, View source) {
    this.target = target;

    target.vpRecyclerView = Utils.findRequiredViewAsType(source, R.id.vp_wallet, "field 'vpRecyclerView'", LRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoticeTwoFrag target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vpRecyclerView = null;
  }
}
