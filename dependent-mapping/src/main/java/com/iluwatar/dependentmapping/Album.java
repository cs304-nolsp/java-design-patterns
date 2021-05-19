package com.iluwatar.dependentmapping;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Album.
 */
class Album {
  private final List<Track> tracks = new ArrayList<>();
  private final String name;

  /**
   * Instantiates a new Album.
   *
   * @param name the name
   */
  Album(String name) {
    this.name = name;
  }

  /**
   * Gets all track.
   *
   * @return the all track
   */
  List<Track> getAllTrack() {
    return tracks;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  String getName() {
    return name;
  }

  /**
   * Add track.
   *
   * @param track the track
   */
  void addTrack(Track track) {
    tracks.add(track);
  }
}
