package cs3500.music.view;

import cs3500.music.model.INote;

/**
 * Created by nbuqu on 6/24/2016.
 */
public class ScrollUp implements Runnable {
  private GuiView<INote> view;

  public ScrollUp(GuiView<INote> view) {
    this.view = view;
  }

  @Override
  public void run() {
    this.view.scrollY(-5);
  }
}