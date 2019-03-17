package cn.zenliu.utils.lzstring4k

import org.junit.Test


internal class LZ4KTest {
    @Test
    fun testCompress() {
        assert(LZ4K.compress("""You can type in any text here and press the "Compress" button.""") == "⚇낮@예恶ဋ脼à匈዁퀃턈·䀧䷠ӂ咨᧑ꗈ耢Ƅ䀖쇵鮰耈찢䐠ꈀ")

    }

    @Test
    fun testDecompress() {
        assert(LZ4K.decompres("⚇낮@예恶ဋ脼à匈዁퀃턈·䀧䷠ӂ咨᧑ꗈ耢Ƅ䀖쇵鮰耈찢䐠ꈀ") == """You can type in any text here and press the "Compress" button.""")
    }

    @Test
    fun testCompressBase64() {

        assert(LZ4K.compressToBase64("""You can type in any text here and press the "Compress" button.""") == "JoewrgBAxghgdhALgTwA4FMIEsH2U9AD0QgAt0AnTeAEwlSoGdGlyIAiAYRAFsH1m7CACMwiRCDgA6IA")

    }

    @Test
    fun testDecompressBase64() {
        assert(LZ4K.decompressFromBase64("""JoewrgBAxghgdhALgTwA4FMIEsH2U9AD0QgAt0AnTeAEwlSoGdGlyIAiAYRAFsH1m7CACMwiRCDgA6IA""") == "You can type in any text here and press the \"Compress\" button.")

    }

    @Test
    fun testCompressURI() {
        assert(LZ4K.compressToEncodedURIComponent("You can type in any text here and press the \"Compress\" button.") == "JoewrgBAxghgdhALgTwA4FMIEsH2U9AD0QgAt0AnTeAEwlSoGdGlyIAiAYRAFsH1m7CACMwiRCDgA6IA")

    }

    @Test
    fun testDecompressURI() {
        assert(LZ4K.decompressFromEncodedURIComponent( "JoewrgBAxghgdhALgTwA4FMIEsH2U9AD0QgAt0AnTeAEwlSoGdGlyIAiAYRAFsH1m7CACMwiRCDgA6IA")=="You can type in any text here and press the \"Compress\" button.")

    }
    @Test
    fun testCompressUTF16() {
        println(LZ4K.compressToUTF16("You can type in any text here and press the \"Compress\" button.")=="""፣汋䀨ಀ䌣塠ᜢ㰠灉䈤塞敝>䑀Ǝ䁇✐Ő䪵ƽൎ∠䐣Ѡ஀綆瘰¬愲Ⴃ䀧∠ """)

    }

    @Test
    fun testDecompressUTF16() {
//        println(LZ4K.decompressFromUTF16("""፣汋䀨ಀ䌣塠ᜢ㰠灉䈤塞敝>䑀Ǝ䁇✐Ő䪵ƽൎ∠䐣Ѡ஀綆瘰¬愲Ⴃ䀧∠ """))
        assert(LZ4K.decompressFromUTF16("""፣汋䀨ಀ䌣塠ᜢ㰠灉䈤塞敝>䑀Ǝ䁇✐Ő䪵ƽൎ∠䐣Ѡ஀綆瘰¬愲Ⴃ䀧∠ """)=="You can type in any text here and press the \"Compress\" button.")
    }
}
