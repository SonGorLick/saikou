package ani.saikou.parsers

import ani.saikou.Lazier
import ani.saikou.lazyList
import ani.saikou.parsers.anime.*

object AnimeSources : WatchSources() {
    override val list: List<Lazier<BaseParser>> = lazyList(
        "AllAnime" to ::AllAnime,
        "Gogo" to ::Gogo,
        "Zoro" to ::Zoro,
        "Kamyroll" to ::Kamyroll,
        "Tenshi" to ::Tenshi,
        "9Anime" to ::NineAnime,
        "9Anime Backup" to ::AniWatchPro,
        "AnimePahe" to ::AnimePahe,
        "ConsumeBili" to ::ConsumeBili
    )
}

object HAnimeSources : WatchSources() {
    val aList: List<Lazier<BaseParser>>  = lazyList(
        "HentaiMama" to ::HentaiMama,
        "Haho" to ::Haho,
        "HentaiStream" to ::HentaiStream,
        "HentaiFF" to ::HentaiFF,
    )

    override val list = listOf(aList,AnimeSources.list).flatten()
}
