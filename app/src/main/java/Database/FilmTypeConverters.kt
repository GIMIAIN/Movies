package Database

import androidx.room.TypeConverter
import java.time.LocalDate
import java.time.ZoneId
import java.util.Date
import java.util.UUID

class FilmTypeConverters {

    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }
    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }
}