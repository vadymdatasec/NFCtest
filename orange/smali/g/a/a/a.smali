.class public Lg/a/a/a;
.super Lfr/mbs/binary/Octets;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final e:Lg/a/a/a;


# instance fields
.field public d:B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "00"

    .line 1
    invoke-static {v0}, Lg/a/a/a;->a(Ljava/lang/String;)Lg/a/a/a;

    move-result-object v0

    sput-object v0, Lg/a/a/a;->e:Lg/a/a/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-byte v0, p0, Lg/a/a/a;->d:B

    return-void
.end method

.method public constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V

    .line 2
    iput-byte p1, p0, Lg/a/a/a;->d:B

    return-void
.end method

.method public constructor <init>(Lg/a/a/a;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V

    .line 6
    iget-byte p1, p1, Lg/a/a/a;->d:B

    iput-byte p1, p0, Lg/a/a/a;->d:B

    return-void
.end method

.method public static a(B)Lg/a/a/a;
    .locals 1

    .line 4
    new-instance v0, Lg/a/a/a;

    invoke-direct {v0, p0}, Lg/a/a/a;-><init>(B)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lg/a/a/a;
    .locals 3

    const-string v0, "[0-9A-Fa-f]{2}"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    .line 2
    invoke-static {p0, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p0}, Lg/a/a/a;->b(I)Lg/a/a/a;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lfr/mbs/binary/OctetRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Hexadecimal String value error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " expecting two chars from 0 to 9, A to F or a to f string"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lfr/mbs/binary/OctetRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(I)Lg/a/a/a;
    .locals 0

    int-to-byte p0, p0

    .line 1
    invoke-static {p0}, Lg/a/a/a;->a(B)Lg/a/a/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()B
    .locals 1

    .line 5
    iget-byte v0, p0, Lg/a/a/a;->d:B

    return v0
.end method

.method public a(I)I
    .locals 3

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    const/16 v1, 0x8

    if-lt v1, p1, :cond_1

    .line 6
    iget-byte v2, p0, Lg/a/a/a;->d:B

    sub-int/2addr v1, p1

    shr-int p1, v2, v1

    int-to-byte p1, p1

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 7
    :cond_1
    new-instance v0, Lfr/mbs/binary/OctetRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "th bit, index should be between 1 and 8"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lfr/mbs/binary/OctetRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()S
    .locals 1

    .line 2
    iget-byte v0, p0, Lg/a/a/a;->d:B

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lg/a/a/a;

    if-eqz v0, :cond_0

    iget-byte v0, p0, Lg/a/a/a;->d:B

    check-cast p1, Lg/a/a/a;

    iget-byte p1, p1, Lg/a/a/a;->d:B

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-byte v0, p0, Lg/a/a/a;->d:B

    return v0
.end method

.method public toBitsString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x8

    if-gt v1, v2, :cond_0

    .line 2
    invoke-virtual {p0, v1}, Lg/a/a/a;->a(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-byte v1, p0, Lg/a/a/a;->d:B

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "%02X"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-virtual {p0}, Lg/a/a/a;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
