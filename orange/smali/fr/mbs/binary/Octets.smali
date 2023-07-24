.class public Lfr/mbs/binary/Octets;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfr/mbs/binary/Octets$TooBigForConversionException;
    }
.end annotation


# static fields
.field public static final c:Lorg/apache/log4j/Logger;


# instance fields
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg/a/a/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lfr/mbs/binary/Octets;

    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lfr/mbs/binary/Octets;->c:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V

    .line 6
    invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V

    .line 4
    invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->put([B)Lfr/mbs/binary/Octets;

    return-void
.end method

.method public static a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 4

    .line 12
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    if-gt v0, v1, :cond_1

    .line 13
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V

    const/4 v1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 15
    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lg/a/a/a;->a()B

    move-result v2

    .line 16
    invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v3

    invoke-virtual {v3}, Lg/a/a/a;->a()B

    move-result v3

    and-int/2addr v2, v3

    int-to-byte v2, v2

    .line 17
    invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(B)Lfr/mbs/binary/Octets;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 18
    :cond_1
    new-instance v0, Lfr/mbs/binary/OctetInvalidSizeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid AND mask size, expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " but get "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lfr/mbs/binary/OctetInvalidSizeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/lang/String;I)[Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 2
    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    :goto_1
    if-ge v5, p1, :cond_0

    mul-int v6, v3, p1

    add-int/2addr v6, v5

    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_0

    .line 5
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    if-gt v0, v1, :cond_1

    .line 2
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 4
    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v2

    .line 5
    invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v3

    .line 6
    invoke-virtual {v2}, Lg/a/a/a;->a()B

    move-result v2

    invoke-virtual {v3}, Lg/a/a/a;->a()B

    move-result v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(B)Lfr/mbs/binary/Octets;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 7
    :cond_1
    new-instance v0, Lfr/mbs/binary/OctetInvalidSizeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid XOR mask size, expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " but get "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lfr/mbs/binary/OctetInvalidSizeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createFromBase64(Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/common/io/BaseEncoding;->b()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/common/io/BaseEncoding;->a(Ljava/lang/CharSequence;)[B

    move-result-object p0

    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createFromBase64Url(Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/common/io/BaseEncoding;->c()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/common/io/BaseEncoding;->a(Ljava/lang/CharSequence;)[B

    move-result-object p0

    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets(B)Lfr/mbs/binary/Octets;
    .locals 1

    .line 10
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0, p0}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets(I)Lfr/mbs/binary/Octets;
    .locals 1

    .line 12
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x4

    invoke-static {v0, p0}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;
    .locals 2

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    mul-int/lit8 p0, p0, 0x2

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "X"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets(J)Lfr/mbs/binary/Octets;
    .locals 0

    .line 13
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const/16 p1, 0x8

    invoke-static {p1, p0}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0, p0}, Lfr/mbs/binary/Octets;-><init>(Lfr/mbs/binary/Octets;)V

    return-object v0
.end method

.method public static createOctets(Lg/a/a/a;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 15
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1

    const-string v0, ":"

    .line 2
    invoke-static {p0, v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets(Ljava/lang/String;Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 3

    .line 3
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V

    .line 4
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 6
    invoke-static {p0, p1}, Lfr/mbs/binary/Octets;->a(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    .line 7
    :goto_0
    array-length p1, p0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_1

    aget-object v2, p0, v1

    .line 8
    invoke-static {v2}, Lg/a/a/a;->a(Ljava/lang/String;)Lg/a/a/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static createOctets(Ljava/math/BigInteger;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 16
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    invoke-direct {v0, p0}, Lfr/mbs/binary/Octets;-><init>([B)V

    return-object v0
.end method

.method public static createOctets(S)Lfr/mbs/binary/Octets;
    .locals 1

    .line 11
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    const/4 v0, 0x2

    invoke-static {v0, p0}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createOctets([B)Lfr/mbs/binary/Octets;
    .locals 1

    .line 9
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0, p0}, Lfr/mbs/binary/Octets;-><init>([B)V

    return-object v0
.end method

.method public static createWithASCII8BString(Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1

    const-string v0, "ISO-8859-1"

    .line 1
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static createWithUtf8String(Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1

    const-string v0, "UTF-8"

    .line 1
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static empty()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V

    return-object v0
.end method

.method public static fromBytes(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Ljava/util/List<",
            "Lfr/mbs/binary/Octets;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 3
    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static join(Ljava/util/List;)Lfr/mbs/binary/Octets;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfr/mbs/binary/Octets;",
            ">;)",
            "Lfr/mbs/binary/Octets;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfr/mbs/binary/Octets;

    .line 3
    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static random(I)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    new-array p0, p0, [B

    .line 2
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, p0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 3
    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static toBytes(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfr/mbs/binary/Octets;",
            ">;)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfr/mbs/binary/Octets;

    .line 3
    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static toHexa(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfr/mbs/binary/Octets;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Le/f/b/b/k;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfr/mbs/binary/Octets;

    .line 3
    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(J)J
    .locals 3

    .line 7
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v0

    .line 8
    invoke-static {p1, p2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    const-wide/16 v1, 0x2

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    const-wide/16 v1, 0x1

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p2

    if-gtz p2, :cond_0

    .line 10
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide p1

    return-wide p1

    .line 11
    :cond_0
    new-instance p2, Lfr/mbs/binary/Octets$TooBigForConversionException;

    invoke-direct {p2, p1, v0}, Lfr/mbs/binary/Octets$TooBigForConversionException;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    throw p2
.end method

.method public and(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lfr/mbs/binary/Octets;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public cycleTosize(I)Lfr/mbs/binary/Octets;
    .locals 2

    .line 1
    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    if-ge v1, p1, :cond_1

    .line 3
    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    :goto_0
    sub-int/2addr p1, v1

    .line 4
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    if-le p1, v1, :cond_0

    .line 5
    invoke-virtual {v0, p0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    .line 6
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v1, p1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    :cond_1
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    instance-of v0, p1, Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public get(II)Lfr/mbs/binary/Octets;
    .locals 3

    .line 2
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V

    move v1, p1

    :goto_0
    add-int v2, p1, p2

    if-ge v1, v2, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public get(I)Lg/a/a/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg/a/a/a;

    return-object p1
.end method

.method public getAll()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg/a/a/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    return-object v0
.end method

.method public getFirst()Lg/a/a/a;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v0

    return-object v0
.end method

.method public getLast(I)Lfr/mbs/binary/Octets;
    .locals 1

    .line 2
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0, p1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public getLast()Lg/a/a/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v0

    return-object v0
.end method

.method public getLastFrom(I)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p0, p1, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public getSerializedFormat()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/xml/bind/annotation/XmlValue;
    .end annotation

    const-string v0, ""

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public padLeft(I)Lfr/mbs/binary/Octets;
    .locals 3

    .line 1
    :goto_0
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    if-ge v0, p1, :cond_0

    .line 2
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    const/4 v1, 0x0

    sget-object v2, Lg/a/a/a;->e:Lg/a/a/a;

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public padRight(I)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    if-ge v0, p1, :cond_0

    .line 2
    sget-object v0, Lg/a/a/a;->e:Lg/a/a/a;

    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public padWith(I)Lfr/mbs/binary/Octets;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 1
    new-instance v1, Lg/a/a/a;

    invoke-direct {v1}, Lg/a/a/a;-><init>()V

    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public pop(I)Lfr/mbs/binary/Octets;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lfr/mbs/exception/LengthTooLongException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->popWithoutException(I)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    if-gt p1, v1, :cond_0

    return-object v0

    .line 3
    :cond_0
    new-instance p1, Lfr/mbs/exception/LengthTooLongException;

    invoke-direct {p1}, Lfr/mbs/exception/LengthTooLongException;-><init>()V

    throw p1
.end method

.method public pop()Lg/a/a/a;
    .locals 2

    .line 4
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/a/a/a;

    return-object v0
.end method

.method public popWithoutException(I)Lfr/mbs/binary/Octets;
    .locals 4

    .line 1
    new-instance v0, Lfr/mbs/binary/Octets;

    invoke-direct {v0}, Lfr/mbs/binary/Octets;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->pop()Lg/a/a/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :catch_0
    sget-object v1, Lfr/mbs/binary/Octets;->c:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pop "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "octets on "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public put(B)Lfr/mbs/binary/Octets;
    .locals 1

    .line 6
    new-instance v0, Lg/a/a/a;

    invoke-direct {v0, p1}, Lg/a/a/a;-><init>(B)V

    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/a/a/a;

    .line 3
    new-instance v1, Lg/a/a/a;

    invoke-direct {v1, v0}, Lg/a/a/a;-><init>(Lg/a/a/a;)V

    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public put([B)Lfr/mbs/binary/Octets;
    .locals 3

    .line 4
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-byte v2, p1, v1

    .line 5
    invoke-virtual {p0, v2}, Lfr/mbs/binary/Octets;->put(B)Lfr/mbs/binary/Octets;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public reverse()Lfr/mbs/binary/Octets;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v0

    .line 2
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    div-int/lit8 v3, v3, 0x2

    if-ge v2, v3, :cond_0

    .line 3
    aget-byte v3, v0, v2

    .line 4
    aget-byte v4, v0, v1

    aput-byte v4, v0, v2

    .line 5
    aput-byte v3, v0, v1

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public set(ILg/a/a/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setSerializedFormat(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    return-void
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public toAsciiString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v1

    const-string v2, "US-ASCII"

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public toBase64()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/common/io/BaseEncoding;->b()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/io/BaseEncoding;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toBase64Url()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/common/io/BaseEncoding;->c()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/io/BaseEncoding;->a()Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/io/BaseEncoding;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toBigInteger()Ljava/math/BigInteger;
    .locals 3

    .line 1
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, ""

    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public toBitsString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2
    iget-object v1, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg/a/a/a;

    .line 3
    invoke-virtual {v2}, Lg/a/a/a;->toBitsString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toBytes()[B
    .locals 4

    .line 4
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    iget-object v3, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg/a/a/a;

    invoke-virtual {v3}, Lg/a/a/a;->a()B

    move-result v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public toHexa()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    .line 4
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toInt()I
    .locals 2

    const-wide/32 v0, 0x7fffffff

    .line 1
    invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->a(J)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public toLong()J
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 1
    invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->a(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public toShort()S
    .locals 2

    const-wide/16 v0, 0x7fff

    .line 1
    invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->a(J)J

    move-result-wide v0

    long-to-int v1, v0

    int-to-short v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":"

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    .line 2
    :cond_0
    invoke-static {p1}, Le/f/b/a/f;->a(Ljava/lang/String;)Le/f/b/a/f;

    move-result-object p1

    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-virtual {p1, v0}, Le/f/b/a/f;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public unpadRight()Lfr/mbs/binary/Octets;
    .locals 3

    .line 1
    sget-object v0, Lg/a/a/a;->e:Lg/a/a/a;

    .line 2
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 3
    :goto_0
    invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lg/a/a/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    add-int/lit8 v1, v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public valueOrNull()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lfr/mbs/binary/Octets;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->popWithoutException(I)Lfr/mbs/binary/Octets;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public xor(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lfr/mbs/binary/Octets;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method
