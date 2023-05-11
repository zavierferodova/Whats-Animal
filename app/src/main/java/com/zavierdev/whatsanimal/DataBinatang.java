package com.zavierdev.whatsanimal;

import java.util.ArrayList;

public class DataBinatang {

    private static String[] NamaHewan = {
            "Kucing",
            "Harimau Putih",
            "Elang Jawa",
            "Burung Hantu Putih",
            "Serigala Abu-Abu",
            "Rusa Sambar",
            "Badak Jawa",
            "Komodo",
            "Beruang Cokelat",
            "Gajah Sumatera",
            "Hiu Macan (Harimau)"
    };

    private static String[] KlasisfikasiHewan = {
            "Animalia|Chordata|Felidae|Mamalia|Carnivora|Felis|Felis Silvestris",
            "Animalia|Chordata|Felidae|Mamalia|Carnivora|Phantera|Panthera Tigris",
            "Animalia|Chordata|Accipitridae|Aves|Accipitriformes|Nisaetus|Nisaetus Bartelsi",
            "Animalia|Chordata|Strigidae|Aves|Strigiformes|Bubo|Bubo Scandiacus",
            "Animalia|Chordata|Canidae|Mamalia|Carnivora|Canis|Canis Lupus",
            "Animalia|Chordata|Cervidae|Mamalia|Artiodactyla|Cervus|Cervus Unicolor",
            "Animalia|Chordata|Rhinocerotidae|Mamalia|Perissodactyla|Rhinoceros|Rhinoceros Sondaicus",
            "Animalia|Chordata|Varanidae|Reptilia|Squamata|Varanus|Varanus Komodoensis",
            "Animalia|Chordata|Ursidae|Mammalia|Carnivora|Ursus|Ursus Arctos",
            "Animalia|Chordata|Elephantidae|Mammalia|Proboscidea|Elephas|Elephas Maximus Sumatranus",
            "Animalia|Chordata|Carcharhinidae|Chondrichthyes|Carcharhiniformes|Galeocerdo|Galeocerdo Cuvier"

    };

    private static String[] DetailHewan = {
            "Kucing disebut juga kucing domestik atau kucing rumah (nama ilmiah: Felis silvestris catus atau Felis catus) adalah sejenis mamalia karnivora dari keluarga Felidae. Kata \"kucing\" biasanya merujuk kepada \"kucing\" yang telah dijinakkan, tetapi bisa juga merujuk kepada \"kucing besar\" seperti singa dan harimau.\n" +
                    "\n" +
                    "Kucing telah berbaur dengan kehidupan manusia paling tidak sejak 6.000 tahun SM, dari kerangka kucing di Pulau Siprus. Orang Mesir Kuno dari 3.500 SM telah menggunakan kucing untuk menjauhkan tikus atau hewan pengerat lain dari lumbung yang menyimpan hasil panen.\n" +
                    "\n" +
                    "Saat ini, kucing adalah salah satu hewan peliharaan terpopuler di dunia. Kucing yang garis keturunannya tercatat secara resmi sebagai kucing trah atau galur murni (pure breed), seperti persia, siam, manx, dan sphinx. Kucing seperti ini biasanya dibiakkan di tempat pemeliharaan hewan resmi. Jumlah kucing ras hanyalah 1% dari seluruh kucing di dunia, sisanya adalah kucing dengan keturunan campuran seperti kucing liar atau kucing kampung.",
            "Harimau putih adalah harimau yang membawa gen resesif yang menghasilkan pewarnaan pucatnya. Ada juga satu fitur genetik yang menyebabkan belangnya juga berwarna pudar. Ini terjadi bila seekor harimau mewarisi dua salinan gen resesif untuk pewarnaan pudar yang jarang terjadi. Harimau putih berhidung merah jambu, berpusat kaki merah jambu, berkulit kelam kelabu, bermata biru es, dan berbulu putih atau putih kuning berbelang hitam, kelabu atau coklat.\n" +
                    "\n" +
                    "Harimau putih bukan albino atau subspesies yang berbeda, jadi bisa berkembangbiak bersama harimau biasa yang berwarna jingga, anaknya adalah heterozigot karena gen pemutihan yang resesif, maka bulunya berwarna jingga, melainkan induk yang jingga pun heterozigot, maka anaknya ada 50% peluang menjadi putih resesif ganda atau jingga heterozigot. Jika dua harimau heterozigot berbiak pula, maka rata-rata 25% anaknya akan berwarna putih, 50% jingga heterozigot (pembawa gen putih) dan 25% yang tersisa jingga homozigot tanpa gen putih. Pada 1970-an, sepasang harimau jingga heterozigot bernama Sashi dan Ravi melahirkan 13 anak dalam Zoo Alipore, tiga darinya berwarna putih. Jika dua harimau putih berbiak, hasilnya 100% anaknya berupa harimau putih homozigot. Harimau yang homozigot untuk gen putihnya dapat juga menjadi heterozigot atau homozigot untuk gen yang lain. Persoalan apakah seseekor harimau itu heterozigot atau homozigot tergantung pada konteks gen yang mana sedang dibahas. Pembiakbakaan dalam mendorong kehomozigotan, maka dijadikan strategi melahirkan harimau putih.\n" +
                    "\n" +
                    "Dibandingkan dengan harimau jingga tanpa gen putih, harimau putih biasanya lebih besar dari lahir lagi hingga mencapai ukuran dewasa sepenuhnya. Inilah salah satu kelebihan yang dimiliki oleh harimau putih dalam habitat liar meskipun berwarna tersebut. Harimau jingga heterozigot pula juga lebih besar dibandingkan harimau jingga yang lain. Kailash Sankhala, direktur kebun binatang New Delhi pada 1960-an mengatakan, \"Salah satu fungsi gen putih ini berkemungkinan untuk mempertahankan suatu 'gen ukuran' dalam populasi harimau dengan ukuran yang lebih besar dari biasanya.\"\n" +
                    "\n" +
                    "Harimau putih individu yang berbelang gelap tercatat sebagai subspesies harimau benggala dan harimau siberia (Panthera tigris altaica) dalam penangkaran, mungkin juga tergolong ke dalam subspesies lainnya. Kini ada ratusan harimau putih dalam penangkaran di seluruh dunia, sekitar seratus dari India dan jumlahnya semakin bertambah. Populasi harimau putih modern mencakup subspesies harimau benggala sejati dan campuran harimau benggala dan harimau siberia tetapi tidak dipastikan apakah gen resesif pemutih ini berasal dari harimau benggala saja atau semua nenek moyangnya berasal dari harimau siberia. ",
            "Elang yang bertubuh sedang sampai besar, langsing, dengan panjang tubuh antara 60-70 cm (dari ujung paruh hingga ujung ekor).\n" +
                    "\n" +
                    "Kepala berwarna coklat kemerahan (kadru), dengan jambul yang tinggi menonjol (2-4 bulu, panjang hingga 12 cm) dan tengkuk yang coklat kekuningan (kadang tampak keemasan bila terkena sinar matahari). Jambul hitam dengan ujung putih; mahkota dan kumis berwarna hitam, sedangkan punggung dan sayap coklat gelap. Kerongkongan keputihan dengan garis (sebetulnya garis-garis) hitam membujur di tengahnya. Ke bawah, ke arah dada, coret-coret hitam menyebar di atas warna kuning kecoklatan pucat, yang pada akhirnya di sebelah bawah lagi berubah menjadi pola garis (coret-coret) rapat melintang merah sawomatang sampai kecoklatan di atas warna pucat keputihan bulu-bulu perut dan kaki. Bulu pada kaki menutup tungkai hingga dekat ke pangkal jari. Ekor kecoklatan dengan empat garis gelap dan lebar melintang yang tampak jelas di sisi bawah, ujung ekor bergaris putih tipis. Betina berwarna serupa, sedikit lebih besar.\n" +
                    "\n" +
                    "Iris mata kuning atau kecoklatan; paruh kehitaman; sera (daging di pangkal paruh) kekuningan; kaki (jari) kekuningan. Burung muda dengan kepala, leher dan sisi bawah tubuh berwarna coklat kayu manis terang, tanpa coretan atau garis-garis.\n" +
                    "\n" +
                    "Ketika terbang, elang jawa serupa dengan elang brontok (Nisaetus cirrhatus) bentuk terang, namun cenderung tampak lebih kecoklatan, dengan perut terlihat lebih gelap, serta berukuran sedikit lebih kecil.\n" +
                    "\n" +
                    "Bunyi nyaring tinggi, berulang-ulang, klii-iiw atau ii-iiiw, bervariasi antara satu hingga tiga suku kata. Atau bunyi bernada tinggi dan cepat kli-kli-kli-kli-kli. Sedikit banyak, suaranya ini mirip dengan suara elang brontok meski perbedaannya cukup jelas dalam nadanya.\n",
            "Burung hantu bersalju adalah burung hantu putih besar dari keluarga burung hantu sejati. Burung hantu bersalju adalah asli daerah Arktik di Amerika Utara dan Eurasia. Jantan hampir semuanya berkulit putih, sementara betina memiliki lebih banyak flek bulu hitam.\n\n" +
                    "Burung hantu bersalju adalah penghuni darat yang terutama berburu tikus dan unggas air, dan secara oportunis makan bangkai . Sebagian besar burung hantu tidur di siang hari dan berburu di malam hari, tetapi burung hantu bersalju aktif di siang hari, terutama di musim panas.\n" +
                    "\n" +
                    "Burung putih bermata kuning, paruh hitam ini mudah dikenali. Panjangnya 52–71 cm (20–28 in), dengan lebar sayap 125–150 cm (49–59 in). Juga, burung hantu ini dapat memiliki berat mulai dari 1,6 hingga 3 kg (3,5 hingga 6,6 lb). Umur rata-rata di alam liar adalah sepuluh tahun. Ini adalah salah satu spesies burung hantu terbesar dan, di Amerika Utara, rata-rata merupakan spesies burung hantu terberat. Jantan dewasa hampir putih murni, tetapi betina dan burung muda memiliki beberapa bintik hitam dan bercak gelap bahkan mungkin mendominasi. Bulu yang tebal, kaki berbulu yang sangat berbulu, dan warna membuat burung hantu bersalju beradaptasi dengan baik untuk kehidupan di utara Lingkaran Arktik .\n",
            "Serigala abu-abu atau serigala (bahasa Latin: Canis lupus) adalah binatang mamalia karnivora. Serigala abu-abu mempunyai asal usul yang sama dengan anjing luar negeri dari keluarga Canis lupus melalui bukti pengurutan DNA dan penyelidikan genetika. Beberapa jenis anjing juga memiliki bentuk fisik yang mirip dengan serigala, contohnya anjing jenis Siberian Husky, Malamut Alaska dan Samoyed. Secara umum, serigala mempunyai tinggi sekitar 60 cm sampai 80 cm (26-32 inci) dan berat sekitar 23–59 kilogram.",
            "Rusa sambar atau sambar india (disebut juga rusa sambur, sambhur, Tamil: Kadaththi man), adalah jenis rusa besar yang umum berhabitat di Asia. Spesies yang umum memiliki ciri khas tubuh yang besar dengan warna bulu kecoklatan. Sambar dapat tumbuh setinggi 102 cm - 160 cm sampai bahu dengan berat sekitar 546 kg. Sambar umumnya berhabitat di hutan dan bergantung pada tanaman semak atau rerumputan. Mereka umumnya hidup dalam kelompok dengan anggota 5 - 6 anggota. Rusa sambar (Cervus unicolor syn. Cervus aristotelis) mendiami sebagian besar Asia Selatan dengan batas sampai wilayah Himalaya. Selain itu dapat pula ditemukan di hutan tropis Burma, Thailand, Indocina, the Semenanjung Malaya), Tiongkok Selatan (termasuk Hainan), Taiwan, serta di pulau Sumatra dan Kalimantan di Indonesia. ",
            "Badak jawa, atau badak bercula-satu kecil (Rhinoceros sondaicus) adalah anggota famili Rhinocerotidae dan satu dari lima badak yang masih ada. Badak ini masih termasuk ke dalam genus yang sama dengan badak india dan memiliki kulit bermosaik yang menyerupai baju baja. Badak ini memiliki panjang 3,1–3,2 m dan tinggi 1,4–1,7 m. Badak ini lebih kecil daripada badak india dan lebih dekat dalam besar tubuh dengan badak hitam. Ukuran culanya biasanya lebih sedikit daripada 20 cm, lebih kecil daripada cula spesies badak lainnya.\n" +
                    "\n" +
                    "Badak ini pernah menjadi salah satu badak di Asia yang paling banyak menyebar. Meski disebut \"badak jawa\", binatang ini tidak terbatas hidup di Pulau Jawa saja, tetapi di seluruh Nusantara, sepanjang Asia Tenggara dan di India serta Tiongkok. Spesies ini kini statusnya sangat kritis, dengan hanya sedikit populasi yang ditemukan di alam bebas, dan tidak ada di kebun binatang. Badak ini kemungkinan adalah mamalia terlangka di bumi. Populasi 40-50 badak hidup di Taman Nasional Ujung Kulon di pulau Jawa, Indonesia. Populasi badak Jawa di alam bebas lainnya berada di Taman Nasional Cat Tien, Vietnam dengan perkiraan populasi tidak lebih dari delapan pada tahun 2007. Berkurangnya populasi badak jawa diakibatkan oleh perburuan untuk diambil culanya, yang sangat berharga pada pengobatan tradisional Tiongkok, dengan harga sebesar $30.000 per kilogram di pasar gelap. Berkurangnya populasi badak ini juga disebabkan oleh kehilangan habitat, yang terutama diakibatkan oleh perang, seperti perang Vietnam di Asia Tenggara juga menyebabkan berkurangnya populasi badak Jawa dan menghalangi pemulihan. Tempat yang tersisa hanya berada di dua daerah yang dilindungi, tetapi badak jawa masih berada pada risiko diburu, peka terhadap penyakit dan menciutnya keragaman genetik menyebabkannya terganggu dalam berkembangbiak. WWF Indonesia mengusahakan untuk mengembangkan kedua bagi badak jawa karena jika terjadi serangan penyakit atau bencana alam seperti tsunami, letusan gunung berapi Krakatau dan gempa bumi, populasi badak jawa akan langsung punah. Selain itu, karena invasi langkap (arenga) dan kompetisi dengan banteng untuk ruang dan sumber, maka populasinya semakin terdesak. Kawasan yang diidentifikasikan aman dan relatif dekat adalah Taman Nasional Halimun di Gunung Salak, Jawa Barat yang pernah menjadi habitat badak Jawa.\n" +
                    "\n" +
                    "Badak jawa dapat hidup selama 30-45 tahun di alam bebas. Badak ini hidup di hutan hujan dataran rendah, padang rumput basah dan daerah daratan banjir besar. Badak jawa kebanyakan bersifat tenang, kecuali untuk masa kenal-mengenal dan membesarkan anak, walaupun suatu kelompok kadang-kadang dapat berkumpul di dekat kubangan dan tempat mendapatkan mineral. Badak dewasa tidak memiliki hewan pemangsa sebagai musuh. Badak jawa biasanya menghindari manusia, tetapi akan menyerang manusia jika merasa diganggu. Peneliti dan pelindung alam jarang meneliti binatang itu secara langsung karena kelangkaan mereka dan adanya bahaya mengganggu sebuah spesies terancam. Peneliti menggunakan kamera dan sampel kotoran untuk mengukur kesehatan dan tingkah laku mereka. Badak Jawa lebih sedikit dipelajari daripada spesies badak lainnya.",
            "Komodo, atau juga disebut biawak komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia. Biawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora.\n" +
                    "\n" +
                    "Komodo merupakan spesies terbesar dari familia Varanidae, sekaligus kadal terbesar di dunia, dengan rata-rata panjang 2-3 meter dan beratnya bisa mencapai 100 kg. Komodo merupakan pemangsa puncak di habitatnya karena sejauh ini tidak diketahui adanya hewan karnivora besar lain selain biawak ini di sebarang geografisnya.\n" +
                    "\n" +
                    "Tubuhnya yang besar dan reputasinya yang mengerikan membuat mereka menjadi salah satu hewan paling terkenal di dunia. Sekarang, habitat komodo yang sesungguhnya telah menyusut akibat aktivitas manusia, sehingga lembaga IUCN memasukkan komodo sebagai spesies yang rentan terhadap kepunahan. Biawak komodo telah ditetapkan sebagai hewan yang dilindungi oleh pemerintah Indonesia dan habitanya dijadikan taman nasional, yaitu Taman Nasional Komodo, yang tujuannya didirikan untuk melindungi mereka. \n",
            "Beruang cokelat (Ursus arctos) adalah salah satu jenis beruang. Hidup di wilayah timur Eurasia dan Amerika Utara. Beruang cokelat bisa berbobot 130–700 kg (300–1500 pon). Beruang kodiak termasuk jenis beruang cokelat yang terbesar, yang seukuran dengan beruang kutub yang memiliki anggota terbanyak dalam kerluarga beruang yang merupakan hewan pemangsa darat terbesar. Ada beberapa subspesies beruang cokelat, antara lain: beruang cokelat suriah, beruang cokelat kodiak, beruang cokelat alaska, beruang cokelat amerika (grizzly) dan beruang cokelat meksiko.\n" +
                    "\n" +
                    "\n" +
                    "Populasi beruang cokelat ada di sebagian wilayah Rusia, Amerika Serikat (kebanyakan Alaska), Kanada, wilayah Karpathia (terutama Rumania ), juga di Ukraina, Slowakia, Polandia dan sebagainya). Bahkan Balkan, Swedia dan Finlandia, menetapkan beruang sebagai hewan nasional. Jadi, Beruang cokelat memiliki habitat yang paling luas dari semua beruang. \n",
            "Gajah sumatra (Elephas maximus sumatranus) adalah subspesies dari gajah asia yang hanya berhabitat di Pulau Sumatra. Gajah sumatra berpostur lebih kecil daripada subspesies gajah india. Populasinya semakin menurun dan menjadi spesies yang sangat terancam. Sekitar 2000 sampai 2700 ekor gajah sumatra yang tersisa di alam liar berdasarkan survei pada tahun 2000. Sebanyak 65% populasi gajah sumatra lenyap akibat dibunuh manusia, dan 30% kemungkinan dibunuh dengan cara diracuni oleh manusia. Sekitar 83% habitat gajah sumatra telah menjadi wilayah perkebunan akibat perambahan yang agresif.\n" +
                    "\n" +
                    "Gajah sumatra merupakan mamalia terbesar di Indonesia, beratnya mencapai 6 ton dan tumbuh setinggi 3,5 meter pada bahu. Periode kehamilan untuk bayi gajah sumatra adalah 22 bulan dengan umur rata-rata sampai 70 tahun. Herbivora raksasa ini sangat cerdas dan memiliki otak yang lebih besar dibandingkan dengan mamalia darat lain. Telinga yang cukup besar membantu gajah mendengar dengan baik dan membantu mengurangi panas tubuh. Belalainya digunakan untuk mendapatkan makanan dan air dengan cara memegang atau menggenggam bagian ujungnya yang digunakan seperti jari untuk meraup.\n",
            "Hiu harimau merupakan satu dari hiu terbesar, dan satu-satunya anggota genus Galeocerdo. Hiu dewasa memiliki panjang tubuh berkisar antara 3,25 m hingga 4,25 m, dan berbobot 385 kg hingga 635 kg. Hiu ini banyak ditemukan di samudera tropis dan hangat, terutama di sekitar pulau di tengah Pasifik. Hiu harimau adalah pemburu soliter, dan berburu di malam hari.\n" +
                    "\n" +
                    "Hiu harimau adalah predator berbahaya, karena memakan banyak benda. Makanannya biasanya ikan, singa laut, burung, hiu kecil, cumi-cumi dan penyu. Terkadang juga ditemukan barang buatan manusia seperti ban, atau plat mobil.\n" +
                    "\n" +
                    "Hiu harimau adalah penyerang kedua terfatal setelah great white shark, dan, bersama dengan great white shark, dianggap sebagai hiu paling berbahaya bagi manusia. "
    };

    private static int[] GambarHewan = {
        R.drawable.kucing_photo,
        R.drawable.harimau_putih_photo,
        R.drawable.elang_jawa_photo,
        R.drawable.burung_hantu_putih_photo,
        R.drawable.serigala_abu_abu_photo,
        R.drawable.rusa_sambar_photo,
        R.drawable.badak_jawa_photo,
        R.drawable.komodo_photo,
        R.drawable.beruang_cokelat_photo,
        R.drawable.gajah_sumatera_photo,
        R.drawable.hiu_macan_photo
    };

    private static int[] SuaraHewan = {
            R.raw.suara_kucing,
            R.raw.suara_harimau,
            R.raw.suara_elang,
            R.raw.suara_burung_hantu,
            R.raw.suara_serigala,
            R.raw.suara_rusa,
            R.raw.suara_badak,
            R.raw.no_sound,
            R.raw.suara_beruang,
            R.raw.suara_gajah,
            R.raw.no_sound
    };

    static ArrayList<Binatang> getListData() {
        ArrayList<Binatang> list = new ArrayList<>();
        for(int i = 0; i < NamaHewan.length;i++) {
            Binatang binatang = new Binatang();
            binatang.setNama(NamaHewan[i]);
            binatang.setKlasifikasi(KlasisfikasiHewan[i]);
            binatang.setDetail(DetailHewan[i]);
            binatang.setPhoto(GambarHewan[i]);
            binatang.setSuara(SuaraHewan[i]);
            list.add(binatang);
        }
        return list;
    }
}
