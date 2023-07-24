.class public Lcom/orange/oab/contactless/packid/hce/user/TokenData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final b:I

.field public final c:Lfr/mbs/binary/Octets;

.field public final d:Ljava/util/Date;

.field public final e:I

.field public final f:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(ILfr/mbs/binary/Octets;Ljava/util/Date;ILfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I

    .line 3
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->c:Lfr/mbs/binary/Octets;

    .line 4
    iput-object p3, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->d:Ljava/util/Date;

    .line 5
    iput p4, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I

    .line 6
    iput-object p5, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->f:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public static a()Ljava/text/DateFormat;
    .locals 4

    const-string v0, "UTC"

    .line 1
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "yyyyMMddHHmmss"

    invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 3
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-object v1
.end method

.method public static create(Lfr/mbs/binary/Octets;Ljava/util/Date;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;
    .locals 7

    .line 1
    new-instance v6, Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    const/4 v1, 0x1

    const/4 v4, 0x2

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;-><init>(ILfr/mbs/binary/Octets;Ljava/util/Date;ILfr/mbs/binary/Octets;)V

    return-object v6
.end method

.method public static parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;
    .locals 6

    .line 1
    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v5

    const/4 p0, 0x1

    .line 2
    invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toInt()I

    move-result v1

    const/16 p0, 0xa

    .line 3
    invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object v2

    const/4 p0, 0x7

    .line 4
    invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parseDate(Lfr/mbs/binary/Octets;)Ljava/util/Date;

    move-result-object v3

    const/4 p0, 0x2

    .line 5
    invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toInt()I

    move-result v4

    .line 6
    new-instance p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;-><init>(ILfr/mbs/binary/Octets;Ljava/util/Date;ILfr/mbs/binary/Octets;)V

    return-object p0
.end method

.method public static parseDate(Lfr/mbs/binary/Octets;)Ljava/util/Date;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->a()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Could not parse token date"

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    if-eq v1, v0, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    .line 3
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->f:Lfr/mbs/binary/Octets;

    iget-object p1, p1, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->f:Lfr/mbs/binary/Octets;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getApiVersionNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I

    return v0
.end method

.method public getApplicationData()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->f:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getExpirationDate()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->d:Ljava/util/Date;

    return-object v0
.end method

.method public getId()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->c:Lfr/mbs/binary/Octets;

    return-object v0
.end method

.method public getSequenceNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->f:Lfr/mbs/binary/Octets;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toHexa()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toOctets()Lfr/mbs/binary/Octets;
    .locals 3

    .line 1
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v0

    iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I

    .line 2
    invoke-static {v1}, Lg/a/a/a;->b(I)Lg/a/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->c:Lfr/mbs/binary/Octets;

    .line 3
    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->a()Ljava/text/DateFormat;

    move-result-object v1

    iget-object v2, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->d:Ljava/util/Date;

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I

    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lfr/mbs/binary/Octets;->createOctets(ILjava/lang/Number;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->f:Lfr/mbs/binary/Octets;

    .line 6
    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Le/f/b/a/j;->a(Ljava/lang/Object;)Le/f/b/a/j$a;

    move-result-object v0

    iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I

    const-string v2, "apiVersionNumber"

    .line 2
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->c:Lfr/mbs/binary/Octets;

    const-string v2, "id"

    .line 3
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->d:Ljava/util/Date;

    const-string v2, "expirationDate"

    .line 4
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I

    const-string v2, "sequenceNumber"

    .line 5
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->f:Lfr/mbs/binary/Octets;

    const-string v2, "applicationData"

    .line 6
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    .line 7
    invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
