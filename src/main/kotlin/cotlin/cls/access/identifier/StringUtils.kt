package cotlin.cls.access.identifier

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}