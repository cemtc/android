// Generated code from Butter Knife. Do not modify!
package com.qy.emt.intro;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.qy.emt.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SlideFragOne_ViewBinding implements Unbinder {
  private SlideFragOne target;

  @UiThread
  public SlideFragOne_ViewBinding(SlideFragOne target, View source) {
    this.target = target;

    target.skip_intro_id = Utils.findRequiredViewAsType(source, R.id.skip_intro_id, "field 'skip_intro_id'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SlideFragOne target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.skip_intro_id = null;
  }
}
