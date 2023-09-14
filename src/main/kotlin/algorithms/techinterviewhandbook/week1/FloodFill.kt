package algorithms.techinterviewhandbook.week1

/**
 * https://leetcode.com/problems/flood-fill/
 */
fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val currentColor = image[sr][sc]
    if (currentColor != color) {
        changeColor(image, sr, sc, currentColor, color)
    }
    return image
}

private fun changeColor(image: Array<IntArray>, sr: Int, sc: Int, color: Int, newColor: Int) {
    val currentColor = image[sr][sc]
    if (currentColor == color) {
        image[sr][sc] = newColor
        if (sr - 1 >= 0) changeColor(image, sr - 1, sc, color, newColor)
        if (sr + 1 < image.size) changeColor(image, sr + 1, sc, color, newColor)
        if (sc + 1 < image.first().size) changeColor(image, sr, sc + 1, color, newColor)
        if (sc - 1 >= 0) changeColor(image, sr, sc - 1, color, newColor)
    }
}