package edu.wpi.first.shuffleboard.widget;

import java.util.Objects;

/**
 * Represents the size of a tile in a grid.
 */
public class TileSize {

  private final int width;
  private final int height;

  /**
   * Creates a size with the given width and height. These must both be positive values.
   */
  public TileSize(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    TileSize size = (TileSize) obj;

    return width == size.width && height == size.height;
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    return String.format("TileSize(width=%d, height=%d)", width, height);
  }
}