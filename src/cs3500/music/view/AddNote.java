package cs3500.music.view;

import java.util.ArrayList;

import cs3500.music.controller.ICompositionController;
import cs3500.music.model.INote;

/**
 * Created by nbuqu on 6/25/2016.
 */
public class AddNote implements Runnable {
  private ICompositionController<INote> controller;
  private GuiView<INote> view;

  public AddNote(ICompositionController<INote> controller, GuiView<INote> view) {
    this.controller = controller;
    this.view = view;
  }

  @Override
  public void run() {
    System.out.println("happens");
    NoteBuilderFrame nb = new NoteBuilderFrame();
    nb.buildFrame(controller);
  }
}
