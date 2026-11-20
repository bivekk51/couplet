package com.couplet.lyrics.domain.model

import com.couplet.lyrics.data.db.SnippetEntity
import com.couplet.lyrics.data.db.SongEntity

sealed interface Candidate {
    data class Curated(
        val snippet: SnippetEntity,
        val song: SongEntity
    ) : Candidate

    data class RandomSong(
        val song: SongEntity
    ) : Candidate
}
