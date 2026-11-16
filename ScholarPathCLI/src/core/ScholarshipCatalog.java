package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.EducationLevel;
import model.EligibilityCriteria;
import model.Scholarship;

public class ScholarshipCatalog {
    private final List<Scholarship> scholarships;

    public ScholarshipCatalog() {
        this.scholarships = new ArrayList<>();
        seedAllScholarships();
    }

    public List<Scholarship> findByCohort(EducationLevel level, int term) {
        List<Scholarship> results = new ArrayList<>();
        for (Scholarship item : scholarships) {
            if (item.matches(level, term)) {
                results.add(item);
            }
        }
        return Collections.unmodifiableList(results);
    }

    private void register(EducationLevel level, int term, String name, String category, String note) {
        EligibilityCriteria criteria = new EligibilityCriteria(level, term, note);
        scholarships.add(new Scholarship(name, category, criteria));
    }

    private void seedAllScholarships() {
        seedKelas10();
        seedKelas11();
        seedKelas12();
        seedSemester1();
        seedSemester2();
        seedSemester3();
        seedSemester4();
        seedSemester5();
        seedSemester6();
        seedSemester7();
        seedSemester8();
    }

    private void seedKelas10() {
        EducationLevel s = EducationLevel.SISWA;
        register(s, 10, "Program Indonesia Pintar (PIP)", "Pemerintah / Bantuan Pendidikan",
                "Bantuan dana pendidikan nasional bagi siswa SMA/SMK/MA sederajat");
        register(s, 10, "SCG Sharing the Dream", "Swasta / CSR",
                "Beasiswa pendidikan dan pembinaan pelajar berprestasi");
        register(s, 10, "Beasiswa Bidik Anak Negeri", "Sosial & Pendidikan",
                "Dukungan biaya pendidikan bagi pelajar SMA/SMK/MA sederajat");
        register(s, 10, "Beasiswa Prestasi Kita", "Prestasi & Umum",
                "Apresiasi prestasi akademik maupun non-akademik tingkat pelajar");
        register(s, 10, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan berbasis esai bagi pelajar aktif");
        register(s, 10, "Beasiswa Cahaya Prestasi", "Prestasi & Umum",
                "Program dukungan dana pendidikan bagi pelajar berprestasi");
        register(s, 10, "Beasiswa Pelajar Juara", "Prestasi & Umum",
                "Program apresiasi pendidikan untuk pelajar SMA/SMK/MA sederajat");
        register(s, 10, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat daerah/provinsi seperti BAZNAS Kalimantan Selatan");
        register(s, 10, "Beasiswa AFS / Bina Antarbudaya (Pertukaran Pelajar)", "Pertukaran Pelajar",
                "Program pertukaran pelajar internasional antarbudaya");
    }

    private void seedKelas11() {
        EducationLevel s = EducationLevel.SISWA;
        register(s, 11, "Program Indonesia Pintar (PIP)", "Pemerintah / Bantuan Pendidikan",
                "Bantuan dana pendidikan nasional bagi siswa SMA/SMK/MA sederajat");
        register(s, 11, "Smart Scholarship YBM BRILiaN", "Filantropi / BUMN",
                "Beasiswa tunjangan pendidikan dan pembinaan pelajar");
        register(s, 11, "Beasiswa Amartha Cendekia", "Swasta / Pemberdayaan",
                "Dukungan pendidikan dan persiapan jenjang lanjut bagi siswa kelas 11");
        register(s, 11, "Youth Ekselensia Scholarship (YES)", "Kepemimpinan & Persiapan Kuliah",
                "Pembinaan intensif akademik dan kepemimpinan pelajar");
        register(s, 11, "SCG Sharing the Dream", "Swasta / CSR",
                "Beasiswa pendidikan dan pembinaan pelajar berprestasi");
        register(s, 11, "Beasiswa Bidik Anak Negeri", "Sosial & Pendidikan",
                "Dukungan biaya pendidikan bagi pelajar SMA/SMK/MA sederajat");
        register(s, 11, "Beasiswa Prestasi Kita", "Prestasi & Umum",
                "Apresiasi prestasi akademik maupun non-akademik tingkat pelajar");
        register(s, 11, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan berbasis esai bagi pelajar aktif");
        register(s, 11, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat daerah/provinsi seperti BAZNAS Kalimantan Selatan");
        register(s, 11, "Program Beasiswa BCA (PPBP & PPTI)", "Swasta / Pendidikan Bisnis & TI",
                "Dibuka untuk siswa kelas 11 yang akan naik ke kelas 12 / lulusan");
        register(s, 11, "Beasiswa Pertukaran Pelajar KL-YES / AFS", "Pertukaran Pelajar",
                "Tergantung batas usia & tahun keberangkatan");
    }

    private void seedKelas12() {
        EducationLevel s = EducationLevel.SISWA;
        register(s, 12, "KIP Kuliah (Kartu Indonesia Pintar Kuliah)", "Pemerintah / Kuliah",
                "Pembiayaan kuliah dan tunjangan biaya hidup bagi lulusan SMA/SMK/MA sederajat");
        register(s, 12, "Beasiswa Unggulan Kemendikbudristek", "Pemerintah / Prestasi",
                "Beasiswa penuh pendidikan tinggi bagi calon mahasiswa baru berprestasi");
        register(s, 12, "Beasiswa Indonesia Maju (BIM)", "Pemerintah / Prestasi",
                "Program persiapan dan beasiswa S1 dalam/luar negeri bagi siswa berprestasi");
        register(s, 12, "Program Beasiswa BCA (PPBP & PPTI)", "Swasta / Pendidikan Bisnis & TI",
                "Program pendidikan bisnis/perbankan dan teknik informatika penuh");
        register(s, 12, "Beasiswa Bakti BCA", "Swasta / CSR",
                "Dukungan dana pendidikan dan pengembangan kompetensi mahasiswa");
        register(s, 12, "Beasiswa Teladan Tanoto Foundation", "Filantropi / Kepemimpinan",
                "Beasiswa pendidikan tinggi dan pelatihan kepemimpinan terstruktur");
        register(s, 12, "Beasiswa Etos ID", "Lembaga Zakat / Pembinaan",
                "Bantuan biaya pendidikan dan pembinaan karakter calon mahasiswa");
        register(s, 12, "Beasiswa Cendekia BAZNAS (BCB)", "Lembaga Zakat / Nasional",
                "Beasiswa pendidikan tinggi di perguruan tinggi mitra BAZNAS");
        register(s, 12, "Beasiswa Adaro (YPMA - Yayasan Pelayanan Masyarakat Adaro)", "Swasta / Regional",
                "Khusus wilayah Kalimantan Selatan & sekitarnya");
        register(s, 12, "Beasiswa Utusan Daerah (BUD) IPB", "Kemitraan Daerah / PTN",
                "Jalur kemitraan pemerintah daerah/instansi untuk studi S1 di IPB");
        register(s, 12, "Beasiswa Mitsui-Bussan (S1 Jepang)", "Internasional / Jepang",
                "Beasiswa penuh jenjang sarjana (S1) di Jepang");
        register(s, 12, "Beasiswa Monbukagakusho / MEXT (G to G Jepang)", "Internasional / Pemerintah Jepang",
                "Beasiswa penuh pemerintah Jepang jalur G to G untuk lulusan SMA/SMK");
        register(s, 12, "Beasiswa Global Korea Scholarship (GKS - S1 Korea Selatan)", "Internasional / Pemerintah Korea",
                "Beasiswa penuh pemerintah Korea Selatan untuk jenjang S1");
        register(s, 12, "Beasiswa Türkiye Bursları (S1 Turki)", "Internasional / Pemerintah Turki",
                "Beasiswa penuh pemerintah Turki untuk jenjang sarjana (S1)");
        register(s, 12, "Program Indonesia Pintar (PIP)", "Pemerintah / Bantuan Sekolah",
                "Untuk semester berjalan di kelas 12");
    }

    private void seedSemester1() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 1, "KIP Kuliah (Kartu Indonesia Pintar Kuliah)", "Pemerintah / Bantuan Pendidikan",
                "Bantuan biaya pendidikan dan biaya hidup bagi mahasiswa baru");
        register(m, 1, "Beasiswa Unggulan Kemendikdasmen", "Pemerintah / Prestasi",
                "Jalur Masyarakat Berprestasi untuk mahasiswa baru");
        register(m, 1, "Beasiswa Pendidikan Indonesia (BPI)", "Pemerintah / Kemendikdasmen-LPDP",
                "Beasiswa penuh jenjang sarjana/vokasi bagi mahasiswa baru");
        register(m, 1, "Beasiswa Indonesia Maju (BIM)", "Pemerintah / Prestasi",
                "Lanjutan dukungan studi S1 bagi talenta berprestasi");
        register(m, 1, "Beasiswa Teladan Tanoto Foundation", "Filantropi / Kepemimpinan",
                "Khusus kampus mitra");
        register(m, 1, "Beasiswa Paragon (Paragon Scholarship Program)", "Swasta / Inovasi",
                "Dukungan dana pendidikan dan pengembangan karier mahasiswa");
        register(m, 1, "Beasiswa Grab (GrabScholar)", "Swasta / CSR",
                "Bantuan biaya pendidikan bagi mahasiswa baru");
        register(m, 1, "Bright Scholarship YBM BRILiaN", "Filantropi / Kepemimpinan",
                "Beasiswa biaya pendidikan, fasilitas asrama, dan pembinaan kepemimpinan");
        register(m, 1, "Beasiswa Etos ID", "Lembaga Zakat / Pembinaan",
                "Beasiswa biaya hidup dan pembinaan intensif mahasiswa baru");
        register(m, 1, "Beasiswa BCA Finance Peduli", "Swasta / CSR",
                "Bantuan dana pendidikan bagi mahasiswa aktif");
        register(m, 1, "Beasiswa Pertamina Sobat Bumi", "BUMN / Keberlanjutan",
                "Jalur reguler/afirmasi/vokasi sesuai pembukaan");
        register(m, 1, "Beasiswa Amgala Vision", "Filantropi / Pendidikan",
                "Dukungan pendidikan bagi mahasiswa berprestasi");
        register(m, 1, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan berbasis esai bagi mahasiswa aktif");
        register(m, 1, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat daerah/provinsi seperti BAZNAS Kalimantan Selatan");
    }

    private void seedSemester2() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 2, "Beasiswa Karya Salemba Empat (KSE)", "Paguyuban / PTN",
                "Untuk kampus mitra PTN");
        register(m, 2, "Beasiswa Van Deventer-Maas Indonesia (VDMI)", "Yayasan / Kemitraan",
                "Untuk kampus mitra");
        register(m, 2, "Beasiswa Meratus Foundation (Lantern of Hope)", "Swasta / Regional",
                "Khusus program studi tertentu");
        register(m, 2, "Beasiswa Desamind", "Komunitas / Sosial",
                "Beasiswa dan pembinaan proyek sosial mahasiswa");
        register(m, 2, "Beasiswa Cendekia BAZNAS (BCB)", "Lembaga Zakat / Nasional",
                "Tergantung ketentuan jadwal BAZNAS pusat/daerah & kampus mitra");
        register(m, 2, "Beasiswa Unggulan Kemendikdasmen", "Pemerintah / Prestasi",
                "Jalur Masyarakat Berprestasi untuk mahasiswa on-going maksimal semester 3");
        register(m, 2, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan bagi mahasiswa aktif");
        register(m, 2, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat provinsi/kabupaten seperti BAZNAS Kalimantan Selatan");
        register(m, 2, "Beasiswa Pendidikan Pemda / Daerah", "Pemerintah Daerah",
                "Sesuai domisili KTP atau daerah kampus");
        register(m, 2, "Beasiswa PPA / Peningkatan Prestasi Akademik (Internal Kampus)", "Internal Perguruan Tinggi",
                "Sesuai kebijakan masing-masing perguruan tinggi");
    }

    private void seedSemester3() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 3, "Beasiswa Bakti BCA", "Swasta / CSR",
                "Khusus mahasiswa S1 PTN semester 3");
        register(m, 3, "Beasiswa Unggulan Kemendikdasmen", "Pemerintah / Prestasi",
                "Jalur Masyarakat Berprestasi untuk mahasiswa on-going maksimal semester 3");
        register(m, 3, "Beasiswa Bank Indonesia (GenBI - Generasi Baru Indonesia)", "Bank Sentral / Kepemimpinan",
                "Untuk kampus mitra PTN/PTS");
        register(m, 3, "Beasiswa Bank Mega Syariah", "Perbankan Syariah / CSR",
                "Minimal semester 3");
        register(m, 3, "Beasiswa Karya Salemba Empat (KSE)", "Paguyuban / PTN",
                "Untuk kampus mitra PTN");
        register(m, 3, "Beasiswa Cendekia BAZNAS (BCB)", "Lembaga Zakat / Nasional",
                "Tergantung ketentuan jadwal pusat/daerah & kampus mitra");
        register(m, 3, "Beasiswa Van Deventer-Maas Indonesia (VDMI)", "Yayasan / Kemitraan",
                "Untuk kampus mitra");
        register(m, 3, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan bagi mahasiswa aktif");
        register(m, 3, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat provinsi/kabupaten seperti BAZNAS Kalimantan Selatan");
        register(m, 3, "Beasiswa Pendidikan Pemda / Daerah", "Pemerintah Daerah",
                "Sesuai domisili KTP atau wilayah kampus");
        register(m, 3, "Beasiswa PPA / Peningkatan Prestasi Akademik (Internal Kampus)", "Internal Perguruan Tinggi",
                "Sesuai kebijakan masing-masing perguruan tinggi");
    }

    private void seedSemester4() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 4, "Djarum Beasiswa Plus", "Swasta / Soft Skills",
                "Khusus mahasiswa S1/D4 semester 4 di kampus mitra");
        register(m, 4, "Beasiswa BCA Finance Peduli", "Swasta / CSR",
                "Terbuka untuk mahasiswa aktif S1/D4 PTN/PTS semester 4–6");
        register(m, 4, "Beasiswa Pertamina Sobat Bumi", "BUMN / Keberlanjutan",
                "Untuk mahasiswa aktif semester 2–6 di kampus mitra");
        register(m, 4, "Paragon Scholarship Program", "Swasta / Inovasi",
                "Untuk mahasiswa semester 4");
        register(m, 4, "Beasiswa Glow and Lovely (Bintang Beasiswa)", "Swasta / Afirmasi Mahasiswi",
                "Khusus mahasiswi S1 PTN semester 4 atau 6");
        register(m, 4, "Beasiswa Astra1st", "Swasta / Pengembangan Talenta",
                "Program beasiswa dan pengembangan profesional mahasiswa");
        register(m, 4, "Beasiswa CIMB Niaga KejarMimpi", "Perbankan / Kepemimpinan",
                "Dukungan pendidikan dan komunitas pengembangan diri mahasiswa");
        register(m, 4, "Beasiswa Bank Indonesia (GenBI - Generasi Baru Indonesia)", "Bank Sentral / Kepemimpinan",
                "Tergantung jadwal seleksi kampus mitra");
        register(m, 4, "Beasiswa Karya Salemba Empat (KSE)", "Paguyuban / PTN",
                "Untuk kampus mitra PTN");
        register(m, 4, "Beasiswa Van Deventer-Maas Indonesia (VDMI)", "Yayasan / Kemitraan",
                "Untuk kampus mitra");
        register(m, 4, "Beasiswa Meratus Foundation (Lantern of Hope)", "Swasta / Regional",
                "Khusus jenjang D3/D4 atau kampus mitra tertentu");
        register(m, 4, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan bagi mahasiswa aktif");
        register(m, 4, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat provinsi/kabupaten seperti BAZNAS Kalimantan Selatan");
        register(m, 4, "Beasiswa Pendidikan Pemda / Daerah", "Pemerintah Daerah",
                "Sesuai domisili KTP atau daerah kampus");
        register(m, 4, "Beasiswa PPA / Peningkatan Prestasi Akademik (Internal Kampus)", "Internal Perguruan Tinggi",
                "Sesuai kebijakan masing-masing perguruan tinggi");
    }

    private void seedSemester5() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 5, "Beasiswa CIMB Niaga", "Perbankan / Prestasi",
                "Khusus mahasiswa aktif S1/D4 semester 5 di seluruh PTN/PTS");
        register(m, 5, "Beasiswa Cendekia BAZNAS (BCB)", "Lembaga Zakat / Nasional",
                "Terbuka untuk mahasiswa S1/D4 semester 5 di kampus mitra BAZNAS");
        register(m, 5, "Beasiswa FIFGROUP Young Leader", "Swasta / Kepemimpinan",
                "Untuk mahasiswa S1/D4 minimal semester 5 di seluruh PTN/PTS");
        register(m, 5, "Beasiswa Pembangunan Jaya", "Swasta / Pendidikan",
                "Untuk mahasiswa S1 semester 5 atau 7 di kampus mitra");
        register(m, 5, "Beasiswa BCA Finance Peduli", "Swasta / CSR",
                "Terbuka untuk mahasiswa aktif S1/D4 PTN/PTS semester 4–6");
        register(m, 5, "Beasiswa Pertamina Sobat Bumi", "BUMN / Keberlanjutan",
                "Untuk mahasiswa aktif semester 2–6 di kampus mitra");
        register(m, 5, "Beasiswa Bakti BCA", "Swasta / CSR",
                "Untuk mahasiswa S1 PTN semester 3 ke atas");
        register(m, 5, "Beasiswa Bank Indonesia (GenBI - Generasi Baru Indonesia)", "Bank Sentral / Kepemimpinan",
                "Untuk mahasiswa S1/D3 di kampus mitra PTN/PTS yang telah menempuh minimal 40 SKS");
        register(m, 5, "Beasiswa Karya Salemba Empat (KSE)", "Paguyuban / PTN",
                "Untuk kampus mitra PTN");
        register(m, 5, "Beasiswa Van Deventer-Maas Indonesia (VDMI)", "Yayasan / Kemitraan",
                "Untuk kampus mitra");
        register(m, 5, "Beasiswa Aktivis Nusantara (BAKTI NUSA)", "Kepemimpinan Aktivis",
                "Program pengembangan kepemimpinan bagi aktivis mahasiswa S1");
        register(m, 5, "Beasiswa PET Bakti Muda", "Swasta / Pemberdayaan",
                "Untuk mahasiswa S1 semester 5 dan 7");
        register(m, 5, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan bagi mahasiswa aktif");
        register(m, 5, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat provinsi/kabupaten seperti BAZNAS Kalimantan Selatan");
        register(m, 5, "Beasiswa Pendidikan Pemda / Daerah", "Pemerintah Daerah",
                "Sesuai domisili KTP atau wilayah kampus");
        register(m, 5, "Beasiswa PPA / Peningkatan Prestasi Akademik (Internal Kampus)", "Internal Perguruan Tinggi",
                "Sesuai kebijakan masing-masing perguruan tinggi");
    }

    private void seedSemester6() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 6, "Beasiswa BCA Finance Peduli", "Swasta / CSR",
                "Terbuka untuk mahasiswa aktif S1/D4 PTN/PTS semester 4–6");
        register(m, 6, "Beasiswa Glow and Lovely (Bintang Beasiswa)", "Swasta / Afirmasi Mahasiswi",
                "Khusus mahasiswi S1 PTN semester 4 atau 6");
        register(m, 6, "Thiess Undergraduate Scholarship Program", "Swasta / Pertambangan & Magang",
                "Khusus mahasiswa S1 semester 6, dilengkapi kesempatan magang di proyek pertambangan");
        register(m, 6, "Beasiswa Pertamina Sobat Bumi", "BUMN / Keberlanjutan",
                "Untuk mahasiswa aktif semester 2–6 di kampus mitra");
        register(m, 6, "Beasiswa Van Deventer-Maas Indonesia (VDMI)", "Yayasan / Kemitraan",
                "Untuk mahasiswa D3/D4/S1 semester 2–6 di kampus mitra");
        register(m, 6, "Beasiswa Bank Indonesia (GenBI - Generasi Baru Indonesia)", "Bank Sentral / Kepemimpinan",
                "Untuk mahasiswa S1/D3 di kampus mitra PTN/PTS yang telah menempuh minimal 40 SKS");
        register(m, 6, "Beasiswa FIFGROUP Young Leader", "Swasta / Kepemimpinan",
                "Untuk mahasiswa S1/D4 minimal semester 5 di seluruh PTN/PTS");
        register(m, 6, "Beasiswa Bakti BCA", "Swasta / CSR",
                "Untuk mahasiswa S1 PTN semester 3 ke atas");
        register(m, 6, "Beasiswa Karya Salemba Empat (KSE)", "Paguyuban / PTN",
                "Untuk kampus mitra PTN");
        register(m, 6, "BSI Scholarship", "Perbankan Syariah / CSR",
                "Untuk mahasiswa D3/S1 di kampus mitra sesuai jalur yang dibuka");
        register(m, 6, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan bagi mahasiswa aktif");
        register(m, 6, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat provinsi/kabupaten seperti BAZNAS Kalimantan Selatan");
        register(m, 6, "Beasiswa Pendidikan Pemda / Daerah", "Pemerintah Daerah",
                "Sesuai domisili KTP atau wilayah kampus");
        register(m, 6, "Beasiswa PPA / Peningkatan Prestasi Akademik (Internal Kampus)", "Internal Perguruan Tinggi",
                "Sesuai kebijakan masing-masing perguruan tinggi");
    }

    private void seedSemester7() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 7, "BSI Scholarship Talenta", "Perbankan Syariah / Talenta",
                "Khusus mahasiswa S1 semester 7 di kampus/jurusan mitra, mencakup bantuan UKT 2 semester & biaya tugas akhir");
        register(m, 7, "BSI Scholarship Afirmasi", "Perbankan Syariah / Afirmasi",
                "Diprioritaskan bagi mahasiswa S1 semester 7 dari keluarga kurang mampu di kampus mitra");
        register(m, 7, "Beasiswa Aktivis Nusantara (BAKTI NUSA)", "Kepemimpinan Aktivis",
                "Khusus mahasiswa muslim D4/S1 semester 7 yang aktif berorganisasi di kampus mitra");
        register(m, 7, "Beasiswa Unggulan KSE (Karya Salemba Empat)", "Paguyuban / Tugas Akhir",
                "Bantuan khusus penyelesaian skripsi/tugas akhir bagi mahasiswa S1 semester 7–8 di kampus mitra");
        register(m, 7, "Beasiswa Riset BAZNAS", "Lembaga Zakat / Riset & Skripsi",
                "Bantuan dana penelitian/tugas akhir/skripsi untuk mahasiswa D4/S1");
        register(m, 7, "BRILiaN Scholarship Program", "BUMN / Talenta",
                "Terbuka untuk mahasiswa semester 5–8 di perguruan tinggi mitra terakreditasi A");
        register(m, 7, "Beasiswa Pembangunan Jaya", "Swasta / Pendidikan",
                "Untuk mahasiswa S1 semester 5 atau 7 di kampus mitra");
        register(m, 7, "Beasiswa PET Bakti Muda", "Swasta / Pemberdayaan",
                "Untuk mahasiswa S1 semester 5 dan 7");
        register(m, 7, "Beasiswa Bakti BCA", "Swasta / CSR",
                "Untuk mahasiswa S1 PTN semester 3 ke atas");
        register(m, 7, "Beasiswa FIFGROUP Young Leader", "Swasta / Kepemimpinan",
                "Untuk mahasiswa S1/D4 minimal semester 5 di seluruh PTN/PTS");
        register(m, 7, "Beasiswa DataPrint", "Swasta / Umum",
                "Bantuan biaya pendidikan bagi mahasiswa aktif");
        register(m, 7, "Beasiswa BAZNAS", "Lembaga Zakat / Daerah",
                "Tingkat provinsi/kabupaten seperti BAZNAS Kalimantan Selatan, termasuk kategori bantuan tugas akhir jika tersedia");
        register(m, 7, "Beasiswa Pendidikan Pemda / Daerah", "Pemerintah Daerah",
                "Sesuai domisili KTP atau wilayah kampus");
        register(m, 7, "Beasiswa PPA / Bantuan Tugas Akhir Internal Kampus", "Internal Perguruan Tinggi",
                "Sesuai kebijakan masing-masing perguruan tinggi");
    }

    private void seedSemester8() {
        EducationLevel m = EducationLevel.MAHASISWA;
        register(m, 8, "Beasiswa Unggulan KSE (Karya Salemba Empat)", "Paguyuban / Tugas Akhir",
                "Bantuan khusus penyelesaian skripsi/tugas akhir bagi mahasiswa S1 semester 7–8 di kampus mitra");
        register(m, 8, "Beasiswa Riset BAZNAS", "Lembaga Zakat / Riset & Skripsi",
                "Bantuan dana penelitian/tugas akhir/skripsi untuk mahasiswa D4/S1 seluruh Indonesia");
        register(m, 8, "Indofood Riset Nugraha (IRN)", "Swasta / Riset Pangan & Pertanian",
                "Bantuan dana penelitian skripsi S1 bertema pangan, gizi, pertanian, peternakan, perikanan, dan bidang terkait");
        register(m, 8, "BRILiaN Scholarship Program", "BUMN / Talenta",
                "Terbuka untuk mahasiswa semester 5–8 di perguruan tinggi mitra terakreditasi A");
        register(m, 8, "Beasiswa Tugas Akhir Permata Bank Syariah", "Perbankan Syariah / Tugas Akhir",
                "Bantuan penyelesaian skripsi/tugas akhir bagi mahasiswa tingkat akhir di kampus mitra");
        register(m, 8, "Beasiswa DataPrint", "Swasta / Umum",
                "Terbuka untuk mahasiswa aktif jenjang D3/D4/S1");
        register(m, 8, "Beasiswa BAZNAS Daerah", "Lembaga Zakat / Daerah",
                "Tingkat provinsi/kabupaten seperti BAZNAS Kalimantan Selatan, khususnya kategori bantuan tugas akhir/skripsi");
        register(m, 8, "Beasiswa Pendidikan Pemda / Daerah", "Pemerintah Daerah",
                "Sesuai domisili KTP atau wilayah kampus, sering kali memiliki jalur bantuan penyelesaian studi");
        register(m, 8, "Beasiswa / Bantuan Tugas Akhir Internal Kampus", "Internal Perguruan Tinggi",
                "Seperti bantuan penyelesaian skripsi dari direktorat kemahasiswaan atau unit pengumpul zakat kampus");
    }
}