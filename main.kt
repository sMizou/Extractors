
// a data class to return $originalUrl, $refererUrl, $downloadUrl
data class Triple<out A, out B, out C>(
    val originalUrl: A,
    val refererUrl: B,
    val downloadUrl: C
) : Serializable {

    override fun toString(): String = "($originalUrl, $refererUrl, $downloadUrl)"

}
