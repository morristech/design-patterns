package structural.adapter

data class Point(val x: Int, val y: Int)

data class Rectangle(val topLeft: Point, val bottomRight: Point)

/**
 * A code sample for the Structural Patterns - Adapter chapter of the Design Patterns book.
 */

/**
 * Our program expects Shape objects that implement this interface.
 */
interface Shape {
    fun boundingBox(): Rectangle
}

/**
 * TextView needs to be converted to Shape to be used in our program.
 *
 * TextView is a final class that we cannot modify to extend Shape.
 *
 * We cannot inherit from TextShape to add the functionality so we need an Adapter.
 */
class TextView {
    var x: Int = 0
    var y: Int = 0
    var width: Int = 0
    var height: Int = 0

    fun isEmpty(): Boolean {
        return width == 0 || height == 0
    }
}

/**
 * TextShape acts as an Adapter based on the Design Patterns Adapter specification.
 *
 * It's goal is to provide a Shape (our Target) from a TextView (our Adaptee).
 *
 * We can still access to the TextView with textShape.textView.
 */
class TextShape(val textView: TextView): Shape {
    override fun boundingBox(): Rectangle {
        return Rectangle(
                topLeft = Point(
                        x = textView.x,
                        y = textView.y
                ),
                bottomRight = Point(
                        x = textView.width + textView.x,
                        y = textView.height + textView.y
                )
        )
    }
}
