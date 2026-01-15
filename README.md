# MovieCatalogCapstone (Dicoding - Menjadi Android Developer Expert / Capstone)

Tema: **Movie Catalog** menggunakan API TheMovieDB (TMDB).

## Fitur Utama (Sesuai Kriteria)
1. **List Item**: daftar film populer dari TMDB.
2. **Detail Item**: detail film (poster, judul, rating, tanggal rilis, overview).
3. **List Favorite (Database)**: daftar favorit tersimpan di Room **(Dynamic Feature `:favorite`)**.

## Modularization
- `:core` → Android Library: domain + data (network, database, repository, usecase)
- `:app` → Base Application: presentation (list & detail), navigation, DI bootstrap
- `:favorite` → Dynamic Feature: halaman favorite (Room)

## Arsitektur & Teknologi
- Clean Architecture (Domain ↔ Data ↔ Presentation) + Separation Model (Data/Domain/Presentation model berbeda)
- Reactive Programming: **Kotlin Coroutines Flow**
- Dependency Injection: **Koin**
- Network: Retrofit + OkHttp
- Database: Room
- UI: XML + Navigation Component + Material

## Cara Menjalankan (Step-by-step singkat)
1. Buka proyek ini dengan **Android Studio**.
2. Buat API key TMDB:
   - Login di TMDB → Settings → API → ambil **API Key (v3 auth)**.
3. Isi `local.properties` (di root project), tambahkan:
   ```
   TMDB_API_KEY=ISI_API_KEY_KAMU
   ```
   > Jangan pakai tanda kutip.
4. Sync Gradle.
5. Run `app`.

## Catatan penting
- Proyek ini **tidak menyertakan** `gradle-wrapper.jar` (file biner).
  Jika Android Studio meminta wrapper, lakukan:
  - **File → Sync Project with Gradle Files** (biasanya Android Studio akan menyiapkan wrapper), atau
  - Buat project baru (Empty Activity) lalu salin folder `gradle/` + `gradlew*` dari project baru ke sini.
