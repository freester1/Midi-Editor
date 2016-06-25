package cs3500.music.controller;

import cs3500.music.model.MusicModel;
import cs3500.music.model.Note;
import cs3500.music.view.ICompositionView;

/**
 * Basic interface for a composition controller. It allows for the composition to be built and
 * viewed. No other methods necessary yet
 * K is the given note implementation.
 */
public interface ICompositionController<K> {

  /**
   * EFFECT: passes the model to the view so the view can generate a display
   */
  void constructView();

  /**
   * EFFECT: call the view to display the composition
   */
  void displayView();

  /**
   * instructs the model to removes the note at the given coordinates
   */
  void removeNote(int x, int y);

}
