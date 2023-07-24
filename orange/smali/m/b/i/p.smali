.class public abstract Lm/b/i/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lm/b/i/p;->a:Ljava/util/HashMap;

    const/4 v0, 0x2

    new-array v0, v0, [C

    .line 2
    fill-array-data v0, :array_0

    sput-object v0, Lm/b/i/p;->b:[C

    return-void

    :array_0
    .array-data 2
        0x2cs
        0x3bs
    .end array-data
.end method

.method public static a(Ljava/lang/String;[I)I
    .locals 3

    .line 3
    sget-object v0, Lm/b/i/p;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    aput p0, p1, v2

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    aput p0, p1, v1

    const/4 p0, 0x2

    return p0

    .line 6
    :cond_0
    sget-object v0, Lm/b/i/o;->h:Lm/b/i/o;

    invoke-virtual {v0, p0}, Lm/b/i/o;->a(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    .line 7
    aput p0, p1, v2

    return v1

    :cond_1
    return v2
.end method

.method public static a(Ljava/lang/Appendable;Ljava/lang/String;Lm/b/i/g;ZZZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    invoke-virtual {p2}, Lm/b/i/g;->d()Lm/b/i/o;

    move-result-object v0

    .line 9
    invoke-virtual {p2}, Lm/b/i/g;->b()Ljava/nio/charset/CharsetEncoder;

    move-result-object p2

    .line 10
    invoke-virtual {p2}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm/b/i/n;->a(Ljava/lang/String;)Lm/b/i/n;

    move-result-object v1

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v4, v2, :cond_12

    .line 12
    invoke-virtual {p1, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result v7

    const/4 v8, 0x1

    if-eqz p4, :cond_3

    .line 13
    invoke-static {v7}, Lm/b/h/i;->a(I)Z

    move-result v9

    if-eqz v9, :cond_2

    if-eqz p5, :cond_0

    if-eqz v5, :cond_11

    :cond_0
    if-eqz v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const/16 v6, 0x20

    .line 14
    invoke-interface {p0, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    const/4 v6, 0x1

    goto/16 :goto_2

    :cond_2
    const/4 v5, 0x1

    const/4 v6, 0x0

    :cond_3
    const/high16 v8, 0x10000

    if-ge v7, v8, :cond_f

    int-to-char v8, v7

    const/16 v9, 0x22

    if-eq v8, v9, :cond_d

    const/16 v9, 0x26

    if-eq v8, v9, :cond_c

    const/16 v9, 0x3c

    if-eq v8, v9, :cond_9

    const/16 v9, 0x3e

    if-eq v8, v9, :cond_7

    const/16 v9, 0xa0

    if-eq v8, v9, :cond_5

    .line 15
    invoke-static {v1, v8, p2}, Lm/b/i/p;->a(Lm/b/i/n;CLjava/nio/charset/CharsetEncoder;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 16
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_2

    .line 17
    :cond_4
    invoke-static {p0, v0, v7}, Lm/b/i/p;->a(Ljava/lang/Appendable;Lm/b/i/o;I)V

    goto :goto_2

    .line 18
    :cond_5
    sget-object v8, Lm/b/i/o;->f:Lm/b/i/o;

    if-eq v0, v8, :cond_6

    const-string v8, "&nbsp;"

    .line 19
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    :cond_6
    const-string v8, "&#xa0;"

    .line 20
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    :cond_7
    if-nez p3, :cond_8

    const-string v8, "&gt;"

    .line 21
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    .line 22
    :cond_8
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_2

    :cond_9
    if-eqz p3, :cond_b

    .line 23
    sget-object v9, Lm/b/i/o;->f:Lm/b/i/o;

    if-ne v0, v9, :cond_a

    goto :goto_1

    .line 24
    :cond_a
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_2

    :cond_b
    :goto_1
    const-string v8, "&lt;"

    .line 25
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    :cond_c
    const-string v8, "&amp;"

    .line 26
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    :cond_d
    if-eqz p3, :cond_e

    const-string v8, "&quot;"

    .line 27
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    .line 28
    :cond_e
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_2

    .line 29
    :cond_f
    new-instance v8, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/String;-><init>([C)V

    .line 30
    invoke-virtual {p2, v8}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_10

    .line 31
    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    .line 32
    :cond_10
    invoke-static {p0, v0, v7}, Lm/b/i/p;->a(Ljava/lang/Appendable;Lm/b/i/o;I)V

    .line 33
    :cond_11
    :goto_2
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    add-int/2addr v4, v7

    goto/16 :goto_0

    :cond_12
    return-void
.end method

.method public static a(Ljava/lang/Appendable;Lm/b/i/o;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 34
    invoke-virtual {p1, p2}, Lm/b/i/o;->a(I)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x3b

    const-string v1, ""

    if-eq p1, v1, :cond_0

    const/16 p2, 0x26

    .line 35
    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    const-string p1, "&#x"

    .line 36
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_0
    return-void
.end method

.method public static synthetic a(Lm/b/i/o;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lm/b/i/p;->b(Lm/b/i/o;Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .line 2
    sget-object v0, Lm/b/i/o;->g:Lm/b/i/o;

    invoke-virtual {v0, p0}, Lm/b/i/o;->a(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static a(Lm/b/i/n;CLjava/nio/charset/CharsetEncoder;)Z
    .locals 2

    .line 37
    sget-object v0, Lm/b/i/m;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    .line 38
    invoke-virtual {p2, p1}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result p0

    return p0

    :cond_0
    return v0

    :cond_1
    const/16 p0, 0x80

    if-ge p1, p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Lm/b/i/o;Ljava/lang/String;I)V
    .locals 11

    .line 2
    const-class v0, Lm/b/i/p;

    new-array v1, p2, [Ljava/lang/String;

    invoke-static {p0, v1}, Lm/b/i/o;->a(Lm/b/i/o;[Ljava/lang/String;)[Ljava/lang/String;

    .line 3
    new-array v1, p2, [I

    invoke-static {p0, v1}, Lm/b/i/o;->a(Lm/b/i/o;[I)[I

    .line 4
    new-array v1, p2, [I

    invoke-static {p0, v1}, Lm/b/i/o;->b(Lm/b/i/o;[I)[I

    .line 5
    new-array p2, p2, [Ljava/lang/String;

    invoke-static {p0, p2}, Lm/b/i/o;->b(Lm/b/i/o;[Ljava/lang/String;)[Ljava/lang/String;

    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p2

    if-eqz p2, :cond_4

    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-static {p2, v0}, Lm/b/h/a;->a(Ljava/io/InputStream;I)Ljava/nio/ByteBuffer;

    move-result-object p2

    const-string v1, "ascii"

    .line 8
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    .line 9
    new-instance v1, Lm/b/j/a;

    invoke-direct {v1, p2}, Lm/b/j/a;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 10
    :goto_0
    invoke-virtual {v1}, Lm/b/j/a;->k()Z

    move-result v2

    if-nez v2, :cond_3

    const/16 v2, 0x3d

    .line 11
    invoke-virtual {v1, v2}, Lm/b/j/a;->a(C)Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-virtual {v1}, Lm/b/j/a;->a()V

    .line 13
    sget-object v3, Lm/b/i/p;->b:[C

    invoke-virtual {v1, v3}, Lm/b/j/a;->a([C)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x24

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 14
    invoke-virtual {v1}, Lm/b/j/a;->j()C

    move-result v5

    .line 15
    invoke-virtual {v1}, Lm/b/j/a;->a()V

    const/16 v6, 0x2c

    const/4 v7, -0x1

    if-ne v5, v6, :cond_0

    const/16 v5, 0x3b

    .line 16
    invoke-virtual {v1, v5}, Lm/b/j/a;->a(C)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 17
    invoke-virtual {v1}, Lm/b/j/a;->a()V

    goto :goto_1

    :cond_0
    const/4 v5, -0x1

    :goto_1
    const/16 v6, 0xa

    .line 18
    invoke-virtual {v1, v6}, Lm/b/j/a;->a(C)Ljava/lang/String;

    move-result-object v6

    .line 19
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v10, 0xd

    if-ne v8, v10, :cond_1

    .line 20
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v8, v9

    invoke-virtual {v6, v0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 21
    :cond_1
    invoke-static {v6, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 22
    invoke-virtual {v1}, Lm/b/j/a;->a()V

    .line 23
    invoke-static {p0}, Lm/b/i/o;->a(Lm/b/i/o;)[Ljava/lang/String;

    move-result-object v6

    aput-object v2, v6, p2

    .line 24
    invoke-static {p0}, Lm/b/i/o;->b(Lm/b/i/o;)[I

    move-result-object v6

    aput v3, v6, p2

    .line 25
    invoke-static {p0}, Lm/b/i/o;->c(Lm/b/i/o;)[I

    move-result-object v6

    aput v3, v6, v4

    .line 26
    invoke-static {p0}, Lm/b/i/o;->d(Lm/b/i/o;)[Ljava/lang/String;

    move-result-object v6

    aput-object v2, v6, v4

    if-eq v5, v7, :cond_2

    .line 27
    sget-object v4, Lm/b/i/p;->a:Ljava/util/HashMap;

    new-instance v6, Ljava/lang/String;

    const/4 v7, 0x2

    new-array v8, v7, [I

    aput v3, v8, v0

    aput v5, v8, v9

    invoke-direct {v6, v8, v0, v7}, Ljava/lang/String;-><init>([III)V

    invoke-virtual {v4, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto/16 :goto_0

    :cond_3
    return-void

    .line 28
    :catch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error reading resource "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 29
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not read resource "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Make sure you copy resources for "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lm/b/i/o;->h:Lm/b/i/o;

    invoke-virtual {v0, p0}, Lm/b/i/o;->a(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
