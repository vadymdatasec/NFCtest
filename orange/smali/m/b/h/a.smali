.class public abstract Lm/b/h/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "(?i)\\bcharset=\\s*(?:\"|\')?([^\\s,;\"\']*)"

    .line 1
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lm/b/h/a;->a:Ljava/util/regex/Pattern;

    const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lm/b/h/a;->b:[C

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 33
    :cond_0
    sget-object v1, Lm/b/h/a;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "charset="

    const-string v1, ""

    .line 36
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 37
    invoke-static {p0}, Lm/b/h/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static a(Ljava/nio/ByteBuffer;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 38
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 39
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    if-lt v2, v0, :cond_0

    .line 40
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 41
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    :cond_0
    const/4 v0, 0x0

    .line 42
    aget-byte v2, v1, v0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, -0x2

    const/4 v6, -0x1

    const/4 v7, 0x1

    if-nez v2, :cond_1

    aget-byte v2, v1, v7

    if-nez v2, :cond_1

    aget-byte v2, v1, v4

    if-ne v2, v5, :cond_1

    aget-byte v2, v1, v3

    if-eq v2, v6, :cond_2

    :cond_1
    aget-byte v2, v1, v0

    if-ne v2, v6, :cond_3

    aget-byte v2, v1, v7

    if-ne v2, v5, :cond_3

    aget-byte v2, v1, v4

    if-nez v2, :cond_3

    aget-byte v2, v1, v3

    if-nez v2, :cond_3

    :cond_2
    const-string p1, "UTF-32"

    goto :goto_0

    .line 43
    :cond_3
    aget-byte v2, v1, v0

    if-ne v2, v5, :cond_4

    aget-byte v2, v1, v7

    if-eq v2, v6, :cond_5

    :cond_4
    aget-byte v2, v1, v0

    if-ne v2, v6, :cond_6

    aget-byte v2, v1, v7

    if-ne v2, v5, :cond_6

    :cond_5
    const-string p1, "UTF-16"

    goto :goto_0

    .line 44
    :cond_6
    aget-byte v0, v1, v0

    const/16 v2, -0x11

    if-ne v0, v2, :cond_7

    aget-byte v0, v1, v7

    const/16 v2, -0x45

    if-ne v0, v2, :cond_7

    aget-byte v0, v1, v4

    const/16 v1, -0x41

    if-ne v0, v1, :cond_7

    .line 45
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const-string p1, "UTF-8"

    :cond_7
    :goto_0
    return-object p1
.end method

.method public static a()Ljava/nio/ByteBuffer;
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "maxSize must be 0 (unlimited) or larger"

    .line 24
    invoke-static {v2, v3}, Lm/b/h/j;->b(ZLjava/lang/String;)V

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const v2, 0xea60

    if-eqz v0, :cond_2

    if-ge p1, v2, :cond_2

    move v3, p1

    goto :goto_2

    :cond_2
    const v3, 0xea60

    .line 25
    :goto_2
    new-array v3, v3, [B

    .line 26
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    if-eqz v0, :cond_3

    move v2, p1

    :cond_3
    invoke-direct {v4, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 27
    :goto_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    if-nez v2, :cond_7

    .line 28
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v5, -0x1

    if-ne v2, v5, :cond_4

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_6

    if-le v2, p1, :cond_5

    .line 29
    invoke-virtual {v4, v3, v1, p1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_4

    :cond_5
    sub-int/2addr p1, v2

    .line 30
    :cond_6
    invoke-virtual {v4, v3, v1, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_3

    .line 31
    :cond_7
    :goto_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/nio/ByteBuffer;Ljava/lang/String;Ljava/lang/String;Lm/b/j/f0;)Lm/b/i/i;
    .locals 8

    .line 3
    invoke-static {p0, p1}, Lm/b/h/a;->a(Ljava/nio/ByteBuffer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_5

    const-string v1, "UTF-8"

    .line 4
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p3, v2, p2}, Lm/b/j/f0;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/i;

    move-result-object v3

    const-string v4, "meta[http-equiv=content-type], meta[charset]"

    .line 6
    invoke-virtual {v3, v4}, Lm/b/i/l;->g(Ljava/lang/String;)Lm/b/k/f;

    move-result-object v4

    invoke-virtual {v4}, Lm/b/k/f;->a()Lm/b/i/l;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string v5, "http-equiv"

    .line 7
    invoke-virtual {v4, v5}, Lm/b/i/t;->c(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "content"

    .line 8
    invoke-virtual {v4, v5}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lm/b/h/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v0

    :goto_0
    if-nez v5, :cond_2

    const-string v6, "charset"

    .line 9
    invoke-virtual {v4, v6}, Lm/b/i/t;->c(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 10
    invoke-virtual {v4, v6}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v0

    :cond_2
    :goto_1
    if-nez v5, :cond_3

    .line 11
    invoke-virtual {v3}, Lm/b/i/t;->d()I

    move-result v4

    if-lez v4, :cond_3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lm/b/i/t;->a(I)Lm/b/i/t;

    move-result-object v6

    instance-of v6, v6, Lm/b/i/v;

    if-eqz v6, :cond_3

    .line 12
    invoke-virtual {v3, v4}, Lm/b/i/t;->a(I)Lm/b/i/t;

    move-result-object v4

    check-cast v4, Lm/b/i/v;

    .line 13
    invoke-virtual {v4}, Lm/b/i/v;->r()Ljava/lang/String;

    move-result-object v6

    const-string v7, "xml"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v5, "encoding"

    .line 14
    invoke-virtual {v4, v5}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 15
    :cond_3
    invoke-static {v5}, Lm/b/h/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 16
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 17
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[\"\']"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 19
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_4
    move-object v0, v3

    goto :goto_2

    :cond_5
    const-string v1, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML"

    .line 20
    invoke-static {p1, v1}, Lm/b/h/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    if-nez v0, :cond_6

    .line 22
    invoke-virtual {p3, v2, p2}, Lm/b/j/f0;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/i;

    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lm/b/i/i;->E()Lm/b/i/g;

    move-result-object p0

    invoke-virtual {p0, p1}, Lm/b/i/g;->a(Ljava/lang/String;)Lm/b/i/g;

    :cond_6
    return-object v0
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const v0, 0xea60

    new-array v0, v0, [B

    .line 1
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    .line 2
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 6

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 7
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 8
    sget-object v4, Lm/b/h/a;->b:[C

    array-length v5, v4

    invoke-virtual {v2, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    aget-char v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v1, "[\"\']"

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 3
    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object p0

    .line 4
    :cond_1
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_2

    return-object p0

    :catch_0
    :cond_2
    :goto_0
    return-object v0
.end method
